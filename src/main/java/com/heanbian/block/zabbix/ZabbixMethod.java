package com.heanbian.block.zabbix;

public interface ZabbixMethod {

	String APIINFO_VERSION = "apiinfo.version";

	//
	String APPLICATION_GET = "application.get";

	//
	String DISCOVERYRULE_CREATE = "discoveryrule.create";
	String DISCOVERYRULE_DELETE = "discoveryrule.delete";
	String DISCOVERYRULE_COPY = "discoveryrule.copy";
	String DISCOVERYRULE_UPDATE = "discoveryrule.update";
	String DISCOVERYRULE_GET = "discoveryrule.get";

	//
	String MFA_CREATE = "mfa.create";
	String MFA_DELETE = "mfa.delete";
	String MFA_UPDATE = "mfa.update";
	String MFA_GET = "mfa.get";

	//
	String PROXY_CREATE = "proxy.create";
	String PROXY_DELETE = "proxy.delete";
	String PROXY_UPDATE = "proxy.update";
	String PROXY_GET = "proxy.get";

	//
	String PROXYGROUP_CREATE = "proxygroup.create";
	String PROXYGROUP_DELETE = "proxygroup.delete";
	String PROXYGROUP_UPDATE = "proxygroup.update";
	String PROXYGROUP_GET = "proxygroup.get";

	//
	String SCRIPT_CREATE = "script.create";
	String SCRIPT_DELETE = "script.delete";
	String SCRIPT_EXECUTE = "script.execute";
	String SCRIPT_UPDATE = "script.update";
	String SCRIPT_GET = "script.get";
	String SCRIPT_GETSCRIPTSBYEVENTS = "script.getscriptsbyevents";
	String SCRIPT_GETSCRIPTSBYHOSTS = "script.getscriptsbyhosts";

	//
	String SERVICE_CREATE = "service.create";
	String SERVICE_DELETE = "service.delete";
	String SERVICE_GET = "service.get";
	String SERVICE_UPDATE = "service.update";

	//
	String HTTPTEST_CREATE = "httptest.create";
	String HTTPTEST_DELETE = "httptest.delete";
	String HTTPTEST_UPDATE = "httptest.update";
	String HTTPTEST_GET = "httptest.get";

	//
	String HOST_CREATE = "host.create";
	String HOST_DELETE = "host.delete";
	String HOST_MASSREMOVE = "host.massremove";
	String HOST_MASSUPDATE = "host.massupdate";
	String HOST_MASSADD = "host.massadd";
	String HOST_UPDATE = "host.update";
	String HOST_GET = "host.get";

	//
	String HOSTPROTOTYPE_CREATE = "hostprototype.create";
	String HOSTPROTOTYPE_DELETE = "hostprototype.delete";
	String HOSTPROTOTYPE_UPDATE = "hostprototype.update";
	String HOSTPROTOTYPE_GET = "hostprototype.get";

	//
	String HOSTINTERFACE_CREATE = "hostinterface.create";
	String HOSTINTERFACE_DELETE = "hostinterface.delete";
	String HOSTINTERFACE_MASSREMOVE = "hostinterface.massremove";
	String HOSTINTERFACE_MASSADD = "hostinterface.massadd";
	String HOSTINTERFACE_UPDATE = "hostinterface.update";
	String HOSTINTERFACE_REPLACEHOSTINTERFACES = "hostinterface.replacehostinterfaces";
	String HOSTINTERFACE_GET = "hostinterface.get";

	//
	String HOSTGROUP_PROPAGATE = "hostgroup.propagate";
	String HOSTGROUP_CREATE = "hostgroup.create";
	String HOSTGROUP_DELETE = "hostgroup.delete";
	String HOSTGROUP_MASSREMOVE = "hostgroup.massremove";
	String HOSTGROUP_MASSUPDATE = "hostgroup.massupdate";
	String HOSTGROUP_MASSADD = "hostgroup.massadd";
	String HOSTGROUP_UPDATE = "hostgroup.update";
	String HOSTGROUP_GET = "hostgroup.get";

	//
	String EVENT_ACKNOWLEDGE = "event.acknowledge";
	String EVENT_GET = "event.get";

	//
	String TOKEN_CREATE = "token.create";
	String TOKEN_DELETE = "token.delete";
	String TOKEN_UPDATE = "token.update";
	String TOKEN_GENERATE = "token.generate";
	String TOKEN_GET = "token.get";

	//
	String DASHBOARD_CREATE = "dashboard.create";
	String DASHBOARD_DELETE = "dashboard.delete";
	String DASHBOARD_GET = "dashboard.get";
	String DASHBOARD_UPDATE = "dashboard.update";

