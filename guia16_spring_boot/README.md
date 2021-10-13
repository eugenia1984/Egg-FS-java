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


## POST

Cuando se tienen que enviar al servidor web paquetes grandes de datos, como imágenes o
datos de formulario de carácter privado por ejemplo. El método GET se queda corto, porque
todos los datos que se transmiten se escriben abiertos en la barra de direcciones del
navegador.

En estos casos, se recurre al método POST. Este método no escribe el parámetro del URL
en la dirección URL, sino que lo adjunta al encabezado HTTP.
Las peticiones POST suelen emplearse con formularios digitales. Abajo encontrarás el
ejemplo de un formulario que recoge un nombre y una dirección de correo electrónico y lo
envía al servidor por medio de POST:

```
<html>
<body>
   <form action="/prueba " method="post">
   Name: <input type="text" name="name"><br>
   E-mail: <input type="text" name="email"><br>
   <button type="submit">
   </form>
</body>
</html>
```


## ¿CUÁNDO USAR UNO U OTRO?

El método POST es aconsejable cuando el usuario debe enviar datos o archivos al servidor,
como, por ejemplo, cuando se rellenan formularios o se suben fotos.
El método GET es adecuado para la personalización de páginas web: el usuario puede
guardar búsquedas, configuraciones de filtros y ordenaciones de listas junto al URL como
marcadores, de manera que en su próxima visita la página web se mostrará según sus
preferencias.

A modo de resumen:

GET – Utilizado para obtener un recurso del servidor, identificado por una url. Para la
configuración de páginas web (filtros, ordenación, búsquedas, links, etc.).

POST – Utilizado para la transferencia de información y datos al servidor. Puede utilizarse
para enviar parámetros y su longitud es ilimitada


---

## CÓDIGOS DE RESPUESTA

Al iniciar el navegador (llamado cliente en este caso) se realiza una petición al servidor web,
quien responde, a su vez, con un código de estado HTTP en forma de cadena de tres dígitos.


Con este mensaje, el servidor web le indica al navegador si su solicitud ha sido procesada
correctamente, si ha ocurrido un error o si se necesita una autenticación. Como
consecuencia, el código de estado HTTP se convierte en una parte esencial en la
transmisión de mensajes de respuesta por parte del servidor web, que es insertado
automáticamente en su encabezado. Por lo general, los usuarios se encuentran con páginas
en formato HTML en vez de códigos de estado HTTP, cuando el servidor web no puede o no
tiene permitido procesar la solicitud del cliente o no es posible realizar la transmisión de
datos.

TIPOS DE RESPUESTA DE LOS CÓDIGOS DE ESTADO HTTP

En principio, los códigos de estado HTTP se dividen en cinco categorías diferentes,
identificadas a su vez, por el primer dígito del código. Por ejemplo, el código de estado HTTP
200 forma parte del tipo de respuesta 2xx, el código 404 del tipo de respuesta 4xx. Esta
clasificación se deriva principalmente de la importancia y la función de los códigos de
estado, divididos principalmente en 5 tipos:

**Códigos de estado 1xx – Información**: Cuando se envía un código de estado HTTP 1xx, el
servidor le notifica al cliente que la petición actual aún continúa. Esta clase reúne y
proporciona información sobre el procesamiento y envío de una solicitud.

**Códigos de estado 2xx – Éxito**: Los códigos que comienzan con un 2 informan sobre una
operación exitosa. Cuando se reciben este tipo de respuestas quiere decir que la solicitud
del cliente fue recibida, comprendida y aceptada. Por lo general, el usuario solo percibe la
web solicitada.

**Códigos de estado 3xx – Redirecciones:**: Aquellos códigos que comienzan con 3 indican
que la solicitud ha sido recibida por el servidor. Sin embargo, para asegurar un
procesamiento exitoso es necesario que el cliente tome una acción adicional. Este tipo de
códigos aparecen principalmente cuando hay redirecciones.

