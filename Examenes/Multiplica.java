/**
 *@author (del metodo) Flores Santillan Yoshua Isai
 *@version 1.0
 */
import java.util.Scanner ;
/**
 * Clase Multiplica. Programa que multiplica valores enteros usando
 *                   un método recursivo.
 *
 */
public class Multiplica {
    public static int producto(int a, int b){//Metodo para multiplicar dos elementos
	int res;
	if(b == 0){
	    res = 0;
	}else if(b < 0){
	    int temp = a * (-1 * b);
	    res = -1 * temp;
	    return res;
	}else{
	    res = a + (a * (b-1));
	}
	return res;
    }//Fin de metodo producto    
    public static void main(String [] parametros) {

	Scanner datos = new Scanner(System.in) ;

	int a ;
	int b ;
	int respuesta = 0 ;

	System.out.println("Escribe el valor del primer número entero") ;
	a = datos.nextInt() ;
	System.out.println("Escribe el valor del segundo número entero") ;
	b = datos.nextInt() ;

	respuesta = producto(a, b) ;
	System.out.println("La multiplicación de " + a + " con " + b +
			   " es: " + respuesta) ;

    } // Fin de main

} // Fin de clase Sumar
