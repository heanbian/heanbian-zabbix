# heanbian-zabbix

## 前提条件

JDK11+

## pom.xml

具体版本，可以上Maven中央仓库查询

```
<dependency>
  <groupId>com.heanbian.block</groupId>
  <artifactId>heanbian-zabbix</artifactId>
  <version>1.0.1</version>
</dependency>
```

## 使用示例

```
ZabbixTemplate template = new ZabbixTemplate(api_url,user,password);

```

说明：基于 ZABBIX API 5.0 LTS