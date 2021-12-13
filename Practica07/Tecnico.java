/**
 *@author Yoshua Isai Flores Santillan 
 */
public class Tecnico extends Operador{
    public Tecnico(String name){
	super(name);
    }
    @Override
    public String toString(){
	return "Tecnico: " + this.name;
    }
    public String trabaja(){
	return "Estoy trabajando";
    }
}
