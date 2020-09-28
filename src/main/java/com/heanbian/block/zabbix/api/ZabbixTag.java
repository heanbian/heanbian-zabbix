package com.heanbian.block.zabbix.api;

public class ZabbixTag {

	private String tag;

	private String value;

	public ZabbixTag(String tag, String value) {
		this.tag = tag;
		this.value = value;
	}

	public String getTag() {
		return tag;
	}

	public String getValue() {
		return value;
	}

}