	//
	String TASK_CREATE = "task.create";
	String TASK_GET = "task.get";

	//
	String VALUEMAP_CREATE = "valuemap.create";
	String VALUEMAP_DELETE = "valuemap.delete";
	String VALUEMAP_UPDATE = "valuemap.update";
	String VALUEMAP_GET = "valuemap.get";

	//
	String CORRELATION_CREATE = "correlation.create";
	String CORRELATION_DELETE = "correlation.delete";
	String CORRELATION_UPDATE = "correlation.update";
	String CORRELATION_GET = "correlation.get";

	//
	String ACTION_CREATE = "action.create";
	String ACTION_DELETE = "action.delete";
	String ACTION_UPDATE = "action.update";
	String ACTION_GET = "action.get";

	//
	String HISTORY_CLEAR = "history.clear";
	String HISTORY_PUSH = "history.push";
	String HISTORY_GET = "history.get";

	//
	String DCHECK_GET = "dcheck.get";

	//
	String DHOST_GET = "dhost.get";

	//
	String DSERVICE_GET = "dservice.get";

	//
	String DRULE_CREATE = "drule.create";
	String DRULE_DELETE = "drule.delete";
	String DRULE_UPDATE = "drule.update";
	String DRULE_GET = "drule.get";

	//
	String ALERT_GET = "alert.get";

	//
	String IMAGE_CREATE = "image.create";
	String IMAGE_DELETE = "image.delete";
	String IMAGE_UPDATE = "image.update";
	String IMAGE_GET = "image.get";

	//
	String GRAPHPROTOTYPE_CREATE = "graphprototype.create";
	String GRAPHPROTOTYPE_DELETE = "graphprototype.delete";
	String GRAPHPROTOTYPE_UPDATE = "graphprototype.update";
	String GRAPHPROTOTYPE_GET = "graphprototype.get";

	//
	String GRAPHITEM_GET = "graphitem.get";

	//
	String ICONMAP_CREATE = "iconmap.create";
	String ICONMAP_DELETE = "iconmap.delete";
	String ICONMAP_UPDATE = "iconmap.update";
	String ICONMAP_GET = "iconmap.get";

	//
	String GRAPH_CREATE = "graph.create";
	String GRAPH_DELETE = "graph.delete";
	String GRAPH_UPDATE = "graph.update";
	String GRAPH_GET = "graph.get";

	//
	String MEDIATYPE_DELETE = "mediatype.delete";
	String MEDIATYPE_CREATE = "mediatype.create";
	String MEDIATYPE_UPDATE = "mediatype.update";
	String MEDIATYPE_GET = "mediatype.get";

	//
	String AUDITLOG_GET = "auditlog.get";

	//
	String REPORT_CREATE = "report.create";
	String REPORT_DELETE = "report.delete";
	String REPORT_UPDATE = "report.update";
	String REPORT_GET = "report.get";

	//
	String MAP_CREATE = "map.create";
	String MAP_DELETE = "map.delete";
	String MAP_UPDATE = "map.update";
	String MAP_GET = "map.get";

	//
	String HOUSEKEEPING_UPDATE = "housekeeping.update";
	String HOUSEKEEPING_GET = "housekeeping.get";

	//
	String SLA_CREATE = "sla.create";
	String SLA_DELETE = "sla.delete";
	String SLA_UPDATE = "sla.update";
	String SLA_GET = "sla.get";
	String SLA_GETSLI = "sla.getsli";

	//
	String MODULE_CREATE = "module.create";
	String MODULE_DELETE = "module.delete";
	String MODULE_UPDATE = "module.update";
	String MODULE_GET = "module.get";

	//
	String TEMPLATEGROUP_CREATE = "templategroup.create";
	String TEMPLATEGROUP_DELETE = "templategroup.delete";
	String TEMPLATEGROUP_GET = "templategroup.get";
	String TEMPLATEGROUP_MASSADD = "templategroup.massadd";
	String TEMPLATEGROUP_MASSREMOVE = "templategroup.massremove";
	String TEMPLATEGROUP_MASSUPDATE = "templategroup.massupdate";
	String TEMPLATEGROUP_PROPAGATE = "templategroup.propagate";
	String TEMPLATEGROUP_UPDATE = "templategroup.update";

	//
	String TEMPLATE_CREATE = "template.create";
	String TEMPLATE_DELETE = "template.delete";
	String TEMPLATE_MASSREMOVE = "template.massremove";
	String TEMPLATE_MASSUPDATE = "template.massupdate";
	String TEMPLATE_MASSADD = "template.massadd";
	String TEMPLATE_UPDATE = "template.update";
	String TEMPLATE_GET = "template.get";