**Códigos de estado 4xx – Errores del cliente**: Cuando aparece un código 4xx quiere decir
que se ha presentado un error de cliente. Esto quiere decir que el servidor ha recibido la
solicitud, pero esta no se puede llevar a cabo. Una de las principales causas de este tipo de
respuestas son las solicitudes defectuosas. Los usuarios de Internet son informados de este
error por medio de una página HTML generada automáticamente.

**Códigos de estado 5xx –Errores del servidor**: El servidor indica un error propio cuando usa
un código 5xx. Este tipo de respuestas indican que la solicitud correspondiente está
temporalmente deshabilitada o es imposible de llevar a cabo. De nuevo, se generará
automáticamente una página en formato HTML.

---

## CÓDIGOS DE ESTADO HTTP MÁS IMPORTANTES

Los únicos códigos visibles para los visitantes son principalmente los códigos de error del
cliente, como el 404 (Not Found), o de error del servidor como el 503 (Service Unavailable),
ya que estos siempre se muestran automáticamente como páginas en formato HTML.


Pero ahora que vamos a trabajar sobre la creación de estas paginas web, va a ver códigos
que nos van a informar de cosas a arreglar dentro de nuestro programa.

A continuación, presentamos una pequeña selección de los códigos de respuesta más
comunes:

200 – OK, petición procesada correctamente.

301 – Indica al browser que visite otra dirección.

403 – Acceso prohibido, por falta de permisos.

404 – No encontrado, cuando el documento no existe.

---

## MAVEN

Maven es una herramienta de software para la gestión y construcción de proyectos Java.
Utiliza un Project Object Model (POM) para describir el proyecto de software a construir, sus
dependencias de otros módulos y componentes externos, y el orden de construcción de los
elementos. El modelo de configuración es simple y está basado en un formato XML
(pom.xml). Además, Maven tiene objetivos predefinidos para realizar ciertas tareas
claramente definidas, como la compilación del código y su empaquetado. La siguiente
figura ilustra los pasos que lleva a cabo esta herramienta desde la importación de librerías
hasta la generación de la aplicación Java.

## DEPENDENCIAS

Uno de los puntos fuertes de Maven son las dependencias. En nuestro proyecto podemos
decirle a Maven que necesitamos un jar (por ejemplo, log4j o el conector de MySQL) y maven
es capaz de ir a internet, buscar esos jar y bajárselos automáticamente. Es más, si alguno de
esos jar necesitara otros jar para funcionar, maven "tira del hilo" y va bajándose todos los jar
que sean necesarios. Vamos a ver todo esto con un poco de detalle. Las dependencias se
recopilan en el archivo pom.xml, dentro de una etiqueta ```<dependencies>```.

Cuando ejecuta una compilación o ejecutamos un proyecto Maven, estas dependencias se
resuelven y luego se cargan desde el repositorio local. Si no están presentes allí, Maven los
descargará de un repositorio remoto y los almacenará en el repositorio local. También se le
permite instalar manualmente las dependencias.

---

## SPRING FRAMEWORK

Spring es un framework alternativo al stack de tecnologías estándar en aplicaciones JavaEE.
Spring popularizó ideas como la inyección de dependencias o el uso de objetos
convencionales (POJOs) como objetos de negocio.

Spring es el framework más popular para el desarrollo de aplicaciones empresariales en
Java, para crear código de alto rendimiento, liviano y reutilizable. Su finalidad es
estandarizar, agilizar, manejar y resolver los problemas que puedan ir surgiendo en el
trayecto de la programación.

##  ¿QUÉ ES UN FRAMEWORK?

Un framework es un entorno de trabajo que tiene como objetivo facilitar la labor de
programación ofreciendo una serie de características y funciones que aceleran el proceso,
reducen los errores, favorecen el trabajo colaborativo y consiguen obtener un producto de
mayor calidad.

Los framework ofrecen una estructura para el desarrollo y no tienen que estar sujetos a un
único lenguaje de programación, aunque es habitual encontrar en el mercado, distintos
frameworks específicos para un lenguaje concreto.


