package com.heanbian.block.zabbix.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixHistoryGetRequest {

	public ZabbixHistoryGetRequest() {
		this.setOutput("extend").setHistory(0).setSortfield("clock").setSortorder("DESC").setLimit("1");
	}

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixHistoryGetRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public ZabbixHistoryGetRequest setOutput(String... output) {
		this.params.put("output", Arrays.asList(output));
		return this;
	}

	public ZabbixHistoryGetRequest setHistory(int history) {
		this.params.put("history", history);
		return this;
	}

	public ZabbixHistoryGetRequest setItemids(String... itemids) {
		return this.setItemids(Arrays.asList(itemids));
	}

	public ZabbixHistoryGetRequest setItemids(List<String> itemids) {
		this.params.put("itemids", itemids);
		return this;
	}

	public ZabbixHistoryGetRequest setSortfield(String sortfield) {
		this.params.put("sortfield", sortfield);
		return this;
	}

	public ZabbixHistoryGetRequest setSortorder(String sortorder) {
		this.params.put("sortorder", sortorder);
		return this;
	}

	public ZabbixHistoryGetRequest setLimit(String limit) {
		this.params.put("limit", limit);
		return this;
	}

}
