# JDBC

---

## PREGUNTAS DE APRENDIZAJE

### 1) ¿Que significa el acrónimo JDBC?

a) Java DataBase Connectivity

b) Java DataBase Conection

c) Java DataBag Connectivity

d) Ninguna de las anteriores


**Respuesta: A -> Java DataBase Connectivity**



### 2) La API de JDBC es un conjunto de:

a) Objetos

b) Clases e Interfaces

c) Métodos

d) Solo Clases

**Respuesta: B -> La API JDBC consiste en un conjunto de interfaces y clases escritas en el lenguaje de programación Java.**



### 3) El encargado de implementar las clases de JDBC es :

a) El JDBC Driver

b) Java

c) La base de datos

d) Ninguna de las anteriores

**Respuesta: A -> a) El JDBC Driver**


### 4) El paquete de la API de JDBC es:

a) java.jdbc.sql.*;

b) java.mysql.*;

c) java.sql.jdbc*;

d) java.sql*;

**Respuesta : D -> d) java.sql*;**



### 5) Cual de estas no es una clase de la API JDBC:

a) Statement

b) ResultSet

c) Connection

d) MetaData

**Respuesta: D ->  MetaData**



### 6) ¿Cual es la clase encarga de conectarse con la base de datos?

a) Statement

b) ResultSet

c) Connection

d) DriverManager

**Respuesta: D -> Driver: Es el enlace de comunicaciones de la base de datos que maneja toda la comunicación con la base de datos. Normalmente, una vez que se carga el controlador, el desarrollador no necesita llamarlo explícitamente.**



###  7) ¿Que datos necesita el objeto Connection para conectarse?

a) url, username y password

b) username y password

c) url, username y nombre BD

d) nombre BD, username, password

**Respuesta: A -> a) url, username y password**



###  8) ¿Cual es la clase encarga de ejecutar las a la base de datos?

a) Statement

b) ResultSet

c) Connection

d) DriverManager

**Respuesta : A -> Statement. Una vez que tengamos la conexión con el objeto Connection, la vamos a usar para crear un
objeto Statement, este objeto recibe la consulta para ejecutarla y enviársela a la base de datos.**



###  9) ¿Cual es la clase encarga de obtener los datos de la base de datos?

a) Statement

b) ResultSet

c) Connection

d) DriverManager

**Respuesta: A -> Los objetos Statement permiten realizar consultas SQL en la base de datos.**


###  10) ¿Cual de estas es la excepción de SQL?

a) MysqlException

b) SQLException

c) DataBaseExcepction

d) ConnectionException

**Respuesta : B -> SQLException**


---
