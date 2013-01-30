daw_prog05
==========

Desarrollo de aplicaciones web - Tarea5 - Cuenta Bancaria



A lo largo de esta unidad has ido aprendiendo a crear tus propias clases así como sus distintos miembros (atributos y métodos). Has experimentando con la encapsulación y accesibilidad (modificadores de acceso a miembros), has creado miembros estáticos (de clase) y de instancia (de objeto), has escrito constructores para tus clases, has sobrecargado métodos y los has utilizado en pequeñas aplicaciones. También has tenido tu primer encuentro el concepto de herencia, que ya desarrollarás en unidades más avanzadas junto con otros conceptos avanzados de la Programación Orientada a Objetos.

Una vez finalizada la unidad se puede decir que tienes un dominio adecuado del lenguaje Java como para desarrollar tus propias clases y utilizarlas en una aplicación final que sea capaz de manipular un conjunto de datos simple. Dada esa premisa, esta tarea tendrá como objetivo escribir una pequeña aplicación en Java empleando algunos de los elementos que has aprendido a utilizar.

Se trata de desarrollar una aplicación Java en consola que permita gestionar una cuenta bancaria. Mediante un menú se podrán realizar determinas operaciones:

    Ver el número de cuenta completo (CCC - Código Cuenta Cliente).
    Ver el titular de la cuenta.
    Ver el código de la entidad.
    Ver el código de la oficina.
    Ver el número de la cuenta (solamente el número de cuenta, sin entidad, oficina ni dígitos de control).
    Ver los dígitos de control de la cuenta.
    Realizar un ingreso. Habrá que solicitar por teclado la cantidad que se desea ingresar.
    Retirar efectivo. Habrá que solicitar por teclado la cantidad que se desea retirar.
    Consultar saldo.
    Salir de la aplicación.

Antes de que aparezca este menú, el programa tendrá que solicitar al usuario los siguientes datos:

    Nombre del titular de la cuenta (con un máximo de caracteres).
    Código cuenta cliente (CCC) de la cuenta completo (entidad-oficina-dígitos de control-cuenta).

El programa deberá asegurarse que el CCC es válido mediante la comprobación de:

    El formato (cuatro dígitos de entidad, cuatro dígitos de oficina, dos dígitos de control y diez dígitos de número de cuenta).
    Los dígitos de control son válidos.

Además del programa principal de la aplicación (clase con una función main), habrá que escribir una clase CuentaBancaria que proporcione todas las herramientas necesarias para trabajar con este tipo de información:

    Constructor (o constructores) adecuados.
    Almacenamiento del nombre del titular (atributos).
    Almacenamiento del código de cuenta (atributos).
    Almacenamiento del saldo actual (atributos).
    Gestión de ingresos y depósitos (métodos de interfaz pública).
    Obtención del saldo (métodos de interfaz pública).
    Obtención de información sobre la cuenta: número de la cuenta, entidad, oficina, titular, etc. (métodos de interfaz pública).
    Aquellas herramientas auxiliares necesarias para poder trabajar cómodamente con el objeto. Algunas de esas herramientas podrán ser públicos y otras quizá no. Algunas podrán ser específicas de clase y otras podrán ser de objeto (métodos de objeto privados, métodos estáticos públicos, etc.).

Para trabajar con el número de cuenta debes utilizar el modelo de Código Cuenta Cliente (CCC), que está formado por cuatro campos: entidad - sucursal - dígito de control - número de cuenta. La idea es que puedas introducir el código de cuenta completo y que la clase disponga de un mecanismo para comprobar que ese código es válido. Si el código no es válido, se debería generar una excepción (y por supuesto no almacenar ese código de cuenta). Para ello podrías tener, por ejemplo, un método estático que permita validar códigos de cuenta.

En general, deberías incluir excepciones para controlar aquellos casos en los que el uso de un método no sea posible (intentar sacar más dinero del que hay en el saldo, intentar introducir un titular con más caracteres de los permitidos, intentar ingresar o retirar una cantidad negativa, etc.).

El código fuente Java de esta clase debería incluir comentarios en cada atributo (o en cada conjunto de atributos) y método (o en cada conjunto de métodos del mismo tipo) indicando su utilidad. El programa principal también debería incluir algunos comentarios explicativos sobre su funcionamiento y la utilización de objetos de la clase CuentaBancaria.

Además del programa deberás escribir también un informe con todas las consideraciones oportunas que se necesiten para entender cómo has realizado la tarea.

El proyecto deberá contener al menos dos archivos fuente Java:

    Programa principal (clase con método main: AplicacionCuentaBancaria.java).
    La clase CuentaBancaria (CuentaBancaria.java).
