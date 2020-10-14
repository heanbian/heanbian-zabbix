package com.heanbian.block.zabbix.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixTrendGetRequest {

	/**
	 * @see ZabbixTrendGetResponse
	 */
	public ZabbixTrendGetRequest() {
		this.setOutput("itemid", "clock", "num", "value_min", "value_avg", "value_max").setLimit("1");
	}

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixTrendGetRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public ZabbixTrendGetRequest setOutput(String... output) {
		this.params.put("output", Arrays.asList(output));
		return this;
	}

	public ZabbixTrendGetRequest setItemids(String... itemids) {
		return this.setItemids(Arrays.asList(itemids));
	}

	public ZabbixTrendGetRequest setItemids(List<String> itemids) {
		this.params.put("itemids", itemids);
		return this;
	}

	public ZabbixTrendGetRequest setLimit(String limit) {
		this.params.put("limit", limit);
		return this;
	}

}
