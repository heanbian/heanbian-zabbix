package com.heanbian.block.zabbix.api;

public class ZabbixHostInterfaceGetResponse {

	private String interfaceid;

	private String hostid;

	private String dns;

	private String ip;

	private String port;

	private String main;

	private String type;

	private String useip;

	private ZabbixHostInterfaceDetails details;

	public String getHostid() {
		return hostid;
	}

	public ZabbixHostInterfaceGetResponse setHostid(String hostid) {
		this.hostid = hostid;
		return this;
	}

	public String getType() {
		return type;
	}

	public ZabbixHostInterfaceGetResponse setType(String type) {
		this.type = type;
		return this;
	}

	public String getMain() {
		return main;
	}

	public ZabbixHostInterfaceGetResponse setMain(String main) {
		this.main = main;
		return this;
	}

	public String getUseip() {
		return useip;
	}

	public ZabbixHostInterfaceGetResponse setUseip(String useip) {
		this.useip = useip;
		return this;
	}

	public String getIp() {
		return ip;
	}

	public ZabbixHostInterfaceGetResponse setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public String getDns() {
		return dns;
	}

	public ZabbixHostInterfaceGetResponse setDns(String dns) {
		this.dns = dns;
		return this;
	}

	public String getPort() {
		return port;
	}

	public ZabbixHostInterfaceGetResponse setPort(String port) {
		this.port = port;
		return this;
	}

	public String getInterfaceid() {
		return interfaceid;
	}

	public ZabbixHostInterfaceGetResponse setInterfaceid(String interfaceid) {
		this.interfaceid = interfaceid;
		return this;
	}

	public ZabbixHostInterfaceDetails getDetails() {
		return details;
	}

	public ZabbixHostInterfaceGetResponse setDetails(ZabbixHostInterfaceDetails details) {
		this.details = details;
		return this;
	}

}
