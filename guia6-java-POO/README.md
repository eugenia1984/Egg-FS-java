# Guia 6 : programacion orientada a objetos

---

## Ejercicios

Guarde en cada carpeta un ejercicio de la guia.

---

## Teoría

Un **paradigma** es una manera o estilo de programación. <br>
Es un conjunto de métodos sistemáticos aplicables en todos los niveles del diseño de programas para resolver problemas. <br>

La **Progrmación orientada a Objetos** es un paradigma de programación, un modelo o estilo de programación que se basa en el concepto de **clases** y **objetos**. <br>

Se enfoca en los **objetos**, sus **atributos** y las **interacciones** que se producen entre ellos para diseñar programas. <br>

Hay un conjunto de objetos que se crean, interaccionan entre sí y dejan de existir cuando ya no son útiles durane la ejecución de un programa. <br>

## ¿ Por qué POO?

Porque el código es reutilizable, organizado y fácil de mantener. <br>
Sigue el principio de DRY don't repeat yourself. <br>
Evita el acceso no deseado a los datos mediante la encapsulación y la abstracción. <br>

---

## Clases y Objetos

Una **clase** es un molde para crear múltiples objetos que encapsula datos ( **atributos** ) y comportamiento ( **métodos** ). <br>

Una clase se define con la palabra reservada **class** seguida del nombre de la clase, que debe comenzar por mayúscula. Si el nombre es compuesto, debe tilizarse UpperCamelCase. <br>

```
public class nombreClase{
  //atributos
  //constructores
  //metodos
}
```

Una vez que se declara una clase se pueden crear ( **instanciar** ) objetos a partir de ella. <br>
Por eso se dice que un objeto es una instancia de una clase. <br>

Pasos para INSTANCIAR OBJETOS: <br>

```
NombreClase nombreObjeto = new NombreClase();
```

Primero declaro la variable de alguno de los tipos de las clases definitivas. <br>
Segundo isntancia el objeto con new que reserva espacio en memoria para los atributos. <br>


