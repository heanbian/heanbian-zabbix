package com.heanbian.block.zabbix.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixHostGetRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixHostGetRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public ZabbixHostGetRequest setSelectGroups(String selectGroups) {
		this.params.put("selectGroups", selectGroups);
		return this;
	}

	public ZabbixHostGetRequest setOutput(String... output) {
		return this.setOutput(Arrays.asList(output));
	}

	public ZabbixHostGetRequest setOutput(List<String> output) {
		this.params.put("output", output);
		return this;
	}

	public ZabbixHostGetRequest setFilterHosts(String... hosts) {
		return this.setFilterHosts(Arrays.asList(hosts));
	}

	public ZabbixHostGetRequest setFilterHosts(List<String> hosts) {
		Map<String, Object> filter = new HashMap<>(1);
		filter.put("host", hosts);

		this.params.put("filter", filter);
		return this;
	}

}
