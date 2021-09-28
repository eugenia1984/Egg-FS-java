# GUÍA DE GIT CON GITHUB

## ¿QUÉ ES EL CONTROL DE VERSIONES?

Los sistemas de control de versiones son programas que tienen como objetivo controlar los
cambios en el desarrollo de cualquier tipo de software, permitiendo conocer el estado actual
de un proyecto, los cambios que se le han realizado a cualquiera de sus piezas, las personas
que intervinieron en ellos, etc. 

El software de control de versiones realiza un seguimiento de
todas las modificaciones en el código en un tipo especial de base de datos. 

Si se comete un error, los desarrolladores pueden ir atrás en el tiempo y comparar las versiones anteriores
del código para ayudar a resolver el error al tiempo que se minimizan las interrupciones para
todos los miembros del equipo.

Los desarrolladores que trabajan en equipos están escribiendo continuamente nuevo
código fuente y cambiando el que ya existe. El código de un proyecto, una aplicación o un
componente de software normalmente se organiza en una estructura de carpetas o "árbol
de archivos". Un desarrollador del equipo podría estar trabajando en una nueva función
mientras otro desarrollador soluciona un error no relacionado cambiando código. Cada
desarrollador podría hacer sus cambios en varias partes del árbol de archivos.

El control de versiones ayuda a los equipos a resolver estos tipos de problemas, al realizar
un seguimiento de todos los cambios individuales de cada colaborador y ayudar a evitar
que el trabajo concurrente entre en conflicto.

En definitiva, tener un control de los cambios en los códigos de nuestra aplicación es una
variable crucial para el éxito de nuestro desarrollo. Git es un sistema de control de versiones
de código abierto, diseñado para manejar grandes y pequeños proyectos con rapidez y
eficiencia. La pretensión de este tutorial es abordar el uso básico de Git proporcionando
ejemplos prácticos útiles para comenzar a administrar repositorios remotos con plataformas
como Bitbucket o GitHub.

## CONTROL DE VERSIONES CON GIT

Git es la mejor opción para la mayoría de los equipos de software actuales. Aunque cada
equipo es diferente y debería realizar su propio análisis, aquí recogemos los principales
motivos por los que destaca el control de versiones de Git con respecto a otras alternativas:

 ## GIT ES UNA EXCELENTE HERRAMIENTA
 
Git tiene la funcionalidad, el rendimiento, la seguridad y la flexibilidad que la mayoría de los
equipos y desarrolladores individuales necesitan. En las comparaciones directas con gran
parte de las demás alternativas, Git resulta muy ventajoso para muchos equipos.

## GIT ES UN PROYECTO DE CÓDIGO ABIERTO DE CALIDAD

Git es un proyecto de código abierto muy bien respaldado con más de una década de
gestión de gran fiabilidad. Los encargados de mantener el proyecto han demostrado un
criterio equilibrado y un enfoque maduro para satisfacer las necesidades a largo plazo de
sus usuarios con publicaciones periódicas que mejoran la facilidad de uso y la funcionalidad.

La calidad del software de código abierto resulta sencilla de analizar y un sin número de
empresas dependen en gran medida de esa calidad

Git goza de una amplia base de usuarios y de un gran apoyo por parte de la comunidad. La
documentación es excepcional y para nada escasa, ya que incluye libros, tutoriales y sitios
web especializados, así como podcasts y tutoriales en vídeo.

El hecho de que sea de código abierto reduce el costo para los desarrolladores aficionados,
puesto que pueden utilizar Git sin necesidad de pagar ninguna cuota. En lo que respecta a
los proyectos de código abierto, no cabe duda de que Git es el sucesor de las anteriores
generaciones de los exitosos sistemas de control de versiones de código abierto, SVN y
CVS.

## GITHUB

Github es un portal creado para alojar el código de las aplicaciones de cualquier
desarrollador. La plataforma está creada para que los desarrolladores suban el código de
sus aplicaciones y herramientas, y que como usuario no solo puedas descargarte la
aplicación, sino también entrar a su perfil para leer sobre ella o colaborar con su desarrollo

