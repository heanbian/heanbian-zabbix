package com.heanbian.block.zabbix.api;

import java.util.List;

public class ZabbixApplicationGetResponse {
	
	private String applicationid;
	private String hostid;
	private String name;
	private List<String> templateids;

	public String getApplicationid() {
		return applicationid;
	}

	public void setApplicationid(String applicationid) {
		this.applicationid = applicationid;
	}

	public String getHostid() {
		return hostid;
	}

	public void setHostid(String hostid) {
		this.hostid = hostid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTemplateids() {
		return templateids;
	}

	public void setTemplateids(List<String> templateids) {
		this.templateids = templateids;
	}
}
