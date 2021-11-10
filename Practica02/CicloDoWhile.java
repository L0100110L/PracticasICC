/**
 *Calcula los numeros primos menores o iguales a 1000 con el ciclo Do While
 *@author Yoshua Isai Flores Santillan
 *@version 1.0
 **/
public class CicloDoWhile{
    /**
     *Metodo main
     **/
    public static void main(String [] args){
	
	boolean esPrimo = true;
	int n = 2;
	int j = 2;
	//Realiza una vez la accion señalada antes de checar que se cumpla la condicion
	do {
	    //Reinicia el valor de verdad para usarlo con los diferentes numeros n
	    esPrimo = true;
	    do{
		//Condicion que indica el momento en que "esPrimo" se vuelve falso
		if(n % j ==0){
		    esPrimo = false;
		}
		j++;
		
		//Indica al ciclo que termine cuando el valor de j sea mayor a la mitad de n
	    }while(j <n/2);
	    //Cuando esPrimo se mantiene verdad imprime el valor que lo mantiene vcrdadero
	    if(esPrimo){
		System.out.println("El nÃºmero " + n + " es primo");
	    }
	    j = 2;
	    n++;
	    //Comprueba que el valor de verdad de esPrimo para los primeros 1000 numeros
	}while(n <= 1000);
    }
}
