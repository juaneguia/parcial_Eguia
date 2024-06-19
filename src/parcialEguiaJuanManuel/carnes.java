package parcialEguiaJuanManuel;

public class carnes extends tienda{
	
	private boolean feedlot; //mas barato

	public carnes(String nombre, double precio, boolean feedlot) {
		super(nombre, precio);
		this.feedlot = feedlot;
	}

	public boolean isFeedlot() {
		return feedlot;
	}

	public void setFeedlot(boolean feedlot) {
		this.feedlot = feedlot;
	}
	
	public double calcularDescuento() {
		double total;
		if (feedlot) {
			total = precio - (precio*0.10);
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