##  SPRING FUNCIONALIDADES

Spring, ofrece como elemento clave la inyección de dependencias a nuestro proyecto pero
existen otras funcionalidades también muy útiles:

• Core container: proporciona inyección de dependencias e inversión de control.

• Web: nos permite crear controladores Web, tanto de vistas MVC como aplicaciones
REST. Esto facilita en gran medida la programación basada en MVC (Modelo Vista
Controlador)

• Acceso a datos: abstracciones sobre JDBC, ORMs como Hibernate, sistemas OXM
(Object XML Mappers), JSM y transacciones.

• Instrumentación: proporciona soporte para la instrumentación de clases.

• Pruebas de código: contiene un framework de testing, con soporte para JUnit y
TestNG y todo lo necesario para probar los mecanismos de Spring.

---

## SPRING MVC

Antes de pasar a ver la inyección de dependencias, veremos otra funcionalidad, que es el
Spring MVC.

Spring Web MVC es un sub-proyecto Spring que está dirigido a facilitar y optimizar el
proceso creación de aplicaciones web utilizando el patrón Modelo Vista Controlador.


## ¿QUE ES EL PATRÓN DE DISEÑO MVC?

MVC es un patrón de diseño que se estructura mediante tres componentes: modelo, vista y
controlador. Este patrón tiene como principio que cada uno de los componentes esté
separado en diferentes objetos, esto significa que los componentes no se pueden combinar
dentro de una misma clase. Sirve para clasificar la información, la lógica del sistema y la
interfaz que se le presenta al usuario.

**Modelo**: Esta capa representa todo lo que tiene que ver con el acceso a datos: guardar,
actualizar, obtener datos, además todo el código de la lógica del negocio, básicamente son
las clases Java y parte de la lógica de negocio. No contiene ninguna lógica que describa
como presentar los datos a un usuario.

**Vista**: este componente presenta los datos del modelo al usuario. La vista sabe cómo
acceder a los datos del modelo, pero no sabe que significa esta información o que puede
hacer el usuario para manipularla.

**Controlador**: este componente se encarga de gestionar las instrucciones que se reciben,
atenderlas y procesarlas. El controlador es el encargado de conectar el modelo con las
vistas, funciona como un puente entre la vista y el modelo, el controlador recibe eventos
generados por el usuario desde las vistas y se encarga de direccionar al modelo la petición,
recibir los resultados y entregarlos a la vista para que pueda mostrarlos.

---

## PROCESAMIENTO DE UNA PETICIÓN EN SPRING MVC

Spring MVC se basa en este patron de diseño para el manejo de las peticiones http y sus
respuestas.

A continuación, se describe el flujo de procesamiento típico para una petición HTTP en
Spring MVC. Spring es una implementación del patrón de diseño "front controller”.

● Todas las peticiones HTTP se canalizan a través del front controller. En casi todos los
frameworks MVC que siguen este patrón, el front controller no es más que un servlet
cuya implementación es propia del framework. En el caso de Spring, la clase
DispatcherServlet.

● El front controller averigua, normalmente a partir de la URL, a qué Controller hay
que llamar para servir la petición. Para esto se usa un HandlerMapping.

● Se llama al Controller, que ejecuta la lógica de negocio, obtiene los resultados y los
devuelve al servlet, encapsulados en un objeto del tipo Model. Además, se devolverá el
nombre lógico de la vista a mostrar (normalmente devolviendo un String, como en
JSF).

● Un ViewResolver se encarga de averiguar el nombre físico de la vista que se
corresponde con el nombre lógico del paso anterior.

● Finalmente, el front controller (el DispatcherServlet) redirige la petición hacia la
vista, que muestra los resultados de la operación realizada.

## INYECCIÓN DE DEPENDENCIAS

La inyección de dependencias es quizás la característica más destacable del core de Spring
Framework, que consiste que en lugar de que cada clase tenga que instanciar los objetos
que necesite, sea Spring el que inyecte esos objetos, lo que quiere decir que es Spring el
que creara los objetos y cuando una clase necesite usarlos se le pasaran (como cuando le
pasas un parámetro a un método).

