import java.util.Scanner;
/**
 *Usa condicionales para determinar si un numero introducido es impar o par segun la configuracion escrita en el codigo
 *@autor Yoshua Isai Flores Santillan
 *@version 1.0
 **/
    
public class IfElse{
    /**
     *Metodo main
     **/
    public static void main(String [] args){
	//Crea un scanner para obtener ingresados por el usuario
	Scanner sc = new Scanner(System.in);
	/*
	 *@param maybe Es el numero introducido para ser analizado
	 */
	int maybe = sc.nextInt();
	/*
	 *Evalua el numero ingresado por el usuario segun sin son impares o no
	 */
	if(maybe % 2 != 0){
	    System.out.println("Weird");
	    /*
	     *Agrega otra condicion para evaluar los numeros segun el intervalo al que pertenecen cuando son pares
	     */
	    if(maybe % 2 == 0){
		if(maybe >1 && maybe<6){
		    System.out.println("Not Weird");
		}
		if(maybe>5 && maybe<21){
		    System.out.println("Weird");
		}
		if(maybe>20){
		    System.out.println("Not Weird");
		}
	    }
	}
	    
	
    }
}
