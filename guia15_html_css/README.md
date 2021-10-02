# HTML5 & CSS3

## INTRODUCCIÓN

El **World Wide Web (WWW**) es un sistema que contiene una cantidad de información casi
infinita. Pero esta información debe estar ordenada de alguna forma de manera que sea
posible encontrar lo que se busca. La unidad básica donde está almacenada esta
información son las **páginas Web**. Estas páginas se caracterizan por contener texto,
imágenes, animaciones... e incluso sonido y video.

Una de las características más importantes de las paginas Web es que son **hipertexto**. Esto
quiere decir que las paginas no son elementos aislados, sino que **están unidas a otras
mediante los links o enlaces hipertexto**. Gracias a estos **enlace**s el navegante de internet
puede pulsar sobre un texto de una página para navegar hasta otra pagina. Será cuestión
del programador de la pagina inicial decidir que palabras o frases serán activas y a donde
nos conducirá pulsar sobre ellas.

---

# HTML 5

Entendiendo que las **paginas web** son **hipertexto**, aquí es donde entra HTML. El **Lenguaje
de Marcado de Hipertexto** o **Hyper Text Markup Languange** (HTML) es el código que se
utiliza para **estructurar** y **desplegar** una página web y sus contenidos. HTML es el lenguaje
con el que se escribe el contenido de las páginas web. Las páginas web pueden ser vistas
por el usuario mediante un tipo de aplicación llamada **cliente web** o más comúnmente
**"navegador" (browser)**. Podemos decir por lo tanto que el HTML es el lenguaje usado para especificar
el contenido que los navegadores deben representar a la hora de mostrar una página web.

Este lenguaje nos permite aglutinar textos, imágenes, enlaces... y combinarlos a nuestro
gusto. La ventaja del HTML a la hora de representar el contenido en un navegador, con
respecto a otros formatos físicos como libros o revistas, es justamente la posibilidad de
colocar referencias a otras páginas, por medio de los enlaces hipertexto.

Cuando nos referimos al contenido queremos indicar párrafos, imágenes, listas, tablas y
todo aquello que forma parte de "el qué". Nunca debemos usar HTML para definir cómo se
debe de ver un contenido, si el texto debe tener color rojo, con una fuente mayor, o si se
debe alinear a la derecha. Para especificar el aspecto que debe tener una web se usa un
lenguaje complementario, llamado **CSS**.

---

## HTML LENGUAJE DE MARCADO

HTML **no es un lenguaje de programación**; **es un lenguaje de marcado que define la
estructura de tu contenido**. Basa su sintaxis en un elemento base al que llamamos **marca (tag / etiqueta)**. 
A través de las etiquetas vamos **definiendo los elementos del
documento**, como enlaces, párrafos, imágenes, etc. Así pues, un documento HTML estará
constituido por texto y un conjunto de etiquetas para definir la función que juega cada
contenido dentro de la página. Todo eso **le servirá al navegador para saber cómo se tendrá
que presentar el texto y otros elementos en la página**.

Existen etiquetas para crear **negritas** (```<strong>.......</strong>```), **párrafos** (```<p>.....</p>```), **imágenes** (```<img......./>```), **tablas**, **listas desordenada** (```<ul> <li>...</li></ul>```) y **listas ordenadas**(```<ol> <li>...</li></ol>```), **enlaces**(```<link....>```), etc. Así
pues, aprender HTML es básicamente aprenderse una serie de etiquetas, sus funciones,
sus usos y saber un poco sobre cómo debe de construirse un documento básico.

Es una tarea muy sencilla de afrontar, al alcance de cualquier persona, puesto que el
lenguaje es muy entendible para los seres humanos.

Por ejemplo, toma la siguiente línea de texto:

*Mi gato es muy gruñon*

Si quieres especificar que se trata de un párrafo, podrías encerrar el texto con la etiqueta
de párrafo (<p>):
  
```<p> Mi gato es muy gruñon </p>```

## ANATOMIA DE UNA ETIQUETA HTML

**elemento** -> ```<p> Mi gato es muy gruñon </p>```

**etiqueta de apertura** ->```<p>```

**etiqueta de cierre** ->``` </p>```

**contenido** ->```Mi gato es muy gruñon ```


Las partes principales de la etiqueta completa llamada elemento son:

1. La **etiqueta de apertura**: consiste en el nombre de la etiqueta (en este caso, p),
encerrado por paréntesis angulares (< >) de apertura y cierre. Establece dónde
comienza o empieza a tener efecto la etiqueta ,en este caso, dónde es el comienzo del
párrafo.

2. La **etiqueta de cierre**: es igual que la etiqueta de apertura, excepto que incluye una
barra de cierre (/) antes del nombre de la etiqueta. Establece dónde termina la etiqueta,
en este caso dónde termina el párrafo.

3. El **contenido**: este es el contenido de la etiqueta, que en este caso es sólo texto.

4. El **elemento**: la etiqueta de apertura, más la etiqueta de cierre, más el contenido
equivale al elemento.

## ANIDAR ETIQUETAS

Puedes también **colocar etiquetas dentro de otros etiqueta**s, esto se llama anidamiento. 

Si, por ejemplo, quieres resaltar una palabra del texto (en el ejemplo la palabra «muy»),
podemos encerrarla en una etiqueta <strong>, que significa que dicha palabra se debe
enfatizar:
  
``` <p> Mi gato es <strong>muy</strong> gruñon </p>```
  
Debes asegurarte que las etiquetas estén correctamente anidadas: 
  
en el ejemplo, creaste la etiqueta de apertura del elemento <p> primero, luego la del elemento <strong>, por lo
tanto, debes cerrar esta etiqueta primero, y luego la de <p>.
  
Las etiquetas deben abrirse y cerrarse ordenadamente, de forma tal que se encuentren
claramente dentro o fuera el uno del otro. Si estos se encuentran solapados, el navegador
web tratará de adivinar lo que intentas decirle, pero puede que obtengas resultados
inesperados.
  
---
  
## ANATOMIA DE UN DOCUMENTO HTML
  
Hasta ahora has visto lo básico de elementos HTML individuales, pero estos no son muy
útiles por sí solos. Ahora verás cómo los elementos individuales son combinados para
formar una página HTML entera.
  
Los documentos html van a ser archivos de texto con la extensión .html y tienen la
siguiente anatomía:
  
```
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Mi pagina de prueba</title>
  </head>
  <body>
    <p> Cooperacion Humana </p>
  </body>
</html>
```
  
Tienes:
  
• ```<!DOCTYPE html>```: el **tipo de documento**. Es un preámbulo requerido. Anteriormente,
cuando HTML era joven (cerca de 1991/2), los tipos de documento actuaban como
vínculos a un conjunto de reglas que el código HTML de la página debía seguir para ser
considerado bueno, lo que podía significar la verificación automática de errores y
algunas otras cosas de utilidad. Sin embargo, hoy día es simplemente un artefacto
antiguo que a nadie le importa, pero que debe ser incluido para que todo funcione
correctamente. Por ahora, eso es todo lo que necesitas saber.
  
• ```<html>...</html>```: la etiqueta <html>. Esta etiqueta **encierra todo el contenido de la página**
entera y, a veces, se le conoce como la **etiqueta raíz** (root element).
  
• ```<head>...</head>```: la etiqueta ```<head>```. Esta etiqueta actúa como un **contenedor de todo
aquello que quieres incluir en la página HTML que no es contenido visible por los
visitantes de la página**. Incluye cosas como palabras clave (keywords), una descripción
de la página que quieres que aparezca en resultados de búsquedas, código CSS para
dar estilo al contenido, declaraciones del juego de caracteres, etc.
  
• ```<meta charset="utf-8">```: esta etiqueta establece **el juego de caracteres que tu
documento usará en utf-8, que incluye casi todos los caracteres de todos los idiomas
humanos**. Básicamente, puede manejar cualquier contenido de texto que puedas
incluir. No hay razón para no establecerlo, y puede evitar problemas en el futuro.  
  
• ```<title>....</title>```: la etiqueta ```<title>``` establece **el título de tu página**, que es el título que
aparece en la pestaña o en la barra de título del navegador cuando la página es
cargada, y se usa para describir la página cuando es añadida a los marcadores o como
favorita.
  
•``` <body>...</body>```: la etiqueta <body>. Encierra **todo el contenido que deseas mostrar a
los usuarios web que visiten tu página**, ya sea texto, imágenes, videos, juegos, pistas de
audio reproducibles, y demás. Estos, delimitados a su vez por otras etiquetas como las
que hemos visto.
  
---
  
## ELEMENTOS EN BLOQUE Y EN LÍNEA
  
El lenguaje HTML clasifica a todos los elementos en dos grupos: **elementos en línea o inline
elements** y **elementos en bloque o block elements**.
  
La diferencia entre ambos viene dada por el modelo de contenido, por el formato y la dirección.
  
Los elementos en bloque siempre empiezan en una nueva línea y ocupan todo el espacio
disponible hasta el final de la línea, mientras que los elementos en línea sólo ocupan el
espacio necesario para mostrar sus contenidos.
  
---
  
## ATRIBUTOS ETIQUETAS
  
Las etiquetas son la estructura básica del HTML. Estas etiquetas se componen y contienen
otras propiedades, como son los **atributos** y el **contenido**.
 
HTML define un total de 91 etiquetas, de las cuales 10 se consideran obsoletas. Sin
embargo, una etiqueta por sí sola a veces no contiene la suficiente información para estar
completamente definida. Para ello contamos con los **atributos**: **pares nombresvalor
separados por "=" y escritos en la etiqueta inicial de un elemento después del nombre
del elemento**. El **valor** puede **estar encerrado entre "comillas dobles" o 'simples'**. Existen,
también, algunos atributos que afectan al elemento por su presencia en la etiqueta de
inicio.
  
 Esta sería la estructura general de una línea de código en lenguaje HTML:
 
```  
<etiqueta atributo1="valor1" atributo2="valor2"> contenido </etiqueta>
```  

```    
<a href="http://www.enlace.com" target="_blank">Ejemplo de enlace</a>
```  
  
Donde:

  • ```  <a>```   es la etiqueta inicial y ```  </a>```   la etiqueta de cierre.

  • ```  href```   y ```  target```   son los atributos.

  • ```  http://www.enlace.com```   y ```  _blank```   son las variables.

  • Ejemplo de enlace es el contenido.

  Nota: las etiquetas ```  <img>```  y ```  <a>```   las veremos en mayor profundidad más adelante.
  
---
  
##    TIPOS DE ATRIBUTOS
  
Aunque cada una de las etiquetas HTML define sus propios atributos, encontramos algunos
comunes a muchas o casi todas las etiquetas, que se dividen en cuatro grupos según su
funcionalidad:
  
• Atributos básicos
  
• Atributos de internacionalización
  
• Atributos de eventos
  
• Atributos de foco
  
En esta guía solo vamos a ver los básicos. Ya que el resto de atributos son para el uso de
otro lenguaje.  
  
##   ATRIBUTOS BASICOS
  
Los atributos básicos se utilizan en la mayoría de etiquetas HTML y XHTML, aunque
adquieren mayor sentido cuando se utilizan hojas de estilo en cascada (CSS):
  
| Atributo  | Descripción |
| --------- | ----------- |  
| id="texto" | Establece un indicador único a cada elemento |
| class="texto" | Establece la clase CSS que se aplica a los estilos del elemento |
| style="texto" | Aplica de forma directa los estilos CSS de un elemento |
| title="texto"   1 Establece el título del elemento (Mejora la accesibilidad) |
  
