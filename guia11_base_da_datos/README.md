# Base de datos

## Ejemplos

```
# Creación de base de datos
CREATE DATABASE superheroes;
```

```
# Uso de base de datos
USE superheroes;
```

```
# Creación de tabla
CREATE TABLE creador (
	id_creador INT NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    PRIMARY KEY (id_creador)
);
```

```
# Creación de tabla
CREATE TABLE personajes (
	id_personaje INT NOT NULL,
    nombre_real VARCHAR(20) NOT NULL,
    personaje VARCHAR(20) NOT NULL,
    inteligencia INT NOT NULL,
    fuerza VARCHAR(10) NOT NULL,
    velocidad INT NOT NULL,
    poder INT NOT NULL,
    aparicion INT NOT NULL,
    ocupacion VARCHAR(30),
    id_creador INT NOT NULL,
    PRIMARY KEY (id_personaje),
    FOREIGN KEY (id_creador) REFERENCES creador (id_creador)
);
```


```
# Inserción de valores a la tabla
INSERT INTO creador VALUES (1, 'Marvel');
INSERT INTO creador VALUES (2, 'DC Comics');
```

```
# Inserción de valores a la tabla
INSERT INTO personajes VALUES (1, 'Bruce Banner', 'Hulk', 160, '600 mil', 75, 98, 1962, 'Físico Nuclear', 1);
INSERT INTO personajes VALUES (2, 'Tony Stark', 'Iron Man', 170, '200 mil', 70, 123, 1963, 'Inventor Industrial', 1);
INSERT INTO personajes VALUES (3, 'Thor Odinson', 'Thor', 145, 'infinita', 100, 235, 1962, 'Rey Asgard', 1);
INSERT INTO personajes VALUES (4, 'Wanda Maximoff', 'Bruja Escarlata', 170, '100 mil', 90, 345, 1964, 'Bruja', 1);
INSERT INTO personajes VALUES (5, 'Carol Danvers', 'Capitana Marvel', 157, '250 mil', 85, 128, 1968, 'Oficial de inteligencia', 1);
INSERT INTO personajes VALUES (6, 'Thanos', 'Thanos', 170, 'infinita', 40, 306, 1973, 'Adorador de la muerte', 1);
INSERT INTO personajes VALUES (7, 'Peter Parker', 'Spiderman', 165, '25 mil', 80, 74, 1962, 'Fotógrafo', 1);
INSERT INTO personajes VALUES (8, 'Steve Rogers', 'Capitán América', 145, '600', 45, 60, 1941, 'Oficial Federal', 1);
INSERT INTO personajes VALUES (9, 'Bobby Drake', 'Ice Man', 140, '2 mil', 64, 122, 1963, 'Contador', 1);
INSERT INTO personajes VALUES (10, 'Barry Allen', 'Flash', 160, '10 mil', 120, 168, 1956, 'Científico forense', 2);
INSERT INTO personajes VALUES (11, 'Bruce Wayne', 'Batman', 170, '500', 32, 47, 1939, 'Hombre de negocios', 2);
INSERT INTO personajes VALUES (12, 'Clarck Kent', 'Superman', 165, 'infinita', 120, 182, 1948, 'Reportero', 2);
INSERT INTO personajes VALUES (13, 'Diana Prince', 'Mujer Maravilla', 160, 'infinita', 95, 127, 1949, 'Princesa guerrera', 2);
```

```
# Consultas a la tabla
SELECT * FROM creador;
SELECT * FROM personajes;
```

```
# Modificación de registro
UPDATE personajes
SET aparicion = 1938
WHERE id_personaje = 12;
```   

```
# Eliminación de registro
DELETE
FROM personajes
WHERE id_personaje = 10;
```


```
# Eliminación de tablas y de base de datos
DROP TABLE creador;
DROP TABLE personajes;
DROP DATABASE superheroes;
```

---

## VIDEOS:


