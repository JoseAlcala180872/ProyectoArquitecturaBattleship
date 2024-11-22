/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Jugador;
import vista.frmInstrucciones;

/**
 *
 * @author Yeisi
 */
public class JugadorController {
    private Jugador jugador;
    public static frmInstrucciones instrucciones= new frmInstrucciones();

    public JugadorController() {
    }
    
    
    public void crearJugador(String nombre){
        jugador=new Jugador(nombre);
    }
    
    
}
