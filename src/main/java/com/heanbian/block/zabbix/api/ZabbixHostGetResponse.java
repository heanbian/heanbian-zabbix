package com.heanbian.block.zabbix.api;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ZabbixHostGetResponse {

	private String hostid;
	private String proxyHostid;
	private String host;
	private String status;
	private String disableUntil;
	private String error;
	private String available;
	private String errorsFrom;
	private String lastaccess;
	private String ipmiAuthtype;
	private String ipmiPrivilege;
	private String ipmiUsername;
	private String ipmiPassword;
	private String ipmiDisable_until;
	private String ipmiAvailable;
	private String snmpDisable_until;
	private String snmpAvailable;
	private String maintenanceid;
	private String maintenanceStatus;
	private String maintenanceType;
	private String maintenanceFrom;
	private String ipmiErrorsFrom;
	private String snmpErrorsFrom;
	private String ipmiError;
	private String snmpError;
	private String jmxDisableUntil;
	private String jmxAvailable;
	private String jmxErrorsFrom;
	private String jmxError;
	private String name;
	private String flags;
	private String templateid;
	private String description;
	private String tlsConnect;
	private String tlsAccept;
	private String tlsIssuer;
	private String tlsSubject;
	private String tlsPskIdentity;
	private String tlsPsk;
	private String proxyAddress;
	private String autoCompress;
	private String discover;
	private String inventoryMode;

	public String getHostid() {
		return hostid;
	}

	public void setHostid(String hostid) {
		this.hostid = hostid;
	}

	public String getProxyHostid() {
		return proxyHostid;
	}

	public void setProxyHostid(String proxyHostid) {
		this.proxyHostid = proxyHostid;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDisableUntil() {
		return disableUntil;
	}

	public void setDisableUntil(String disableUntil) {
		this.disableUntil = disableUntil;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getErrorsFrom() {
		return errorsFrom;
	}

	public void setErrorsFrom(String errorsFrom) {
		this.errorsFrom = errorsFrom;
	}

	public String getLastaccess() {
		return lastaccess;
	}

	public void setLastaccess(String lastaccess) {
		this.lastaccess = lastaccess;
	}

	public String getIpmiAuthtype() {
		return ipmiAuthtype;
	}

	public void setIpmiAuthtype(String ipmiAuthtype) {
		this.ipmiAuthtype = ipmiAuthtype;
	}

	public String getIpmiPrivilege() {
		return ipmiPrivilege;
	}

	public void setIpmiPrivilege(String ipmiPrivilege) {
		this.ipmiPrivilege = ipmiPrivilege;
	}

	public String getIpmiUsername() {
		return ipmiUsername;
	}

	public void setIpmiUsername(String ipmiUsername) {
		this.ipmiUsername = ipmiUsername;
	}

	public String getIpmiPassword() {
		return ipmiPassword;
	}

	public void setIpmiPassword(String ipmiPassword) {
		this.ipmiPassword = ipmiPassword;
	}

	public String getIpmiDisable_until() {
		return ipmiDisable_until;
	}

	public void setIpmiDisable_until(String ipmiDisable_until) {
		this.ipmiDisable_until = ipmiDisable_until;
	}

	public String getIpmiAvailable() {
		return ipmiAvailable;
	}

	public void setIpmiAvailable(String ipmiAvailable) {
		this.ipmiAvailable = ipmiAvailable;
	}

	public String getSnmpDisable_until() {
		return snmpDisable_until;
	}

	public void setSnmpDisable_until(String snmpDisable_until) {
		this.snmpDisable_until = snmpDisable_until;
	}

	public String getSnmpAvailable() {
		return snmpAvailable;
	}

	public void setSnmpAvailable(String snmpAvailable) {
		this.snmpAvailable = snmpAvailable;
	}

	public String getMaintenanceid() {
		return maintenanceid;
	}

	public void setMaintenanceid(String maintenanceid) {
		this.maintenanceid = maintenanceid;
	}

	public String getMaintenanceStatus() {
		return maintenanceStatus;
	}

	public void setMaintenanceStatus(String maintenanceStatus) {
		this.maintenanceStatus = maintenanceStatus;
	}

	public String getMaintenanceType() {
		return maintenanceType;
	}

	public void setMaintenanceType(String maintenanceType) {
		this.maintenanceType = maintenanceType;
	}

	public String getMaintenanceFrom() {
		return maintenanceFrom;
	}

	public void setMaintenanceFrom(String maintenanceFrom) {
		this.maintenanceFrom = maintenanceFrom;
	}

	public String getIpmiErrorsFrom() {
		return ipmiErrorsFrom;
	}

	public void setIpmiErrorsFrom(String ipmiErrorsFrom) {
		this.ipmiErrorsFrom = ipmiErrorsFrom;
	}

	public String getSnmpErrorsFrom() {
		return snmpErrorsFrom;
	}

	public void setSnmpErrorsFrom(String snmpErrorsFrom) {
		this.snmpErrorsFrom = snmpErrorsFrom;
	}

	public String getIpmiError() {
		return ipmiError;
	}

	public void setIpmiError(String ipmiError) {
		this.ipmiError = ipmiError;
	}

	public String getSnmpError() {
		return snmpError;
	}

	public void setSnmpError(String snmpError) {
		this.snmpError = snmpError;
	}

	public String getJmxDisableUntil() {
		return jmxDisableUntil;
	}

	public void setJmxDisableUntil(String jmxDisableUntil) {
		this.jmxDisableUntil = jmxDisableUntil;
	}

	public String getJmxAvailable() {
		return jmxAvailable;
	}

	public void setJmxAvailable(String jmxAvailable) {
		this.jmxAvailable = jmxAvailable;
	}

	public String getJmxErrorsFrom() {
		return jmxErrorsFrom;
	}

	public void setJmxErrorsFrom(String jmxErrorsFrom) {
		this.jmxErrorsFrom = jmxErrorsFrom;
	}

	public String getJmxError() {
		return jmxError;
	}

	public void setJmxError(String jmxError) {
		this.jmxError = jmxError;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlags() {
		return flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}

	public String getTemplateid() {
		return templateid;
	}

	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTlsConnect() {
		return tlsConnect;
	}

	public void setTlsConnect(String tlsConnect) {
		this.tlsConnect = tlsConnect;
	}

	public String getTlsAccept() {
		return tlsAccept;
	}

	public void setTlsAccept(String tlsAccept) {
		this.tlsAccept = tlsAccept;
	}

	public String getTlsIssuer() {
		return tlsIssuer;
	}

	public void setTlsIssuer(String tlsIssuer) {
		this.tlsIssuer = tlsIssuer;
	}

	public String getTlsSubject() {
		return tlsSubject;
	}

	public void setTlsSubject(String tlsSubject) {
		this.tlsSubject = tlsSubject;
	}

	public String getTlsPskIdentity() {
		return tlsPskIdentity;
	}

	public void setTlsPskIdentity(String tlsPskIdentity) {
		this.tlsPskIdentity = tlsPskIdentity;
	}

	public String getTlsPsk() {
		return tlsPsk;
	}

	public void setTlsPsk(String tlsPsk) {
		this.tlsPsk = tlsPsk;
	}

	public String getProxyAddress() {
		return proxyAddress;
	}

	public void setProxyAddress(String proxyAddress) {
		this.proxyAddress = proxyAddress;
	}

	public String getAutoCompress() {
		return autoCompress;
	}

	public void setAutoCompress(String autoCompress) {
		this.autoCompress = autoCompress;
	}

	public String getDiscover() {
		return discover;
	}

	public void setDiscover(String discover) {
		this.discover = discover;
	}

	public String getInventoryMode() {
		return inventoryMode;
	}

	public void setInventoryMode(String inventoryMode) {
		this.inventoryMode = inventoryMode;
	}

}
