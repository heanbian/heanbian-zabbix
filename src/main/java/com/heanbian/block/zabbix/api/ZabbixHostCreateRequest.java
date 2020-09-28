package com.heanbian.block.zabbix.api;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixHostCreateRequest {

	// "Template Module Generic SNMP" "10204"
	// "Templates/Modules" "8"
	// 启用
	public ZabbixHostCreateRequest() {
		this.setTemplateIds("10204").setGroupsIds("8").available(1);
	}

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixHostCreateRequest setHost(String host) {
		this.params.put("host", host);
		return this;
	}

	/**
	 * 
	 * @param available 0 - (default) unknown; 1 - available; 2 - unavailable.
	 * @return ZabbixHostCreateRequest
	 */
	public ZabbixHostCreateRequest available(int available) {
		this.params.put("available", available);
		return this;
	}

	public ZabbixHostCreateRequest setInterface(ZabbixInterface interfaces) {
		return this.setInterfaces(Arrays.asList(interfaces));
	}

	public ZabbixHostCreateRequest setInterfaces(List<ZabbixInterface> interfaces) {
		this.params.put("interfaces", interfaces);
		return this;
	}

	public ZabbixHostCreateRequest setGroupsIds(String... groupids) {
		return this.setGroups(Arrays.asList(groupids).stream().map(ZabbixGroupId::new).collect(toList()));
	}

	public ZabbixHostCreateRequest setGroups(List<ZabbixGroupId> groups) {
		this.params.put("groups", groups);
		return this;
	}

	public ZabbixHostCreateRequest setTags(List<ZabbixTag> tags) {
		this.params.put("tags", tags);
		return this;
	}

	public ZabbixHostCreateRequest setTemplateIds(String... templateids) {
		return this.setTemplates(Arrays.asList(templateids).stream().map(ZabbixTemplateId::new).collect(toList()));
	}

	public ZabbixHostCreateRequest setTemplates(List<ZabbixTemplateId> templates) {
		this.params.put("templates", templates);
		return this;
	}

	public ZabbixHostCreateRequest setMacros(List<ZabbixMacro> macros) {
		this.params.put("macros", macros);
		return this;
	}

	public ZabbixHostCreateRequest setInventoryMode(int inventoryMode) {
		this.params.put("inventory_mode", inventoryMode);
		return this;
	}

	public ZabbixHostCreateRequest setInventory(String macaddress_a, String macaddress_b) {
		Map<String, String> inventory = new HashMap<>(2);
		inventory.put("macaddress_a", macaddress_a);
		inventory.put("macaddress_b", macaddress_b);

		this.params.put("inventory", inventory);
		return this;
	}

}
