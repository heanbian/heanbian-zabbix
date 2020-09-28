package com.heanbian.block.zabbix.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixItemUpdateRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixItemUpdateRequest setItemid(String itemid) {
		this.params.put("itemid", itemid);
		return this;
	}

	public ZabbixItemUpdateRequest setStatus(int status) {
		this.params.put("status", status);
		return this;
	}

	public ZabbixItemUpdateRequest setName(String name) {
		this.params.put("name", name);
		return this;
	}

	public ZabbixItemUpdateRequest setMasterItemid(String masterItemid) {
		this.params.put("master_itemid", masterItemid);
		return this;
	}

	public ZabbixItemUpdateRequest setAllowTraps(String allowTraps) {
		this.params.put("allow_traps", allowTraps);
		return this;
	}

	public ZabbixItemUpdateRequest setPreprocessing(List<ZabbixPreprocessing> preprocessing) {
		this.params.put("preprocessing", preprocessing);
		return this;
	}

}
