package es.indra.carrito.beans;

public class Compra {

	private String fecha;
	private Producto producto;
	private int cantidadComprada;

	public Compra() {

	}

	public Compra(String fecha, Producto producto, int cantidadComprada) {
		super();
		this.fecha = fecha;
		this.producto = producto;
		this.cantidadComprada = cantidadComprada;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidadComprada() {
		return cantidadComprada;
	}

	public void setCantidadComprada(int cantidadComprada) {
		this.cantidadComprada = cantidadComprada;
	}

}
