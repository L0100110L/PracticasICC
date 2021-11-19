/**
 *@author Flores Santillan Yoshua Isai
 *@version 1.0
 */
import java.util.Scanner;
/**
 *Clase para ejemplificar el paso de parametros por valor y cuando es por referencia
 */
public class NoEntiendo{
    /**
     *Metodo que cambia el valor de x pero no lo guarda en el main
     */ 

    public static void main(String [] args){
	int x;
	Scanner in = new Scanner(System.in);
	Scanner in2 = new Scanner(System.in);
	System.out.println("Paso de parametros por valor: \n");
	System.out.println("Introduce el valor de x en numero entero \n");
	x = in.nextInt();
	System.out.println("Introduce el valor con el que vas a sumar x \n");	
	int diferente = in.nextInt();
	esdiferentelojuro(x,diferente);
	System.out.println("\nTermina de aplicarse el metodo y x vale " + x);
	System.out.println("\nAhora en los arreglos se va a ejemplificar el paso de parametros por referencia"
			   + "\nIntroduce el tamano del arreglo (Introducir un valor menor a 0 o mayor a 20 es invalido)");
	//probando algo que quien sabe si sirva
	boolean nosirve = true;
	
	while(nosirve){
	int n = in2.nextInt();
	if (n<21 && n>0){
	    nosirve = false;
	    int [] y = new int [n];
	    System.out.println("Ahora internamente se estan usando ciclos para darle un valor a cada posicion del arreglo");
	    for(int i=0 ;i < y.length ; i++){
		y[i] = i;		
	    }
	    tambienesmuydiferente(y);
	    System.out.println("Al imprimir y en la ultima posicion el valor esperado es el de la suma de los elementos de su arreglo " + y[y.length-1]);

	}else{

	    System.out.println("Introduce un valor valido la proxima vez");
	}
	}
    }
    /**
     *Metodo que suma dos valores dados por el usuario
     */
    public static void esdiferentelojuro(int x, int pepino){
	
	x = pepino + x;
	System.out.println("Aplicando metodo que pasa parametros por valor \nx = " + x);	
    }
    /**
     *Metodo que usa la referencia
     */
    public static void tambienesmuydiferente(int [] arreglo){
	int suma = 0;
	for(int i = 0; i < arreglo.length; i++){
	    suma+= arreglo[i];	    
	}
	arreglo[arreglo.length-1] = suma;
    }
    
}