Nota: los atributos de id, class y style los veremos en mayor profundidad en la parte de
CSS. 
  
---  
  
# SINTAXIS HTML
  
## LAS MAYÚSCULAS O MINÚSCULAS SON INDIFERENTES AL ESCRIBIR ETIQUETAS
  
En HTML las mayúsculas y minúsculas son indiferentes. Quiere decir que las etiquetas
pueden ser escritas con cualquier tipo de combinación de mayúsculas y minúsculas.
  
**Resulta sin embargo aconsejable acostumbrarse a escribirlas en minúscula ya que otras
tecnologías que pueden convivir con nuestro HTML** (XML por ejemplo) no son tan
permisivas y nunca viene mal hacernos a las buenas costumbres desde el principio, para
evitar fallos triviales en un futuro.
  
##  COMENTARIOS EN HTML
  
En un documento HTML, los comentarios se escriben entre los caracteres ``` <!--```  y ``` -->``` . 
  
 Por ejemplo: 
  
  ``` <!--Esto es un comentario en HTML-->``` 
  
##  SALTOS DE LÍNEA EN HTML
  
Otra de las cosas importantes de conocer sobre la sintaxis básica del HTML es que los
saltos de línea no importan a la hora de interpretar una página. **Un salto de línea será
simplemente interpretado como un separador de palabras, un espacio en blanco**. Es por
ello que para separar líneas necesitamos usar la etiqueta de párrafo, o la etiqueta BR que
significa un salto de línea simple.
 
```
Esto es una línea
<br>
Esto es otra línea
```
  
Esto en una pagina se vería así:
  
```
Esto es una línea
Esto es otra línea
```  
  
**La etiqueta BR no tiene su correspondiente cierre**. Es un detalle que quizás te haya llamado
la atención.
  
---  
  
##   FORMATO DE PARRAFOS HTML
  
Previamente en nuestra guía habíamos visto la etiqueta ```  <strong>```   que nos permitía darle
formato a nuestro texto, más concreto **ponerlo en negrita**. 
  
Ahora veremos con más detalle las más ampliamente utilizadas y ejemplificaremos algunas de ellas posteriormente.
  
Formatear un texto pasa por tareas tan evidentes como definir los párrafos, justificarlos,
introducir viñetas, numeraciones o bien poner en negrita, itálica, etc.
  
Hemos visto que para definir los párrafos nos servimos de la etiqueta **P** que **introduce un
salto y deja una línea en blanco antes de continuar con el resto del documento**.
  
Podemos también usar la etiqueta ```  <br>```  , de la cual no existe su cierre correspondiente, para
realizar un simple salto de línea con lo que no dejamos una línea en blanco sino que solo
cambiamos de línea. 
  
Cabe destacar que la etiqueta <br>, no es la única etiqueta sin cierre.
  
Podéis comprobar que cambiar de línea en nuestro documento HTML sin introducir alguna
de estas u otras etiquetas no implica en absoluto un cambio de línea en la página
visualizada. 
  
 En realidad el navegador introducirá el texto y no cambiara de línea a no ser
que esta llegue a su fin o bien lo especifiquemos con la etiqueta correspondiente.
  
 ---
  
 ##  ALINEAR TEXTO
  
Los párrafos delimitados por etiquetas P pueden ser fácilmente justificados a la izquierda,
centro o derecha especificando dicha justificación en el interior de la etiqueta por medio
de un atributo ``` align ```. Recordemos que los atributos no son más que un parámetro incluido
en el interior de la etiqueta que ayudan a definir el funcionamiento de la etiqueta de una
forma más personalizada.
  
 Es importante tener muy en cuenta lo siguiente, que ya hemos comentado
anteriormente. El **HTML se usa para definir el contenido**. Por lo tanto, **los atributos align que
vamos a conocer a continuación se estarían metiendo en una terreno que no le
corresponde al HTML, porque están definiendo la forma en la que un párrafo debe de
representarse, su estilo, y no el contenido**. Es importante señalarlo para aprender que **estas
cosas se deben hacer mediante el lenguaje CSS, que sirve para definir el estilo**, la forma.
  
Usamos este ejemplo también para reforzar el uso de los atributos de una manera más
practica.
  
Así, si deseásemos introducir un texto alineado a la izquierda escribiríamos:

``` 
<p align="left">Texto alineado a la izquierda</p>
``` 
  
Para una justificación al centro:

  ``` 
  <p align="center">Texto alineado al centro</p>
``` 
  
  Para alinear a la derecha:

  ``` 
  <p align="right">Texto alineado a la derecha</p>
``` 
  
  Esto en una pagina se vería así:
  
  ``` 
Texto alineado a la izquierda
                               Texto alineado al centro
                                                           Texto alineado a la derecha
  ``` 
  
Como veis, en cada caso **el atributo align toma determinados valores que son escritos
entre comillas**. En algunas ocasiones necesitamos especificar algunos atributos para el
correcto funcionamiento de la etiqueta. En otros casos, el propio navegador toma un valor
definido por defecto. Para el caso de align, el valor por defecto es left.
  
---
  
## FORMATEO DE LETRA
  
Además de todo lo relativo a la organización de los párrafos, uno de los aspectos
primordiales del formateo de un texto es el de la propia letra. Resulta muy común y
práctico **presentar texto resaltado en negrita, itálica y otros**. Todo esto y mucho más es
posible por medio del HTML a partir de multitud de etiquetas entre las cuales vamos a
destacar algunas.
  
Pero antes de comenzar cabe hacer una reflexión sobre por qué son interesantes estas
etiquetas y se siguen usando, a pesar que están entrando prácticamente en el terreno de
CSS, ya que en la práctica están directamente formateando el aspecto de las fuentes. 
   **Son importantes porque las etiquetas en si no están para definir un estilo en concreto, sino una
función de ciertas palabras dentro de un contenido**.
  
##  NEGRITA
  
Podemos escribir texto en negrita incluyéndolo dentro de las **etiquetas strong** y su cierre.
Recordemos que ya la habíamos visto previamente.
  
 ```
<p><strong> Texto en negrita </strong> y texto normal</p>
```
 
## ITÁLICA
  
En este caso existen dos posibilidades, una corta: **i y su cierre (italic)** y otra un poco más
larga: **EM y su cierre**. En esta guía vamos a usar, y en la mayoría de las páginas que veréis
por ahí, os encontraréis con la primera forma sin duda más sencilla a escribir y a acordarse.
  
 ```
<p><i> Texto en italica </i> y texto normal</p>  
  ```
  
  ***Observación:** I es de italic se utiliza por ejemplo para remarcar una palabra que esté en otro lenguaje distinto del texto, y asi como **strong** tiene más sentido que utilizar **b**, tiene más significado semático utilizar **i** que **em**
  
## SUBRAYADO
  
El HTML nos propone también para el subrayado la etiqueta: **U (underlined)**. Sin embargo, el
uso de subrayados ha de ser aplicado con mucha precaución dado que los enlaces
hipertexto van, a no ser que se indique lo contrario, subrayados con lo que podemos
confundir al lector y apartarlo del verdadero interés de nuestro texto.
  
Además, cabe decir que la etiqueta U se ha quedado obsoleta, debido a que es algo que
realmente se debe hacer del lado del CSS, al ser básicamente un estilo.
  
```
<p><u> Texto subrayado</u> y texto normal</p>  
```
  
**Obeservación:** esta etiqueta asi no se usa.  
  
 ---
  
  ## ENCABEZADOS
  
Existen otras etiquetas para definir párrafos especiales, que funcionaran como **títulos de
nuestra pagina**. Son los **encabezados** o **headings** en inglés. Como decimos, son** etiquetas
que formatean el texto como un titulo**, pero el hecho de que cambien el formato no es lo
que nos tiene que preocupar, sino el significado en sí de la etiqueta. Es cierto que los
navegadores asignan un tamaño mayor de letra y colocan el texto en negrita, pero lo
importante es que **sirven para definir la estructura del contenido de un documento HTML**.
Así los **navegadores para ciegos podrán** informar a los invidentes que esta es una división
nueva de contenido y que su titulo es este o aquel. También** motores de búsqueda** sabrán
interpretar mejor el contenido de una página en función de los títulos y subtítulos.
  
Hay varios tipos de encabezados, que se diferencian visualmente en el tamaño de la letra
que utilizan. La etiqueta en concreto es la **h1**, para los encabezados más grandes, **h2** para
los de segundo nivel y así hasta**h6** que es el encabezado más pequeño. Pero lo
importante, insistimos es la estructura que denotan. **Una página tendrá generalmente un
encabezado de nivel 1** y dentro varios de nivel 2.
  
 Luego, dentro de los **h2** encontraremos si acaso **h3**, etc. Nunca debemos usar los
encabezados porque nos formateen el texto de una manera dada, sino porque nuestro
documento lo requiera según su estructura.
  
  Los encabezados implican también una separación en párrafos, así que todo lo que
escribamos dentro de H1 y su cierre (o cualquier otro encabezado) se colocará en un
párrafo independiente.
Podemos ver cómo se presentan algunos encabezados a continuación.
<h1> Encabezado de nivel 1 </h1>
Los encabezados, como otras etiquetas de HTML, soportan el atributo align. Veremos un
ejemplo de encabezado de nivel 2 alineado al centro, aunque repetimos que esto debería
hacerse en CSS.
<h2 align=”center”> Encabezado de nivel 2 </h2>
  
 ---
  
 ##  LISTAS EN HTML
  
Las posibilidades que nos ofrece el HTML en cuestión de tratamiento de texto son
realmente notables. No se limitan a lo visto hasta ahora, sino que van más lejos todavía.
Varios ejemplos de ello son las listas, que sirven para enumerar y definir elementos.
  
Las listas originalmente están pensadas para citar, numerar y definir cosas a través de  características, o al menos así lo hacemos en la escritura de textos. Sin embargo, las listas
finalmente se utilizan para mucho más que enumerar una serie de puntos, en realidad son
un recurso muy interesante para **poder maquetar elementos diversos, como barras de
navegación, pestañas**, etc.
  
Por ahora, trataremos las listas desde el punto de vista de su construcción y veremos los
diferentes tipos que existen, y que podemos utilizar para resolver nuestras distintas
necesidades a la hora de escribir textos en HTML.
  
Podemos distinguir dos tipos de listas HTML:
  
• **Listas desordenadas**
  
• **Listas ordenadas**
  
## LISTAS DESORDENADAS
  
Son delimitadas por las etiquetas UL y su cierre (unordered list). Cada uno de los elementos
de la lista es citado por medio de una etiqueta LI (La LI tiene su cierre, aunque si no lo
colocas el navegador al ver el siguiente LI interpretará que estás cerrando el anterior). La
cosa queda así:

```  
<p>Países del mundo</p>
<ul>
  <li>Argentina</li>
  <li>Perú</li>
  <li>Chile</li>
</ul>
```
  
Esto en una pagina se vería así:  
  
```
Países del mundo

  * Argentina
  * Perú
  * Chile
```
  
Podemos definir el tipo de viñeta empleada para cada elemento. Para ello debemos
especificarlo por medio del atributo **type** incluido dentro de la etiqueta de apertura **UL**, si
queremos que el estilo sea válido para toda la lista, o dentro de la etiqueta **LI** si queremos
hacerlo específico de un solo elemento. La sintaxis es del siguiente tipo:
  
 
```
<ul type="tipo de viñeta">
```
  
