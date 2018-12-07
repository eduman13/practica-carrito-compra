# UsuarioNoRegistrado
Acciones que puede realizar un usuario no registrado
* Registrarse
* Buscar productos por distintos campos

###Registrarme
Como **usuarioNoRegistrado** quiero **poder registrarme** con el objetivo de **poder acceder a toda la funcionalidad del sistema**

**URL:** /registrar-usuario
**Método-HTTP:** POST
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**

###Buscar productos
Como **usuarioNoRegistrado** quiero **poder buscar productos del catálogo** con el objetivo de **poder ver los productos que disponen en la tienda online**

**URL:** /buscar/{nombre}||{categoría}||{id}
**Método-HTTP:** GET
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**

###Ver producto
Como **usuarioRegistrado** quiero poder **ver un producto seleccionado** con el objetivo de **ver su precio, comentarios, etc.**

**URL:** /verProducto/{id}
**Método-HTTP:** GET
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**