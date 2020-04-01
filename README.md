Remember to create and assosiate your own:
<ul>
application.properties
</ul>
<ul>
Database
</ul>


Source path:<br>
src/main/resources/application.properties
<br> 
<br> 
Configuration:
<br>
<ul>spring.jpa.properties.hibernate.hbm2ddl.auto=create-drop</ul>
<ul>spring.datasource.url=jdbc:mysql://<database>:<port>/<databaseName>?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT</ul>
<ul>spring.datasource.username=<databaseUsername></ul>
<ul>spring.datasource.password=<usernamePassword></ul>
<ul>spring.jpa.show-sql=true</ul>
<ul>server.port=8080</ul>
