package com.heanbian.block.zabbix.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixItemCreateRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixItemCreateRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public ZabbixItemCreateRequest setName(String name) {
		this.params.put("name", name);
		return this;
	}

	public ZabbixItemCreateRequest setKey(String key_) {
		this.params.put("key_", key_);
		return this;
	}

	public ZabbixItemCreateRequest setHostid(String hostid) {
		this.params.put("hostid", hostid);
		return this;
	}

	public ZabbixItemCreateRequest setType(int type) {
		this.params.put("type", type);
		return this;
	}

	public ZabbixItemCreateRequest setValueType(int valueType) {
		this.params.put("value_type", valueType);
		return this;
	}

	public ZabbixItemCreateRequest setInterfaceid(String interfaceid) {
		this.params.put("interfaceid", interfaceid);
		return this;
	}

	public ZabbixItemCreateRequest setApplications(String... applications) {
		this.params.put("applications", applications);
		return this;
	}

	public ZabbixItemCreateRequest setApplications(List<String> applications) {
		this.params.put("applications", applications);
		return this;
	}

	public ZabbixItemCreateRequest setDelay(String delay) {
		this.params.put("delay", delay);
		return this;
	}

	public ZabbixItemCreateRequest setInventoryLink(int inventoryLink) {
		this.params.put("inventory_link", inventoryLink);
		return this;
	}

	public ZabbixItemCreateRequest setSnmpCommunity(String snmpCommunity) {
		this.params.put("snmp_community", snmpCommunity);
		return this;
	}

	public ZabbixItemCreateRequest setSnmpOid(String snmpOid) {
		this.params.put("snmp_oid", snmpOid);
		return this;
	}

	public ZabbixItemCreateRequest setUnits(String units) {
		this.params.put("units", units);
		return this;
	}

	public ZabbixItemCreateRequest setMasterItemid(String masterItemid) {
		this.params.put("master_itemid", masterItemid);
		return this;
	}

	public ZabbixItemCreateRequest setOutputFormat(String outputFormat) {
		this.params.put("output_format", outputFormat);
		return this;
	}

	public ZabbixItemCreateRequest setUrl(String url) {
		this.params.put("url", url);
		return this;
	}

	public ZabbixItemCreateRequest setQueryFields(String min, String max) {
		return this.setQueryFields("json", min, max);
	}

	public ZabbixItemCreateRequest setQueryFields(String mode, String min, String max) {
		Map<String, String> queryFields = new HashMap<>(3);
		queryFields.put("mode", mode);
		queryFields.put("min", min);
		queryFields.put("max", max);

		this.params.put("query_fields", queryFields);
		return this;
	}

	public ZabbixItemCreateRequest setPreprocessing(List<ZabbixPreprocessing> preprocessing) {
		this.params.put("preprocessing", preprocessing);
		return this;
	}

}