---
🧑‍💻 [Introduccion Base de Datos](https://www.youtube.com/watch?v=Thq0vO9v_80&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw)

## Informacion de los videos

Las **BASE DE DATOS RELACIONALES** comparten conceptos con **POO**, porque las bases de datos relacionales tratan de manipular y modelar problemas de la realidad.

Vamos a ver como los objetos del programa de Java se pueden almacenar en una **Base de Datos** también llamada **Schema**, y está conformada por **tablas** que representan lo que el programa pretende modelar en la realidad.

Las tablas poseen **campos** / **columnas** que representan los atributos de los objetos y contienen **tipos de datos**:

**VARCHAR** -> String y tambien van entre comillas SIMPLES

**SQL**: es un lenguaje declarativo de acceso a base de datos que permite especificar diversos tipos de operaciones en ellas. También llamado lenguaje de consulta estructurado. Permite **recuperar**, **modificar**, y **eliminar** información, además de **crear** nuevos esquemas(SCHEMA / BASE DE DATOS).


Los **esquemas** contienen las **tablas** donde se almacena la informacion de la aplicación.

**Datos DDL**: permiten crear y definir nuevas bases de datos, campos e indices.

Los comandos son:

	 * **CREATE**: crea esquemas, nuevas tablas, campos e indices.
	 
	 * **DROP**: elimina tablas e indices
	 
	 * **ALTER**: modifica las tablas agregando campos o cambiando la definición de los campos.


## CREATE 

CREO  una base de datos / schema , puede ser tanto con SCHEMA como con DATABASE:

```
CREATE SCHEMA 'egg';
```

```
CREATE DATABASE 'egg2';
```

Con el *trueno* puedo ejecutar mi sentencia.

Una vez creada del lado izquierdo donde dice *schema* debo **actualizar / refrescar** para ver los cambios, para ver mi tabla.

Ahora voy a **crear una tabla dentro del schema / la base de datos**, se asimila a cuando uno define una clase junto a sus atributos y tipos de datos, es similar a definir una clase.

Para los nombres de cada columna si tengo más de una palabra las debo **separar con guión bajo**, y siempre todo en **minúscula**,  por ejemplo *nombre_mascota*

Damos el nombre a la tabla

Vamos definiendo cada columna con su nombre y su tipo de dato, tambien le puedo definir la cantidad de caracteres, si es una **PK** (primary key / clave primaria), si quiero que tenga nulos ( NOT NULL).

Entre () indico el MAX_LEN

```
CREATE TABLE 'egg2'.'curso_programacion'(
  'nombre_curso' VARCHAR (255) NOT NULL,
  'cantidad_alumno' INT NULL);
```

## DROP

Para **eliminar** un **schema** o una **tabla**.

La puedo eliminar directamente desde la parte donde tengo el SCHEMA, hago click en la tabla a eliminar y drop.

Tambien se puede hacer con sentencia, siempre y cuando marquemos el schema donde está la tabla qie queremos eliminar, lo que tenemos que hacer es seleccionarlo, desde chemma hacer doble ckick en la tabla que queremos eliminar



```
DROP table nombre_de_la_tabla;
```


Para borrar el **schema** tambien se puede hacer desde el SCHEMA seleccionandolo con click y drop.

**OJO** porque al borrar SCHEMA se borran todas sus tablas y la información que tenían.


También se puede hacer en forma de sentencia

```
DROP schema nombre_de_mi_base_de_datos;
```

## ALTER

Se utiliza para **modificar** un **schema** o una **tabla**.

Lo puedo hacer directo desde el modo grafico, me posiciono y lo cambio.

Tambien lo puedo hacer en forma de sentencia.

Voy a cambiar de nombre a nombre1, de la tabla prueba_tabla de la base de datos: prueba

```
ALTER TABLE 'prueba'.'prueba_tabla'
CHANGE COLUMN 'nombre' 'nombre1' VARCHAR(255) NOT NULL;
```

Y si por ejemplo le quiero cambiar la longitud:

```
ALTER TABLE 'prueba'.'prueba_tabla'
CHANGE COLUMN 'nombre1' 'nombre1' VARCHAR(50) NOT NULL;
```

## SCRIPT

**Archivo**s SQL que incorporan sentencias SQL ya escritas, nos ahorran tiempo, solo lo importamos y lo ejecutamos.


Arriba de todo a la izquierda el segundo **OPEN A SQL SCRIPT FIELD IN A NEW QUERY TAB**


Un ejemplo de script

```
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Sambung');
```

Para ver la tabla:

```
SELECT * from fabricante;
```

SELECT * (todo) from(de la tabla) fabricante(nombre de la tabla)


---

🧑‍💻 [Insertar, modificar, eliminar](https://www.youtube.com/watch?v=Sa7f59JjKP4&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=3)

## DML

**DML** lenguaje de manupilación de datos, nos permite:

	 * **INSERT** agregar datos a las tablas. Carga lotes de datos en la base de datos en una única operación.
	 
	 * **UPDATE** modificar datos. Modifica los valores de los campos y registros específicos.
	 
	 * **DELETE** eliminar datos (un registro de na tabla o de varias tablas)

Es lo equivalente a un ABM (Alta, Baja, Modificación)


### INSERT INTO

En base a la misma tabla del fabricante amos a agregar registros con **INSERT INTO**

	 * **INSERT INTO** en su formato más sencillo se utiliza para añadir una sola fila a una tabla. Debemos especificar el nomre de la tabla y una lista de valores para la fila. Los valores deben suministrarse en el mismo orden en que se especificaron los atributos correspondientes en el comando CREATE TABLE.
	 
```
INSERT INTO nombre_tabla (columna1, columna2,...) VALUES (valor1, valor2,...);
```

En mi tabla de fabricante:

```
SELECT * FROM fabricante;

INSERT INTO fabricante (CODIGO, NOMBRE) VALUES (10, 'HP');
INSERT INTO fabricante (CODIGO, NOMBRE) VALUES (11, 'LG');
```

### UPDATE

Para modificar valores de atributos de una o más filas seleccionadas. Una cláusula WHERE en el comando UPDATE selecciona las filas de una tabla que se van a modificar. La sentencia UPDATE tiene la siguiente forma, para el caso de querer modificar dos datos:

```
UPDATE nombre_tabla
SET col_nombre1 = (valor | DEFAULT),
        col_nombre2 =  (valor | DEFAULT)
[ORDER BY...] [WHERE condicion]
```

Indicar la tabla y el código que queremos modificar junto con los valores que están involucrados (en este caso nombre).

```
SELECT * FROM fabricante;

UPDATE fabricante
	SET NOMBRE = 'HP'
WHERE CODIGO = 10;
```

**RECORDAR** las *claves primarias* una vez creadas no pueden modificarse.

### DELETE

Elimina filas de una tabla. Inclyye una clásula WHERE, para seleccionar las filas que se van a eliminar.

	 * Las filas se eliminan explícitamente sólo de una tabla a al vez. Sin embargo, la eliminación se puede propagar a filas de otras tablas si se han especificado  opciones de acciones referenciales en las restricciones de integridad referencial del DDL.
	 * En función del número de filas seleccionadas por la condición de la clásula WHERE, ninguna, una o varias filas pueden ser eliminadas por un solo comando DELETE. **La ausencia de una clásula WHERE significa que se corrarán todas las filas de la relación**, sin embargo, la tabla sigue existiendo.

```
DELETE FROM nombre_tabla [WHERE condicion] [ORDER BY ...] [LIMIT cantidad_filas]
```

En el ejemplo que ya teníamos queremos borrar de la tabla fabricante el registo con código 10:


```
SELECT * FROM fabricante;

DELETE
  FROM fabricante
  WHERE codigo = 10;
```

---


🧑‍💻 [Select, From, Where](https://www.youtube.com/watch?v=bLocGDEEs0I&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=4)

### Realizar consultas

### SELECT

### FROM

### WHERE
---

🧑‍💻 [Tablas relacionadas](https://www.youtube.com/watch?v=IiJk53KWJZc&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=5)

:computer: [Join avanzados](https://www.youtube.com/watch?v=5XAkfs3K5ZI&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=6)

:computer: [Order by, Group by, Having](https://www.youtube.com/watch?v=XE-vi6mNcuY&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=7)


---

## PREGUNTAS DE APRENDIZAJE

### 1) Responda Verdadero (V) o Falso (F)

Una primary key es la columna (columnas) que tiene datos completamente únicos a lo largo de la tabla.

->

VERDADERO


La función principal de una clave primaria en una tabla es mantener su integridad.

->

VERDADERO


Las foreign keys o llaves foráneas son campos que vinculan una tabla con la clave primaria o externa de otra tabla.

->

VERDADERO


Una tabla no puede tener más de una clave foránea definida.

->

FALSO, SI PUEDE


INSERT, UPDATE y CREATE son commandos DDL. 

->

FALSO . DDDL = lenguaje de definicion de datos. INSERT, UPDATE y CREATE son DML = lenguaje de manipulacion de datos


El comando DROP se utiliza para eliminar todas las filas de una tabla.

->

FALSO el comando DROP elimina TODA la tabla, es decir las filas y las columnas. Con DELETE se eliminan ls filas.



### 2) ¿Cuál de las siguientes sentencias son ciertas sobre las relaciones?

a) Las relaciones son entidades

b) Las relaciones son enlaces lógicos entre las tablas implementadas a través de primary y foreign keys.

c) Las relaciones son almacenadas como atributos en la base de datos.

d) Las relaciones explícitamente definen una asociación entre 2 tablas.

**Respuesta: todas las anteriores**


### 3) ¿Cómo se crea una base de datos con SQL?

a) CREATE DATABASE

b) UPDATE DATABASE

