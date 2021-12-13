/**
 *@author Yoshua Isai Flores Santillan 
 *@version 1.0
 */
public class Oficial extends Operador{
    public Oficial(String name){//Constructor con parametro string
	super(name);
    }
    @Override
    public String toString(){//Metodo que devuelve el nombre del Oficial
	return "Tecnico" + this.name;
    }

    public String trabaja(){//Metodo que devuelve el String Estoy trabajando 
	return "Estoy trabajando";
    }
}
