# Herencia

---

:computer: En el proyecto [**Hoteles**](https://github.com/eugenia1984/Egg-FS-java/tree/master/guia9_herencia/Hoteles) se puede ver la herencia de clases, el método *instanceOf* y como se corta la herencia con *final*. 

A partir de la clase Hotel, se va a ir heredando a Hotel 1 *, Hotel 2 * , Hotel 3 * , Hotel 4 * y Hotel 5 * , y cada hotel al subir de categoría va a tener los atributos de la clase de la que hereda más sus nuevas propiedades. 

---

## PREGUNTAS DE APRENDIZAJE

### 1) ¿Qué palabra se usa para generar la herencia entre clases?

a) implements <br>
b) super <br>
c) this <br>
d) extends <br>

**Respuesta D : EXTENDS indica que se extiende ( que hereda) de su clase Padre / Madre***<br>


### 2) ¿Qué código de los siguientes tiene que ver con la herencia?

a) public class Componente extends Producto <br>
b) public class Componente inherit Producto <br>
c) public class Componente implements Producto <br>
d) public class Componente belong to Producto <br>

**Respuesta A: Porque indica que la clase Componente extiende (hereda) de su clase Padre / Madre Producto**<br>


### 3) ¿La superclase es la clase?

a) Madre <br>
b) Hija <br>
c) Nieta <br>
d) Es una interfaz <br>


**REspuesta A : MADRE es de la que van a heredar las hijas**<br>


### 4) Cual de estos componentes de la superclase no hereda la subclase

a) Atributos <br>
b) Métodos <br>
c) Getter/Setters <br>
d) Constructores <br>

**Respuesta D: CONSTRUCTORES; los constructores no se heredan, los métodos si se heredan. Con super puedo usar los constructores de la clase padre.**<br>


### 5) La superclase debe ser abstracta

a) Siempre <br>
b) Nunca <br>
c) Depende de la situación <br>
d) Cuando implementa una interfaz <br>


### 6) ¿Cuál tipo de clase debe tener al menos un método abstracto?

a) final <br>
b) abstract <br>
c) public <br>
d) Todas las anteriores <br>


### 7) ¿De cuántas clases se puede derivar Java?

a) Tres clases <br>
b) Dos clases <br>
c) Una clase <br>
d) Cinco clases <br>


### 8) Una clase que termina la cadena de una herencia se la puede declarar como:

a) final <br>
b) abstract <br>
c) public <br>
d) Ninguna de las anteriores <br>

**Respuesta A: FINAL, no va a tener hijos/ hijas** <br>


### 9) ¿Qué palabra se usa para implementar una interfaz?

a) implements <br>
b) super <br>
c) this <br>
d) extends <br>

**Respuesta A: IMPLEMENTS se utiliza par ala interfaz** <br>

### 10) ¿Qué código asociarías a una Interfaz en Java?

a) public class Componente interface Product <br>
b) Componente cp = new Componente (interfaz) <br>
c) public class Componente implements Printable <br>
d) Componente cp = new Componente.interfaz <br>

**Respuesta C: porque las interfaces se implementan utilizando la palabra IMPLEMENTS**<br>

---

## Ejercicios prácticos

### Ejercicio 1:

Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. 

La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.  

Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un mensaje por pantalla informando de que se alimenta.  <br>
Generar  una clase Main que realice lo siguiente:  

```JAVA
public class Main {

   public static void main(String[] args) {
       //Declaro un objeto PERRO
        Animal perro = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro.alimentarse();
        
        //Declaro otro objeto Perro
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.alimentarse();
        //Declaro un objeto Gato
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames" );
        gato.alimentarse();
        //Declaro un objeto Caballo
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.alimentarse();
     }
}
```


