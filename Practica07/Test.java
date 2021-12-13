public class Test{
    public static void main(String[] args){
        double arreglo[] = new double[100000];
	for(int i = 0; i < arreglo.length - 1; i++){
	    arreglo[i] = Math.random() * 100000;
	}
	for(int j = 0; j < arreglo.length - 1; j++){
	System.out.println(arreglo[j]);
	}
	arreglo.quickSort(arreglo, 1, 2);
    }
}