Un sistema de gestión de versiones es ese con el que los desarrolladores pueden
administrar su proyecto, ordenando el código de cada una de las nuevas versiones que
sacan de sus aplicaciones para evitar confusiones. Así, al tener copias de cada una de las
versiones de su aplicación, no se perderán los estados anteriores cuando se va a actualizar.

Git, al ser un sistema de control, va ser la herramienta que nos va a permitir comparar el
código de un archivo para ver las diferencias entre las versiones, restaurar versiones
antiguas si algo sale mal, y fusionar los cambios de distintas versiones.

Así pues, Github es un portal para gestionar proyectos usando el sistema Git.

## ¿CÓMO VAMOS A LOGRAR ESO?

Github permite que los desarrolladores alojen proyectos creando repositorios de forma
gratuita. Un repositorio es como una carpeta para tu proyecto. El repositorio de tu proyecto
contiene todos los archivos de tu repositorio y almacena el historial de revisión de cada
archivo. También puedes debatir y administrar el trabajo de tu proyecto dentro del
repositorio.

## CREAR UN REPOSITORIO EN GITHUB

Para subir tu proyecto a GitHub, deberás crear un repositorio donde alojarlo. Para poder
crear un repositorio deberemos crearnos una cuenta en GitHub.

1) En la esquina superior derecha de cualquier página, utiliza el menú desplegable + y selecciona Repositorio Nuevo

2) Escribe un nombre corto y fácil de recordar para tu repositorio. Por ejemplo: "holamundo".

3) También puedes agregar una descripción de tu repositorio. Por ejemplo, "Mi primer repositorio en GitHub".

4) Elige la visibilidad del repositorio. Puedes restringir quién tiene acceso a un repositorio
eligiendo la visibilidad de un repositorio: público o privado. Publico significa que
cualquier persona puede ver ese repositorio y privado significa que solo personas
autorizadas pueden verlo. Que sea publico no significa que la gente puede subir cosas
a nuestro repositorio, lo único que permite es que se puedan ver los archivos.

5) Podemos crear el repositorio con un ReadMe

6) Da click en Crear repositorio.

## INSTALACIÓN DE GIT

Una vez que tenemos creado un repositorio en GitHub vamos a tener que instalar Git

## INSTALADOR DE GIT PARA MAC

El modelo de Git de Apple viene preinstalado en macOS. Abra su terminal o editor de scripts
de shell de su elección e ingrese git –version para verificar qué versión de Git está en su
máquina. Si aún no está en su máquina, ejecutar git –version le pedirá que instale Git.

Si bien esta compilación de Git está bien para algunos usuarios, es posible que desee
instalar la versión más actualizada. Puede hacerlo de muchas formas diferentes; hemos
recopilado algunas de las opciones más fáciles a continuación.

1) Una forma es instalar Git en un Mac es mediante el instalador independiente:
A. Descarga el instalador de Git para Mac más reciente desde acá:

[https://sourceforge.net/projects/git-osx-installer/files/](https://sourceforge.net/projects/git-osx-installer/files/)

B. Sigue las instrucciones para instalar Git.
Abre un terminal y escribe el siguiente texto para comprobar que la instalación se ha
realizado correctamente:

```
git --version:
$ git --version
git version 2.9.2
```

2) Otra forma es instalar Git mediante HomeBrew:
3) 
Homebrew instala una lista de paquetes útiles que no vienen preinstalados en Mac.