Donde tipo de viñeta puede ser uno de los siguientes:

  • circle

  • disc

  • square

  Vamos a ver un ejemplo de lista con un cuadrado en lugar de un redondel, y en el último
elemento colocaremos un círculo. Para ello vamos a colocar el atributo type en la etiqueta
UL, con lo que afectará a todos los elementos de la lista. 
  
```
<ul type="square">
  <li>Elemento 1 </li>
  <li>Elemento 2 </li>
  <li>Elemento 3 </li>
  <li type="circle">Elemento 4
</ul>  
```  
  
## LISTAS ORDENADAS
  
Las listas ordenadas sirven también para presentar información, en diversos elementos o
items, con la particularidad que éstos estarán predecidos de un número o una letra para
enumerarlos, siempre por un orden.
  
Para realizar las listas ordenadas usaremos las etiquetas** OL (ordered list)** y su cierre. Cada
elemento sera igualmente indicado por la etiqueta LI, que ya vimos en las listas
desordenadas.
  
Pongamos un ejemplo:
  
```    
<p>Reglas de comportamiento en el trabajo</p>
<ol>
  <li>El jefe siempre tiene la razón </li>
  <li>En caso de duda aplicar regla 1 </li>
</ol>  
```  

Esto en una pagina se vería así:
``` 
Reglas de comportamiento en el trabajo

  1. El jefe siempre tiene la razón 
  2. En caso de duda aplicar regla 1 
```    
  
 Del mismo modo que para las listas desordenadas, las listas ordenadas ofrecen la
posibilidad de modificar el estilo. 
  
En concreto nos es posible especificar el tipo de
numeración empleado eligiendo entre **números (1, 2, 3...)**, **letras (a, b, c...)** y sus **mayúsculas
(A, B, C,...)** y **números romanos** en **sus versiones mayúsculas (I, II, III,...)** y **minúsculas (i, ii, iii,...)**.
  
Para realizar dicha selección hemos de utilizar, como para el caso precedente, el atributo
type, el cual será situado dentro de la etiqueta OL. Los valores que puede tomar el atributo
en este caso son:
  
  1 para ordenar números
  
  a por letras minúsuclas del alfabeto
  
  A por letras mayúsuclas del alfabeto
  
  i por números romanos en einúscula
  
  I por números romanos en mayúscula
  
Puede que en algún caso deseemos comenzar nuestra enumeración por un número o letra
que no tiene por qué ser necesariamente el primero de todos. Para solventar esta situación,
podemos utilizar un segundo atributo, start, que tendrá como valor un número. Este
número, que por defecto es 1, corresponde al valor a partir del cual comenzamos a definir
nuestra lista. Para el caso de las letras o los números romanos, el navegador se encarga de
hacer la traducción del número a la letra correspondiente.
  
Un ejemplo de todo esto sería:
  
 ```
 <p>Ordenamos por números</p>
<ol type="1">
  <li>Elemento 1 </li>
  <li> Elemento 2 </li>
</ol>
<p>Ordenamos por letras</p>
<ol type="a">
  <li>Elemento a </li>
  <li> Elemento b </li>
</ol>
<p>Ordenamos por números romanos empezando por el 10</p>
<ol type="i" start="10">
  <li>Elemento x </li>
  <li> Elemento xi </li>
</ol>
```
  
En una página se vería así:
  
    
 ```
Ordenamos por números

  1. Elemento 1 
  2. Elemento 2

Ordenamos por letras

  a. Elemento a
  b. Elemento b 

Ordenamos por números romanos empezando por el 10

  x. Elemento x 
  xi. Elemento xi 
```
  
---
  
##  ANIDANDO LISTAS
  
Nada nos impide utilizar todas estas etiquetas de forma anidada como hemos visto en
otros casos. De esta forma, podemos conseguir listas mixtas como por ejemplo:
  
```
<p>Ciudades del mundo</p>
<ul>
  <li>Argentina </li>
<ol>
  <li>Buenos Aires </li>
  <li>Bariloche </li>
</ol>
  <li>Uruguay </li>
<ol>
  <li>Montevideo </li>
  <li>Punta del Este </li>
</ol>
</ul> 
```
  
En una página se vería así:
  
```
Ciudades del mundo

  * Argentina
     1. Buenos Aires 
     2. Bariloche 
  * Uruguay
     1. Montevideo
     2. Punta del Este 
    
```
  
---
  
##    ENLACES EN HTML
  
Hasta aquí, hemos podido ver que una página web es un archivo HTML en el que podemos
incluir, entre otras cosas, textos formateados a nuestro gusto e imágenes (las veremos con
detalle enseguida). Del mismo modo, un sitio web podrá ser considerado como el conjunto
de archivos, principalmente páginas HTML e imágenes, que constituyen el contenido al que
el navegante tiene acceso.
  
  Sin embargo, no podríamos hablar de navegante o de navegación si estos archivos HTML
no estuviesen debidamente conectados entre ellos y con el exterior de nuestro sitio por
medio de **enlaces hipertexto**. En efecto, el atractivo original del HTML radica en la posible
puesta en relación de los contenidos de los archivos introduciendo referencias bajo forma
de **enlaces que permitan un acceso rápido a la información deseada**. De poco serviría en la
red tener páginas aisladas a las que la gente no puede acceder y desde las que la gente no
puede saltar a otras.
  
Un enlace puede ser fácilmente detectado por el usuario en una página. Basta con **deslizar
el puntero del ratón sobre las imágenes o el texto y ver como cambia de su forma original
transformándose por regla general en una mano con un dedo señalador**.
  
  
Adicionalmente, **estos enlaces suelen ir, en el caso de los textos, coloreados y subrayados
para que el usuario no tenga dificultad en reconocerlos**.
  
##  SINTAXIS DE UN ENLACE
  
Para colocar un enlace, nos serviremos de las etiquetas **a** y su cierre. Dentro de la etiqueta
de apertura deberemos especificar asimismo el **destino del enlace**. Este destino será
introducido bajo forma de **atributo**, el cual lleva por nombre **"href"**.
  
``` 
<a href="destino">contenido</a>
```
  
Siendo **el "contenido" un texto o una image**n. Es la parte de la página que se colocará
activa y donde deberemos pulsar para acceder al enlace. Por su parte, **"destino" será una
página, un correo electrónico o un archivo**.
  
Por ejemplo, un enlace a la home de EggEducación, se vería así:
  
```  
<a href="https://eggeducacion.com/es-AR/">Home de EggEducación.com</a> 
  ```

Ahora, si queremos que el contenido del enlace sea una imagen y no un texto, podremoscolocar la correspondiente etiqueta IMG dentro de la etiqueta a.
  
 ```
<a href="https://eggeducacion.com/es-AR/"><img src="logo.jpg"></a>
 ```
  
Nota: veremos la etiqueta de imágenes más adelante.
  
## EL ASPECTO DE LOS ENLACES
  
Nosotros mediante el HTML, y las hojas de estilo CSS, podemos definir el aspecto que
tendrán los enlaces en una página. Sin embargo, ya de manera predeterminada el
navegador los destaca para que los podamos distinguir. Generalmente encontraremos a
los **enlaces subrayados y coloreados en azul**, aunque esta regla depende del navegador
del usuario y de sus estilos definidos como predeterminados.
  
##  TIPOS DE ENLACES
  
Para estudiar en profundidad los enlaces tenemos que clasificarlos por su tipo, porque
dependiendo ese tipo algunas cosas cambiarán a la hora de construirlos.
  
En función del destino los enlaces son clásicamente agrupados del siguiente modo:
  
• **Enlaces locales**: los que se dirigen a otras páginas del mismo sitio web.
  
• **Enlaces remotos**: los dirigidos hacia páginas de otros sitios web. Estos son los que
vimos en el ejemplo anterior.
  
### ENLACES LOCALES
  
Como hemos dicho, **un sitio web esta constituido de páginas interconexas**, que **se
relacionan mediante enlaces de hipertexto**. Para cumplir con esto es que vamos a utilizar
los enlaces locales.

Los enlaces locales se tratan de un tipo de enlace mucho más común en el día a día del
desarrollo. De hecho, es el tipo de enlace que más se produce en lo general. Estos enlaces
locales **nos permiten relacionar distintos documentos HTML que componen un sitio web**.
Gracias a los enlaces locales podremos convertir varias páginas sueltas en un sitio web
completo, compuesto de varios documentos.
  
Para crear este tipo de enlaces, hemos de usar la misma etiqueta A que ya conocemos, de
la siguiente forma:

 ```  
<a href="archivo.html">contenido</a>
  
 ```
  
 ### RUTAS DE LOS ENLACES
  
Hacer un enlace en si no es para nada complejo. No requiere muchas explicaciones con lo
que ya hemos visto en la guía alcanza, sin embargo hay que abordar con detalle un tema
importante: **las rutas de los enlaces**. Como rutas nos referimos al **destino del enlace**, o sea,
**lo que ponemos en el atributo "href**" y es importante que nos paremos aquí porque nos
puede dar algunos problemas al desarrollar, sobre todo para las personas que puedan
tener menos experiencia en el trabajo con el ordenador.

Por regla general, para una mejor organización, los sitios suelen estar ordenados por
**directorios**. Estos directorios **suelen contener diferentes secciones de la página, imágenes,
scripts, estilos, etc**. Es por ello que en muchos casos no nos valdrá con especificar el
nombre del archivo, sino que **tendremos que especificar además el directorio en el que
nuestro archivo.html esta alojado**.
  
Para aquellos que no saben como mostrar un camino de un archivo, aquí van una serie de
indicaciones que los ayudaran a comprender la forma de expresarlos. No resulta difícil en
absoluto y con un poco de practica lo haréis prácticamente sin pensar.
  
1. Hay que situarse mentalmente en el directorio en el que se encuentra la página
donde vamos a crear el enlace.
  
2. Si la página destino está en el mismo directorio que el archivo desde donde vamos
a enlazar podemos colocar simplemente el nombre del archivo de destino, ya que
no hay necesidad de cambiar de directorio.
  
3. Si la página de destino está en una carpeta o subdirectorio interior al directorio
donde está el archivo de origen, hemos de marcar la ruta enumerando cada uno de
los directorios por los que pasamos hasta llegar al archivo de destino, separándolos
por el símbolo barra **"/"**. Al final obviamente, escribimos el nombre del archivo
destino.
  
4. Si la página destino se encuentra en un directorio padre (superior al de la página del
enlace), hemos de escribir dos puntos y una barra **"../"** tantas veces como niveles
subamos en la arborescencia hasta dar con el directorio donde esta emplazado el
archivo destino.  

 5. Si la página se encuentra en otro directorio no incluido ni incluyente del archivo
origen, tendremos que subir como en la regla 3 por medio de** ".."** hasta encontrar un
directorio que englobe el directorio que contiene a la página destino.
  
 A continuación haremos como en la regla 2. Escribiremos todos los directorios por los
que pasamos hasta llegar al archivo.
  
Imagina que tienes la siguiente estructura de carpetas y archivos. La que aparece en la
siguiente imagen.
  
```
  -mi_web
        index.html
    -seccion1
        -paginas
    -seccion2
        pagina2.html
```
  
1) Para hacer un enlace a index.html
```
<a href="index.html">Ir a index.html</a>
```
  
