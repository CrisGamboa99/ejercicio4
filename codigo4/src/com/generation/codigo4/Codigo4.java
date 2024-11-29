package com.generation.codigo4;

//Se importa la libreria para el scanner
import java.util.Scanner;

public class Codigo4 {

	// Se añade el método main para poder ejecutar el código
	public static void main(String[] args) {
		
		// Se añade System.in para el funcionamiento correcto del scanner
	    Scanner s = new Scanner(System.in);
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    // Se cambia el 1 por 2, ya que es el turno del jugador 2
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    // El siguiente scanner es innecesario
	    //Scanner s2 = new Scanner();
	    String j2 = s.nextLine();
	    
	    //Se cierra el scanner, ya que no se utilizará más
	    s.close();
	    
	 // Se cambia j1 == j2 por j1.equals(j2) para que se compare si son iguales de manera correcta
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
		      switch(j1) {
	            // Se añade el break; después de cada case
	            // Se cambia la comparación por un equals en cada if de cada case para que se comparen correctamente
		        case "piedra":
		          if (j2.equals("tijeras")) {
		            g = 1;
		          }
		          break;

		        case "papel":
		          if (j2.equals("piedra")) {
		            g = 1;
		          //Hace falta una llave para cerrar el if
		          }
		          break;
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	}
}

