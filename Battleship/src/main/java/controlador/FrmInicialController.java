/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmInicial;

/**
 *
 * @author Yeisi
 */
public class FrmInicialController implements iFrmInicial{
    public static frmInicial inicio= new frmInicial();
    
    @Override
    public void mostrar() {
        inicio.setVisible(true);
    }

    @Override
    public void ocultar() {
        inicio.setVisible(false);
    }
    
    
    
    
    
    
}
