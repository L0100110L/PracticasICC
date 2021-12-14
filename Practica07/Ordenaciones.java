/**
 *@author Yoshua Isai Flores Santillan
 *@version 1.0
 */
import java.util.Scanner;
import java.util.Random;
public class Ordenaciones{
        public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Indica el tamano del arreglo a ordenar");
	    int n = sc.nextInt();
	    Random r = new Random();	    
	    int arreglo[] = new int[n];// Generacion del arreglo con elementos
	    for(int i = 0; i < arreglo.length - 1; i++){//Rellenado del arreglo
	    int numero = r.nextInt(n);
	    arreglo[i] = numero;
	}
	    for(int j = 0; j < arreglo.length - 1; j++){//Ciclo para mostrar los elementos del arreglo
	    System.out.print(arreglo[j] + ", ");
	}
	    System.out.println();
	    
	    //bubbleSort(arreglo);
	    
	    for(int j = 0; j < arreglo.length - 1; j++){
	    System.out.print(arreglo[j] + ", ");
	}
	    System.out.println();
	    System.out.println("\nNuevo arreglo para quicksort:\n \nIndica el tamano del segundo arreglo");
	    int n2 = sc.nextInt();
	    
	    int arreglo2[] = new int[n2];// Generacion de otro arreglo con elementos
	    for(int i = 0; i < arreglo2.length - 1; i++){//Rellenado del arreglo
	    int numero = r.nextInt(100);
	    arreglo2[i] = numero;
	}
	    for(int j = 0; j < arreglo2.length - 1; j++){//Ciclo para mostrar los elementos del arreglo
	    System.out.print(arreglo2[j] + ", ");
	}
	    System.out.println();
	    int n3 = n2 - 1;
	    
	    quickSort(arreglo2, 0, n3);
	    System.out.println("\nYa se ordeno el arreglo, quedó del siguiente modo:\n");
	    
	    for(int j = 0; j < arreglo2.length - 1; j++){
	    System.out.print(arreglo2[j] + ", ");
	}
	    System.out.println();
    }
    public static void bubbleSort(int[] array){//Metodo bubblesort
	    for(int i = 0; i < array.length - 1; i++){
		for(int j = 0; i < array.length - 1; j++){
		if(array[j] > array[j + 1]){
		    int temp = array[j];
		    array[j] = array[j + 1];
		    array[j + 1] =temp;
		}	       
		}
	    }
	}
        public static void quickSort(int A[], int izq, int der){
	int pivote = A[izq];
	int i=izq;
	int j = der;
	int aux;
	while(i < j){
	    while(A[i] <= pivote && i < j) i++;
	    while(A[j] > pivote) j--;
	    if (i < j){
		aux = A[i];
		A[i] = A[j];
		A[j] = aux;		    
	    }
	}
	
	A[izq] = A [j];
	A[j] = pivote;
	
	if (izq < j-1)
	    quickSort(A, izq, j-1);
	if(j + 1 < der)
	    quickSort(A, j+1, der);	        
    }
}