La DI (Dependency Injector o Inyector de Dependencias) consiste en que en lugar de que
sean las clases las encargadas de crear (instanciar) los objetos que van a usar (sus atributos),
los objetos se inyectaran mediante los métodos setters o mediante el constructor en el
momento en el que se cree la clase y cuando se quiera usar la clase en cuestión ya estará
lista, en cambio sin usar DI la clase necesita crear los objetos que necesita cada vez que se
use.

En Spring hay un Contendor DI que es el encargado de inyectar a cada objeto los objetos
que necesita (de los que depende) según se le indique ya sea en un archivo de
configuración XML o mediante anotaciones.

Spring a estas clases que van a ser inyectadas por el contenedor, las llama Spring Beans.

##  ¿QUE ES UN BEAN?

Un Bean es una clase de Java que debe cumplir los siguientes requisitos:

• Tener todos sus atributos privados (private).

• Tener métodos set() y get() públicos de los atributos privados que nos interese.

• Tener un constructor público por defecto.

A diferencia de los Bean convencionales que representan una clase, la particularidad de los
Beans de Spring es que son objetos creados y manejados por el contenedor Spring.



## CONTENEDOR SPRING

En Spring hay un Contendor DI que es el encargado de inyectar a cada objeto los objetos
que necesita (de los que depende) según se le indique ya sea en un archivo de
configuración XML o mediante anotaciones. En el caso de Spring ese objeto es el
contenedor IoC el cual es provisto por los módulos spring-core y spring-beans.

Spring se basa en el principio de Inversión de Control (IoC) o Patrón Hollywood («No nos
llames, nosotros le llamaremos») consiste en:

• Un Contenedor que maneja objetos por vos, este contenedor es un archivo XML. Este
archivo se llama application-context.xml.

• El contenedor generalmente controla la creación de estos objetos. Por decirlo de
alguna manera, el contenedor hace los “new” de las clases java para que no los
realices vos.

• El contenedor resuelve dependencias entre los objetos que contiene.

Un ejemplo típico para ver su utilidad es el de una clase que necesita una conexión a base
de datos, sin DI si varios usuarios necesitan usar esta clase se tendrán que crear múltiples
conexiones a la base de datos con la consiguiente posible perdida de rendimiento, pero
usando la inyección de dependencia, las dependencias de la clase (sus atributos), son
instanciados una única vez cuando se despliega la aplicación y se comparten por todas las
instancias de modo que una única conexión a base de datos es compartida por múltiples
peticiones.

## TIPOS DE INYECCIÓN DE DEPENDENCIAS

Las variantes de DI soportadas por el contenedor IoC de Spring son constructor, setter y con
el uso de anotaciones que nos evitaría tener que escribir nada en el xml.

1. Constructor

En este caso el contenedor se encarga de invocar el constructor de la clase pasando los
argumentos como dependencias. Es la recomendada para la mayoría de los casos, podes
leer más detalles en la documentación de Spring.

El siguiente ejemplo muestra una clase que solo puede inyectarse en dependencia con
inyección de constructor:

```
public class ListadorPeliculasServicio {
// la clase ListadorPeliculasServicio tiene una dependencia de
BuscadorPeliculaServicio
private final BuscadorPeliculaServico buscadorPeliculaServicio;
// Un constructor para que el contenedor de Spring pueda inyectar
BuscadorPelicula
public ListadorPeliculasServicio(BuscadorPeliculaServico
buscadorPeliculaServicio) {
this.buscadorPeliculaServicio = buscadorPeliculaServicio;
}
// la lógica de negocio que usa el buscadorPeliculaServicio se omite...
}
```

De esta manera la clase ListadorPeliculasServicio, puede usar todos los atributos y métodos
de la clase BuscadorPeliculaServicio, sin la necesidad de usar el new para instanciar la clase
cada vez que queramos usar sus métodos o sus atributos en un método de
ListadorPeliculasServicio.

