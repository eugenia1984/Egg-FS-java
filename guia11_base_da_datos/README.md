# Base de datos

## Ejemplos

```
# Creación de base de datos
CREATE DATABASE superheroes;

# Uso de base de datos
USE superheroes;

# Creación de tabla
CREATE TABLE creador (
	id_creador INT NOT NULL,
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

# Inserción de valores a la tabla
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

# Consultas a la tabla
SELECT * FROM creador;
SELECT * FROM personajes;

# Modificación de registro
UPDATE personajes
SET aparicion = 1938
WHERE id_personaje = 12;
    
# Eliminación de registro
DELETE
FROM personajes
WHERE id_personaje = 10;

# Eliminación de tablas y de base de datos
DROP TABLE creador;
DROP TABLE personajes;
DROP DATABASE superheroes;
```

---

## VIDEOS:

---

🧑‍💻 [Introduccion Base de Datos](https://www.youtube.com/watch?v=Thq0vO9v_80&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw)

🧑‍💻 [Insertar, modificar, eliminar](https://www.youtube.com/watch?v=Sa7f59JjKP4&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=3)

🧑‍💻 [Select, From, Where](https://www.youtube.com/watch?v=bLocGDEEs0I&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=4)

🧑‍💻 [Tablas relacionadas](https://www.youtube.com/watch?v=IiJk53KWJZc&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=5)

:computer: [Join avanzados(]https://www.youtube.com/watch?v=5XAkfs3K5ZI&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=6)

:computer: [Order by, Group by, Having](https://www.youtube.com/watch?v=XE-vi6mNcuY&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=7)


---

## Informacion de los videos

Las **BASE DE DATOS RELACIONALES** comparten conceptos con **POO**, porque las bases de datos relacionales tratan de manipular y modelar problemas de la realidad.

Vamos a ver como los objetos del programa de Java se pueden almacenar en una **Base de Datos** también llamada **Schema**, y está conformada por **tablas** que representan lo que el programa pretende modelar en la realidad.

Las tablas poseen **campos** qeu representan los atributos de los objetos y contienen **tipos de datos**:

**VARCHAR** -> String y tambien van entre comillas dobles

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

Una vez creada del lado izquierdo donde dice *schema* debo actualizar / refrescar para ver los cambios, ver mi tabla.

Ahora voy a **crear una tabla dentro del schema / la base de datos**, se asimila a cuando uno define una clase junto a sus atributos.

Para los nombres de cada columna si tengo más de una palabra las debo separar con guion bajo, y siempre todo en minuscula

Damos el nombre a la tabla

Vamos definiendo cada columna con su nombre y su tipo de dato, tambien le puedo definir la cantidad de caracteres, si es una **PK** (primary key / clave primaria), si quiero que tenga nulos ( NOT NULL).

Los nombres van todos en minuscula, y si son mas de una palabra se separan con guion bajo, por ejemplo *nombre_mascota*.

```
CREATE TABLE 'egg2'.'curso_programacion'(
  'nombre_curso' VARCHAR (255) NOT NULL,
  'cantidad_alumno' INT NULL);
```

## DROP

Para eliminar un schema o una tabla.

La puedo eliminar directamente desde la parte donde tengo el SCHEMA, hago click en la tabla a eliminar y drop.

Tambien se puede hacer con sentencia, siempre y cuando marquemos el schema donde está la tabla qie queremos eliminar, lo que tenemos que hacer es seleccionarlo, desde chemma hacer doble ckick en la tabla que queremos eliminar

```
DROP table nombre_de_la_tabla;
```


Para borrar el **schema** tambien se puede hacer desde el SCHEMa seleccionandolo con click y drop, ojo porque al borrar el schema ya pierdo todas mis tablas.

Tambien se puede hacer en forma de sentencia

```
DROP schema nombre_de_mi_base_de_datos;
```

## ALTER

Se utiliza para modificar un schema o una tabla

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

Archivos SQL que incorporan sentencias SQL ya escritas, nos ahorran tiempo, solo lo importamos y lo ejecutamos.


Arriba de todo a la izquierda el segundo **OPEN A SQL SCRIPT FIELD IN A NEW QUERY TAB**


Un ejemplo de script

```
CREATE DATABASE tienda CHARACTEER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Sambung');
```


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

[1](https://www.oracle.com/ar/database/what-is-a-relational-database/)
[2](https://www.geeksforgeeks.org/sql-tutorial/)

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