2) Para hacer un enlace desde index.html hacia pagina1.html:
```
<a href="seccion1/paginas/pagina1.html">Ir a pagina1.html</a>
```
  
3) Para hacer un enlace desde pagina2 hacia pagina1:
```
<a href="../seccion1/paginas/pagina1.html">Ir (también) a pagina1.html</a>
```
  
4) Para hacer un enlace desde pagina1 hacia pagina2:
```
<a href="../../seccion2/pagina2.html">Ir ahora a pagina2.html</a>  
```  

---
  
## IMÁGENES EN HTML
  
Sin duda uno de los aspectos más vistosos y atractivos de las páginas web es el **grafismo**.
La introducción en nuestro texto de imágenes puede ayudarnos a explicar más fácilmente
nuestra información y darle un aire mucho más estético. El abuso no obstante, puede
conducirnos a una sobrecarga que se traduce en una distracción para el navegante, quien
tendrá más dificultad en encontrar la información necesaria.
  
El uso de imágenes también tiene que ser realizado con cuidado porque aumentan el
tiempo de carga de la página, lo que puede ser de un efecto nefasto si nuestro visitante no
tiene una buena conexión o si es un poco impaciente. Por ello es recomendable **siempre
optimizar las imágenes para Internet, haciendo que su tamaño en bytes sea lo mínimo
posible, para facilitar la descarga, pero sin que ello comprometa mucho su calidad**.
  
En esta guía no explicaremos como crear ni tratar las imágenes, únicamente diremos que
para ello se utilizan aplicaciones como Paint Shop Pro, Photoshop o Gimp. Tampoco
explicaremos las particularidades de cada tipo de archivo: **GIF**, **JPG** o **PNG** y la forma de
optimizar nuestras imágenes.

La etiqueta que utilizaremos para insertar una imagen es **IMG** (image). Esta etiqueta **no
posee su cierre correspondiente** y **en ella hemos de especificar obligatoriamente el
paradero de nuestro archivo gráfico mediante el atributo src (source)**.
 
La sintaxis queda entonces de la siguiente forma:
```  
<img src="camino_hacia_el_archivo.jpg">
  ```
  
Para expresar el camino, lo haremos de la misma forma que vimos para los enlaces. Las
reglas siguen siendo las mismas, lo único que cambia es que, en lugar de una página
siendo el destino, el destino es un archivo gráfico. En el código anterior estamos enlazando
un archivo con extensión **.jpg**, pero podrá ser otro tipo de archivo como **.gif** o **.png**.
Aparte de este atributo, indispensable obviamente para la visualización de la imagen, la
etiqueta IMG nos propone otra serie de atributos de mayor o menor utilidad, que listamos a
continuación:
  
## ATRIBUTO ALT
  
Dentro de las comillas de este atributo colocaremos **una brevísima descripción de la
imagen**. Esta etiqueta **es** indispensable pero presenta varias utilidades. La sintaxis te
quedaría de esta manera:

  ```
<img src="mi_archivo.png" alt="Descripción de esta maravillosa imagen">
  ```
  
Primeramente, **sirve para el posicionamiento de la página en buscadores**. De los atributos
alt el buscador puede extraer palabras clave y le ayuda a entender qué función o
contenido tiene la imagen, y por lo tanto la página.
  
Otra utilidad importante la encontramos en determinadas **aplicaciones, usadas por
personas con discapacidad**. Navegadores para ciegos, por ejemplo, no muestran las
imágenes y por tanto los alt ofrecen la posibilidad de leerlas. Nunca esta de más pensar en
crear páginas accesibles.
  
Por último, **durante el proceso de carga de la página y cuando la imagen no ha sido todavía
cargada, el navegador podría mostrar esta descripción, con lo que el navegante se puede
hacer una idea de lo que va en ese lugar**. **Si hubo problemas de conexión y no se pudo
mostrar la imagen, también podría usarse ese alt para mostrar al menos su descripción**.
  
En general podemos considerar como aconsejable el uso de este atributo, salvo para
imágenes de poca importancia. Si la imagen es usada como cuerpo de un enlace todavía
se hace más indispensable.
  

## ATRIBUTOS HEIGHT Y WIDTH
  
Estos atributos definen la **altura** y **anchura** respectivamente de la imagen en píxeles.
  
Aunque estas dimensiones forman parte del estilo de la imagen, y por tanto podrían ir en el
CSS, todavía puede ser interesante definirlas dentro del HTML. Esto, **ya no es tan
indispensable, puesto que muchos sitios creados con "Responsive Web Design" prefieren
que las imágenes se adapten al tamaño de la pantalla donde se va a visualizar**.
  
**Todos los archivos gráficos poseen unas dimensiones de ancho y alto**. Estas dimensiones
pueden obtenerse a partir del propio diseñador grafico o bien haciendo clic con el botón
derecho sobre la imagen, vista desde el explorador de archivos de tu ordenador, para
luego elegir "propiedades" o "información de la imagen" sobre el menú que se despliega.
Un ejemplo de etiqueta IMG con sus valores de anchura y altura declarados te quedaría así:
  
```
<img src="mi-imagen.gif" width="200" height="300">
```
  
## IMÁGENES QUE SON ENLACES Y EL ATRIBUTO BORDER
  
Si un texto puede servir de enlace, una imagen puede cumplir la misma función:
  
```
<a href="archivo.html"><img src="imagen.gif"></a>
```

El problema de hacer esto en ciertos navegadores es que se crea un borde en la imagen,
del mismo color que el color configurado para los enlaces, lo que suele ser un efecto poco
deseado.
  
Sin embargo, en HTML podemos indicar que una imagen tenga borde. Mediante el **atributo
"border"** se define el tamaño en píxeles del cuadro que rodea la imagen. De esta forma
podemos recuadrar nuestra imagen si lo deseamos. No es algo que se use mucho, pero
resulta particularmente útil cuando deseamos eliminar el borde que aparece cuando la
imagen sirve de enlace. En dicho caso tendremos que especificar **border="0"**.  

---
  
## TABLAS EN HTML
  
Una tabla es** un conjunto de celdas organizadas dentro de las cuales podemos alojar
distintos contenidos**. HTML dispone de una gran variedad de etiquetas para crear tablas,
con sus atributos.
  
En un principio nos podría parecer que las tablas son raramente útiles y que pueden ser
utilizadas principalmente para listar datos como agendas, resultados y otros datos de una
forma organizada. En general, sirven para representar información tabulada, en filas y
columnas. Esto es una realidad en los últimos años, desde que las tablas se han
descartado para fines relacionados con la maquetación.
  
Como veremos a continuación, existen diversas etiquetas que se deben utilizar en una
forma determinada para la creación de tablas. Por ello, puede que en un principio nos
resulte un poco complicado trabajar con estas estructuras pero, con un poco de práctica
podremos crear tablas con absoluta soltura. Si deseamos mostrar datos de una manera
sencilla de leer, dispuestos en filas y columnas, tarde o temprano observaremos que las
tablas son la mejor solución y apreciaremos las posibilidades nos ofrecen.
  
### ETIQUETAS BÁSICAS PARA TABLAS EN HTML
  
Para empezar, nada más sencillo que por el principio: las tablas son definidas por las
etiquetas **TABLE** y su cierre.
  
Dentro de estas dos etiquetas colocaremos todas las otras etiquetas de las tablas, hasta
llegar a las **celdas**. Dentro de las celdas ya es permitido colocar** textos** e **imágenes** que
darán el contenido a la tabla.
  
Las tablas** son descritas por líneas de arriba a abajo (y luego por columnas de izquierda a
derecha)**. **Cada una de estas líneas, llamada fila, es definida por otra etiqueta y su cierre: TR
(table row)**.
  
Asimismo, **dentro de cada línea, habrá diferentes celdas**. Cada una de estas celdas será
definida por otra etiqueta: **TD (table data)**. Dentro de ésta y su cierre será donde
coloquemos nuestro contenido, el contenido de cada celda.  
  
Aquí tenéis un ejemplo de estructura de tabla:  
  
```
<table>
<tr>
  <td>Celda 1, linea 1</td>
  <td> Celda 2, linea 1</td>
</tr>
<tr>
  <td> Celda 1, linea 2</td>
  <td> Celda 2, linea 2</td>
</tr>
</table> 
```
  
En una página se ve así:  

  
```
Celda 1, linea 1  Celda 1, linea 2
Celda 2, linea 1  Celda 2, linea 2
```  
  
También existe la etiqueta TH (table header), que sirve para crear una celda cuyo contenido
esté formateado como un título o cabecera de la tabla. En la práctica, lo que hace es poner
en negrita y centrado el contenido de esa celda, lo que se puede conseguir aplicando las
correspondientes etiquetas dentro de la celda.
  
Aquí tenéis un ejemplo de estructura de tabla con la etiqueta th:  
  
```
 <table>
<tr>
  <th>Titulo Celda 1</th>
  <th> Titulo Celda 2</th>
</tr>
<tr>
  <td>Celda 1, linea 1</td>
  <td> Celda 2, linea 1</td>
</tr>
<tr>
  <td> Celda 1, linea 2</td>
  <td> Celda 2, linea 2</td>
</tr>
</table> 
  ```
  
---  
  
 ## ATRIBUTOS PARA TABLAS, FILAS Y CELDAS

A partir de esta idea simple y sencilla, las tablas adquieren otra magnitud cuando les
incorporamos toda una cantidad de atributos aplicados sobre cada tipo de etiquetas que
las componen.

En cuanto a atributos para tabla hay unos cuantos. Muchos los conoces ya de otras
etiquetas, como width, height, align, etc. Hay otros que son especialmente creados para las
etiquetas TABLE.

• **cellspacing**: es el espacio entre celdas de la tabla.

• **cellpadding**: es el espacio entre el borde de la celda y su contenido.

• **border**: es el número de píxeles que tendrá el borde de la tabla.

• **bordercolor**: es el rbg que le vas a asignar al borde de la tabla.

En cuanto a las etiquetas "interiores" de una tabla, nos referimos a TR y TD, ten en cuenta:

• Podemos usar prácticamente cualquier tipo de etiqueta dentro de la etiqueta TD
para, de esta forma, escribir su contenido.

• Las etiquetas situadas en el interior de la celda no modifican el resto del
documento.

• Las etiquetas de fuera de la celda no son tenidas en cuenta por ésta.

Así pues, podemos especificar el formato de nuestras celdas a partir de etiquetas
introducidas en su interior o mediante atributos colocados dentro de la etiqueta de celda
TD o bien, en algunos casos, dentro de la etiqueta TR, si deseamos que el atributo sea
valido para toda la línea. La forma más útil y actual de dar forma a las celdas es a partir de
las hojas de estilo en cascada que ya tendréis la oportunidad de abordar más adelante.

Empecemos viendo atributos que nos permiten modificar una celda en concreto o toda
una línea:

• **align**: Justifica el texto de la celda del mismo modo que si fuese el de un párrafo.

• **valign**: Podemos elegir si queremos que el texto aparezca arriba (top), en el centro
(middle) o abajo (bottom) de la celda.

• **bgcolor**: Da color a la celda o línea elegida.

• **bordercolor**: Define el color del borde.

Otros atributos que pueden ser únicamente asignados a una celda y no al conjunto de
celdas de una línea son:

• **background**: Nos permite colocar un fondo para la celda a partir de un enlace o una
imagen.

• **height**: Define la altura de la celda en pixeles o porcentaje.

• **width**: Define la anchura de la celda en pixeles o porcentaje.

