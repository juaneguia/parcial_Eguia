package parcialEguiaJuanManuel;

public class conservas extends tienda{
	
	private boolean enlatado;

	public conservas(String nombre, double precio, boolean enlatado) {
		super(nombre, precio);
		this.enlatado = enlatado;
	}

	public boolean isEnlatado() {
		return enlatado;
	}

	public void setEnlatado(boolean enlatado) {
		this.enlatado = enlatado;
	}
	
	public double calcularDescuento() {
		double total;
		total = precio - (precio * 0.1);
		return total;
	}
    public void mostrarEstado() {
        System.out.println("Producto: " + nombre + ", Precio: $" + calcularDescuento());
    }

}
