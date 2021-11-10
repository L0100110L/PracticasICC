/**
 *Calcula los numeros primos que son iguales o menores a 1000  con ciclo While
 *@author Yoshua Isai Flores Santillan
 *@version 1.0
 **/
public class CicloWhile{
    /**
     *Metodo main
     **/
    public static void main(String [] args){
	
	boolean esPrimo = true;
	int i = 2;
	int j = 2;
	
	/**
	 *Ejecuta la serie de instrucciones mientras i se mantenga en el intervalo valido
	 */
	while(i <= 1000){
	    /**
	     *Se ejecuta mientras j este en el rango especificado
	     */
	    while(j < i/2){
		/**
		 *El valor de verdad se cambia y se sale del ciclo cuando se cumple que i entre j da como residuo 0
		 */
		if(i % j == 0){
		    esPrimo = false;
		    break;
		}
		j++;
	    }
	    /**
	     *Condicion que al cumplirse senala que imprima el valor que satisface la condicion
	     */
	    if(esPrimo){
		System.out.println("El número " + i +" es primo");
	    }
	    esPrimo = true;
	    j = 2;
	    i++;
	}
    }
}