• **colspan**: Expande una celda horizontalmente.

• **rowspan**: Expande una celda verticalmente.

Estos últimos cuatro atributos descritos son de gran utilidad. Concretamente, height y
width nos ayudan a definir las dimensiones de nuestras celdas de una forma absoluta (en
pixeles o puntos de pantalla) o de una forma relativa, es decir por porcentajes referidos al
tamaño total de la tabla.

posible expandir celdas fusionando éstas con sus vecinas. El valor que pueden tomar estas
etiquetas es numérico. El número representa la cantidad de celdas fusionadas.

Así:
```
<td colspan="2">
```
El resto de los atributos presentados presentan una utilidad y uso bastante obvios. Los
dejamos a vuestra propia investigación.

---

## FORMULARIOS HTML


Hasta ahora hemos visto la forma en la que el HTML gestiona y muestra la información,
esencialmente mediante texto, imágenes y enlaces. Nos queda por ver de qué forma
podemos intercambiar información con nuestro visitante. Desde luego, este nuevo aspecto
resulta primordial para gran cantidad de acciones que se pueden llevar a cabo mediante la
Web: comprar un articulo, rellenar una encuesta, enviar un comentario al autor, registrar un
usuario, etc.


Los formularios son esas famosas cajas de texto y botones que podemos encontrar en
muchas páginas web. Son muy utilizados para realizar búsquedas o bien para introducir
datos personales por ejemplo en sitios de comercio electrónico. Los datos que el usuario
introduce en estos campos son enviados al correo electrónico del administrador del
formulario o bien a un programa que se encarga de procesarlo automáticamente. Nosotros
en esta guía no vamos a mostrar como enviar la información al mail, ya que nos interesa,
más adelante poder manejar esa información.

##  QUÉ SE PUEDE HACER CON UN FORMULARIO

Usando HTML podemos únicamente enviar el contenido del formulario a un correo
electrónico, es decir, construir un formulario con diversos campos y, a la hora pulsar el
botón de enviar, generar un mensaje de que se ha registrado con éxito la información.

Pero para todo lo que sea manejar esa información y guardarla, por ejemplo, en una base
de datos vamos a tener que utilizar Java. Como lo haremos lo veremos más adelante en el
curso.

Así pues, en resumen, con HTML podremos construir los formularios, con diversos tipos de
campos, como cajas de texto, botones de radio, cajas de selección, menús desplegables,
etc. Sin embargo, debe quedar claro que desde HTML no se puede manejar esta
información para guardarla o enviarla a algún correo, etc. Eso será trabajo de Java.

## CÓMO HACER UN FORMULARIO EN HTML


Los formularios son definidos por medio de las etiquetas FORM y su cierre. Entre estas dos
etiquetas colocaremos todos los campos y botones que componen el formulario. Dentro
de esta etiqueta FORM debemos especificar algunos atributos

**action**: define el tipo de acción a llevar a cabo con el formulario. Como ya hemos dicho,
existen dos posibilidades:

• El formulario es enviado a una dirección de correo electrónico. Para esto hay que
poner el mail en el action.

• El formulario es enviado a un programa o script que procesa su contenido. Esta es
la posibilidad que más no interesa.

```
<form action="ruta del método que va a manejar la información"></form>
```

**method**: Este atributo se encarga de especificar la forma en la que el formulario es enviado.
Los dos valores posibles que puede tomar esta atributo son **POST** y **GET**. A efectos
prácticos y, salvo que se os diga lo contrario, daremos siempre el valor POST. Estos
conceptos de POST y GET, lo veremos más adelante en el curso.

**enctype**: Se utiliza para indicar la forma en la que viajará la información que se mande por
el formulario. En el caso más corriente, enviar el formulario por correo electrónico, el valor
de este atributo debe de ser "text/plain". Así conseguimos que se envíe el contenido del
formulario como texto plano dentro del email. Si fuéramos a enviar una imagen dentro del
formulario, este atributo debería ser “multipart/form-data”. También todos estos conceptos
vamos a verlos más adelante.

Este ultimo atributo puede que esté como que no esté, las otras dos si vamos a guardar la
información de nuestro formulario en Java, van a estar siempre.

###  EJEMPLO DE ETIQUETA FORM COMPLETA

Entonces con todo lo anterior ya explicado, la etiqueta completa nos quedaría así:

```
<form action="ruta del metodo que va a manejar la información" method="POST" enctype="multipart/form-data"></form>
```

Entre esta etiqueta y su cierre colocaremos el resto de etiquetas que darán forma a nuestro
formulario.

## CAMPOS DE TEXTO

El lenguaje HTML nos propone una gran diversidad de alternativas a la hora de crear
nuestros formularios, es decir, una gran variedad de elementos para diferentes propósitos.
Estas van desde la clásica caja de texto, hasta la lista de opciones en un menú
desplegable, pasando por las cajas de validación, etc.

Las etiquetas que tenemos que utilizar para crear campos de texto, pueden ser de dos
tipos. Veamos en qué consiste cada una de estas modalidades y como podemos
implementarlas en nuestro formulario.

## ETIQUETA INPUT

Las cajas de texto son colocadas por medio de la etiqueta INPUT. Dentro de esta etiqueta
hemos de especificar el valor de dos atributos: type y name.

```
<input type="text" name="nombre">
```

De este modo expresamos nuestro deseo de crear una caja de texto cuyo contenido será
llamado "nombre" (por ejemplo, en el caso de la etiqueta anterior, pero podemos poner
distintos nombres a cada uno de los campos de texto que habrán en los formularios).

## ATRIBUTO TYPE

Como hemos visto el atributo type nos sirve para especificar el tipo de dato que se va a
ingresar en nuestro input, en el ejemplo anterior lo habíamos puesto como tipo text, para
que sea una caja de texto y poder ingresar texto. Pero existen otros tipos de valores para el
atributo type

## NUMBER

Este tipo permite al usuario ingresar números. Los navegadores vienen con validaciones
para evitar que el usuario ingrese algo que no sea números. Además, en los navegadores
modernos, los campos numéricos suelen venir con controles que permiten a los usuarios
cambiar su valor de forma gráfica.
```
<input type="number">
```

## DATE

Este le permite al usuario ingresar una fecha, ya sea mediante una caja de texto o una
interfaz grafica con selector de fecha.
```
<input type="date">
```

## EMAIL

Este tipo permite al usuario ingresar un mail. Los navegadores vienen con validaciones
para validar que se esté ingresando con el formato correcto de un mail. Este input se va a
ver como un input de texto común y corriente.
```
<input type="email">
```

## TEXTO OCULTO

Hay determinados casos en los que podemos desear esconder el texto escrito en el
campo input, por medio de círculos negros, de manera que aporte una cierta
confidencialidad. Para esto vamos a usar el type password.
```
<input type="password">
```

## ATRIBUTO NAME

Si vemos de nuevo el ejemplo del principio:
```
<input type="text" name="nombre">
```
En este ejemplo creamos una caja de texto cuyo contenido será llamado "nombre”,
elegimos nombre, pero podemos ponerles el nombre que queramos.

--- 
  
  El nombre del elemento del formulario es de gran importancia para poder identificarlo en
nuestro programa de procesamiento (Java).

Además de estos dos atributos, esenciales para el correcto funcionamiento de nuestra
etiqueta, existen otra serie de atributos que pueden resultarnos de utilidad pero que no son
imprescindibles:

**size**: define el tamaño de la caja de texto, en número de caracteres visibles. Si al escribir el
usuario llega al final de la caja, el texto que escriba a continuación también cabrá dentro
del campo pero irá desfilando, a medida que se escribe, haciendo desaparecer la parte de
texto que queda a la izquierda.

**maxlength**: indica el tamaño máximo del texto, en número de caracteres, que puede ser
escrito en el campo. En caso que el campo de texto tenga definido el atributo maxlength, el
navegador no permitirá escribir más caracteres en ese campo que los que hayamos
indicado.

**value**: en algunos casos puede resultarnos interesante asignar un valor definido al campo
en cuestión. Esto puede ayudar al usuario a rellenar más rápidamente el formulario o darle
alguna idea sobre la naturaleza de datos que se requieren. Este valor inicial del campo
puede ser expresado mediante el atributo value. Veamos su efecto con un ejemplo
sencillo:
```
<input type="text" name="instituto" value="Egg Educación">
```

**placeholder**: este atributo especifica una pequeña pista que describe el valor esperado de
para el campo (input).
La pequeña sugerencia se muestra en el campo de entrada antes de que el usuario ingrese
un valor. Una vez que escriba, esa pista va a desaparecer.
```
<input type="text" name="nombre " placeholder="Nombre del usuario ">
```

**Nota**: recordemos que todos estos ejemplos de input deben ir entre las etiquetas de
apertura y de cierre form.

```
<form>
  <input type="text" name="instituto" value="Egg Educación">
</form>
```


## ETIQUETA TEXTAREA PARA TEXTO LARGO

Si deseamos poner a la disposición de usuario un campo de texto donde pueda escribir
cómodamente sobre un espacio compuesto de varias líneas, hemos de invocar una nueva
etiqueta: TEXTAREA y su cierre correspondiente.

Este tipo de campos son prácticos cuando el contenido a enviar no es un nombre, teléfono,
edad o cualquier otro dato breve, sino más bien, un comentario, opinión, etc. en los que
existe la posibilidad que el usuario desee rellenar varias líneas.

Dentro de la etiqueta textarea deberemos indicar, como para el caso visto anteriormente, el
atributo name para asociar el contenido a un nombre que será asemejado a una variable
en un lenguaje de programación. Además, podemos definir las dimensiones del campo a
partir de los atributos siguientes:

• **rows**: define el número de líneas del campo de texto.

• **cols**: define el número de columnas del campo de texto.

La etiqueta queda por tanto de esta forma:

```
<textarea name="comentario" rows="10" cols="40"></textarea>
```

Asimismo, es posible predefinir el contenido del campo. Para ello, no usaremos el atributo
value, sino que escribiremos dentro de la etiqueta el contenido que deseamos atribuirle.

Veámoslo:
```
<textarea name="comentario" rows="10" cols="40">Escribe tu comentario…</textarea>
```

Esta etiqueta al igual que el input debe ir dentro de la etiqueta form.

## ETIQUETA LABEL

El elemento LABEL y su etiqueta de cierre, provee una descripción corta para el campo de
texto y que puede ser asociada a un campo de texto. Podemos asociar una etiqueta label a
un campo de texto para que el usuario pueda acceder al campo de texto con solo clickear
el label. También, como veremos más adelante, cuando veamos las cajas de opciones,
clickear en el nombre de la opción para acceder a ella, “tickear” esa opción.

La etiqueta se ve de esta forma:
```
<label>Nombre del Usuario</label>
<input type="text" name="nombre">
```

## ATRIBUTO LABEL

La etiqueta label solo consta del atributo for. Mediante la utilización del atributo for
podemos asociar el label con el input. Para lograr esto vamos a tener que utilizar también
el atributo ID, este atributo lo explicamos previamente y lo vamos a ver más en detalle en la
parte de CSS.

La manera que anclamos un label a un input es, al label le vamos a dar un valor en su
atributo for, este va a representar el dato que se va a ingresar en el input y en el input
vamos a poner el mismo valor pero en el atributo ID. Entonces, el primer elemento input en
el documento con un ID que coincida con el dispuesto en el atributo for puesto en el
label, será el control etiquetado para este elemento.

