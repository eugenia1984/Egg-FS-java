# Teoría

## FUNDAMENTOS WEB

El éxito de la web se basa en dos factores fundamentales: el **protocolo HTTP** y el **lenguaje
HTM**L. 

El primero permite una implementación sencilla de un sistema de comunicaciones
que permite enviar cualquier archivo de forma fácil, simplificando el funcionamiento del
servidor y posibilitando que servidores poco potentes atiendan cientos o miles de
peticiones y reduzcan de este modo los costes de despliegue. 

El segundo, el lenguaje
HTML, proporciona un mecanismo sencillo y muy eficiente de creación de páginas
enlazadas.

## EL PROTOCOLO HTTP

El protocolo **HTTP** (*Hypertext Transfer Protocol*) es el protocolo principal de la World Wide
Web. Es un protocolo simple, orientado a conexión y sin estado. Está orientado a conexión
porque emplea para su funcionamiento un 9protocolo de comunicaciones9 (*TCP*, o Transport
Control Protocol) de modo conectado, que establece un canal de comunicaciones entre el
cliente y el servidor, por el cual pasan los bytes que constituyen los datos de la transferencia,
en contraposición a los protocolos denominados de datagrama (o no orientados a conexión)
que dividen la serie de datos en pequeños paquetes (o datagramas) antes de enviarlos,
pudiendo llegar por diversas vías del servidor al cliente.

Explicado de manera más simple, cuando escribes una dirección web en tu navegador y se
abre la página que deseas, es porque tu navegador se ha comunicado con el servidor web
por HTTP. Dicho de otra manera, *el protocolo HTTP es el código o lenguaje en el que el
navegador le comunica al servidor qué página quiere visualizar*.

### HTTPS

Existe una variante de HTTP denominada **HTTPS** (S significa "secure", o "seguro") que utiliza
el *protocolo de seguridad SSL* (o "Secure Socket Layer") para cifrar y autenticar el tráfico de
datos, muy utilizada por los servidores web oientados al comercio electrónico o por aquellos
que albergan información de tipo personal o confidencial.

¿CÓMO FUNCIONA HTTP?

De forma esquemática, el funcionamiento de HTTP es como sigue: el cliente establece una
conexión TCP con el servidor, hacia el puerto por defecto para el protocolo HTTP (o el
indicado expresamente en la conexión), envía una orden HTTP de solicitud de un recurso
(añadiendo algunas cabeceras con información) y, utilizando la misma conexión, el servidor
responde enviando los datos solicitados y, además, añadiendo algunas cabeceras con
información.

La manera más fácil de explicar cómo funciona HTTP es describiendo cómo se abre una
página web:

1. En la barra de direcciones del navegador, el usuario teclea example.com.

2. El navegador envía esa solicitud, es decir, la petición HTTP, al servidor web que
administre el dominio example.com. Normalmente, la solicitud del cliente dice algo
así como “Envíame este archivo”, pero también puede ser simplemente “¿Tienes este
archivo?”.

3. El servidor web recibe la solicitud HTTP, busca el archivo en cuestión (en nuestro
ejemplo, la página de inicio de example.com, que corresponde al archivo index.html)
y el servidor envía una respuesta. En primer lugar envía una cabecera o header. Esta
cabecera le comunica al cliente, mediante un código de estado, el resultado de la
búsqueda.

4. Si se ha encontrado el archivo solicitado y el cliente ha solicitado recibirlo (y no solo
saber si existe), el servidor envía, tras el header, el message body o cuerpo del
mensaje, es decir, el contenido solicitado: en nuestro ejemplo, el archivo index.html.

5. El navegador recibe el archivo y lo abre en forma de página web.

## MENSAJES HTTP

Como vimos el servidor recibe un mensaje que es la petición HTTP del usuario y después
envía una respuesta HTTP al cliente/navegador, en base a la petición.
Existen dos tipos de mensajes HTTP: peticiones y respuestas, cada uno sigue su propio
formato.

**Peticiones**

Una petición de HTTP se ve de la siguiente manera:

```
GET / HTTP / 1.1
```

GET -> método

GET/ -> la direccion del recurso

