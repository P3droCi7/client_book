Remember to create and assosiate your own:
<ul>
<li>
application.properties
</li>
<li>
Database
</li>
</ul>

Source path:<br>
src/main/resources/application.properties
<br> 
<br> 
Configuration:
<br>
<ul>
<li>spring.jpa.properties.hibernate.hbm2ddl.auto=create-drop</li>
<li>spring.datasource.url=jdbc:mysql://database:port/databaseName?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT</li>
<li>spring.datasource.username=databaseUsername</li>
<li>spring.datasource.password=usernamePassword</li>
<li>spring.jpa.show-sql=true</li>
<li>server.port=8080</li>
</ul>
