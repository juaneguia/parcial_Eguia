package parcialEguiaJuanManuel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		vegetales producto1 = new vegetales("Manzana", 500, true);
		vegetales producto2 = new vegetales("Frutilla", 1000, false);
		carnes producto3 = new carnes("Carne Picada", 1500, true);
		carnes producto4 = new carnes("Asado", 5000, false);
		conservas producto5 = new conservas("Paté", 500, true);
		conservas producto6 = new conservas("Fideos", 1500, false);
		
		double totalCompra = 0;
	
		System.out.println("Bienvenido a la tienda, ¿Qué desea llevar?");
		int respuesta=1;
		while (respuesta!=0) {
			switch (respuesta) {
			
			case 1: {
				producto1.mostrarEstado();
			    totalCompra = totalCompra + producto1.calcularDescuento();
			
			}
	
			case 2: {
				producto2.mostrarEstado();
				totalCompra = totalCompra + producto2.calcularDescuento();

			}
	
			case 3: {
				producto3.mostrarEstado();
				totalCompra = totalCompra + producto3.calcularDescuento();

			}
	
			case 4: {
				producto4.mostrarEstado();
				totalCompra = totalCompra + producto4.calcularDescuento();

			}
	
			case 5:{
				producto5.mostrarEstado();
				totalCompra = totalCompra + producto5.calcularDescuento();

			}

			case 6:{
				producto6.mostrarEstado();
				totalCompra = totalCompra + producto6.calcularDescuento();

			}
			case 0: {
				System.out.println("Presione 0 para finalizar compra");
			}
		
			BufferedReader aux=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("¿Desea agregar algún producto?");
			respuesta=Integer.valueOf(aux.readLine());
			}
			
		}
		
		System.out.println("El total de la compra es de $ " + totalCompra);
	
	
		

		
		


	}

}
