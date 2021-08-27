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

VERDADERO


INSERT, UPDATE y CREATE son commandos DDL. 

->

FALSO . DDDL = lenguaje de definicion de datos. INSERT, UPDATE y CREATE son DML = lenguaje de manipulacion de datos


El comando DROP se utiliza para eliminar todas las filas de una tabla.

->

VERDADERO el comando DROP elimina TODA la tabla, es decir las filas y las columnas



### 2) ¿Cuál de las siguientes sentencias son ciertas sobre las relaciones?

a) Las relaciones son entidades

b) Las relaciones son enlaces lógicos entre las tablas implementadas a través de primary y foreign keys.

c) Las relaciones son almacenadas como atributos en la base de datos.

d) Las relaciones explícitamente definen una asociación entre 2 tablas.


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

**Respuesta INSERT INTO nombre_tabla...**


### 5) En SQL, para modificar la estructura de una tabla de una base de datos se emplea la instrucción

a) ALTER TABLE

b) CHANGE TABLE

c) MODIFY TABLE

d) Las anteriores respuestas no son correctas

**Respuesta ALTER TABLE modifica la tabla agregando campos o cambiando la definicion de los campos**


### 6) ¿Qué instrucción se emplea para eliminar todo el contenido de una tabla, pero conservando la tabla?

a) DELETE TABLE

b) DROP TABLE

c) TRUNCATE TABLE

d) Las anteriores respuestas no son correctas

**Respuesta DELETE TABLE se borran las filas pero la tabla sigue existiendo vacía. DROP TABLE eimina la definicion de la tabla**


### 7) ¿Cómo se borra toda una base de datos con SQL?

e) DELETE DATABASE

f) DROP DATABASE

g) ERASE DATABASE

h) Las anteriores respuestas no son correctas

**Respuesta DROP DATABASE**


### 8) ¿En cuál de las siguientes sentencias del lenguaje SQL se emplea la cláusula SET?

a) DELETE

b) DROP

c) SELECT

d) UPDATE

**Respuesta UPDATE**


### 9) En SQL, para eliminar las filas duplicadas del resultado de una sentencia SELECT se emplea:

a) NO DUPLICATE

b) UNIQUE

c) DISTINCT

d) Las anteriores respuestas no son correctas

**Respuesta DISTINCT queremos traer solo registros diferentes**


### 10) Una sentencia SELECT sin la cláusula WHERE devuelve

a) Todos los registros existentes en la tabla que no estén relacionados con otra tabla

b) Todos los registros existentes en la tabla

c) No se puede ejecutar una sentencia SELECT sin la cláusula WHERE

d) Las anteriores respuestas no son correctas

**Respuesta: Todos los registros existentes en la tabla es como tener el ALL (*)**


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

**Respuesta: Juan% indica que es donde comienza**


### 13) ¿Cuál de las siguientes no es una función de agregación?

a) AVG()

b) FLOOR()

c) SUM()

d) Las anteriores respuestas no son correctas


### 14) ¿Cuál de las siguientes no es una función de agregación?

a) COUNT()

b) LIMIT()

c) MAX()

d) MIN()

**Respuesta LIMIT**

---

🧑‍💻 [Introduccion Base de Datos](https://www.youtube.com/watch?v=Thq0vO9v_80&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw)

🧑‍💻 [Insertar, modificar, eliminar](https://www.youtube.com/watch?v=Sa7f59JjKP4&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=3)

🧑‍💻 [Select, From, Where](https://www.youtube.com/watch?v=bLocGDEEs0I&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=4)

🧑‍💻 [Tablas relacionadas](https://www.youtube.com/watch?v=IiJk53KWJZc&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=5)

:computer: [Join avanzados(]https://www.youtube.com/watch?v=5XAkfs3K5ZI&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=6)

:computer: [Order by, Group by, Having](https://www.youtube.com/watch?v=XE-vi6mNcuY&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=7)


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



