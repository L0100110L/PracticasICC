public class 14dic2021{
    public static void main (String [] args){
	Random r = new Random();
	int[] a = new int[100];
	for(int i = 0; i < a.length; i++){
	    
	}
	System.out.prinln("Busqueda");
	for(int i = 0; i < a.length; i++){
	    if(a[i] == r.nextInt(a.length)) {
		System.out.println("Se encontro el numero en la posicion" + i);
		break;
	    }
	}
    }
    public static mergesort(int[] a, int i, int m, int j){
	int [] aux = new int[j -i + 1];
        int k = 0;
	int p = 1;
	int p = i;
	int q = m + 1;		    
    }
    //Busque con arreglos ordenados, busqueda binaria
    public static void busquedaBinaria(int [] a, int nextInt){
	int inicio = 0;
	int fin = a.length -1;
	int medio = (inicio + fin)/ 2;
	while (inicio <= fin){
	    if (a[medio] < fin){
		System.out.println("Encontrado en" + medio)
		    return;
	    }else if (a[medio] < nextInt){
		inicio = medio + 1;
	    }
	}

    }
}
