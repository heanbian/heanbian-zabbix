package com.heanbian.block.zabbix.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixHostGroupGetRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	/**
	 * 
	 * @param output "extend"
	 * @return ZabbixHostGroupGetRequest
	 */
	public ZabbixHostGroupGetRequest setOutput(String output) {
		this.params.put("output", output);
		return this;
	}

	public ZabbixHostGroupGetRequest setFilterNames(String... names) {
		return this.setFilterNames(Arrays.asList(names));
	}

	public ZabbixHostGroupGetRequest setFilterNames(List<String> names) {
		Map<String, Object> filter = new HashMap<>(1);
		filter.put("name", names);

		this.params.put("filter", filter);
		return this;
	}

}
