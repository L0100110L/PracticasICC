public class Tecnico extends Operador{
    public Tecnico(){
	super();
    }
    @Override
    public String toString(){
	return "Tecnico: " + this.name;
    }
    public String trabaja(){
	return "Estoy trabajando";
    }
}