Esto se vería así:
```
<label for="nombre">Nombre del Usuario</label>
<input type="text" id="nombre" name="nombre">
```


El label y el input se verán igual pero ahora cuando el usuario clickee el label se va a activar
el campo de texto del input para poder ingresar el valor que el usuario necesite. Después
vamos a ver un ejemplo más útil con las cajas de opciones.

## OTROS ELEMENTOS DE FORMULARIOS

Seguramente hayan notado que los input son un manera muy practica de hacernos llegar
la información del navegante. No obstante, en muchos casos, permitir al usuario que
escriba cualquier texto permite demasiada libertad y puede que la información que éste
escriba no sea la que nosotros estamos necesitando.

Por ejemplo, pensemos que queremos que el usuario indique su país de residencia. En ese
caso podríamos ofrecer una lista de países para que seleccione el que sea. Este mismo
caso se puede aplicar a gran variedad de informaciones, como el tipo de tarjeta de crédito
para un pago, la puntuación que da a un recurso, si quiere recibir o no un boletín de
novedades, etc...

Este tipo de opciones predefinidas por nosotros pueden ser expresadas por medio de
diferentes campos de formulario. Veamos a continuación cuales son:
  
  ## LISTAS DE OPCIONES

Las listas de opciones son ese tipo de menús desplegables que nos permiten elegir una (o
varias) de las múltiples opciones que nos proponen. Para construirlas emplearemos una
etiqueta SELECT, con su respectivo cierre.






Como para los casos ya vistos, dentro de esta etiqueta definiremos su nombre por medio
del atributo name. Cada opción será incluida en una línea precedida de la etiqueta
**OPTION**.

Podemos ver, a partir de estas explicaciones, la forma más típica y sencilla de esta
etiqueta:

```
<select name="estacion">
	<option>Primavera</option>
	<option>Verano</option>
	<option>Otoño</option>
	<option>Invierno</option>
</select>
```

Esta estructura puede verse modificada principalmente a partir de otros dos atributos:

**size**: indica el número de valores mostrados a la vez en la lista. Lo típico es que no se
incluya ningún valor en el atributo size, en ese caso tendremos un campo de opciones
desplegable, pero si indicamos un valor para el atributo size aparecerá un campo donde
veremos las opciones definidas por size y el resto podrán ser vistos por medio de la barra
lateral de desplazamiento.

**multiple**: permite la selección de más elementos de la lista. Este atributo se expresa sin
valor alguno, es decir, no se utiliza con el igual, simplemente se pone para conseguir el
efecto, o no se pone si queremos una lista desplegable común.
```
<select name="estacion" size="3" multiple>
```

La etiqueta OPTION puede asimismo ser modificada por medio de otros atributos.

selected: del mismo modo que multiple, este atributo no toma ningún valor sino que
simplemente indica que la opción que lo presenta esta elegida por defecto.
```
<option selected>Otoño</option>
```

## BOTONES DE RADIO

Existe otra alternativa para plantear una elección, en este caso, obligamos al usuario a
elegir únicamente una de las opciones que se le proponen.

La etiqueta empleada en este caso es INPUT en la cual usaremos el atributo type con el de
valor radio. Este atributo colocara una casilla pinchable al lado del valor del input. Veamos
un ejemplo:
```
<input type="radio" name="estacion" value="1">Primavera
<br>
<input type="radio" name="estacion" value="2">Verano
<br>
<input type="radio" name="estacion" value="3">Otoño
<br>
<input type="radio" name="estacion" value="4">Invierno
```

En este tipo de input para elegir una opción debemos tocar en la casilla clickeable, pero
habíamos explicado previamente en la etiqueta label, que podíamos hacer que la etiqueta
label al clickearla se active la caja de texto del input. Ahora, podemos usar eso para que
cuando el usuario clickee la palabra primavera se seleccione esa opción. 

Esto se vería así:

```
<input type="radio" id="primavera" name="estacion" value="1">
<label for="primavera">Primavera</label>
<br>
<input type="radio" id="verano" name="estacion" value="2">
<label for="verano">Verano</label>
<br>
<input type="radio" id="otonio" name="estacion" value="3">
<label for="otonio">Otoño</label>
<br>
<input type="radio" id="invierno" name="estacion" value="4">
<label for="invierno">Invierno</label>
```

La única diferencia va a ser que el usuario va a poder clickear el nombre de la estación que
quiere para seleccionar esa opción, además de poder clickear la casilla.

## CAJAS DE VALIDACIÓN

Este tipo de elementos pueden ser activados o desactivados por el visitante por un simple
click sobre la caja en cuestión. Para esto vamos a usar la etiqueta INPUT con el valor
checkbox en el atributo type.
```
<input type="checkbox" name="estacion" value="1">Primavera
```

## ENVIO, BORRADO Y DEMÁS

Ha llegado el momento de explicar cómo podemos hacer un botón para provocar el envío
del formulario, entre otras cosas.

Como podremos imaginarnos, en formularios no solamente habrá elementos o campos
donde solicitar información del usuario, sino también habrá que implementar otra serie de
funciones. Concretamente, han de permitirnos su envío mediante un botón. También
puede resultar práctico poder proponer un botón de borrado o bien acompañar el
formulario de datos ocultos que puedan ayudarnos en su procesamiento.


## BOTÓN DE ENVÍO DE FORMULARIO (BOTÓN DE SUBMIT)

Para dar por finalizado el proceso de relleno del formulario y hacerlo llegar a su gestor, el
usuario ha de enviarlo por medio de un botón previsto a tal efecto. Para esto vamos a
utilizar la etiqueta BUTTON y su respectivo cierre. Dentro el elemento button se puede
poner texto ( y etiquetas como <i>, <b>, <strong>, <br>, <img>, etc.). 

Se vería así:
```
<button type="submit">Enviar</button>
```

Como puede verse, tan solo hemos de especificar que se trata de un botón de envío
(type="submit") y hemos de definir el mensaje que queremos que aparezca escrito en el
botón.

## BOTÓN DE BORRADO (BOTÓN DE RESET)

Este botón nos permitirá borrar el formulario por completo, en el caso de que el usuario
desee rehacerlo desde el principio. Su estructura sintáctica es parecida a la anterior:
```
<button type="reset">Borrar</button>
```

A diferencia del botón de envío, indispensable en cualquier formulario, el botón de borrado
resulta meramente optativo y no es utilizado frecuentemente. Hay que tener cuidado de no
ponerlo muy cerca del botón de envío y de distinguir claramente el uno del otro, para que
ningún usuario borre el contenido del formulario que acaba de rellenar por error.

## BOTONES NORMALES

Dentro de los formularios también podemos colocar botones normales, pulsables como
cualquier otro botón. Estos botones por si solos no tienen mucha utilidad pero podremos
necesitarlos para realizar acciones en el futuro. Su sintaxis es la siguiente:
```
<button type="button">Borrar</button>
```

## DATOS OCULTOS (CAMPOS HIDDEN)

En algunos casos, aparte de los propios datos rellenados por el usuario, puede resultar
práctico enviar datos definidos por nosotros mismos que ayuden al programa en su
procesamiento del formulario. Este tipo de datos, que no se muestran en la página pero si
pueden ser detectados solicitando el código fuente, no son frecuentemente utilizados por
páginas construidas en HTML, son más bien usados por páginas que emplean tecnologías
de servidor. No se asusten, veremos más adelante qué quiere decir esto. Tan solo
queremos dar constancia de su existencia y de su modo creación. He aquí un ejemplo:

```
<input type="hidden" name="instituto" value="Egg Educación">
```

Esta etiqueta, incluida dentro de nuestro formulario, enviara un dato adicional al programa
encargado de la gestión del formulario.

## EJEMPLO COMPLETO DE FORMULARIO

Con esto ultimo finalizamos el tema de formularios. Pasemos ahora a ejemplificar todo lo
aprendido a partir de la creación de un formulario.

```
<form action="ruta del metodo que va a manejar la información" method="POST" enctype="multipart/form-data"></form>
<label>Nombre del usuario</label> <br>
<input type="text" name="nombre"> <br>
<label>Edad del usuario</label> <br>
<input type="number" name="edad "> <br>
<label>Fecha de nacimiento del usuario</label> <br>
<input type="date” name="fechanac"> <br>
<label>Sexo del usuario</label> <br>
<input type="radio" name="sexo" value="Hombre"> Hombre <br>
<input type="radio" name="sexo" value="Mujer"> Mujer <br>
<label>Pais nacimiento del usuario</label> <br>
<select name="pais">
	<option>Argentina</option>
	<option>Brasil</option>
	<option>Chile</option>
	<option>Uruguay</option>
</select>
<br>
<button type="submit">Enviar</button>
<button type="reset">Borrar</button>
```



---

# SECCIONES EN HTML

Las paginas web se trabajan con lo que se conoce como un esquema. El esquema (outline)
de una página web es un índice de los apartados de una página web que muestra la
relación de jerarquía entre los diferentes apartados y subapartados. El concepto de
esquema se formalizó en HTML 5 con más precisión que en HTML 4 / XHTML 1 y explica
algunas características y formas de utilización de las etiquetas de secciones y bloques de
contenido.

En relación a esto se pensó que las páginas de HTML se pueden dividir en secciones y en
HTML 5 se introdujo una serié de etiquetas que nos van a ayudar con la división de nuestra
pagina en secciones. Dentro de cada sección van a haber más etiquetas, esto es
simplemente para que podemos tener un índice de los apartados de la pagina web.

```<section>```: se utiliza para representar una sección "general" dentro de un documento o
aplicación, como un capítulo de un libro. Puede contener subsecciones y si lo
acompañamos de h1-h6 podemos estructurar mejor toda la página creando jerarquías del
contenido, algo muy favorable para el buen posicionamiento web.

```<article>```: representa un componente de una página que consiste en una composición
autónoma en un documento, página, aplicación, o sitio web con la intención de que pueda
ser reutilizado y repetido.

```<aside>```: representa una sección de la página que abarca un contenido relacionado con el
contenido que lo rodea, por lo que se le puede considerar un contenido independiente.
Este elemento puede utilizarse para efectos tipográficos, barras laterales, elementos
publicitarios u otro contenido que se considere separado del contenido principal de la
página.

```<header>```: representa un grupo de artículos introductorios o de navegación. Está destinado
a contener por lo general la cabecera de la sección (un elemento h1-h6 o un elemento
hgroup).

```<nav>```: representa una sección de una página que enlaza a otras páginas o a otras partes
dentro de la página. No todos los grupos de enlaces en una página necesita estar en un
elemento nav, sólo las secciones que constan de bloques de navegación principales son
apropiadas para el elemento de navegación.

```<footer>```: representa el pie de una sección, con información acerca de la página/sección
que poco tiene que ver con el contenido de la página, como el autor, el copyright o el año.
<hgroup>: representa el encabezado de una sección. El elemento se utiliza para agrupar un
conjunto de elementos h1-h6 cuando el título tiene varios niveles, tales como subtítulos o
títulos alternativos.

---

## ETIQUETAS EXTRAS

En este apartado que va a ser el ultimo de nuestra parte de html vamos a ver unas
etiquetas que no hemos visto todavía y que son importantes.

## ETIQUETA DIV