:computer: está en la carpeta [**Ejercicio 1**](https://github.com/eugenia1984/Egg-FS-java/tree/master/guia9_herencia/ejercicio1)

---

### Ejercicio 2:

Crear una superclase llamada Electrodoméstico con los siguientes atributos:

precio, color, consumo energético (letras entre A y F) y peso. 

Los constructores que se deben implementar son los siguientes:

• Un constructor vacío.

• Un constructor con todos los atributos pasados por parámetro.

Los métodos a implementar son: 

• Métodos getters y setters de todos los atributos. 

• **Método comprobarConsumoEnergetico(char letra)**: comprueba que la letra es correcta, sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el objeto y no será visible. 

• **Método comprobarColor(String color)**: comprueba que el color es correcto, y si no lo es, usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. Este método se invocará al crear el objeto y no será visible. 

• **Metodo crearElectrodomestico()**: le pide la información al usuario y llena el electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al precio se le da un valor base de $1000. 

• **Método precioFinal()**: según el consumo energético y su tamaño, aumentará el valor del precio. Esta es la lista de precios: 

| LETRA | PRECIO |
| ----- | ------ |
| A | $ 1000 |
| B | $ 800 |
| C | $ 600 |
| D | $ 500 |
| D | $ 300 |
| F | $ 100 |

| PESO | PRECIO |
| ---- | ------ |
| ENTRE 1 - 19 KG | $ 100 |
| ENTRE 20 - 49 KG | $ 500 |
| ENTRE 50 - 79 KG | $ 800 |
| MAYOR QUE 80 KG | $ 1000 |


A continuación se debe crear una subclase llamada Lavadora, con el atributo carga, además de los atributos heredados.

Los constructores que se implementarán serán: 

• Un constructor vacío. 

• Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre. 

Los métodos que se implementara serán

• Método get y set del atributo carga.

• **Método crearLavadora ()**: este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos el atributo propio de la lavadora.

• **Método precioFinal()**: este método será heredado y se le sumará la siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o igual, no se incrementará el precio. 

Este método debe llamar al método padre y añadir el código necesario. 

Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar al precio. 


Se debe crear también una subclase llamada Televisor con los siguientes atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados. 

Los constructores que se implementarán serán: 

• Un constructor vacío. 

• Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán: 

• Método get y set de los atributos resolución y sintonizador TDT. 

• **Método crearTelevisor()**: este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos los atributos del televisor.

• **Método precioFinal()**: este método será heredado y se le sumará la siguiente funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500.

Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.


Finalmente, en el main debemos realizar lo siguiente: 

Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el precio final de los dos electrodomésticos 

:computer: Está en la carpeta [**Ejercicio2**](https://github.com/eugenia1984/Egg-FS-java/tree/master/guia9_herencia/ejercicio2)

----

### Ejercicio 3:

Siguiendo el ejercicio anterior, en el main vamos a crear un arrayList de Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.  


Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. 

Se deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los televisores, por un lado, el de las lavadoras por otro, y al final, la suma del precio de todos los Electrodomésticos.

Por ejemplo, si tenemos una lavadora con un precio de 2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 para lavadora y 5000 para televisor 


:computer: Está en la carpeta [**ejericico 3**](https://github.com/eugenia1984/Egg-FS-java/tree/master/guia9_herencia/guia9ejercicio3)

----

### Ejercicio 4

En un puerto se alquilan amarres para barcos de distinto tipo. 

Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y el barco que lo ocupará. 


Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación. 


Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:  

• Número de mástiles para veleros. <br>
• Potencia en CV para barcos a motor. <br>
• Potencia en CV y número de camarotes para yates de lujo. <br>


Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).


En los barcos de tipo especial el módulo de cada barco, se calcula sacando el modulo normal y sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles, en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y el número de camarotes. 

Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el precio final de su alquiler 


----


### Ejercicio 5:

Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas geométricas, en este caso un circulo y un rectángulo. Ya que este calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos para calcular el área, el perímetro y el valor de PI como constante. Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se calcule el área y el perímetro
de los dos.

En el main se crearán las formas y se mostrará el resultado final.

Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro. 

Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

:computer: [**ver ejercicio 5**](https://github.com/eugenia1984/Egg-FS-java/tree/master/guia9_herencia/guia9ejercicio5)

----
 
