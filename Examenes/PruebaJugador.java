/**
 *
 * Programa que prueba el funcionamiento de la clase JugadorBeisbol
 *
 */
public class PruebaJugador {

    public static void main(String [] cosas) {

	JugadorBeisbol unJugador ;
	JugadorBeisbol otroJugador ;
	JugadorBeisbol unaJugadora ;

	unJugador = new JugadorBeisbol("Juan Torres", "jardinero", 0.276) ;
	otroJugador = new JugadorBeisbol("Lalo Cuevas", "jardinero", 0.284) ;
	unaJugadora = new JugadorBeisbol("Ana Flores", "lanzadora", 0.345) ;

	System.out.println(unJugador.obtenerNombre() + " es " +
			   unJugador.obtenerPosicion() ) ;
	System.out.println(otroJugador.obtenerNombre() + " su porcentaje es " +
			   otroJugador.obtenerPorcentaje() ) ;
	System.out.println(unaJugadora.obtenerNombre() + " es " +
			   unaJugadora.obtenerPosicion() +
			   " y su porcentaje de bateo es " +
			   unaJugadora.obtenerPorcentaje() ) ;

	otroJugador.asignarPorcentaje(otroJugador.obtenerPorcentaje() + 0.025) ;

	if ( unJugador.mismaPosicion(otroJugador) ) {
	    System.out.println("Los jugadores " +
			       unJugador.obtenerNombre() + " y " +
			       otroJugador.obtenerNombre() +
			       " tienen la misma posicion" ) ;
	    System.out.println("El jugador " + unJugador.obtenerNombre() +
			       " cambia de posicion a catcher" ) ;
	    unJugador.asignarPosicion("catcher") ;
	}

	System.out.println(unJugador) ; // Muestra datos del jugador

	// Verifica si dos jugadores son el mismo
	if ( unJugador.equals(otroJugador) ) {
	    System.out.println("Los jugadores " +
			       unJugador.obtenerNombre() + " y " +
			       otroJugador.obtenerNombre() +
			       " son el mismo jugador") ;
	}

	if ( unaJugadora.esMayorPorcentaje(otroJugador) ) {
	    System.out.println(unaJugadora.obtenerNombre() +
			       " tiene el mejor porcentaje") ;
	} else {
	    System.out.println(otroJugador.obtenerNombre() +
			       " tiene el mejor porcentaje") ;
	}

    } // Fin del main

} // Fin de la clase PruebaJugador
