/**
 *@author Yoshua Isai Flores Santillan 
 */
public class Directivo{
    public Directivo(String name){//Constructor con parametro string
	super(name);
    }
    @Override
    public String toString(){//toString que devuelve el nombre del directivo
	return "Directivo: " + this.name;
    }
}
