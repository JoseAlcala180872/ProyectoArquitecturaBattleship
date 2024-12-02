/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

import modelo.Jugador;

/**
 *
 * @author Yeisi
 */
public interface iFrmInstrucciones {
    
    public void mostrar();
    public void ocultar();
    public Jugador crearJugador(String nombre);
    
}
