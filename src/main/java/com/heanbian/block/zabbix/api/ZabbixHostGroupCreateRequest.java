package com.heanbian.block.zabbix.api;

public class ZabbixHostGroupCreateRequest {

	private String name;

	public ZabbixHostGroupCreateRequest(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
