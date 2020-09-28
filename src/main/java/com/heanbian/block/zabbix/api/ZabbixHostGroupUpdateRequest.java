package com.heanbian.block.zabbix.api;

public class ZabbixHostGroupUpdateRequest {

	private String groupid;

	private String name;

	public ZabbixHostGroupUpdateRequest(String groupid, String name) {
		this.groupid = groupid;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getGroupid() {
		return groupid;
	}

}
