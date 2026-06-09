Registro de Llanquihue Tour
Nombre del proyecto: Llanquihue Tour - Prototipo de Sistema
Breve descripción de su propósito
Este proyecto es un software orientado a objetos desarrollado para la agencia de turismo "Llanquihue Tour". Su propósito principal es digitalizar y automatizar la gestión de los clientes y colaboradores de la empresa, solucionando problemas de registro manual, evitando la duplicación de información y diferenciando correctamente los roles de guías turísticos y operadores locales mediante validaciones de datos.

Estructura de paquetes y clases implementadas
El sistema está organizado de forma modular en los siguientes paquetes:

paquete llanquihuetour.model
Persona.java: Clase base que agrupa los atributos de los usuarios.
Direccion.java: Clase que modela la ubicación (composición de Persona).
Colaborador.java: Clase que hereda de Persona para diferenciar los roles de trabajo.
paquete llanquihuetour.exception`
ValidacionExcepcion.java: Clase personalizada para el manejo de errores (ej. correos sin @).
paquete llanquihuetour.app
Main.java: Clase principal donde se crean las instancias y se ejecuta el programa.
Instrucciones para compilar y ejecutar la clase Main
Clonar el repositorio desde GitHub.
Abrir el proyecto utilizando el entorno de desarrollo IntelliJ IDEA.
En el panel izquierdo, desplegar la carpeta src y navegar por los paquetes hasta abrir el archivo llanquihuetour/app/Main.java.
Hacer clic derecho sobre cualquier parte del código dentro del archivo Main.java.
Seleccionar la opción Run 'Main.main()' (o presionar el botón verde de "Play" al lado del método main).
Los resultados y las validaciones se mostrarán en la consola inferior del programa.
