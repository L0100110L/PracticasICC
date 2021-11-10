/**
 *Calcula los numeros primeros menores o iguales a 1000 con el ciclo For
 *@author Yoshua Isai Flores Santillan
 *@version 1.0
 **/
public class CicloFor{
    /**
     *Metodo main
     **/
    public static void main(String[] args){
	
	boolean esPrimo = true;
	/*
	 *El numero que se evaluara como primo o no primo que empieza en 2, luego define un intervalo valido en el que se ejecutara la accion, agrega uno cada que revisa un valor dado inicial
	 */
	for(int i = 2; i<1000; i++){
	    /*
	     *El valor es verdadero mientras nada indique lo contrario
	     */
	    esPrimo = true;
	    /*
	     *El numero que dividira a "i" para determinar si es primo o no, debe ser menor que el primer numero y debe ir probando los numeros uno a uno
	     */
	    for(int j = 2; j < i; j++){
		/*
		 *La condicion que se señala cuando i es primo o falso al tener que j debe ser menor que i y mayor a 1 se comprueba que i es un numero primo si no hay otro numero que lo divida con residuo 0
		 */
		if(i % j == 0){
		    esPrimo = false;
		    break;
		   
		}
	    }
	    /*
	     *Imprime el numero cuyo valor de verdad "esPrimo" es verdadero
	     */
	    if(esPrimo){
		System.out.println("El nÃºmero i: " + i + " es primo");
	    }
	}

    }
}