## 2. Setter

Aquí el contenedor asigna las dependencias usando los métodos setter de los atributos.
Recomendada para dependencias opcionales.

```
// En vez de tener un constructor para que el contenedor de Spring pueda inyectar
BuscadorPelicula, tendríamos un método Setter
public setBuscadorPelicuaServicio(BuscadorPeliculaServico
buscadorPeliculaServicio) {
this.buscadorPeliculaServicio = buscadorPeliculaServicio;
}
```

## ANOTACIONES

De las dos formas anteriores era necesario indicar en el archivo de configuración que beans
podían ser inyectados en otros y sobre los que se querían inyectar.

Ahora, cuando una clase está anotada con uno de las siguientes anotaciones, Spring
las registrará automáticamente en el application-context. Esto hace que la clase esté
disponible para la inyección de dependencias en otras clases y esto se vuelve vital
para construir nuestras aplicaciones. Estas anotaciones se las conoce como Spring
Stereotypes y se pueden encontrar en el paquete org.springframework.stereotype.

Spring Stereotypes

**@Component**: Es el estereotipo general y permite anotar un bean para que Spring lo
considere uno de sus objetos. Un bean es un componente hecho en software que se
puede reutilizar y que puede ser manipulado visualmente por una herramienta de
programación en lenguaje Java. Sustituye la declaración del bean en el xml.

**@Repository**: Es el estereotipo que se encarga de dar de alta un bean para que implemente
el patrón repositorio. Esta anotación se utiliza en clases Java que acceden directamente a
la base de datos. Los repositorios tendrán los métodos para ingresar, editar, eliminar, etc
objetos en la base de datos, también, tendrá consultas a la base de datos. La anotación
@Repository funciona como un marcador para cualquier clase que cumpla la función de
repositorio u Objeto de acceso a datos.
```
@Repository
public class Repositorio{}
```

**@Service**: Este estereotipo se encarga de gestionar las operaciones de negocio más
importantes a nivel de la aplicación. Usualmente operaciones CRUD, trabajará con los
repositorios para enviar los resultados de las operaciones de negocio a la base de datos y
persistir los objetos.
```
@Service
public class Servicio{}
```

**@Controller**: El último de los estereotipos que es el que realiza las tareas de controlador y
gestión de la comunicación entre el usuario y la aplicación. Para ello se apoya habitualmente
en algún motor de plantillas o librería de etiquetas


**@Autowired** Esta anotación le indica a Spring dónde debe ocurrir una inyección. Si se lo
coloca en un método, por ejemplo: setMovie, entiende (por el prefijo que establece la
anotación @Autowired) que se necesita inyectar un bean. Spring busca un bean de tipo
Movie y, si lo encuentra, lo inyecta a este método. Sustituye la declaración de los atributos
del bean en el xml. @Autowired se emplea para generar la inyección de dependencia de un
tipo de Objeto que pertenece a una clase con la @Component(@Controller, @Service,
@Repository)
```
@Autowired
private final PeliculaServicio peliculaServicio;
```

**@Qualifier(«nombreBean»)**: es una de las anotaciones más prácticas de Spring cuando se
quiere añadir versatilidad a como se realiza un @Autowired en los componentes. Sirve para
indicar que clase es la que se debe inyectar. Con esta anotación podemos indicar el id del
bean que se quiere inyectar, esta anotación se usa cuando el atributo que vamos a inyectar
es una interfaz de la que hay varias implementaciones y entonces será mediante esta
anotación con la que le diremos cual es la clase que queremos inyectar.

---

## SPRING MVC ANOTACIONES

También existen otras anotaciones que nos ayudarán con el manejo del patrón de diseño
Spring MVC. Nos darán facilidades para la comunicación entre las vistas, el controlador y los
modelos.

@Controller: esta anotación se repite en este apartado, ya que nos da la posibilidad de
marcar a una clase como un controlador. Esta anotación se utiliza para crear una clase como
controlador web, que puede manejar las solicitudes del cliente y enviar una respuesta al
cliente.

