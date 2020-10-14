package com.heanbian.block.zabbix.api;

import java.util.HashMap;
import java.util.Map;

public class ZabbixHostInterfaceGetRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixHostInterfaceGetRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public ZabbixHostInterfaceGetRequest setOutput(String output) {
		this.params.put("output", output);
		return this;
	}

	public ZabbixHostInterfaceGetRequest setHostids(String hostids) {
		this.params.put("hostids", hostids);
		return this;
	}

}