La etiqueta div se conoce como etiqueta de división. La etiqueta div se usa en HTML para
hacer divisiones de contenido en la página web como (texto, imágenes, encabezado, pie
de página, barra de navegación, etc.). La etiqueta Div tiene etiquetas de apertura (<div>) y
de cierre (</div>) y es obligatorio cerrar la etiqueta. Div es la etiqueta más útil en el
desarrollo web porque nos ayuda a separar datos en la página web y podemos crear una
sección particular para datos o funciones particulares en las páginas web. Cabe aclarar
que la etiqueta div genera un salto de linea.

• La etiqueta Div es una etiqueta de nivel de bloque

• Es una etiqueta de contenedor genérica

• Se utiliza para agrupar varias etiquetas de HTML para que se puedan crear
secciones y aplicarles estilo.

Un ejemplo que podríamos usar para la etiqueta div es, supongamos que tenemos 3
párrafos que queremos alinear a la izquierda, esto recordemos lo haríamos con el atributo
align. Nosotros haríamos algo así:

```
<p align="left">Parrafo 1</p>
<p align="left">Parrafo 2</p>
<p align="left">Parrafo 3</p>

```

Una forma de simplificar nuestro código anterior y de evitar introducir continuamente el
atributo align sobre cada una de nuestras etiquetas es utilizando la etiqueta DIV. Vamos a
usar un div para generar una sección de todos los párrafos y le pones el atributo align al
div.

Esto se vería asÏ:


```
<div align="left">
	<p>Parrafo 1</p>
	<p>Parrafo 2</p>
	<p>Parrafo 3</p>
</div>
```
Como hemos visto, la etiqueta DIV marca divisiones en las que definimos un bloque de
contenido, y a los que podríamos aplicar estilo de manera global, aunque lo correcto sería
aplicar ese estilo del lado del CSS.

---

## ETIQUETA SPAN

El elemento span HTML es un contenedor en línea genérico para elementos y contenido en
línea. Solía agrupar elementos con fines de estilo (mediante el uso de los atributos de clase
o id). La mejor manera de usarlo es cuando no hay ningún otro elemento semántico
disponible. span es muy similar a la etiqueta div, pero div es una etiqueta a nivel de bloque
y span es una etiqueta en línea. La etiqueta Span es una etiqueta emparejada, lo que
significa que tiene una etiqueta de apertura (<) y de cierre (>), y es obligatorio cerrar la
etiqueta.

• La etiqueta span se utiliza para agrupar elementos en línea.

• La etiqueta span no realiza ningún cambio visual por sí misma.

• span es muy similar a la etiqueta div, pero div es una etiqueta a nivel de bloque y
span es una etiqueta en línea.

Un ejemplo de la etiqueta span, es poner una parte de un párrafo de un color concreto, ya
que es una etiqueta en linea, la podemos meter dentro de una etiqueta p.

```
<p>My mother has <span style="color: blue">blue</span> eyes.</p>
```
La etiqueta span no crea un salto de línea similar a una etiqueta div, sino que permite al
usuario separar cosas de otros elementos a su alrededor en una página dentro de la misma
línea. Al evitar el salto de línea, solo da como resultado el texto seleccionado para cambiar,
manteniendo todos los demás elementos a su alrededor iguales.

Nota: en el apartado de CSS vamos a ver mejor el atributo style y el atributo color. Ahora los
estamos usando para el ejemplo.

---

#  CSS

## INTRODUCCIÓN

CSS es el acrónimo de Cascading Style Sheets, o lo que sería en español Hojas de Estilo
en Cascada. Es un lenguaje que sirve para especificar el estilo o aspecto de las páginas
web. CSS se define en base a un estándar publicado por una organización llamada W3C,
que también se encarga de estandarizar el propio lenguaje HTML.

## POR QUÉ EXISTE CSS

El lenguaje HTML está limitado a la hora de aplicar forma a un documento. Sirve de manera
excelente para especificar el contenido que debe tener una página web, pero no permite
definir cómo ese documento se debe presentar al usuario.

Otro motivo que ha hecho necesaria la creación de CSS ha sido la separación del
contenido de la presentación. Al inicio las páginas web tenían mezclado en su código
HTML el contenido con las etiquetas necesarias para darle forma. Esto tiene sus
inconvenientes, ya que la lectura del código HTML se hace pesada y difícil a la hora de
buscar errores o depurar las páginas. Además, desde el punto de vista de la riqueza de la
información y la utilidad de las páginas a la hora de almacenar su contenido, es un gran
problema que los textos están mezclados con etiquetas incrustadas para dar forma a
éstos, pues se degrada su utilidad.

## CSS SOLVENTA ESTOS PROBLEMAS

Como hemos visto, para facilitar un correcto mantenimiento de las páginas web y para
permitir que los diseñadores pudieran trabajar como sería deseable, había que introducir
un nuevo elemento en los estándares y éste fue el lenguaje CSS.

CSS se ideó para aplicar el formato en las páginas, de una manera mucho más detallada,
con nuevas posibilidades que no estaban al alcance de HTML. Al mismo tiempo, gracias a
la posibilidad de aplicar el estilo de manera externa al propio documento HTML, se
consiguió que el mantenimiento de las páginas fuese mucho más sencillo.


## CARACTERÍSTICAS Y VENTAJAS DE CSS

El modo de funcionamiento de CSS consiste en definir, mediante una sintaxis especial, la
forma de presentación que le aplicaremos a los elementos de la página.

Podemos aplicar CSS a muchos niveles, desde un sitio web entero hasta una pequeña
etiqueta. Estos son los principales bloques de acción.

• Una web entera: de modo que se puede definir en un único lugar el estilo de toda
una web, de una sola vez.

• Un documento HTML o página en particular: se puede definir la forma de cada uno
de los bloques de contenido de una página, en una declaración que afectará a un
solo documento de un sitio web.

• Una porción del documento: aplicando estilos visibles en un trozo de la página,
como podría ser la cabecera.

• Una etiqueta en concreto: llegando incluso a poder definir varios estilos diferentes
para una sola etiqueta. Esto es muy importante ya que ofrece potencia en nuestra
programación. Podemos definir, por ejemplo, varios tipos de párrafos: en rojo, en
azul, con márgenes, sin ellos...

La potencia de la tecnología salta a la vista. Pero no solo se queda ahí, ya que además esta
sintaxis CSS permite aplicar al documento formato de modo mucho más exacto. Si antes el
HTML se nos quedaba corto para maquetar las páginas y teníamos que utilizar trucos para
conseguir nuestros efectos, ahora tenemos muchas más herramientas que nos permiten
definir esta forma:

• Podemos definir la distancia entre líneas del documento.

• Se puede aplicar identado (sangrado) a las primeras líneas del párrafo.

• Podemos colocar elementos en la página con mayor precisión, y sin lugar a errores.

• Y mucho más, como definir la visibilidad de los elementos, márgenes, subrayados,
tachados, etc.

Otra ventaja importante de CSS es la capacidad de especificar las medidas con diversas
unidades. Si con HTML tan sólo podíamos definir atributos en las páginas con pixeles y
porcentajes, ahora podemos definir utilizando muchas más unidades como:

• Pixeles (px) y porcentaje (%), como antes.

• Pulgadas (in).

• Puntos (pt).

• Centímetros (cm).

• Y otras que veremos más adelante

---
					  

## SINTAXIS HTML

La meta básica del lenguaje Cascading Stylesheet (CSS) es permitir al motor del
navegador pintar elementos de la página con características específicas, como colores,
posición o decoración. La sintaxis CSS refleja estas metas y estos son los bloques básicos
de construcción.

• La propiedad que es un identificador, un nombre leíble por humanos, que define qué
característica es considerada.

• El valor que describe como las características deben ser manejadas por el motor.
Cada propiedad tiene un conjunto de valores válidos, definido por una gramática
formal, así como un significado semántico, implementados por el motor del
navegador.

---

## DECLARACIONES DE CSS

Configurando propiedades CSS a valores específicos es la función principal del lenguaje
del CSS. Una propiedad y su valor son llamados una declaración, y cualquier motor de CSS
calcula qué declaraciones aplican a cada uno de los elementos de una página para
mostrarlos apropiadamente y estilizarlos.

Ambos propiedades y valores son sensibles a mayúsculas y minúsculas en CSS. El par se
separa por dos puntos, “ : ”, y los espacios en blanco antes, entre ellos y después, pero no
necesariamente dentro de ellos, son ignorados.

Declaración CSS:

```
backgorund-color : red;
```

**propiedad** -> backgorund-color

**:** -> los dos puntos separan las dos entidades

**red** -> valor


Hay más de 100 propiedades diferentes en CSS y cerca de un número infinito de diferentes
valores. No todos los pares de propiedades y valores son permitidos, cada propiedad
define que valores son válidos. Cuando un valor no es válido para una propiedad
específica, la declaración es considerada inválida y es completamente ignorada por el
motor del CSS.

##  BLOQUES DE DECLARACIONES EN CSS

Las declaraciones son agrupada en bloques, que es una estructura delimitada por una llave
de apertura, ‘{‘, y una de cierre, ‘}’. Los bloques en ocasiones puedes anidarse, por lo que las
llaves de apertura y cierre deben de coincidir.

Bloque css:
```
{
  Aquí puede ir cualquier
  contenido, incluso
  ningún contenido.
}
```

Las **llaves delimitan el inicio y el final del bloque**.

Esos bloques son naturalmente llamados **bloques de declaraciones** y las declaraciones
dentro de ellos están separadas por un punto y coma, “ ; ”. Un bloque de declaración puede
estar vacío, que es contener una declaración nula. Los espacios en blanco alrededor de las
declaraciones son ignorados. En cuanto a la última declaración de un bloque, esta no
necesita terminar en un punto y coma, aunque es usualmente considerado una buena
práctica porque previene el olvidar agregarlo cuando se extienda el bloque con otra
declaración.

Bloque css con declaraciones:
```
{
 background-color : red ;
 background-style: none;
}
```

CSS define una serie de términos que permiten describir cada una de las partes que
componen los estilos CSS. El siguiente esquema muestra las partes que forman un estilo
CSS muy básico:

```
h1{
  color: black;	
}
```
Los diferentes términos se definen a continuación:

***Regla***: cada uno de los estilos que componen una hoja de estilos CSS.

En el ejemplo:
```
h1{
  color: black;	
}
```


***Selector***: indica el elemento o elementos HTML a los que se aplica la regla CSS.

En el ejemplo:

```
h1
```

***Declaración***: especifica los estilos que se aplican a los elementos. Está compuesta por una
o más propiedades CSS.

En el ejemplo:
```
  color: black;	
```

***Propiedad***: permite modificar el aspecto de una característica del elemento.

En el ejemplo ->
```
  color:
```

***Valor***: indica el nuevo valor de la característica modificada en el elemento.

En el ejemplo:
```

 black;	

```

---	
					  
					  
## INCLUIR CSS A NUESTRO HTML

CSS sirve para definir el aspecto de las páginas web, eso ya debe haber quedado claro. No
obstante, hay diferentes niveles a los que podemos aplicar los estilos. Vamos a ir por orden,
describiendo los puntos desde el más específico al más general, de manera que también
iremos aumentando la dificultad e importancia de los distintos usos.

## PEQUEÑAS PARTES DE LA PÁGINA

Para definir estilos en secciones reducidas de una página se puede utilizar el
atributo style en la etiqueta sobre la que queremos aplicar estilos. Como valor de ese
atributo indicamos en sintaxis CSS las características de estilos. Lo vemos con un ejemplo,
pondremos un párrafo en el que determinadas palabras las vamos a visualizar en color
verde.
```
<p>My mother has <span style="color: green">blue</span> eyes.</p>
```

