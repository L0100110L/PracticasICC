/**
 *Calcula el area total y volumen de un cilindro con caracteristias especificas
 *@author Yoshua Isai Flores Santillan
 *@version 1.0
 **/
public class Cilindro{
    /**
     *Metodo main
     **/
    public static void main(String[] args){
	/*
	 *@param radio Se refiere al radio del circulo de la base del cilindro, se usa para calcular el area del circulo
	 */
	int radio = 10;
	/*
	 *@param altura Es la altura con la que se definio el cilindro
	 */
	int altura = 20;
	/*
	 *@param pi Una constante que se usa para calcular el valor del area del circulo
	 */
	double pi = 3.1416;
	/*
	 *@param r2 Es el radio multiplicado por el mismo radio que es el equivalente de elevarlo al cuadrado, necesario para determinar el area del circulo
	 */
	int r2 = radio*radio;
	/*
	 *@param raporalt Es la multiplicacion del radio por la altura, usada para determinar el area total
	 */
	int radporalt = radio*altura;
	/*
	 *@param areatot Es el area de toda la superficie del cilindro
	 */
	double areatot = 2*pi*radporalt + 2*pi*r2;
	/*
	 *@param area Calculo del area del circulo
	 */
	double area = r2*pi;
	/*
	 *@param volumen Calculo del volumen
	 */
	double volumen = area*altura;
	
	/*
	 *Imprime el area calculada para la superficie del cilindro
	 */
	System.out.println("El aŕea total del cilindro es " + areatot + "cm²");
	/*
	 *Imprime el volumen calculado para el cilindro
	 */
	System.out.println("El volumen del cilindro es " + volumen + "cm³");
	    


	    

	
    }

}
    