c) ALTER DATABASE

d) Las anteriores respuestas no son correctas

**Respuesta: se crea con: CREATE DATABASE**


### 4) En SQL, ¿cuál de estas sentencias añade una fila a una tabla en una base de datos?

a) ADD

b) INSERT

c) UPDATE

d) INCLUDE

**Respuesta B: INSERT INTO nombre_tabla...**


### 5) En SQL, para modificar la estructura de una tabla de una base de datos se emplea la instrucción

a) ALTER TABLE

b) CHANGE TABLE

c) MODIFY TABLE

d) Las anteriores respuestas no son correctas

**Respuesta A: ALTER TABLE modifica la tabla agregando campos o cambiando la definicion de los campos**


### 6) ¿Qué instrucción se emplea para eliminar todo el contenido de una tabla, pero conservando la tabla?

a) DELETE TABLE

b) DROP TABLE

c) TRUNCATE TABLE

d) Las anteriores respuestas no son correctas

**Respuesta A y C : DELETE y TRUNCATE TABLE borran la data de la tabla, pero la tabla se conserva vacçia. DROP TABLE eimina la definicion de la tabla**


### 7) ¿Cómo se borra toda una base de datos con SQL?

e) DELETE DATABASE

f) DROP DATABASE

g) ERASE DATABASE