## ESTILO DEFINIDO PARA UNA ETIQUETA

De este modo podemos hacer que toda una etiqueta muestre un estilo determinado. Por
ejemplo, podemos definir un párrafo entero en color rojo y otro en color azul. Para ello
utilizamos el atributo style, que es admitido por todas las etiquetas del HTML.

```
<p style="color: #990000">
 Esto es un párrafo de color rojo.
</p>
<p style="color: #000099">
 Esto es un párrafo de color azul.
</p>
```

##  ESTILO DEFINIDO EN UNA PARTE DE LA PÁGINA

Con la etiqueta <div> podemos definir secciones de una página y aplicarle estilos con el
atributo style, es decir, podemos definir estilos de una vez a todo un bloque de la página.
```
<div style="color: #000099; font-weight: bold">
 <h3>Estas etiquetas van en <strong>azul y negrita</strong></h3>
 <p>Seguimos dentro del DIV, luego permanecen los etilos</p>
</div>
```

Hasta aquí hemos visto los usos de las CSS más específicos, que se consiguen usando el
atributo style en las etiquetas. Sin embargo, hay otras formas más avanzadas de usar las
CSS, que deberías tener en cuenta porque son todavía más versátiles y recomendadas

## ESTILO DEFINIDO PARA TODA UNA PÁGINA

Podemos definir, en la cabecera del documento, estilos para que sean aplicados a toda la
página. Es una manera muy cómoda de darle forma al documento y muy potente, ya que
estos estilos serán seguidos en toda la página y nos ahorraremos así "ensuciar" las
etiquetas HTML colocando el atributo style.

Además, es común que los estilos declarados se quieran aplicar a distintas etiquetas
dentro del mismo documento. Gracias a la aplicación de estilos para toda la página,
podemos escribir los estilos una vez y usarlos para un número indefinido de etiquetas. Por
ejemplo podremos definir el estilo a todos los párrafos una vez y que se aplique
igualmente, sea cual sea el número de párrafos del documento. Por último, también
tendremos la ventaja que, si más adelante deseamos cambiar los estilos de todas las
etiquetas, lo haremos de una sola vez, ya que el estilo fue definido una única vez de
manera global.

A grandes rasgos, entre ```<style>``` y ```</style>```, se coloca el nombre de la etiqueta (o selector)
para la que queremos definir los estilos y entre llaves -{ }- colocamos en sintaxis CSS las
características de estilos. El concepto de selectores lo veremos más adelante.

```
<html>
<head>
  <title>Ejemplo de estilos para toda una pagina</title>
  <style>
    h1 { text-decoration: underline; text-align: center }
    p { font-Family: arial,verdana; color: white; background-color: black }
    body { color: black; background-color: #cccccc; text-indent: 1cm }
   </style>
</head>
<body>
  <h1>Pagina con estilos</h1>
  <p>Pagina con estilos de ejemplo</p>
</body>
</html>

```
Como se puede apreciar en el código, hemos definido que la etiqueta <h1> se presentará

• Subrayado

• Centrada

También, por ejemplo, hemos definido que el cuerpo entero de la página (etiqueta <body>)
se le apliquen los estilos siguientes:

• Color del texto negro


• Color del fondo grisáceo
• Margen lateral de 1 centímetro

Cabe destacar que muchos de los estilos aplicados a la etiqueta <body> son heredados
por el resto de las etiquetas del documento, como el color del texto o su tamaño. Esto es
así, siempre y cuando no se vuelvan a definir esos estilos en las etiquetas hijas, en cuyo
caso el estilo de la etiqueta más concreta será el que mande. Puede verse este detalle en
la etiqueta <p>, que tiene definidos estilos que ya fueron definidos para <body>. Los estilos
que se tienen en cuenta son los de la etiqueta <p>, que es más concreta.

---
									       
## ESTILO DEFINIDO PARA TODO UN SITIO WEB
									       
Una de las características más potentes del desarrollo con hojas de estilos es la posibilidad
de definir los estilos de todo un sitio web en una única declaración.
									       
Esto se consigue creando un archivo de extensión .css donde tan sólo colocamos las
declaraciones de estilos de la página y enlazando todas las páginas del sitio con ese
archivo. De este modo, todas las páginas comparten una misma declaración de estilos,
reutilizando el código CSS de una manera mucho más potente.
									       
Este es el modelo más ventajoso de aplicar estilos al documento HTML y por lo tanto el
más recomendable. De hecho, cualquier otro modo de definir estilos no es considerado
una buena práctica y lo tenemos que evitar siempre que se pueda.
									       
Algunas de las ventajas de este modelo de definición de estilos son las siguientes:
									       
• Se ahorra en líneas de código HTML, ya que no tenemos que escribir el CSS en la
propia página (lo que reduce el peso del documento y mejora la velocidad de
descarga).
									       
• Se mantiene separado correctamente lo que es el contenido (HTML) de la
presentación (CSS), que es uno de los objetivos de las hojas de estilo y una de las
máximas de todo desarrollador: cada cosa en su sitio.	

• Se evita la molestia de definir una y otra vez los estilos con el HTML y lo que es más
importante, si cambiamos la declaración de estilos, cambiarán automáticamente
todas las páginas del sitio web. Esto es una característica muy deseable, porque
aumenta considerablemente la facilidad de mantenimiento del sitio web.
									       
 Veamos ahora cómo el proceso para incluir estilos con un fichero externo.
									       
## 1- Creamos el fichero con la declaración de estilos
									       
Es un fichero de texto normal con la extensión .css para aclararnos qué tipo de archivo es.
El texto que debemos incluir debe ser escrito exclusivamente en sintaxis CSS, es decir,
sería erróneo incluir código HTML en él: etiquetas y demás. Podemos ver un ejemplo a
continuación.
									       
El nombre de este archivo va a ser **estilos.css**.		
									       
```
p {
  font-size: 12cm;
  font-family: arial, helvetica;
  font-weight: normal;
}
									       
h1 {
  font-size: 36cm;
  font-family: verdana, arial;
  text-decoration: underline;
  text-align: center;
  background-color: Teal;
}
									       
body {
  background-color: #006600;
  font-family: arial;
  color: White;
}
```

## 2- Enlazamos la página web con la hoja de estilos
									       
Para ello, vamos a colocar la etiqueta <link> dentro de la etiqueta <head></head> con los
atributos siguientes:
									       
• **rel**: indica el tipo de relación que tiene el recurso enlazado y la página HTML. Para
los archivos CSS, siempre se utiliza el valor stylesheet.
									       
• **href**: indica la URL del archivo CSS que contiene los estilos. La URL indicada puede
ser relativa o absoluta y puede apuntar a un recurso interno o externo al sitio web.
Veamos una página web entera que enlaza con la declaración de estilos anterior:								
									       
```
<html>
<head>
  <link rel="stylesheet" href="estilos.css">
  <title>Ejemplo de pagina que lee estilos </title>
</head>
<body>
  <h1>Pagina con estilos</h1>
  <p>Pagina con estilos de ejemplo</p>
</body>
</html>
```	

---
					   
##  SELECTORES CCS
					   
Teniendo en cuenta que ya podemos asignarle estilos a todo un sitio web, mediante un
archivo css que usa selectores para elegir las etiquetas a las que asignarles los estilos,
también tenemos que entender que existen varios tipos de selectores
					   
### Selector Universal
					   
Se utiliza para seleccionar todos los elementos de la página. El siguiente ejemplo elimina el
margen y el relleno de todos los elementos HTML (por ahora no es importante fijarse en la
parte de la declaración de la regla CSS):

```
*{
  margin: 0;
  padding: 0;
}
```
					   
## Selector de Etiqueta
					   
Selecciona todos los elementos de la página cuya etiqueta HTML coincide con el valor del
selector. El siguiente ejemplo selecciona todos los párrafos de la página:					   

```
p{
  text-align: justify;
  font-family: Verdana;
}
```	
		
## Selector Descendente
					   
Selecciona los elementos que se encuentran dentro de otros elementos. Un elemento es
descendiente de otro cuando se encuentra entre las etiquetas de apertura y de cierre del
otro elemento.
					   
El selector del siguiente ejemplo selecciona todos los elementos <span> de la página que
se encuentren dentro de un elemento <p>.

```
p sapn{			   
  color: red;
}					   
```					   
## Selector de Clase
					   
¿Como hago para aplicarle estilos solo al primer párrafo?
					   
Una de las soluciones más sencillas para aplicar estilos a un solo elemento de la página
consiste en utilizar el atributo class de HTML sobre ese elemento para indicar directamente
la regla CSS que se le debe aplicar. 

Ejemplo:
					   
					   
HTML:
```					   
<body>
 <p class="destacado">Parrafo 1</p>
 <p class="error">Parrafo 2</p>
 <p>Parrafo 3</p>
</body>
```
		 
CSS:
```		 
.destacado {
  font-size: 15px;
}
.error {
  color: red;
}
```
En nuestro archivo CSS para especificar una clase, vamos a poner punto(‘.’) y el nombre de
la clase que queremos que coincida que con valor que pongamos en nuestro atributo class
en el html.
		 
Entonces, en el ejemplo podemos ver como el primer párrafo tiene el valor destacado y el
segundo párrafo el valor error para el atributo class y en nuestro archivo CSS, hemos
definido un estilo para esas clases.
		 
El beneficio del atributo class, además de dejarnos asignar estilos a un solo elemento, es
que después podemos reutilizar esa class para asignarle ese estilo a otros párrafos
concretos o a otras etiquetas, solo deberemos ponerle el valor de un estilo que ya existe en
el atributo class.
		 
## Selector de Id
		 
En un documento HTML, los selectores de ID de CSS buscan un elemento basado en el
contenido del atributo id. El atributo ID del elemento seleccionado debe coincidir
exactamente con el valor dado en el selector. Este tipo de selectores sólo seleccionan un
elemento de la página porque el valor del atributo id no se puede repetir en dos elementos
diferentes de una misma página.
		 
Ejemplo:

HTML:
```
<div id="identificador">¡Este div tiene un ID especial!</div>
<div>Este solo es un div regular.</div>		 
```
CSS:
```
#identificador{
 background-color: blue;
}		       
```

En nuestro archivo CSS para especificar un ID, vamos a poner el numeral (‘#’) y el nombre
del ID que queremos que coincida que con valor que pongamos en nuestro atributo ID en
el html.
		       
Como podemos ver el ID, es muy parecido al atributo class pero la diferencia es que el ID
se puede usar para identificar un solo elemento, mientras que una clase se puede usar
para agrupar más de uno.
		       
		       
---
		       
## PRIORIDAD EN APLICACIÓN DE ESTILO
		       
Ahora que entendemos los selectores en CSS, tenemos que entender como prioriza los
estilos CSS.
		       
## Herencia
		       
Los hijos heredan los estilos de sus elementos padres, no es necesario declarar sus estilos
si estos se mantienen igual.
		       
```
body{
  color: yellow;
}
h2{
  color: yellow; //No es necesario
}
```		       

 ## Cascada
		       
Todo estilo sobrescribe a uno anterior.

```
h2{
  color: yellow;
}
h2{
  color: red;
}
```

		     
## Especificidad
		       
Cuando hay conflictos de estilos el navegador aplica sólo el de mayor especificidad.

```
h2{
  color: yellow;
}
h2.subtitle{
  color: green;
}
```
		       
---
		       
		       
