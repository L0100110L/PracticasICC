import java.util.Scanner;
/**
 *Compara numeros usando la condicional "if" para determinar que numero es mayor o menor
 *@author Yoshua Isai Flores Santillan
 *@version 1.0
 **/
public class Condicionales{
    /**
     *Metodo main
     *@param args Son los argumentos que se escriben al momento de ejecutar
     **/
    public static void main(String[] args){
	/**
	 *Imprime un titulo para el programa
	 */
	System.out.println("****Condicionales****");
	
	/**
	 *Crea un objeto de la clase Scanner con nombre "in"
	 */
	Scanner in = new Scanner(System.in);
	
	/**
	 *Da una intruccion al usuario
	 */
	System.out.println("Dame el número 1: ");

	/**
	 *@param num1 Es el primer numero para comparar
	 */
	int num1 = in.nextInt();
	
	/**
	 *Da otra instruccion para comparar el primer dato
	 */
	System.out.println("Dame el número 2: ");

	/**
	 *@param num2 Es el segundo dato para evaluar
	 */
	int num2 = in.nextInt();
	
	/**
	 *Senala que hacer cuando el primer numero ingresado tiene un valor mayor al 
	 */
	if(num1 > num2){
	    System.out.println("El número más grande es: " + num1);
	} else{
	    /**
	     *Da la instruccion para cuando el primer numero no es mas grande
	     */
	    System.out.println("El número más grande es: " + num2);}
			       
	    

	
    }
}
