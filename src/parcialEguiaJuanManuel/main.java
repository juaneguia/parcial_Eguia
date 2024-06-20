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
		producto1.mostrarEstado();
		producto2.mostrarEstado();
		producto3.mostrarEstado();
		producto4.mostrarEstado();
		producto5.mostrarEstado();
		producto6.mostrarEstado();
		
		int respuesta=8;
		BufferedReader aux=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el producto");
		respuesta=Integer.valueOf(aux.readLine());
		while (respuesta!=0) {
			switch (respuesta) {
			case 1: {
			    totalCompra = totalCompra + producto1.calcularDescuento();
				BufferedReader aux3=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("¿Desea agregar algún producto?");
				respuesta=Integer.valueOf(aux3.readLine());
			}
			break;
	
			case 2: {
				totalCompra = totalCompra + producto2.calcularDescuento();
				BufferedReader aux3=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("¿Desea agregar algún producto?");
				respuesta=Integer.valueOf(aux3.readLine());
			}
			break;
	
			case 3: {
				totalCompra = totalCompra + producto3.calcularDescuento();
				BufferedReader aux3=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("¿Desea agregar algún producto?");
				respuesta=Integer.valueOf(aux3.readLine());
			}
			break;
	
			case 4: {
				totalCompra = totalCompra + producto4.calcularDescuento();
				BufferedReader aux3=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("¿Desea agregar algún producto?");
				respuesta=Integer.valueOf(aux3.readLine());
			}
			break;
	
			case 5:{
				totalCompra = totalCompra + producto5.calcularDescuento();
				BufferedReader aux3=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("¿Desea agregar algún producto?");
				respuesta=Integer.valueOf(aux3.readLine());
			}
			break;

			case 6:{
				totalCompra = totalCompra + producto6.calcularDescuento();
				BufferedReader aux3=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("¿Desea agregar algún producto?");
				respuesta=Integer.valueOf(aux3.readLine());
			}
			break;
			case 0: {
				System.out.println("Presione 0 para finalizar compra");
			}
			break;
			default:
			BufferedReader aux2=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese una opción válida");
			respuesta=Integer.valueOf(aux2.readLine());
			break;
			}
		}
		System.out.println("El total de la compra es de $ " + totalCompra);
	}
}
