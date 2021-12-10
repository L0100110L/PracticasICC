public class Empleado{
    protected String name;
    public Empleado(){
	name = "pancho";	    
    }
    public Empleado(String nombre){
	name = nombre;
    }
    public String getName(){
	return name;
    }
    public void setName(String nombre){
	name = nombre;
    }
    @Override
    public String toString(){
	return "Soy " + name;
    }
    @Override
    public boolean equals(Object a){
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
