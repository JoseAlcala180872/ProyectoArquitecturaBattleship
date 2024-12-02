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
public class FrmInstruccionesController implements iFrmInstrucciones{
    public static frmInstrucciones instrucciones= new frmInstrucciones();

    @Override
    public void mostrar() {
        instrucciones.setVisible(true);
    }

    @Override
    public void ocultar() {
        instrucciones.setVisible(false);
    }    
    
    public Jugador crearJugador(String nombre){        
        return new Jugador(nombre);
        
    }
}
