package com.heanbian.block.zabbix.api;

import java.util.HashMap;
import java.util.Map;

public class ZabbixGenericRequest {
	
	private final Map<String, Object> params = new HashMap<>();

	public ZabbixGenericRequest() {
	}

	public ZabbixGenericRequest(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
	}

	public ZabbixGenericRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public Map<String, Object> getParams() {
		return params;
	}
}
