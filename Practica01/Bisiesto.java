import java.util.Scanner;
/**
 *Determina si el a�o introducido es un a�o bisiesto o no con condicion "if"
 *@author Yoshua Isai Flores Santillan
 *@version 1.0
 **/
public class Bisiesto{
    /**
     *Metodo main
     **/
    public static void main(String[] args){
	/*
	 *Imprime un titulo para introducir al programa
	 */
	System.out.println("****Bisiesto****");
	/*
	 *Crea un objeto del tipo Scanner para que el usuario de un a�o 
	 */
	Scanner in = new Scanner(System.in);
	/*
	 *Imprime un titulo explicando la funcion del programa
	 */
	System.out.println("Escribe un año para determinar si es bisiesto o no");
	int año = in.nextInt();
	/*
	 *Segun el dato introducido es evaluado que el residuo de la division del a�o entre cuatro sea igual a cero
	 */
	if(año % 4 == 0){
	    /*
	     *Cuando se cumple la condicion muestra el siguiente mensaje
	     */
	    System.out.println("El año: " + año + " es bisiesto");
	} else{
	    /*
	     *En caso contrario muestra lo posterior
	     */
	    System.out.println("El año: " + año + " no es bisiesto");
	}
    }
}
