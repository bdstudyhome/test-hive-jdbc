### Links
- https://sparkbyexamples.com/apache-hive/connect-to-hive-using-jdbc-connection/

### Permission Error
- hadoop/etc/hadoop/core-site.xml
```xml
    <property>
        <name>hadoop.proxyuser.datapros.hosts</name>
        <value>*</value>
    </property>
    <property>
        <name>hadoop.proxyuser.datapros.groups</name>
        <value>*</value>
    </property>
```
- apache-hive/conf/hive-site.xml
```xml
<property>
  <name>hive.server2.authentication</name>
  <value>NONE</value>
</property>
```
- HiveJDBCConnect.java
```java
con = DriverManager.getConnection(conStr, "datapros", "");
```
