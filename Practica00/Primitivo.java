/**
 *Muestra la cantidad de BYTES que usa cada tipo de dato primitivo en java
 *@author Yoshua Isai Flores Santillan
 *@version 1.0
 **/
public class Primitivo{
    /**
     *Metodo main
     **/
    public static void main(String[] args){
       
	//Imprime la cantidad de BYTES que ocupa cada tipo de dato
	System.out.println("Tipos primitivos");
	System.out.println("Byte: " + Byte.BYTES + " bytes");
	System.out.println("Short: " + Short.BYTES + " bytes");
	System.out.println("Interger: " + Integer.BYTES + " bytes");
	System.out.println("Long: " + Long.BYTES + " bytes");
	System.out.println("Float: " + Float.BYTES + " bytes");
	System.out.println("Double: " + Double.BYTES + " bytes");
	System.out.println("Boolean: 1 byte");
	System.out.println("Character: " + Character.BYTES +" bytes");
    }
}
