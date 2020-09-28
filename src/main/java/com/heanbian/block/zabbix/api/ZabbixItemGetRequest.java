package com.heanbian.block.zabbix.api;

import java.util.HashMap;
import java.util.Map;

public class ZabbixItemGetRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixItemGetRequest setOutput(String output) {
		this.params.put("output", output);
		return this;
	}

	public ZabbixItemGetRequest setHostids(String hostids) {
		this.params.put("hostids", hostids);
		return this;
	}

	public ZabbixItemGetRequest setSearchKey(String key_) {
		Map<String, String> search = new HashMap<>(1);
		search.put("key_", key_);

		this.params.put("search", search);
		return this;
	}

	public ZabbixItemGetRequest setFilterType(String type) {
		Map<String, String> filter = new HashMap<>(1);
		filter.put("type", type);

		this.params.put("filter", filter);
		return this;
	}

	public ZabbixItemGetRequest setSortfield(String sortfield) {
		this.params.put("sortfield", sortfield);
		return this;
	}

}