@RequestMapping: La clase Controller contiene varios métodos para manejar diferentes
peticiones HTTP, pero ¿cómo asigna Spring una petición en particular a un método del
controlador en particular? Bueno, eso se hace con la ayuda de la anotación

@RequestMapping. Es una anotación que se especifica sobre un método del controlador.
Proporciona el mapeo entre la ruta de la petición y el método del controlador. También
admite alguna opción avanzada que se puede usar para especificar métodos de controlador
separados para diferentes tipos de petición en el mismo URI como puede especificar un
método para manejar una petición GET y otro para manejar la petición POST.

```
@Controller
public class Controlador{
   @RequestMapping("/")
   public String hola(){
   return "Hola Spring MVC";
  }
}
```

En este ejemplo, la página de inicio se asignará a este método de controlador. Entonces,
cualquier petición sobre la ruta localhost:8080“/”, irá a este método que devolverá "Hola
Spring MVC".

@GetMapping: esta anotación se utiliza para asignar solicitudes HTTP GET a métodos de
controlador específicos. @GetMapping es una anotación compuesta que actúa como un
acceso directo para @RequestMapping (method = RequestMethod.GET).
```
@Controller
public class Controlador{
  @GetMapping("/")
  public String hola(){
  return "Hola Spring MVC";
 }
}
```

@PostMapping: esta anotación se utiliza para asignar solicitudes HTTP POST a métodos de
controlador específicos. @PostMapping es una anotación compuesta que actúa como un
acceso directo para @RequestMapping (method = RequestMethod.POST).
```
@Controller
public class Controlador{
@PostMapping("/guardar")
public String guardarUsuario(){
return "Usuario Guardado ";
}
}
```


@RequestParam: esta es otra anotación Spring MVC útil que se usa para vincular los
parámetros de una petición HTTP a los argumentos de un método controlador. Por ejemplo,
si envía parámetros de un formulario junto con URL para guardar un usuario, el método
puede obtenerlos como argumentos propios.

```
@GetMapping(“/libro”){
  public void mostrarDetalleLibro(@RequestParam("ISBN") String ISBN){
  System.out.println(ISBN);
 }
}
```

Si accedes a tu aplicación web que proporciona detalles del libro con un parámetro de
consulta(query string) como el siguiente:

http://localhost:8080/libro?ISBN=900848893

Entonces se llamará al método del controlador porque está vinculado a la URL "/libro" y el
parámetro de consulta ISBN se usará para completar el argumento del método con el
mismo nombre "ISBN" dentro del método mostrarDetalleLibro().

De esa manera podemos obtener en nuestro controlador un dato que viaja a través de una
URL, que va a venir de una petición HTTP.

@PathVariable: esta es otra anotación que se utiliza para recuperar datos de la URL. A
diferencia de la anotación @RequestParam que se usa para extraer parámetros de consulta,
esta anotación permite al controlador manejar una petición HTTP con URLs parametrizadas,
estas serían URLs que tiene parámetros como parte de su ruta, por ejemplo:

http://localhost:8080/libro/900848893

Entonces para poder acceder a este detalle que se encuentra en la ruta de la URL, usaríamos
la anotación @PathVariable de la siguiente manera:
```
@GetMapping(“/libro{ISBN}”){
  public void mostrarDetalleLibro(@PathVariable("ISBN") String ISBN){
  System.out.println(ISBN);
 }
}
```


La variable Path o variable de ruta se representa entre llaves como {ISBN} en nuestra ruta de
petición, lo que significa que la parte después de /libro se extrae y se completa en el ISBN
del argumento del método, que está anotado con @PathVaraible.

---

# SPRING BOOT

Spring Boot es una de las tecnologías dentro del mundo de Spring de las que más se está
hablando últimamente. ¿Qué es y cómo funciona Spring Boot? . Para entender el concepto
primero debemos reflexionar sobre cómo construimos aplicaciones con Spring Framework

