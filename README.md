# heanbian-zabbix

## 前提条件

JDK 21

## pom.xml

具体版本，可以上[Maven中央仓库](https://repo1.maven.org/maven2/com/heanbian/heanbian-zabbix/)查询

```
<dependency>
  <groupId>com.heanbian</groupId>
  <artifactId>heanbian-zabbix</artifactId>
  <version>20.3</version>
</dependency>
```

## 使用示例

```
ZabbixTemplate template = new ZabbixTemplate(api_url,user,password);

```

说明：支持 `Zabbix API 5.0 LTS` 、`Zabbix API 6.0 LTS` 、`Zabbix API 7.0 LTS`