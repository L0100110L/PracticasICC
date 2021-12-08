/**
 *@author Flores Santillan Yoshua Isai
 *Clase Jugador Beisbol
 */
public class JugadorBeisbol{
    private String nombre;
    private String posicion;
    private Double porcentaje;
    public JugadorBeisbol(String nombre, String posicion, Double porcentaje){
	nombre = nombre;
	posicion = posicion;
	porcentaje = porcentaje;
    }
    //Metodos getters
    public String obtenerNombre(){
	return this.nombre;
    }
    public Double obtenerPorcentaje(){
	return this.porcentaje;
    }
    public String obtenerPosicion(){
	return this.posicion;
    }
    //Metodos setters
    public void asignarPorcentaje(Double nuevoPorcentaje){
	this.porcentaje = nuevoPorcentaje;
    }
    public void asignarPosicion(String nuevaPosicion){
	this.posicion = nuevaPosicion;
    }    
    public boolean mismaPosicion(Object a){
	    JugadorBeisbol ab = (JugadorBeisbol) a;	
	if(this.obtenerPosicion().equals(ab.posicion)){
	    return true;
	}else{
	    return false;
	}
    }
    public boolean esMayorPorcentaje(Object a){	
	JugadorBeisbol ab = (JugadorBeisbol) a;	
	if(this.obtenerPorcentaje() > ab.porcentaje){
	    return true;
	}else{
	    return false;
	}
    }
    @Override   
    public boolean equals(Object a){	
	if(a instanceof JugadorBeisbol){
	    JugadorBeisbol jugadorTP = (JugadorBeisbol) a;
	    if(this.obtenerNombre().equals(jugadorTP.nombre) && this.obtenerPosicion().equals(jugadorTP.posicion) && this.obtenerPorcentaje()== jugadorTP.porcentaje){
		return true;
	    }else{
		return false;
	    }
	}else{
	    return false;
	}
    }
    @Override
    public String toString(){
	return "El jugador: " + this.nombre + "\nCon posicion: " + this.posicion + "\nCon porcentaje: " + this.porcentaje;
    }
    
}
