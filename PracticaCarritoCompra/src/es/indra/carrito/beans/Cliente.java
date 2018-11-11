package es.indra.carrito.beans;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private List<Compra> comprasRealizadas = new ArrayList<Compra>();

	public Cliente() {

	}

	public Cliente(String nombre, String apellidos, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	/**
	 * M�todo para recorrer comprasRealizadas
	 */
	public void recorrerComprasRealizadas() {
		for (Compra compra : comprasRealizadas) {
			System.out.println("Nombre: " + compra.getProducto().getNombre() + "Cantidad comprada: "
					+ compra.getCantidadComprada());
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * M�todo paar registrarse en una empresa para poder comprar sus productos
	 * 
	 * @param empresa
	 */
	public void registrarEnEmpresa(Empresa empresa) {
		empresa.setClientesEmpresa(this);
		empresa.setListaClienteCompra(this, comprasRealizadas);
	}

	/**
	 * M�todo para buscar los productos de la empresa que coinciden con el nombre
	 * 
	 * @param nombre
	 * @param empresa
	 */
	public void buscarProducto(String nombre, Empresa empresa) {
		for (Producto producto : empresa.getListaProductos()) {
			if (producto.getNombre().equals(nombre)) {
				System.out.println("Nombre: " + producto.getNombre() + " Descripcion: " + producto.getDescripci�n()
						+ " Precio: " + producto.getPrecio() + "�" + " Cantidad: " + producto.getStock());
			}
		}
	}

	/**
	 * M�todo para comprar una determinada cantidad de un prdoducto de una empresa
	 * 
	 * @param empresa
	 * @param producto
	 * @param cantidad
	 * @return devuelve true si se pudo comprar el producto y false si no se pudo
	 *         comprar
	 */
	public boolean comprar(Empresa empresa, Producto producto, int cantidad) {
		if (cantidad <= 0) {
			System.out.println("Por favor, introduzca un n�mero positivo");
			return false;
		} else if (!empresa.getClientesEmpresa().contains(this)) {
			System.out.println("No estas Registrado " + this.getNombre() + " " + this.getApellidos());
			return false;
		} else if (producto.getStock() <= cantidad) {
			System.out.println("No hay suficiente stock");
			return false;
		} else {
			producto.setStock(producto.getStock() - cantidad);
			Producto productoComprado = new Producto(producto.getNombre(), producto.getDescripci�n(),
					producto.getCategoria(), producto.getPrecio()); // Producto comprado que no tiene el stock como
																	// atributo
			Compra compra = new Compra("08/11/2018", productoComprado, cantidad);
			comprasRealizadas.add(compra);
			empresa.setListaClienteCompra(this, comprasRealizadas);
			return true;
		}

	}

}
