package parcialEguiaJuanManuel;

public class tienda {
	
	protected String nombre;
	protected double precio;
	
	public tienda(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "tienda [nombre=" + nombre + ", precio=" + precio + "]";
	}

}
