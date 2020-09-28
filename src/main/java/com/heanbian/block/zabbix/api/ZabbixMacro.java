package com.heanbian.block.zabbix.api;

public class ZabbixMacro {

	private String macro;

	private String value;

	private String description;

	public ZabbixMacro(String macro, String value) {
		this(macro, value, null);
	}

	public ZabbixMacro(String macro, String value, String description) {
		this.macro = macro;
		this.value = value;
		this.description = description;
	}

	public String getMacro() {
		return macro;
	}

	public String getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

}