HTTP/1.1 -> version del protocolo

Host:developer.mozilla.org   -> cabecera <br>
Accept-Language: fr


Una petición de HTTP, está formado por los siguientes campos:

• Un método HTTP, normalmente pueden ser un verbo, como: GET, POST o un nombre
como: OPTIONS (en-US) o HEAD (en-US), que defina la operación que el cliente
quiera realizar. El objetivo de un cliente, suele ser una petición de recursos, usando
GET, o presentar un valor de un formulario HTML, usando POST, aunque en otras
ocasiones puede hacer otros tipos de peticiones.

• La dirección del recurso pedido; la URL del recurso, sin los elementos obvios por el
contexto, como pueden ser: sin el protocolo (http://), el dominio

(aquí developer.mozilla.org), o el puerto TCP (aquí el 80).
• La versión del protocolo HTTP.

• Cabeceras HTTP, opcionales, que pueden aportar información adicional a los
servidores.

**Respuestas**

Un ejemplo de repuesta:

```
HTTP/1.1 200 OK
```

HTTP/1.1 -> version del protocolo

200 -> codigo de respuesta

OK -> mensaje de estado

Las respuestas están formadas por los siguientes campos:

• La versión del protocolo HTTP que están usando.

• Un código de respuesta, indicando si la petición ha sido exitosa, o no, y debido a
qué.

• Un mensaje de estado, una breve descripción del código de estado.

• Cabeceras HTTP, como las de las peticiones.

---

## MÉTODOS DE PETICIÓN

En la web, los clientes, como un navegador, por ejemplo, se comunican con los distintos
servidores web con ayuda del protocolo HTTP, el cual regula cómo ha de formular sus
peticiones el cliente y cómo ha de responder el servidor. El protocolo HTTP emplea varios
métodos de petición diferentes.

**GET**

GET es la madre de todas las peticiones de HTTP. Este método de petición existía ya en los
inicios de la world wide web y se utiliza *para solicitar un recurso*, como un archivo HTML,* del
servidor web*. Esto podría ser cuando un usuario clickea un link para ir a una pagina concreta.

Cuando escribes la dirección URL www.ejemplo.com/test.html en tu navegador, este se
conecta con el servidor web y le envía una petición GET:


*GET /test.html*

El servidor enviaría el archivo test.html como respuesta.

**PARTES DE UNA URL**

A la petición GET puede añadirse más información, con la intención de que el servidor web
también la procese. Estos llamados parámetros de URL se adjuntan a la dirección URL, la
URL puede estar compuesta de varias partes, y las vamos a ver a continuación:

**Ruta (Path)**

Es lo que viene después de la barra /.

Normalmente indica páginas y subpáginas que podemos encontrar en un sitio web.

www.ejemplo.com/otraPagina.html

**Parámetro (Query String)**

Es lo que viene después del signo de interrogación ?. Todos los parámetros se componen
de un nombre y un valor: “Nombre=Valor”.

En una URL puede haber varios parámetros. Y cuando es el caso, éstos se separan con el
símbolo de ampersand &.


Los parámetros pueden indicar diferentes cosas. A veces tienen que ver con una búsqueda
en el sitio, a veces son parámetros de campañas publicitarias, etc.
Veámoslo con este ejemplo: para buscar ciertas ofertas en la página web de una empresa
de software, en la petición GET se indicará “Windows” como plataforma y “Office” como
categoría:

GET /search?platform=Windows&category=office

**Etiqueta**

Las etiquetas en una URL aparecen después del hashtag #.

Su función, entre otras cosas, consiste en permitir hacer scroll hasta un elemento en
concreto. Por ejemplo, si mandamos a alguien una URL que contenga una etiqueta, ésta le
dirigirá a la parte exacta de la página en cuestión. 

Veamos una URL completa:

```
https://www.ejemplo.com/pagina/subpagina?parametro1=ABDC&parametro2=DEFG#etiqueta
```

https:// -> protocolo

www.ejemplo.com/ -> subdominio

pagina/subpagina -> ruta

?parametro1=ABDC&parametro2=DEFG#etiqueta -> parametros (querystring)


---
