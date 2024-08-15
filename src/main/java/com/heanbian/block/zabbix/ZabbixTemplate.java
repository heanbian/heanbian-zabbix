package com.heanbian.block.zabbix;

import static org.springframework.http.HttpMethod.POST;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.heanbian.block.zabbix.api.ZabbixHistoryGetRequest;
import com.heanbian.block.zabbix.api.ZabbixHistoryGetResponse;
import com.heanbian.block.zabbix.api.ZabbixHostCreateRequest;
import com.heanbian.block.zabbix.api.ZabbixHostGenericResponse;
import com.heanbian.block.zabbix.api.ZabbixHostGetRequest;
import com.heanbian.block.zabbix.api.ZabbixHostGetResponse;
import com.heanbian.block.zabbix.api.ZabbixHostGroupCreateRequest;
import com.heanbian.block.zabbix.api.ZabbixHostGroupGenericResponse;
import com.heanbian.block.zabbix.api.ZabbixHostGroupGetRequest;
import com.heanbian.block.zabbix.api.ZabbixHostGroupGetResponse;
import com.heanbian.block.zabbix.api.ZabbixHostGroupUpdateRequest;
import com.heanbian.block.zabbix.api.ZabbixHostInterfaceCreateRequest;
import com.heanbian.block.zabbix.api.ZabbixHostInterfaceGenericResponse;
import com.heanbian.block.zabbix.api.ZabbixHostInterfaceGetRequest;
import com.heanbian.block.zabbix.api.ZabbixHostInterfaceGetResponse;
import com.heanbian.block.zabbix.api.ZabbixHostInterfaceUpdateRequest;
import com.heanbian.block.zabbix.api.ZabbixHostUpdateRequest;
import com.heanbian.block.zabbix.api.ZabbixItemCreateRequest;
import com.heanbian.block.zabbix.api.ZabbixItemGenericResponse;
import com.heanbian.block.zabbix.api.ZabbixItemGetRequest;
import com.heanbian.block.zabbix.api.ZabbixItemGetResponse;
import com.heanbian.block.zabbix.api.ZabbixItemUpdateRequest;
import com.heanbian.block.zabbix.api.ZabbixTrendGetRequest;
import com.heanbian.block.zabbix.api.ZabbixTrendGetResponse;
import com.heanbian.block.zabbix.api.ZabbixUserLogin;

public class ZabbixTemplate {

	private final String url;
	private final String jsonrpc;
	private final String username;
	private final String password;

	private final RestTemplate restTemplate;
	private String auth = null;

	public ZabbixTemplate(String url, String username, String password) {
		this(url, "2.0", username, password, new RestTemplate());
	}

	public ZabbixTemplate(String url, String jsonpc, String username, String password, RestTemplate restTemplate) {
		this.url = url;
		this.jsonrpc = jsonpc;
		this.username = username;
		this.password = password;
		this.restTemplate = restTemplate;
	}

	public List<ZabbixHistoryGetResponse> historyGet(String... itemids) {
		return this.historyGet(Arrays.asList(itemids));
	}

	public List<ZabbixHistoryGetResponse> historyGet(List<String> itemids) {
		ZabbixHistoryGetRequest zabbixHistoryGetRequest = new ZabbixHistoryGetRequest();
		zabbixHistoryGetRequest.setItemids(itemids);
		return this.historyGet(zabbixHistoryGetRequest);
	}

	public List<ZabbixHistoryGetResponse> historyGet(ZabbixHistoryGetRequest zabbixHistoryGetRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HISTORY_GET).setAuth(getAuth())
				.setParams(zabbixHistoryGetRequest.getParams());

		HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<List<ZabbixHistoryGetResponse>>> response = restTemplate.exchange(url, POST,
				request, new ParameterizedTypeReference<ZabbixResponse<List<ZabbixHistoryGetResponse>>>() {
				});

		ZabbixResponse<List<ZabbixHistoryGetResponse>> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public List<ZabbixTrendGetResponse> trendGet(String... itemids) {
		return this.trendGet(Arrays.asList(itemids));
	}

	public List<ZabbixTrendGetResponse> trendGet(List<String> itemids) {
		ZabbixTrendGetRequest zabbixTrendGetRequest = new ZabbixTrendGetRequest();
		zabbixTrendGetRequest.setItemids(itemids);
		return this.trendGet(zabbixTrendGetRequest);
	}