h) Las anteriores respuestas no son correctas

**Respuesta F: DROP DATABASE**


### 8) ¿En cuál de las siguientes sentencias del lenguaje SQL se emplea la cláusula SET?

a) DELETE

b) DROP

c) SELECT

d) UPDATE

**Respuesta D: UPDATE**


### 9) En SQL, para eliminar las filas duplicadas del resultado de una sentencia SELECT se emplea:

a) NO DUPLICATE

b) UNIQUE

c) DISTINCT

d) Las anteriores respuestas no son correctas

**Respuesta C: DISTINCT queremos traer solo registros diferentes**


### 10) Una sentencia SELECT sin la cláusula WHERE devuelve

a) Todos los registros existentes en la tabla que no estén relacionados con otra tabla

b) Todos los registros existentes en la tabla

c) No se puede ejecutar una sentencia SELECT sin la cláusula WHERE

d) Las anteriores respuestas no son correctas

**Respuesta B: Todos los registros existentes en la tabla es como tener el ALL (*)**


### 11) En SQL, para ordenar los datos devueltos por una sentencia SELECT se emplea la cláusula

a) ORDER BY

b) ORDERED BY

c) SORT BY

d) SORTED BY

**Respuesta: ORDER BY se ordena**


### 12) En una cláusula LIKE, ¿cómo se obtienen todos los nombres de personas que comienzan con "Juan"?

a) LIKE "Juan%"

b) LIKE "Juan*"

c) LIKE "Juan$"

d) LIKE "Juan&"

**Respuesta A: Juan% indica que es donde comienza**


### 13) ¿Cuál de las siguientes no es una función de agregación?

a) AVG()

b) FLOOR()

c) SUM()

d) Las anteriores respuestas no son correctas

**Respuesta B: FLOOR**


### 14) ¿Cuál de las siguientes no es una función de agregación?

a) COUNT()

b) LIMIT()

c) MAX()

d) MIN()

**Respuesta B: LIMIT**



---

## Bibliografía

Información sacada de las paginas:

[1 - https://www.oracle.com/ar/database/what-is-a-relational-database](https://www.oracle.com/ar/database/what-is-a-relational-database/)
[2 - https://www.geeksforgeeks.org/sql-tutorial/](https://www.geeksforgeeks.org/sql-tutorial/)

---


## EJERCICIOS DE APRENDIZAJE

### Ejercicio 1

Abrir el script llamado “superhéroes” y ejecutarlo de modo tal que se cree la base de datos y todas sus tablas. Posteriormente, crear las tablas que se muestran en el siguiente modelo de entidad relación:

| creador |
| ------- |
| (PK) id_creador INT(11) |
| nombre VARCHAR (20) |

| personajes |
| ---------- |
| (PK) id_persona INT(11) |
| nombre_real VARCHAR(20) |
| personaje VARCHAR(20) |
| inteligencia INT(11) |
| fuerza VARCHAR(10) |
| velocidad INT(11) |
| poder INT(11) |
| aparicion INT(11) |
| ocupacion VARCHAR(30) |
|id_creador INT(11) |


```
#creo la base de datos con nombre superheroes
CREATE DATABASE  superheroes;
#creo la tabla creador y sus columnas, siempre recordar seleccionar la bd en SCHEMAS
CREATE TABLE creador (
	id_creador INT(11) NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    PRIMARY KEY (id_creador)
);

# Creación de tabla
CREATE TABLE personajes (
	id_personaje INT NOT NULL,
    nombre_real VARCHAR(20) NOT NULL,
    personaje VARCHAR(20) NOT NULL,
    inteligencia INT NOT NULL,
    fuerza VARCHAR(10) NOT NULL,
    velocidad INT NOT NULL,
    poder INT NOT NULL,
    aparicion INT NOT NULL,
    ocupacion VARCHAR(30),
    id_creador INT NOT NULL,
    PRIMARY KEY (id_personaje),
    FOREIGN KEY (id_creador) REFERENCES creador (id_creador)
);
```

## Parte A ) Inserción de valores a la tabla

```
# A ) Inserción de valores a la tabla
INSERT INTO creador VALUES (1, 'Marvel');
INSERT INTO creador VALUES (2, 'DC Comics');

# Inserción de valores a la tabla
INSERT INTO personajes VALUES (1, 'Bruce Banner', 'Hulk', 160, '600 mil', 75, 98, 1962, 'Físico Nuclear', 1);
INSERT INTO personajes VALUES (2, 'Tony Stark', 'Iron Man', 170, '200 mil', 70, 123, 1963, 'Inventor Industrial', 1);
INSERT INTO personajes VALUES (3, 'Thor Odinson', 'Thor', 145, 'infinita', 100, 235, 1962, 'Rey Asgard', 1);
INSERT INTO personajes VALUES (4, 'Wanda Maximoff', 'Bruja Escarlata', 170, '100 mil', 90, 345, 1964, 'Bruja', 1);
INSERT INTO personajes VALUES (5, 'Carol Danvers', 'Capitana Marvel', 157, '250 mil', 85, 128, 1968, 'Oficial de inteligencia', 1);
INSERT INTO personajes VALUES (6, 'Thanos', 'Thanos', 170, 'infinita', 40, 306, 1973, 'Adorador de la muerte', 1);
INSERT INTO personajes VALUES (7, 'Peter Parker', 'Spiderman', 165, '25 mil', 80, 74, 1962, 'Fotógrafo', 1);
INSERT INTO personajes VALUES (8, 'Steve Rogers', 'Capitán América', 145, '600', 45, 60, 1941, 'Oficial Federal', 1);
INSERT INTO personajes VALUES (9, 'Bobby Drake', 'Ice Man', 140, '2 mil', 64, 122, 1963, 'Contador', 1);
INSERT INTO personajes VALUES (10, 'Barry Allen', 'Flash', 160, '10 mil', 120, 168, 1956, 'Científico forense', 2);
INSERT INTO personajes VALUES (11, 'Bruce Wayne', 'Batman', 170, '500', 32, 47, 1939, 'Hombre de negocios', 2);
INSERT INTO personajes VALUES (12, 'Clarck Kent', 'Superman', 165, 'infinita', 120, 182, 1948, 'Reportero', 2);
INSERT INTO personajes VALUES (13, 'Diana Prince', 'Mujer Maravilla', 160, 'infinita', 95, 127, 1949, 'Princesa guerrera', 2);

# Una vez insertados todos los registros realizar una selección de todos los atributos para
# corroborar que la tablas se encuentren completas.
#Para ver la tabla creador
SELECT * from creador;
# Para ver la tabla personajes
SELECT * from personajes;
```

Parte B: Cambiar en la tabla personajes el año de aparición a 1938 del personaje Superman.

```
# B ) Cambiar en la tabla personajes el año de aparición a 1938 del personaje Superman.
# A continuación, realizar un listado de toda la tabla para verificar que el personaje haya sido actualizado.
#MODIFICACION DE REGISTRO
UPDATE personajes #DE QUE TABLA
SET aparicion = 1938 #QUE CAMBIO A QUE VALOR
WHERE id_personaje = 12;  #EN QUE FILA
```

Parte C: Eliminar el registro que contiene al personaje Flash.

```
# c) Eliminar el registro que contiene al personaje Flash. 
# A continuación, mostrar toda la tabla para verificar que el registro haya sido eliminado.
DELETE
FROM personajes  #de que tabla
WHERE id_personaje = 10; #que registro (fila) elimino
# Para ver la tabla personajes y chequear que no esta el registro
SELECT * from personajes;
```

Parte D: Eliminar la base de datos superhéroes.

```
# D) Eliminar la base de datos superhéroes.
DROP TABLE creador;
DROP TABLE personajes;
DROP DATABASE superheroes;
```

[ver resolucion](https://github.com/eugenia1984/Egg-FS-java/blob/master/guia11_base_da_datos/ejercicio1.sql)

---

## Ejerccicio 2

Abrir el script llamado “personal-inserts” y ejecutarlo de modo tal que se cree la base
de datos “personal”, se creen las tablas y se inserten todos los datos en las tablas para
que quede de la siguiente manera:

| departamentos |
| ------------- |
| (PK) id_depto INT |
| nombre_depto VARCHAR(20) |
| ciudad VARCHAR(15) |
| cod_director VARCHAR(12) |

| empleados |
| --------- |
| (PK) id_empl INT |
| nombre CHAR(30) |
| sex_emp CHAR(1) |
|fec_nac DATE |
| sal_emp FLOAT |
|comision_emp FLOAT |
| cargo_emp FLOAT(15) |
| cod_jefe VARCHAR(12) |
| id_depto INT |


Creo la base de datos de nombre : personal

```
# Creo la base de datos de nombre : personal
#CREATE DATABASE personal;
DROP DATABASE IF EXISTS personal;
CREATE DATABASE personal CHARACTER SET utf8mb4;
USE personal;
```

Creo la primer tabla con su PK y columnas

```
# Creo la primer tabla con su PK y columnas
CREATE TABLE departamentos (
id_depto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre_depto VARCHAR(20) NOT NULL,
  ciudad VARCHAR(15) NULL,
  cod_director VARCHAR(12) NULL
);
```

Creo la segunda tabla empleados

```
# Creo la segunda tabla
CREATE TABLE empleados(
id_emp INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre CHAR(30) NOT NULL,
sex_emp CHAR(1) NOT NULL,
fec_nac DATE NOT NULL,
fec_incorporacion DATE NOT NULL,
sal_empl FLOAT NOT NULL,
comision_emp FLOAT NOT NULL,
cargo_emp VARCHAR(15),
cod_jefe VARCHAR(12) NOT NULL,
  id_depto INT UNSIGNED NOT NULL,
FOREIGN KEY (id_depto) REFERENCES departamentos(id_depto)  
);
```

Inserto datos en la tabla departamentos
 
```
# Inserto datos en la tabla departamentos
INSERT INTO `departamentos` VALUES (1000,'GERENCIA','CIUDAD REAL','31.840.269');
INSERT INTO `departamentos` VALUES (1500,'PRODUCCIÓN','CIUDAD REAL','16.211.383');
INSERT INTO `departamentos` VALUES (2000,'VENTAS','CIUDAD REAL','31.178.144');
INSERT INTO `departamentos` VALUES (2100,'VENTAS','BARCELONA','16.211.383');
INSERT INTO `departamentos` VALUES (2200,'VENTAS','VALENCIA','16.211.383');
INSERT INTO `departamentos` VALUES (2300,'VENTAS','MADRID','16.759.060');
INSERT INTO `departamentos` VALUES (3000,'INVESTIGACIÓN','CIUDAD REAL','16.759.060');
INSERT INTO `departamentos` VALUES (3500,'MERCADEO','CIUDAD REAL','22.222.222');
INSERT INTO `departamentos` VALUES (4000,'MANTENIMIENTO','CIUDAD REAL','333.333.333');
INSERT INTO `departamentos` VALUES (4100,'MANTENIMIENTO','BARCELONA','16.759.060');
INSERT INTO `departamentos` VALUES (4200,'MANTENIMIENTO','VALENCIA','16.759.060');
INSERT INTO `departamentos` VALUES (4300,'MANTENIMIENTO','MADRID','16.759.060');
```

Inserto datos en la tabla empleados
 
```
#INSERTO DATOS EN LA TABLA EMPLEADOS
INSERT INTO `empleados` VALUES (222,'José Giraldo','M','1985-01-20','2000-11-01',1200000,400000,'Asesor','22.222.222',3500);
INSERT INTO `empleados` VALUES (333,'Pedro Blanco','M','1987-10-28','2000-10-01',800000,3000000,'Vendedor','31.178.144',2000);
INSERT INTO `empleados` VALUES (444,'Jesús Alfonso','M','1988-03-14','2000-10-01',800000,3500000,'Vendedor','31.178.144',2000);
INSERT INTO `empleados` VALUES (555,'Julián Mora','M','1989-07-03','2000-10-01',800000,3100000,'Vendedor','31.178.144',2200);
INSERT INTO `empleados` VALUES (666,'Manuel Millán','M','1990-12-08','2004-06-01',800000,3700000,'Vendedor','31.178.144',2300);
INSERT INTO `empleados` VALUES (777,'Marcos Cortez','M','1986-06-23','2000-04-16',2550000,500000,'Mecánico','333.333.333',4000);
INSERT INTO `empleados` VALUES (782,'Antonio Gil','M','1980-01-23','2010-04-16',850000,1500000,'Técnico','16.211.383',1500);
INSERT INTO `empleados` VALUES (219,'Melissa Roa','F','1960-06-19','2001-03-16',2250000,2500000,'Vendedor','31.178.144',2100);
INSERT INTO `empleados` VALUES (111,'Irene Díaz','F','1979-09-28','2004-06-01',1050000,200000,'Mecánico','333.333.333',4200);
INSERT INTO `empleados` VALUES (383,'Luis Pérez','M','1956-02-25','2000-01-01',5050000,0,'Director','31.840.269',1500);
INSERT INTO `empleados` VALUES (060,'Darío Casas','M','1960-04-05','1992-11-01',4500000,500000,'Investigador','31.840.269',3000);
INSERT INTO `empleados` VALUES (802,'William Daza','M','1982-10-09','1999-12-16',2250000,1000000,'Investigador','16.759.060',3000);
INSERT INTO `empleados` VALUES (221,'Carla López','F','1975-05-11','2005-07-16',4500000,500000,'Jefe Mercadeo','31.840.269',3500);
INSERT INTO `empleados` VALUES (331,'Carlos Rozo','M','1975-05-11','2001-09-16',750000,500000,'Vigilante','31.840.269',3500);
INSERT INTO `empleados` VALUES (099,'Diana Solarte','F','1957-11-19','1990-05-16',1250000,500000,'Secretaria','31.840.269',1000);
INSERT INTO `empleados` VALUES (144,'Rosa Angulo','F','1957-03-15','1998-08-16',3250000,3500000,'Jefe Ventas','31.840.269',2000);
INSERT INTO `empleados` VALUES (269,'María Rojas','F','1959-01-15','1990-05-16',6250000,1500000,'Gerente','31.840.261',1000);
INSERT INTO `empleados` VALUES (343,'Elisa Rojas','F','1979-09-28','2004-06-01',3000000,1000000,'Jefe Mecánicos','31.840.269',4000);
INSERT INTO `empleados` VALUES (334,'Marisol Pulido','F','1979-10-01','1990-05-16',3250000,1000000,'Investigador','16.759.060',3000);
INSERT INTO `empleados` VALUES (335,'Ana Moreno','F','1992-01-05','2004-06-01',1200000,400000,'Secretaria','16.759.060',3000);
INSERT INTO `empleados` VALUES (336,'Carolina Ríos','F','1992-02-15','2000-10-01',1250000,500000,'Secretaria','16.211.383',1500);
INSERT INTO `empleados` VALUES (337,'Edith Muñoz','F','1992-03-31','2000-10-01',800000,3600000,'Vendedor','31.178.144',2100);
INSERT INTO `empleados` VALUES (338,'Abel Gómez','M','1939-12-24','2000-10-01',1050000,200000,'Mecánico','333.333.333',4300);
INSERT INTO `empleados` VALUES (689,'Mario Llano','M','1945-08-30','1990-05-16',2250000,2500000,'Vendedor','31.178.144',2300);
INSERT INTO `empleados` VALUES (785,'Joaquín Rosas','M','1947-07-07','1990-05-16',2250000,2500000,'Vendedor','31.178.144',2200);
INSERT INTO `empleados` VALUES (898,'Iván Duarte','M','1955-08-12','1998-05-16',1050000,200000,'Mecánico','333.333.333',4100);

```

## a) A continuación, realizar las siguientes consultas sobre la base de datos personal:

## 1. Obtener los datos completos de los empleados.

```
# 1. Obtener los datos completos de los empleados.
SELECT * FROM empleados;
```

## 2. Obtener los datos completos de los departamentos.

```
# 2. Obtener los datos completos de los departamentos.
SELECT * FROM departamentos;
```

## 3. Listar el nombre de los departamentos.

```
# 3. Listar el nombre de los departamentos.
SELECT nombre_depto FROM departamentos; 
```

## 4. Obtener el nombre y salario de todos los empleados.

```
# 4. Obtener el nombre y salario de todos los empleados.
SELECT nombre, sal_empl FROM empleados;
```

## 5. Listar todas las comisiones.

```
# 5. Listar todas las comisiones.
SELECT comision_emp FROM empleados;
```

## 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.

```
# 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.SELECT * FROM empleados WHERE cargo_emp = 'Secretaria';
SELECT * FROM empleados WHERE cargo_emp = 'Secretaria';
```


## 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente

```
# 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente
SELECT * FROM empleados WHERE cargo_emp = 'Vendedor' ORDER BY nombre;
```

## 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.

```
# 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.
SELECT nombre, cargo_emp FROM empleados ORDER BY sal_empl DESC;
```

## 9. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.

```
# 9. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.
SELECT nombre AS Nombre, cargo_emp AS Cargo FROM empleados;
```

## 10. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.

```
# 10. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.
SELECT sal_empl, comision_emp FROM empleados WHERE id_depto = 2000 ORDER BY comision_emp ASC;
```

## 11. Obtener el valor total a pagar que resulta de sumar el salario y la comisión de los empleados del departamento 3000 una bonificación de 500, en orden alfabético del empleado.

```
# 11. Obtener el valor total a pagar que resulta de sumar el salario y la comisión de los empleados del departamento 3000 una bonificación de 500, en orden alfabético del empleado.
SELECT (sal_empl + comision_emp + 500) AS SalarioConComisionyBono FROM empleados WHERE id_depto = 3000 ORDER BY nombre ASC;
```

## 12. Muestra los empleados cuyo nombre empiece con la letra J.

## 13. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000.

## 14. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.

## 15. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.

## 16. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.

## 17. Hallar los empleados cuyo nombre no contiene la cadena “MA”

## 18. Obtener los nombres de los departamentos que sean “Ventas” ni “Investigación” ni ‘Mantenimiento.

## 19. Ahora obtener los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento.

## 20. Mostrar el salario más alto de la empresa.

## 21. Mostrar el nombre del último empleado de la lista por orden alfabético.

## 22. Hallar el salario más alto, el más bajo y la diferencia entre ellos.

## 23. Hallar el salario promedio por departamento. **Consultas con Having**

## 24. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.

## 25. Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige. Solo los que tengan más de dos empleados (2 incluido).

## 26. Hallar los departamentos que no tienen empleados ***Consulta con Subconsulta**

## 27. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.


---

## Ejercicio 3

Abrir el script de la base de datos llamada “tienda.sql” y ejecutarlo para crear sus tablas e insertar datos en las mismas. A continuación, generar el modelo de entidad relación.

Deberá obtener un diagrama de entidad relación igual al que se muestra a continuación:

| fabricante |
| ---------- |
| (PK) codigo INT(10) |
| nombre VARCHAR(100) |

| producto |
| -------- |
| (PK) codigo INT(10) |
| nombre VARCHAR(100) |
| precio DOUBLE |
| codigo_fabricante INT(10) |

A continuación, se deben realizar las siguientes consultas sobre la base de datos:

1. Lista el nombre de todos los productos que hay en la tabla producto.

2. Lista los nombres y los precios de todos los productos de la tabla producto.

3. Lista todas las columnas de la tabla producto.

4. Lista los nombres y los precios de todos los productos de la tabla producto,
redondeando el valor del precio.

5. Lista el código de los fabricantes que tienen productos en la tabla producto.

10. Lista el código de los fabricantes que tienen productos en la tabla producto, sin
mostrar los repetidos.

11. Lista los nombres de los fabricantes ordenados de forma ascendente.

12. Lista los nombres de los productos ordenados en primer lugar por el nombre de
forma ascendente y en segundo lugar por el precio de forma descendente.

13. Devuelve una lista con las 5 primeras filas de la tabla fabricante.

14. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT)

15. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)

16. Lista el nombre de los productos que tienen un precio menor o igual a $120.

17. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el
operador BETWEEN.

18. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN.

23. Devuelve una lista con el nombre de todos los productos que contienen la cadena
Portátil en el nombre

## Consultas Multitabla

1. Devuelve una lista con el código del producto, nombre del producto, código del
fabricante y nombre del fabricante, de todos los productos de la base de datos.

2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de
todos los productos de la base de datos. Ordene el resultado por el nombre del
fabricante, por orden alfabético.

3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del
producto más barato.

4. Devuelve una lista de todos los productos del fabricante Lenovo.

5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un
precio mayor que $200.

6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-
Packard. Utilizando el operador IN.

7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de
todos los productos que tengan un precio mayor o igual a $180. Ordene el resultado
en primer lugar por el precio (en orden descendente) y en segundo lugar por el
nombre (en orden ascendente)


## Consultas Multitabla

Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.

1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto
con los productos que tiene cada uno de ellos. El listado deberá mostrar también
aquellos fabricantes que no tienen productos asociados.

2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen
ningún producto asociado.

## Subconsultas (En la cláusula WHERE)

Con operadores básicos de comparación

1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).

2. Devuelve todos los datos de los productos que tienen el mismo precio que el
producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).

3. Lista el nombre del producto más caro del fabricante Lenovo.

4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos.

## Subconsultas con IN y NOT IN

1. Devuelve los nombres de los fabricantes que tienen productos asociados.
(Utilizando IN o NOT IN).

2. Devuelve los nombres de los fabricantes que no tienen productos asociados.
(Utilizando IN o NOT IN).


## Subconsultas (En la cláusula HAVING)

1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo
número de productos que el fabricante Lenovo.

---
