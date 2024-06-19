package parcialEguiaJuanManuel;

public class vegetales extends tienda{

	private boolean estacion;

	public vegetales(String nombre, double precio, boolean estacion) {
		super(nombre, precio);
		this.estacion = estacion;
	}

	public boolean isEstacion() {
		return estacion;
	}

	public void setEstacion(boolean estacion) {
		this.estacion = estacion;
	}
	
	public double calcularDescuento() {
		double total;
		if (estacion) {
			total = precio - (precio*0.20);
		}
		else {
			total=precio;
		}
		return total;
	}
	
    public void mostrarEstado() {
        System.out.println("Producto: " + nombre + ", Precio: $" + calcularDescuento());

    }
	
}
