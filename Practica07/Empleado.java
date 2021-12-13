/**
 *@author Yoshua Isai Flores Santillan 
 */
public class Empleado{
    protected String name;
    public Empleado(){//Constructor para dar por default un nombre al empleado cuando no recibe parametros
	name = "pancho";	    
    }
    public Empleado(String nombre){//Constructor que recibe como parametros un String y usa ese String para nombrar al empleado
	name = nombre;
    }
    public String getName(){//Metodo para obtener el nombre del nombre
	return name;
    }
    public void setName(String nombre){//metodo para modificar el nombre del empleado
	name = nombre;
    }
    @Override
    public String toString(){//Devuelve un String con el nombre del empleado
	return "Empleado: " + name;
    }
    @Override
    public boolean equals(Object a){ //Compara a los empleados segun el nombre para ver si son el mismo
	if(a instanceof Empleado){
	    Empleado tmp = (Empleado) a;
	    if(this.name.equals(tmp.name){
		    return true;
		}else{
		    return false;
		}else{
		    return false
			}
		}		
	}				
}
