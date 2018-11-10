package es.indra.carrito.main;


import es.indra.carrito.beans.Cliente;
import es.indra.carrito.beans.Empresa;
import es.indra.carrito.beans.Producto;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto("Tomate", "Rojo", Producto.Categor�a.ALIMENTACION, 1.00, 500);
		Producto producto2 = new Producto("Naranjas", "Naranja", Producto.Categor�a.ALIMENTACION, 1.00, 500);
		Producto producto3 = new Producto("Manzanas", "Golden", Producto.Categor�a.ALIMENTACION, 1.01, 500);
		Producto producto4 = new Producto("Pepino", "ToGuapo", Producto.Categor�a.ALIMENTACION, 1.00, 500);
		Producto producto5 = new Producto("Zanahoria", "Para conojeos", Producto.Categor�a.ALIMENTACION, 1.00, 500);
		Empresa empresa1 = new Empresa("Mercadona");
		empresa1.anadirProducto(producto1, producto2, producto3, producto4, producto5);
		Cliente cliente1 = new Cliente("Tomas", "Garcia", "Calle falsa 123", "66666666");
		Cliente cliente2 = new Cliente("Andres", "Garcia", "Calle falsa 123", "66666666");
		Cliente cliente3 = new Cliente("Jose", "Garcia", "Calle falsa 123", "66666666");
		cliente1.registrarEnEmpresa(empresa1);
		empresa1.decrementarStock(producto1, 20);
		//empresa1.recorrerListaProductos();
		cliente1.comprar(empresa1, producto1, 9);
		cliente2.registrarEnEmpresa(empresa1);
		cliente2.comprar(empresa1, producto4, 8);
		//empresa1.recorrerListaClienteCompra();
		cliente3.registrarEnEmpresa(empresa1);
		//empresa1.recorrerClientesEmpresa();
		cliente3.comprar(empresa1, producto4, 34);
		cliente2.comprar(empresa1, producto1, 37);
		
		empresa1.recorrerListaProductos();
		Cliente cliente4 = new Cliente("Eduardo", "Garcia", "Calle falsa 123", "66666666");
		cliente4.registrarEnEmpresa(empresa1);
		//cliente3.recorrerComprasRealizadas();
		cliente4.comprar(empresa1, producto5, 1);
		empresa1.recorrerClientesEmpresa();


//		cliente2.buscarProducto("Manzanas", empresa1);
//		cliente1.buscarProducto("Manzanas", empresa1);
//		cliente1.comprar(empresa1, cliente1, producto1, 20);
//		cliente1.comprar(empresa1, cliente1, producto2, 20);
//		cliente1.comprar(empresa1, cliente1, producto3, 20);
//		cliente1.comprar(empresa1, cliente1, producto4, 20);
//		cliente1.comprar(empresa1, cliente1, producto1, 20);
//		cliente1.registrarEnEmpresa(empresa1, cliente1);
//		cliente2.registrarEnEmpresa(empresa1, cliente2);
//		cliente3.registrarEnEmpresa(empresa1, cliente3);
//		empresa1.recorrerClientesEmpresa();
//		cliente1.recorrerComprasRealizadas();
//		cliente2.comprar(empresa1, cliente2, producto3, 56);
//		empresa1.recorrerListaClienteCompra();
//		cliente3.comprar(empresa1, cliente3, producto4, 89);
//		empresa1.recorrerListaClienteCompra();

	}

}
