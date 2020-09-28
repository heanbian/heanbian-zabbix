package com.heanbian.block.zabbix.api;

public class ZabbixHostInterfaceUpdateRequest {

	private String interfaceid;

	private String port;

	public ZabbixHostInterfaceUpdateRequest(String interfaceid, String port) {
		this.interfaceid = interfaceid;
		this.port = port;
	}

	public String getInterfaceid() {
		return interfaceid;
	}

	public String getPort() {
		return port;
	}

}
