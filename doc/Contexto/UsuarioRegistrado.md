# UsuarioRegistrado
Acciones que puede realizar un usuario registrado
* Login
* Añadir productos al carrito de compra
* Comprar productos
* Buscar productos por una serie de campos
* Ver su historial de compras
* Comentar los productos
* Actualizar sus datos
* Tener una lista con productos deseados

### Login
Como **usuarioRegistrado** quiero **logearme** con mi *username* o mi *email*  y mi *password* con el objetivo de **poder acceder a toda la funcionalidad que me ofrece la aplicacion como usuarioRegistrado**

**URL:** /login-usuario
**Método-HTTP:** GET
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**

### Añadir productos al carrito de compra
Como **usuarioRegitrado** quiero poder **añadir uno o varios productos a mi carrito de compra** con el objetivo de **poder comprar esos productos más adelante**

**URL:** /anadir-carritoCompra
**Método-HTTP:** POST
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**

### Comprar Producto
Como **usuarioRegistrado** quiero poder **comprar los productos de mi carrito de compra** con el objetivo de **finalizar la compra y poder disponer de los productos comprados**

**URL:** /comprar-producto
**Método-HTTP:** POST
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**


### Buscar productos por una serie de campos
Como **usuarioRegistrado** quiero poder **buscar productos por una serie de campos** con el objetivo de **poder acceder a los productos que deseo sin tener que realizar una búsqueda dentro de todo el listado de artículos disponibles**

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

### Ver su historial de compras
Como **usuarioRegistrado** quiero poder **ver mi historial de compras** con el objetivo de **poder acceder a una lista de mis compras con todos sus datos**

**URL:** /historial-compras
**Método-HTTP:** GET
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**


### Comentar los productos
Como **usuarioRegistrado** quiero poder **comentar los productos** con el objetivo de **dejar una review de los productos que he comprado para que la puedan ver otros usuarios**

**URL:** /verProducto/{id}/comentar
**Método-HTTP:** POST
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**

### Actualizar sus datos
Como **usuarioRegistrado** quiero poder **actualizar mis datos** con el objetivo de **poder actualizar mis datos de registro por si quiero modificar alguno por cualquier motivo**

**URL:** /actualizar-datos/{id}
**Método-HTTP:** PUT
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**

### Tener una lista con productos deseados
Como **usuarioRegistrado** quiero poder **tener una lista de mis productos deseados** con el objetivo de **tener una lista alternativa al carrito de compra con productos que me gustan pero que no quiero comprar por el momento**

**URL:** /anadir-productosDeseados/{id_usuarioRegistrado}&{id_producto}
**Método-HTTP:** POST
**Headers:**
**Parámetros query string**
* **Request:**
* **Response:**

**Parámetros body:**
**Status Code:**

##Criterios de aceptación
**Escenario 1:** Si el stock de un producto es menor o igual que 5
**Dado que** el producto que visita un usuario tiene menos o es igual a 5 unidades
**Cuando** el cliente esta consultando el producto
**Entonces** se tiene que indicar que el producto tiene 5 o menos de stock para que el usuario interesado tenga constancia de ello
