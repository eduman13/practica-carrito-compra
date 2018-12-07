# Administrador
Acciones del administrador:
* Login
* Registrarme
* Crear productos
* Eliminar usuariosRegistrados
* Enviar e-mail a los usuarios registrados
* Actualizar datos compra
* Ver historial de compras de los distintos usuarios registrados

###Registrarme
Como **administrador** quiero **registrarme** con el objetivo de **quedar regitrado en la base de datos del sistema para poder acceder en un futuro**
*Nota: Primera iteracción con el sistema de un administrador no registrado*

**URL:** /registro-administrador
**Método-HTTP:** POST
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**


###Login
Como **administrador** quiero **logearme** con mi *username* o *email* y *password* con el objetivo de **poder acceder a toda la funcionalidad del sistema como administrador**

**URL:** /login-administrador
**Método-HTTP:** GET
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**


###Crear producto
Como **administrador** quiero **poder crear productos** con el obletivo de **introducir un nuevo producto en el catálogo de productos**

**URL:** /crear-producto
**Método-HTTP:** POST
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**


###Eliminar usuariosRegistrados
Como **administrador** quiero **eliminar usuarioRegistrado** con el objetivo de **poder eliminar usuarioRegistrado por diferentes motivos como pueden ser: fata de acticvidad, uso inapropiado del sistema, etrc.**

**URL:** /eliminar/{id}
**Método-HTTP:** DELETE
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**


###Enviar e-mail a los usuarios registrados
Como **administrador** quiero **enviar e-mail a usuarioRegistrado** con el objetivo de **poder enviar un e-mail con información acerca de nuestros productos**
* **Request:**

**URL:** /enviar-email/{id}
**Método-HTTP:** GET
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**


###Actualizar datos compra
Como **administrador** quiero **actualizar datos compra de un usuario** con el objetivo de **poder actualizar los datos de un pedido de un usuarioRegistrado por si este desea cambiar los datos del pedido**
**URL:** /actualizar-datos/{id}
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**


###Ver historial de compras de los distintos usuarios registrados
Como **administrador** quiero **poder acceder al historial de compra de cada cliente** con el objetivo de **poder ver el historial de compra de cada cliente para poder ver sus predilecciones de compra**

**URL:** /historial-compras/{id}
**Método-HTTP:** GET
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**


##Criterios de aceptación
**Escenario 1:** usuarioRegistrado quiere cambiar dirección envío de una compra
**Dado que** la compra se ha efectuado y el usuarioRegitrsado no puede modificar los datos del envío
**Cuando** el usuarioRegistrado ya ha realizado la compra
**Entonces** consulto su historial de registros y modifico la dirección de envío