Fundamentalmente existen tres pasos a realizar. El primero es crear un proyecto
Maven/Gradle y descargar las dependencias necesarias. En segundo lugar desarrollamos
la aplicación y en tercer lugar la desplegamos en un servidor. Si nos ponemos a pensar un
poco a detalle en el tema, únicamente el paso dos es una tarea de desarrollo. Los otros
pasos están más orientados a infraestructura. No deberíamos tener que estar eligiendo
continuamente las dependencias y el servidor de despliegue.

## SPRING INITIALIZER

SpringBoot nace con la intención de simplificar los pasos 1 y 3 y que nos podamos centrar
en el desarrollo de nuestra aplicación. ¿Cómo funciona?. El enfoque es sencillo y lo
entenderemos realizando un ejemplo. Para ello nos vamos a conectarnos al asistente de
Boot que se denomina Spring Initializer.



---

## THYMELEAF

Thymeleaf es un motor de plantillas, es decir, es una tecnología que nos va a permitir definir
una plantilla y, conjuntamente con un modelo de datos, obtener un nuevo documento, sobre
todo en entornos web. Para saber más sobre Thymelaf, recomendamos meterse en su
documentación: Thymelaf

## ¿QUE ES EXACTAMENTE UN MOTOR DE PLANTILLAS?

El motor de plantillas (utilizado específicamente aquí para el desarrollo web) se genera para
separar la interfaz de usuario(Vistas), de los datos comerciales(Modelos), puede generar
documentos en un formato específico y el motor de plantillas para el sitio web generará un
estándar Documento HTML.

Las plantillas, o más exactamente los motores de plantillas (templates engines) leen un
fichero de texto, que contiene la presentación ya preparada en HTML, e inserta en él la
información dinámica que le ordena el Controlador, la parte que une la vista con la
información.

Veamos un ejemplo para ver las posibilidades de las plantillas, que no acaban, ni mucho
menos, en la web. La sintaxis a utilizar depende del motor de plantillas utilizado, pero todos
son muy similares. Los motores de plantillas suelen tener un pequeño lenguaje de script que
permite generar código dinámico, como listas o cierto comportamiento condicional, pero
esto también depende del lenguaje.

Este lenguaje de script es absolutamente mínimo, lo justo para posibilitar ese
comportamiento dinámico:

```
<html>
<body>
Hola ${nombre}
<body>
</html>
 ``` 
Esta claro que este ejemplo, que es una pequeña variación del famoso "Hola Mundo", es
bastante simple. Lo que está sucediendo, al procesar este fichero, el motor de plantillas lo
recorrerá, analizará y sustituirá esa “etiqueta clave” ${nombre} por el texto que le hallamos
indicado, el nombre del visitante, por ejemplo, de forma que tengamos una presentación
personalizada.
  
Básicamente, el motor de plantillas se encarga de recibir, una variable de tipo String llamada
nombre, que se la va a enviar el controlador a la vista y la hará parte del HTML, haciéndolo
dinámico. Por lo que los diferentes usuarios verán diferentes resultados.

## VENTAJAS THYMELEAF

Permite realizar tareas que se conocen como natural templating. Es decir, como está basada
en añadir atributos y etiquetas, sobre todo HTML, va a permitir que nuestras plantillas se
puedan renderizar en local, y esa misma plantilla después utilizarla también para que sea
procesada dentro del motor de plantillas. Por lo cual las tareas de diseño y programación se
pueden llevar conjuntamente.

## TIPOS DE EXPRESIONES

Permite trabajar con varios tipos de expresiones:

Expresiones variables: Son quizás las más utilizadas, como por ejemplo ${…}
Expresiones de selección: Son expresiones que nos permiten reducir la longitud de la
expresión si prefijamos un objeto mediante una expresión variable, como por ejemplo *{…}
Expresiones de enlace: Nos permiten crear URL que pueden tener parámetros o variables,
como por ejemplo @{…}

---

# PREGUNTAS DE APRENDIZAJE