	public List<ZabbixTrendGetResponse> trendGet(ZabbixTrendGetRequest zabbixTrendGetRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.TREND_GET).setAuth(getAuth())
				.setParams(zabbixTrendGetRequest.getParams());

		HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<List<ZabbixTrendGetResponse>>> response = restTemplate.exchange(url, POST,
				request, new ParameterizedTypeReference<ZabbixResponse<List<ZabbixTrendGetResponse>>>() {
				});

		ZabbixResponse<List<ZabbixTrendGetResponse>> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public List<ZabbixHostGroupGetResponse> hostGroupGet(String... names) {
		ZabbixHostGroupGetRequest zabbixHostGroupGetRequest = new ZabbixHostGroupGetRequest();
		zabbixHostGroupGetRequest.setFilterNames(names).setOutput("extend");
		return this.hostGroupGet(zabbixHostGroupGetRequest);
	}

	public List<ZabbixHostGroupGetResponse> hostGroupGet(ZabbixHostGroupGetRequest zabbixHostGroupGetRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HOSTGROUP_GET).setAuth(getAuth())
				.setParams(zabbixHostGroupGetRequest.getParams());

		HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<List<ZabbixHostGroupGetResponse>>> response = restTemplate.exchange(url, POST,
				request, new ParameterizedTypeReference<ZabbixResponse<List<ZabbixHostGroupGetResponse>>>() {
				});

		ZabbixResponse<List<ZabbixHostGroupGetResponse>> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public ZabbixHostGroupGenericResponse hostGroupDelete(String... groupids) {
		return this.hostGroupDelete(Arrays.asList(groupids));
	}

