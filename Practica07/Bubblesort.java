/**
 *@author Yoshua Isai Flores Santillan 
 */
    
import java.util.Arrays;
class Bubblesort{
    public void bubbleSort(int array[]){
	for(int i = 0; i < array.length - 1; i++){
	    boolean cambio = true;
	    for(int j = 0; i < array.length - 1; j++){
		if(array[j] > array[j + 1]){
		    int temp = array[j];
		    array[j] = array[j + 1];
		    array[j + 1] = temp;
		    cambio = false;		   
		}		
	    }
	    if(cambio == true){
		break;
	    }
	}
    }
}

