# first_steps_kotlin
¿Qué debemos saber del desarrollo nativo?

1. ¿Cuál es la característica principal que define a una aplicación nativa?

-Las características principales que brinda una aplicación nativa es migrar la app en plataformas.
-Poder reutilizar bibliotecas existentes o proporcionar sus propias bibliotecas para reutilizarlas.
-Aumentar el rendimiento en ciertos casos, en especial, los de mayor exigencia computacional, como el de los juegos.

2. ¿Qué dos lenguajes son los más relevantes para el desarrollo nativo en Android?

C o C++

3. ¿Qué lenguaje es el estándar actual para el desarrollo nativo en iOS?

Swift

4. Identifica y describe dos ventajas clave del enfoque nativo, especialmente en rela-
ción con el rendimiento y la experiencia de usuario.

Posee NativeActivity que controla la comunicación con el FrameWork de Android y tu código nativo, de esta manera no tenemos que crear una subclase ni llamar a sus métodos. Lo que garantiza un rendimiento óptimo y una integración fluida con el ecosistema existente en cada plataforma.

El lenguaje favorece la experiencia de usuario en apps móviles porque permite crear apps que funcionan de manera rápida, fluida y eficiente al estar diseñadas específicamente para un sistema operativo como iOS y ANDROID.

 Kotlin es el lenguaje por excelencia de aplicaciones móviles nativas de Android

5. ¿Cuál es la principal desventaja del desarrollo nativo en términos de tiempo y re-
cursos?

Son los costos elevados que conlleva al tener que mantener bases de código separadas para Android (Kotlin/Java) e iOS(Swift/Objective-c), lo que prolonga el tiempo de desarrollo y requiere más personal especializado, resultando de una menor reutilización del código y un mantenimiento más costoso y extenso.

Sobre el Desarrollo Multiplataforma:
1. ¿Cuál es la promesa o el objetivo principal de los frameworks multiplataforma?

El objetivo principal es permitir que los desarrolladores creen aplicaciones que funcionen en múltiples sistemas operativos o dispositivos (como iOS y Android) utilizando como única base de código, lo que le genera a su vez la eficiencia en desarrollo como el motivo principal.

2. Nombra tres frameworks multiplataforma populares y el lenguaje de programación
que utiliza cada uno.

React Native creado por Meta. Utiliza JavaScript. Framework de código abierto.

Flutter es un kit de desarrollo (SDK) creado por Google. Conocido por crear interfaces de usuarios hermosas. Utiliza Dart

Xamarin es un framework de Microsoft que permite el desarrollo de aplicaciones móviles con una base de código compartida en C#. Su lenguaje principal es C# y ha sido integrado en la plataforma .NET.

3. Identifica y describe dos ventajas clave de este enfoque, especialmente relaciona-
das con los costos y la velocidad de desarrollo.

Reducción de costos porque se puede tener una misma base de código para múltiples plataformas y por lo tanto, mayor velocidad del desarrollo, ya que los equipos pueden reutilizar componentes y lógica de negocio, lo que acorta los plazos de entrega.

4. ¿Cuáles son las dos desventajas más comunes de los frameworks, sobre todo en
términos de rendimiento y acceso a funciones del dispositivo?

El rendimiento, ya que el código de los Frameworks y las librerías adicionales aumentan el tamaño final y menor fluidez porque el código  tiene que comunicarse con los componentes nativos a través de un puente o intermediario.

Párrafo de Conclusión:

Kotlin es un lenguaje de programación funciona y orientada a objetos que proporciona una sintaxis y conceptos similares a los de otros lenguajes, como C#, Java y Scala, entre muchos otros.

Es administrado por Kotlin Foundation, por los mismos creadores de JetBrains y Google, lo que significa que las herramientas de Android se diseñaron para admitir Kotlin.

Algunas APIs de Android están escritas en Kotlin, pero en su gran mayoría están escritas en Java. Por lo que este lenguaje resulta una experiencia mucho más agradable que Android


BIBLIOGRAFÍA
o Documentación oficial: Android Developers, Apple Developer, Flutter, React Native.
o Blogs de tecnología: Artículos que realicen comparativas actualizadas sobre rendi-
miento, costos y casos de uso.

"Descripción general de Kotlin" https://developer.android.com/kotlin/overview?hl=es-419 
"Guía para desarrollar la experiencia de usuario con Android"https://blog.stylingandroid.com/