	//
	String TEMPLATEDASHBOARD_CREATE = "templatedashboard.create";
	String TEMPLATEDASHBOARD_DELETE = "templatedashboard.delete";
	String TEMPLATEDASHBOARD_UPDATE = "templatedashboard.update";
	String TEMPLATEDASHBOARD_GET = "templatedashboard.get";

	//
	String REGEXP_CREATE = "regexp.create";
	String REGEXP_DELETE = "regexp.delete";
	String REGEXP_UPDATE = "regexp.update";
	String REGEXP_GET = "regexp.get";

	//
	String USER_CREATE = "user.create";
	String USER_DELETE = "user.delete";
	String USER_UPDATE = "user.update";
	String USER_CHECKAUTHENTICATION = "user.checkAuthentication";
	String USER_LOGOUT = "user.logout";
	String USER_LOGIN = "user.login";
	String USER_GET = "user.get";
	String USER_UNBLOCK = "user.unblock";
	String USER_PROVISION = "user.provision";
	String USER_RESETTOTP = "user.resettotp";

	//
	String USERMACRO_CREATE = "usermacro.create";
	String USERMACRO_CREATEGLOBAL = "usermacro.createglobal";
	String USERMACRO_DELETE = "usermacro.delete";
	String USERMACRO_DELETEGLOBAL = "usermacro.deleteglobal";
	String USERMACRO_UPDATE = "usermacro.update";
	String USERMACRO_UPDATEGLOBAL = "usermacro.updateglobal";
	String USERMACRO_GET = "usermacro.get";

	//
	String USERDIRECTORY_CREATE = "userdirectory.create";
	String USERDIRECTORY_DELETE = "userdirectory.delete";
	String USERDIRECTORY_UPDATE = "userdirectory.update";
	String USERDIRECTORY_TEST = "userdirectory.test";
	String USERDIRECTORY_GET = "userdirectory.get";

	//
	String USERGROUP_CREATE = "usergroup.create";
	String USERGROUP_DELETE = "usergroup.delete";
	String USERGROUP_UPDATE = "usergroup.update";
	String USERGROUP_GET = "usergroup.get";

	//
	String ITEM_CREATE = "item.create";
	String ITEM_DELETE = "item.delete";
	String ITEM_UPDATE = "item.update";
	String ITEM_GET = "item.get";

	//
	String ITEMPROTOTYPE_CREATE = "itemprototype.create";
	String ITEMPROTOTYPE_DELETE = "itemprototype.delete";
	String ITEMPROTOTYPE_UPDATE = "itemprototype.update";
	String ITEMPROTOTYPE_GET = "itemprototype.get";

	//
	String MAINTENANCE_CREATE = "maintenance.create";
	String MAINTENANCE_DELETE = "maintenance.delete";
	String MAINTENANCE_UPDATE = "maintenance.update";
	String MAINTENANCE_GET = "maintenance.get";

	//
	String AUTOREGISTRATION_UPDATE = "autoregistration.update";
	String AUTOREGISTRATION_GET = "autoregistration.get";

	//
	String ROLE_CREATE = "role.create";
	String ROLE_DELETE = "role.delete";
	String ROLE_GET = "role.get";
	String ROLE_UPDATE = "role.update";

	//
	String TRIGGER_CREATE = "trigger.create";
	String TRIGGER_DELETE = "trigger.delete";
	String TRIGGER_UPDATE = "trigger.update";
	String TRIGGER_GET = "trigger.get";

	//
	String TRIGGERPROTOTYPE_UPDATE = "triggerprototype.update";
	String TRIGGERPROTOTYPE_CREATE = "triggerprototype.create";
	String TRIGGERPROTOTYPE_DELETE = "triggerprototype.delete";
	String TRIGGERPROTOTYPE_GET = "triggerprototype.get";

	//
	String AUTHENTICATION_UPDATE = "authentication.update";
	String AUTHENTICATION_GET = "authentication.get";

	//
	String SETTINGS_UPDATE = "settings.update";
	String SETTINGS_GET = "settings.get";

	//
	String TREND_GET = "trend.get";

	//
	String CONNECTOR_CREATE = "connector.create";
	String CONNECTOR_DELETE = "connector.delete";
	String CONNECTOR_UPDATE = "connector.update";
	String CONNECTOR_GET = "connector.get";

	//
	String CONFIGURATION_IMPORTCOMPARE = "configuration.importcompare";
	String CONFIGURATION_IMPORT = "configuration.import";
	String CONFIGURATION_EXPORT = "configuration.export";

	//
	String PROBLEM_GET = "problem.get";

	//
	String HANODE_GET = "hanode.get";

}