	public ZabbixHostGroupGenericResponse hostGroupDelete(List<String> groupids) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<List<String>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HOSTGROUP_DELETE).setAuth(getAuth()).setParams(groupids);

		HttpEntity<ZabbixRequest<List<String>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<ZabbixHostGroupGenericResponse>> response = restTemplate.exchange(url, POST,
				request, new ParameterizedTypeReference<ZabbixResponse<ZabbixHostGroupGenericResponse>>() {
				});

		ZabbixResponse<ZabbixHostGroupGenericResponse> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public ZabbixHostGroupGenericResponse hostGroupUpdate(String groupid, String name) {
		return this.hostGroupUpdate(new ZabbixHostGroupUpdateRequest(groupid, name));
	}

	public ZabbixHostGroupGenericResponse hostGroupUpdate(ZabbixHostGroupUpdateRequest zabbixHostGroupUpdateRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<ZabbixHostGroupUpdateRequest> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HOSTGROUP_UPDATE).setAuth(getAuth())
				.setParams(zabbixHostGroupUpdateRequest);

		HttpEntity<ZabbixRequest<ZabbixHostGroupUpdateRequest>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<ZabbixHostGroupGenericResponse>> response = restTemplate.exchange(url, POST,
				request, new ParameterizedTypeReference<ZabbixResponse<ZabbixHostGroupGenericResponse>>() {
				});

		ZabbixResponse<ZabbixHostGroupGenericResponse> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public ZabbixHostGroupGenericResponse hostGroupCreate(String name) {
		return this.hostGroupCreate(new ZabbixHostGroupCreateRequest(name));
	}

	public ZabbixHostGroupGenericResponse hostGroupCreate(ZabbixHostGroupCreateRequest zabbixHostGroupCreateRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<ZabbixHostGroupCreateRequest> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HOSTGROUP_CREATE).setAuth(getAuth())
				.setParams(zabbixHostGroupCreateRequest);

		HttpEntity<ZabbixRequest<ZabbixHostGroupCreateRequest>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<ZabbixHostGroupGenericResponse>> response = restTemplate.exchange(url, POST,
				request, new ParameterizedTypeReference<ZabbixResponse<ZabbixHostGroupGenericResponse>>() {
				});

		ZabbixResponse<ZabbixHostGroupGenericResponse> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public List<ZabbixHostInterfaceGetResponse> hostInterfaceGet(String hostid) {
		return this.hostInterfaceGet("extend", hostid);
	}

	public List<ZabbixHostInterfaceGetResponse> hostInterfaceGet(String output, String hostids) {
		ZabbixHostInterfaceGetRequest zabbixHostInterfaceGetRequest = new ZabbixHostInterfaceGetRequest();
		zabbixHostInterfaceGetRequest.setOutput(output).setHostids(hostids);
		return this.hostInterfaceGet(zabbixHostInterfaceGetRequest);
	}

	public List<ZabbixHostInterfaceGetResponse> hostInterfaceGet(
			ZabbixHostInterfaceGetRequest zabbixHostInterfaceGetRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HOSTINTERFACE_GET).setAuth(getAuth())
				.setParams(zabbixHostInterfaceGetRequest.getParams());

		HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<List<ZabbixHostInterfaceGetResponse>>> response = restTemplate.exchange(url, POST,
				request, new ParameterizedTypeReference<ZabbixResponse<List<ZabbixHostInterfaceGetResponse>>>() {
				});

		ZabbixResponse<List<ZabbixHostInterfaceGetResponse>> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public ZabbixHostInterfaceGenericResponse hostInterfaceDelete(String... interfaceids) {
		return this.hostInterfaceDelete(Arrays.asList(interfaceids));
	}

	public ZabbixHostInterfaceGenericResponse hostInterfaceDelete(List<String> interfaceids) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<List<String>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HOSTINTERFACE_DELETE).setAuth(getAuth()).setParams(interfaceids);

		HttpEntity<ZabbixRequest<List<String>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<ZabbixHostInterfaceGenericResponse>> response = restTemplate.exchange(url, POST,
				request, new ParameterizedTypeReference<ZabbixResponse<ZabbixHostInterfaceGenericResponse>>() {
				});

		ZabbixResponse<ZabbixHostInterfaceGenericResponse> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public ZabbixHostInterfaceGenericResponse hostInterfaceCreate(
			ZabbixHostInterfaceCreateRequest zabbixHostInterfaceCreateRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<ZabbixHostInterfaceCreateRequest> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HOSTINTERFACE_CREATE).setAuth(getAuth())
				.setParams(zabbixHostInterfaceCreateRequest);

		HttpEntity<ZabbixRequest<ZabbixHostInterfaceCreateRequest>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<ZabbixHostInterfaceGenericResponse>> response = restTemplate.exchange(url, POST,
				request, new ParameterizedTypeReference<ZabbixResponse<ZabbixHostInterfaceGenericResponse>>() {
				});

		ZabbixResponse<ZabbixHostInterfaceGenericResponse> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public ZabbixHostInterfaceGenericResponse hostInterfaceUpdate(String interfaceid, String port) {
		return this.hostInterfaceUpdate(new ZabbixHostInterfaceUpdateRequest(interfaceid, port));
	}

	public ZabbixHostInterfaceGenericResponse hostInterfaceUpdate(
			ZabbixHostInterfaceUpdateRequest zabbixHostInterfaceUpdateRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<ZabbixHostInterfaceUpdateRequest> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HOSTINTERFACE_UPDATE).setAuth(getAuth())
				.setParams(zabbixHostInterfaceUpdateRequest);

		HttpEntity<ZabbixRequest<ZabbixHostInterfaceUpdateRequest>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<ZabbixHostInterfaceGenericResponse>> response = restTemplate.exchange(url, POST,
				request, new ParameterizedTypeReference<ZabbixResponse<ZabbixHostInterfaceGenericResponse>>() {
				});

		ZabbixResponse<ZabbixHostInterfaceGenericResponse> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public ZabbixItemGenericResponse itemDelete(String... itemids) {
		return this.itemDelete(Arrays.asList(itemids));
	}

	public ZabbixItemGenericResponse itemDelete(List<String> itemids) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<List<String>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.ITEM_DELETE).setAuth(getAuth()).setParams(itemids);

		HttpEntity<ZabbixRequest<List<String>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<ZabbixItemGenericResponse>> response = restTemplate.exchange(url, POST, request,
				new ParameterizedTypeReference<ZabbixResponse<ZabbixItemGenericResponse>>() {
				});

		ZabbixResponse<ZabbixItemGenericResponse> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public ZabbixItemGenericResponse itemCreate(ZabbixItemCreateRequest zabbixItemCreateRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.ITEM_CREATE).setAuth(getAuth())
				.setParams(zabbixItemCreateRequest.getParams());

		HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<ZabbixItemGenericResponse>> response = restTemplate.exchange(url, POST, request,
				new ParameterizedTypeReference<ZabbixResponse<ZabbixItemGenericResponse>>() {
				});

		ZabbixResponse<ZabbixItemGenericResponse> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public ZabbixItemGenericResponse itemUpdate(ZabbixItemUpdateRequest zabbixItemUpdateRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.ITEM_UPDATE).setAuth(getAuth())
				.setParams(zabbixItemUpdateRequest.getParams());

		HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<ZabbixItemGenericResponse>> response = restTemplate.exchange(url, POST, request,
				new ParameterizedTypeReference<ZabbixResponse<ZabbixItemGenericResponse>>() {
				});

		ZabbixResponse<ZabbixItemGenericResponse> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public List<ZabbixItemGetResponse> itemGet(ZabbixItemGetRequest zabbixItemGetRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.ITEM_GET).setAuth(getAuth())
				.setParams(zabbixItemGetRequest.getParams());

		HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<List<ZabbixItemGetResponse>>> response = restTemplate.exchange(url, POST, request,
				new ParameterizedTypeReference<ZabbixResponse<List<ZabbixItemGetResponse>>>() {
				});

		ZabbixResponse<List<ZabbixItemGetResponse>> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public List<ZabbixHostGetResponse> hostGet(String... hosts) {
		ZabbixHostGetRequest zabbixHostGetRequest = new ZabbixHostGetRequest();
		return this.hostGet(zabbixHostGetRequest.setFilterHosts(hosts));
	}

	public List<ZabbixHostGetResponse> hostGet(ZabbixHostGetRequest zabbixHostGetRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HOST_GET).setAuth(getAuth())
				.setParams(zabbixHostGetRequest.getParams());

		HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<List<ZabbixHostGetResponse>>> response = restTemplate.exchange(url, POST, request,
				new ParameterizedTypeReference<ZabbixResponse<List<ZabbixHostGetResponse>>>() {
				});

		ZabbixResponse<List<ZabbixHostGetResponse>> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public ZabbixHostGenericResponse hostCreate(ZabbixHostCreateRequest zabbixHostCreateRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HOST_CREATE).setAuth(getAuth())
				.setParams(zabbixHostCreateRequest.getParams());

		HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<ZabbixHostGenericResponse>> response = restTemplate.exchange(url, POST, request,
				new ParameterizedTypeReference<ZabbixResponse<ZabbixHostGenericResponse>>() {
				});

		ZabbixResponse<ZabbixHostGenericResponse> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public ZabbixHostGenericResponse hostUpdate(ZabbixHostUpdateRequest zabbixHostUpdateRequest) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HOST_UPDATE).setAuth(getAuth())
				.setParams(zabbixHostUpdateRequest.getParams());

		HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<ZabbixHostGenericResponse>> response = restTemplate.exchange(url, POST, request,
				new ParameterizedTypeReference<ZabbixResponse<ZabbixHostGenericResponse>>() {
				});

		ZabbixResponse<ZabbixHostGenericResponse> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public ZabbixHostGenericResponse hostDelete(String... hostids) {
		return this.hostDelete(Arrays.asList(hostids));
	}

	public ZabbixHostGenericResponse hostDelete(List<String> hostids) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<List<String>> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.HOST_DELETE).setAuth(getAuth()).setParams(hostids);

		HttpEntity<ZabbixRequest<List<String>>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<ZabbixHostGenericResponse>> response = restTemplate.exchange(url, POST, request,
				new ParameterizedTypeReference<ZabbixResponse<ZabbixHostGenericResponse>>() {
				});

		ZabbixResponse<ZabbixHostGenericResponse> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	public String getAuth() {
		if (this.auth == null) {
			this.auth = this.userLogin(this.username, this.password);
		}
		return this.auth;
	}

	public ZabbixTemplate setAuth(String auth) {
		this.auth = auth;
		return this;
	}

	public String userLogin(String username, String password) {
		return this.userLogin(new ZabbixUserLogin(username, password));
	}

	public String userLogin(ZabbixUserLogin zabbixUserLogin) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ZabbixRequest<ZabbixUserLogin> dto = new ZabbixRequest<>();
		dto.setJsonrpc(jsonrpc).setMethod(ZabbixMethod.USER_LOGIN).setParams(zabbixUserLogin);

		HttpEntity<ZabbixRequest<ZabbixUserLogin>> request = new HttpEntity<>(dto, headers);
		ResponseEntity<ZabbixResponse<String>> response = restTemplate.exchange(url, POST, request,
				new ParameterizedTypeReference<ZabbixResponse<String>>() {
				});

		ZabbixResponse<String> result = response.getBody();
		printError(result);
		return result.getResult();
	}

	private <T> void printError(ZabbixResponse<T> result) {
		if (result.getError() != null) {
			throw new ZabbixException(result.getError().getData());
		}
	}
}
