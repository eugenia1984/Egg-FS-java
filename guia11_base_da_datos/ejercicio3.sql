DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  codigo_fabricante INT UNSIGNED NOT NULL,
  FOREIGN KEY (codigo_fabricante) REFERENCES fabricante(codigo)
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

#Para ver toda la tabla de fabricante
SELECT * FROM fabricante;
#Para ver toda la tabla de producto
SELECT * FROM producto;
# 1. Lista el nombre de todos los productos que hay en la tabla producto.
SELECT nombre FROM producto;
# 2. Lista los nombres y los precios de todos los productos de la tabla producto.
SELECT nombre, precio FROM producto;
# 3. Lista todas las columnas de la tabla producto.
SELECT * FROM producto;
# 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.
SELECT nombre, ROUND(precio) FROM producto;
# 5. Lista el código de los fabricantes que tienen productos en la tabla producto.
SELECT codigo_fabricante FROM producto;
# 10. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos.
SELECT DISTINCT codigo_fabricante FROM producto;
# 11. Lista los nombres de los fabricantes ordenados de forma ascendente.
SELECT nombre FROM fabricante ORDER BY nombre ASC;
# 12. Lista los nombres de los productos ordenados en primer lugar por el nombre de
# forma ascendente y en segundo lugar por el precio de forma descendente.
# NOTA: Solo se nota el orden si hay productos de nombre repetido (1er criterio de orden) y distinto precio
INSERT INTO producto VALUES(99, 'Portátil Ideapd 320', 443, 2);
INSERT INTO producto VALUES(98, 'Portátil Ideapd 320', 442, 2);
INSERT INTO producto VALUES(97, 'Portátil Ideapd 320', 441, 2);

SELECT * FROM producto ORDER BY nombre ASC, precio DESC;
# Borra los 3 inserts anteriores:
DELETE FROM producto WHERE codigo BETWEEN 97 AND 99;
# 13. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
SELECT * FROM fabricante LIMIT 5;
# 14. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT)
SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;
# 15. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)
SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;
# 16. Lista el nombre de los productos que tienen un precio menor o igual a $120.
SELECT nombre, precio FROM producto WHERE precio <= 120;
# 17. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN.
SELECT * FROM producto WHERE precio BETWEEN 60 AND 200;
#18. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN. 
SELECT * FROM producto WHERE codigo_fabricante IN(1, 3, 5);
# 23. Devuelve un listado de todos los fabricantes que existen en la base de datos, 
#junto con los productos que tiene cada uno de ellos. El listado deberá mostrar 
#también aquellos fabricantes que no tienen productos asociados
SELECT  nombre FROM producto WHERE nombre LIKE '%Portátil%';
#24 Devuelve una lista con el código del producto, nombre del producto, código del fabricante y nombre del fabricante, de todos los productos de la base de datos.
SELECT p.codigo, p.nombre, f.codigo, f.nombre 
FROM fabricante f 
INNER JOIN producto p 
ON f.codigo = p.codigo_fabricante;

#25 Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos de la base de datos.
# Ordene el resultado por el nombre del fabricante, por orden alfabético.
SELECT  p.nombre, precio, f.nombre 
FROM fabricante f 
INNER JOIN producto p 
ON f.codigo = p.codigo_fabricante 
ORDER BY f.nombre ASC;

#26 Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato.
SELECT p.nombre, precio, f.nombre 
FROM fabricante f 
INNER JOIN producto p 
ON f.codigo = p.codigo_fabricante 
ORDER BY precio ASC LIMIT 1;

# 27 Devuelve una lista de todos los productos del fabricante Lenovo.
SELECT * FROM fabricante f 
INNER JOIN producto p 
ON f.codigo = p.codigo_fabricante 
WHERE f.nombre = 'Lenovo';

# 28 Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200.
SELECT  * FROM fabricante f 
INNER JOIN producto p 
ON f.codigo = p.codigo_fabricante 
WHERE f.nombre = 'Crucial' AND precio > 200;

# 29 Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. Utilizando el operador IN.
SELECT * FROM fabricante f 
INNER JOIN producto p 
ON f.codigo = p.codigo_fabricante
WHERE f.nombre IN('Asus', 'Hewlett-Packard');

# 30 Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente)
# NOTA: Solo se nota el orden si hay productos que tengan igual precio y su nombre comience igual (2do criterio de orden)
INSERT INTO producto VALUES(33, 'Disco SSD A', 181.99, 4);
INSERT INTO producto VALUES(34, 'Disco SSD B', 181.99, 4);
INSERT INTO producto VALUES(35, 'Disco SSD C', 181.99, 4);
SELECT p.nombre, precio, f.nombre 
FROM fabricante f 
INNER JOIN producto p 
ON f.codigo = p.codigo_fabricante 
WHERE precio >= 180 
ORDER BY precio DESC, p.nombre ASC;
# Borra los 3 inserts anteriores:
delete from producto where codigo between 33 and 35;

# 31 Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos fabricantes que no tienen productos asociados.
SELECT * FROM fabricante f 
LEFT JOIN producto p 
ON f.codigo = p.codigo_fabricante;

# 32 Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado. 
SELECT * FROM fabricante f 
LEFT JOIN producto p 
ON f.codigo = p.codigo_fabricante 
WHERE p.codigo_fabricante IS NULL;

# 33. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo');

# 34. Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del fabricante Lenovo. 
#(Sin utilizar INNER JOIN).
SELECT * FROM producto WHERE precio = 
(SELECT MAX(precio) FROM producto WHERE codigo_fabricante = 2);

# 35. Lista el nombre del producto más caro del fabricante Lenovo.
SELECT nombre FROM producto WHERE precio =
(SELECT MAX(precio) FROM producto WHERE codigo_fabricante = 2);

# 36. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio 
#de todos sus productos.
SELECT * FROM producto WHERE codigo_fabricante = 1 AND precio > 
(SELECT AVG(precio) FROM producto WHERE codigo_fabricante = 1);
#Otro modo
SELECT *
FROM producto
WHERE precio > (SELECT AVG(precio) FROM producto 
WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre LIKE '%asus%')) 
AND codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre LIKE '%asus%');

#37. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número
# de productos que el fabricante Lenovo.
SELECT f.nombre
FROM fabricante AS f
JOIN producto AS p
ON p.codigo_fabricante = f.codigo
GROUP BY p.codigo_fabricante
HAVING COUNT(p.codigo) = (SELECT COUNT(codigo) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre LIKE '%lenovo%'));