## 1) ¿Qué significa el acrónimo HTTP?

a) HypertText Translation Protocol

b) HyperText Transport Protocol

c) HyperText Transfer Protocol

d) Ninguna de las anteriores


## 2) ¿Cual de estos SI es un método de petición?

a) REMOVE

b) UPDATE

c) REFRESH

d) GET


## 3) ¿En una URL, después del signo de interrogación van los?

a) Parámetros

b) Etiquetas

c) Rutas

d) Ninguna de las anteriores


## 4) Usualmente usamos el método POST en, ¿qué etiqueta HTML?

a) <ul>
  
b) <form>
  
c) <table>
  
d) <input>
  
  
## 5) ¿Qué indica el código HTTP 200?
  
a) OK, petición procesada correctamente.
  
b) Indica al browser que visite otra dirección.
  
c) Acceso prohibido, por falta de permisos.
  
d) No encontrado, cuando el documento no existe.
  

## 6) ¿Qué indica el código HTTP 500?
  
a) Indica al browser que visite otra dirección.
  
b) Acceso prohibido, por falta de permisos.
  
c) No encontrado, cuando el documento no existe.
  
d) Error interno en el servidor.

##    7) Maven:
  
a) Es una herramienta para formatear código
  
b) Es una herramienta para automatizar tareas
  
c) Es un IDE para construir aplicaciones web
  
d) Ninguna de las anteriores
  
  
## 8) ¿Cuál es el nombre del archivo donde de encuentran las dependencias de Maven?
  
a) Application-context.xml
  
b) Dependencies-xml
  
c) Maven.xml
  
d) Pom.xml
  
  
## 9) Spring Framework es:
  
a) Un framework para el desarrollo de aplicaciones PHP
  
b) Un framework para el desarrollo de aplicaciones .net
  
c) Un framework para el desarrollo de aplicaciones Java
  
d) Todas las anteriores
  
  
## 10) ¿Spring Framework utiliza qué patrón de diseño?
  
a) Patrón DAO
  
b) Patrón DTO
  
c) Patrón MVC
  
d) Patrón EVC
  
## 11) ¿Qué significa el acrónimo MVC?
  
a) Modelo Vistas Controlar
  
b) Modelo Vistas Controlador
  
c) Mostrar Vistas Controlador
  
d) Modelo Ver Controlador
  
## 12) ¿Cuál de estas NO es una anotación de Spring?
  
a) @Component
  
b) @Repository
  
c) @Table
  
d) @Autowired
  
## 13) ¿Qué anotación usamos para marcar una clase como Controlador?
  
a) @Service
  
b) @Controller
  
c) @Repository
  
d) @Component  
  
## 14) ¿Qué anotación usamos para marcar una clase como Servicio?
  
a) @Service
  
b) @Controller
  
c) @Repository
  
d) @Component
  
  
##  15) ¿Qué anotación usamos para marcar una clase como Repositorio?
  
a) @Service
  
b) @Controller
  
c) @Repository
  
d) @Component
  
  
##  16) ¿Qué anotación usamos para inyectar una clase?
  
a) @Qualifier
  
b) @Autowired
  
c) @Repository
  
d) @Component
  
##  17) ¿Qué anotación usamos marcar que un método de una clase controlador, va a recibir peticiones GET?
  
a) @PostMapping
  
b) @GetMapping
  
c) @MappingGet
  
d) @GetPetition
  
  ##  18) La etiqueta RequestParam nos permite obtener datos del URL, pero, ¿de que parte?
  
a) Parámetros
  
b) Etiqueta
  
c) Ruta
  
d) Ninguna de las anteriores
  
##  19) ¿Qué es Thymeleaf?
  
a) Un motor de vistas
  
b) Un lenguaje de programación basado en Java
  
c) Un motor de plantillas
  
d) Ninguna de las anteriores
  
##  20) ¿Cuál de estos NO es un atributo de Thymeleaf?
  
a) th:text
  
b) th:each
  
c) th:if
  
d) th:else
  
  
---
