/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.frmInstrucciones;

/**
 *
 * @author Yeisi
 */
public class FrmInstruccionesController {
    public static frmInstrucciones inicio= new frmInstrucciones();
    
    public static void mostrar(){
        inicio.setVisible(true);
    }
    
    public static void ocultar(){
        inicio.setVisible(false);
    }
    
    
    
}