A. Pegue el siguiente comando en su terminal para instalar Homebrew:
```
/bin/bash -c "$(curl -fsSL
https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

B. El terminal le pedirá que ingrese una contraseña. Ingrese la contraseña que usa para
iniciar sesión en su Mac y continuar con el proceso de instalación.

C. Una vez terminado, ingrese brew install git en la terminal y espere a que se descargue.
Verifique que Git se instaló ejecutando git –version .

## INSTALADOR DE GIT PARA LINUX

Debian / Ubuntu (apt-get)

Los paquetes de Git están disponibles mediante APT:

1. Desde tu núcleo, instala Git mediante apt-get:

```
$ sudo apt-get update
$ sudo apt-get install git
```


2. Introduce el siguiente texto para verificar que la instalación se ha realizado
correctamente:

```
git --version:
$ git --version
git version 2.9.
```

## INSTALADOR DE GIT PARA WINDOWS

1. Descarga el instalador de Git para Windows más reciente.

2. Cuando hayas iniciado correctamente el instalador, verás la pantalla del asistente de instalación de Git.

3. Selecciona las opciones Siguiente y Finalizar para completar la instalación. Las opciones predeterminadas son las más lógicas en la mayoría de los casos.

4. Abre el símbolo del sistema (o Git Bash si durante la instalación seleccionaste no usar Git desde el símbolo del sistema de Windows).

5. Introduce el siguiente texto para verificar que la instalación se ha realizado correctamente:

```
git --version:
$ git --version
git version 2.9.2
```

## CONFIGURACIÓN INICIAL

Abra su terminal de Git para comenzar con la ejecución de comandos, por ejemplo, abrirá
el programa Git bash en Windows para ingresar a la línea de comandos de este programa.

Una vez que ingrese, use el siguiente comando para establecer el nombre de usuario de git:

```
git config -—global user.name “Jhoel Perez”
```
Recuerde sustituir el texto entre comillas por su nombre real. Ahora indique el correo
electrónico del usuario para git:

```
git config --global user.email "micorreopersonal@jhoel.com"
```

Sustituyendo el texto entre comillas por su cuenta de correo electrónico. Esta configuración
inicial debería ser suficiente para comenzar. 

Para comprobar otros valores de su configuración actual ejecute:

```
git config -–list
```


Se mostrarán los nuevos valores configurados al final, y otros valores de configuración predeterminados:

```
color.diff=auto
color.status=auto
```

```
user.name=Juan Perez
user.email=micorreopersonal@juan.com
```

## FORMAS DE COMENZAR A TRABAJAR CON GIT

Para trabajar con Git con Github tenemos dos formas de trabajar:

1) Trabajar en local, en un repositorio que me cree en mi máquina y vincularlo a un repositorio creado en GitHub

2) Clonar un repositorio de Github (u otro hosting de repositorios) para traernos a local el repositorio completo y empezar a trabajar con ese proyecto.

Vamos a elegir de momento la opción 1) que nos permitirá comenzar desde cero y con la
que podremos apreciar mejor cuáles son las operaciones básicas con Git. En este sentido,
cualquier operación que realizas con Git tiene que comenzar mediante el trabajo en local,
por lo que tienes que comenzar por crear el repositorio en tu propia máquina. Incluso si tus
objetivos son simplemente subir ese repositorio a Github para que otras personas lo puedan
acceder a través del hosting remoto de repositorios, tienes que comenzar trabajando en
local.

## INICIO DE UN NUEVO REPOSITORIO: GIT INIT

Primero deberemos crear una carpeta vacía para inicializar nuestro repositorio, una vez que
la tenemos creada debemos decirle a la terminal que se pare en esa carpeta, así todos los
comandos de Git, afectan a esa carpeta.

En Windows podemos hacer click derecho a la carpeta y darle a Git Bash Here, eso nos
abrirá la terminal Git Bash en la carpeta para trabajar Git.

En Mac podemos hacer lo mismo, click derecho a la carpeta y darle a la opción Nuevo
Terminal en la carpeta.

Una vez parados en nuestra carpeta. Para crear un nuevo repositorio, usa el comando git
init. git init es un comando que se utiliza una sola vez durante la configuración inicial de un
repositorio nuevo. Al ejecutar este comando, se creará un nuevo subdirectorio .git en tu
directorio de trabajo actual. También se creará una nueva rama principal.

```
$ git init
```

## GUARDAR CAMBIOS EN EL REPOSITORIO: GIT ADD Y GIT COMMIT

Ahora que has iniciado o clonado un repositorio, puedes realizar commits en la versión del
archivo. Vamos a ir a nuestra carpeta y vamos a crear un archivo txt con nuestro nombre
escrito, una vez que lo tengamos creado vamos a hacer los siguientes comandos.

**Git Status**

El comando de git status nos da toda la información necesaria sobre la rama actual.

```
git status
```


Podemos encontrar información como:

• Si la rama actual está actualizada

• Si hay algo para confirmar, enviar o recibir (pull).

• Si hay archivos en preparación (staged), sin preparación(unstaged) o que no están recibiendo seguimiento (untracked)

• Si hay archivos creados, modificados o eliminados

Hacemos un git status en nuestro repositorio para ver el estado actual.


## Git Add

Cuando creamos, modificamos o eliminamos un archivo, estos cambios suceden en local y no se incluirán en el siguiente commit (a menos que cambiemos la configuración).

Necesitamos usar el comando git add para incluir los cambios del o de los archivos en tu siguiente commit.

Añadir un único archivo:

```
git add <archivo>
```

Añadir todo de una vez:

```
git add .
```

Si revisas la captura de pantalla del git status, verás que hay nombres de archivos en rojo - esto significa que los archivos sin preparación. Estos archivos no serán incluidos en tus
commits hasta que no los añadas.

Hacemos un git add . para agregar nuestro archivo txt. Una vez que hacemos el git add
hacemos otro git status, ahora veremos que los archivos que estaban en rojo, están en verde,
esto quiere decir que ya los hemos agregado para hacer nuestro commit.

## Git Commit

Este sea quizás el comando más utilizado de Git. Una vez que se llega a cierto punto en el desarrollo, queremos guardar nuestros cambios (quizás después de una tarea o asunto
específico) o subir un archivo / proyecto.

Git commit es como establecer un punto de control en el proceso de desarrollo al cual puedes volver más tarde si es necesario. Es como un punto de guardado en un videojuego.

También necesitamos escribir un mensaje corto para explicar qué hemos desarrollado o modificado en el código fuente.

```
git commit -m "mensaje de confirmación"
```

Hacemos un commit para guardar nuestro txt y le ponemos un mensaje que explique que hemos hecho.

## VINCULAR NUESTRO REPOSITORIO CON GITHUB

Primero deberemos crear un repositorio, sin el archivo readME.

Una vez que tenemos el archivo agregado y guardado de manera local, tenemos que vincular este repositorio local a un repositorio remoto en GitHub. 

Para esto vamos a utilizar el comando git remote add.

Este comando va a tomar el alias nuestro repositorio y la url de nuestro repositorio en GitHub, con esto va a vincularlo con nuestro repositorio local.

```
git remote add <name> <url>
```

El alias que vamos a utilizar para Github es origin y para obtener la url de nuestro repositorio, podemos encontrarla al principio de nuestro repositorio:

Buscamos el url de nuestro repositorio de GitHub y lo hacemos en nuestro terminal.

Por lo que pondremos ```git remote add origin <url>```
  
## COLABORACIÓN ENTRE REPOSITORIOS: GIT PUSH

Después de haber confirmado tus cambios y haber vinculado el repositorio de Git local con el repositorio remoto de GitHub, el siguiente paso que quieres dar es enviar tus cambios o
archivos al servidor remoto. git push envía tus commits al repositorio remoto.

```
git push <nombre-remoto> <nombre-de-tu-rama>
```

De todas formas, si tu rama ha sido creada recientemente, puede que tengas que cargar y
subir tu rama con el siguiente comando:

```
git push origin <nombre-de-tu-rama>
```

Recordemos que usamos el alias origin para el repositorio remoto.

Cuando creamos un repositorio en GitHub, nos crea una rama por defecto llamada main,
podemos en la configuración cambiar para que la rama que se cree por defecto se llame
master.

Por lo que ahora haremos el siguiente comando en nuestra terminal:

```
git push origin main
```

o

```
git push origin master
```

Una vez que hemos hecho esto, si refrescamos nuestro repositorio vamos a ver nuestro
archivo txt en nuestro repositorio de GitHub.

Este proceso se va a repetir, quitando la vinculación y la inicialización del repositorio, cada
vez que nosotros hagamos un cambio dentro de nuestro repositorio. Esto puede ser
modificar un archivo ya existente o agregar más archivos a la carpeta local.

---


## RAMAS EN GIT
A menudo necesitamos trabajar con más de una persona sobre un mismo proyecto.

Pero, ¿Qué pasa si más de un desarrollador hace cambios sobre el mismo archivo?, o peor aún,
¿Qué pasa si ambos cambian la misma línea de código?

Para evitar este tipo de problemas y colisionar código permanentemente, git provee la
herramienta de branches (rama). De esta manera, puedes crear tu propia rama del
proyecto y hacer todos los cambios que necesites, y al final del proceso crear un pull
request para mergear (juntar tus cambios) con la rama principal, main o master

## GIT CHECKOUT Y GIT BRANCH

El comando git branch es el que usaremos principalmente para trabajar con la creación de
ramas, borrado de ramas y demás. Sin embargo, no es el único comando para la operativa
que veremos en este artículo, ya que existen otros subcomandos de Git útiles y necesarios
para trabajar con ramas, como checkout para crear y moverse entre ramas

Puedes comenzar tu primera práctica para trabajar con ramas. Haremos algo tan sencillo
como lanzar el comando "git branch" a secas. Esto nos dará el listado de ramas que
tengamos en un proyecto. Pero hay que advertir que las ramas de un repositorio local
pueden ser distintas de las ramas de un repositorio remoto. Por ejemplo, cuando clonas un
repositorio de GitHub generalmente estás clonando únicamente la rama master y no todas
las ramas que se hayan creado a lo largo del tiempo. Otro ejemplo es cuando creas una
rama en tu repositorio local. En este caso la rama la tendrás simplemente en tu proyecto
local y no se subirá al repositorio remoto hasta que no lo especifiques.

## LA RAMA MASTER O MAIN

Cuando inicializamos un proyecto con Git automáticamente nos encontramos en una rama
a la que se denomina "master".

Puedes ver las rama en la que te encuentras en cada instante con el comando:

```
git branch
```

Esta rama es la principal de tu proyecto y a partir de la que podrás crear nuevas ramas
cuando lo necesites.

Si has hecho algún commit en tu repositorio observarás que después de lanzar el comando
"git branch" nos informa el nombre de la rama como "master".

Recordemos que en GitHub esta rama puede llamarse Main, siempre podemos cambiar el
nombre de la rama a Master con las configuraciones de GitHub.


## CREAR UNA RAMA NUEVA

El procedimiento para crear una nueva rama es bien simple. Usando el comando checkout
seguido del nombre de la rama que queremos crear. 

El guion b lo que hace es crear la rama
y cambiar a esa rama nueva.

```
git checkout -b nombre_de_tu_branch
```

Si nos fijamos nos solo creamos una nueva rama local, sino que ahora nos paramos en la
nueva rama que creamos.

```
-> Git git:(master) git checkout -b ramaGit
Switched to a new branch 'ramaGit'
->Git git:(ramaGir)
```

Podemos obtener una descripción más detallada de las ramas con este otro comando:

```
git show-branch
```

Esto nos muestra todas las ramas del proyecto con sus commits realizados. La salida sería
como la de la siguiente imagen.

```
-> Git git:(ramaGit) git show-branch
![master] Primer commit
*[ramaGit] Primer commit
--
+* [master] Primer commit
-> Git git:(ramaGit)
```

Como podemos ver la rama nueva ya tiene el primer commit que realizamos en la rama
master porque como explicamos más arriba, estamos clonando la rama master.

## PASAR DE UNA RAMA A OTRA

Para moverse entre ramas usamos el comando git checkout seguido del nombre de la rama
que queremos que sea la activa.

```
git checkout nombre_de_tu_branch
```

Esto se vería así:

```
-> Git git:(ramaGit) git checkout master
Switched to branch 'master'
-> Git git:(master) git checkout ramaGit
Switched to branch 'ramaGit'
-> Git git:(ramaGit)
```

---
