/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import java.util.Random;

/**
 *
 * @author Yeisi
 */
public class Juego {
    //Atributos 
    //List<Jugador> jugadores;
    Jugador jugador1;
    Jugador jugador2;
    Jugador turnoJugador;
    int tiempoLimite;
    //Constructor
    public Juego(Jugador jugador1,  Jugador jugador2){
        this.jugador1=jugador1;
        this.jugador2=jugador2;
        this.turnoJugador = seleccionarJuadorInicial();
    }
    
    
    //Metodos
    public void iniciarJuego(Juego juego){
        // Bucle principal del juego
        while (!haTerminadoElJuego()) {
            // El jugador actual realiza su turno
            turnoJugador.realizarJugada();

            // Cambiamos al siguiente jugador
            turnoJugador = turnoJugador == jugador1 ? jugador2 : jugador1;
        }
        
    }
    
    public Jugador seleccionarJuadorInicial(){
         Random random = new Random();  
          // Generamos un número aleatorio entre 0 (inclusivo) y 2 (exclusivo)
          // Si el número es 0, el jugador 1 inicia, si no, el jugador 2
         return random.nextInt(2) == 0 ? jugador1 : jugador2;              
        
    }
    
    
    
    
}
