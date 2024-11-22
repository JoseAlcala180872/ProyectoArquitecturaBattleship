/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.NaveFactory;
import modelo.SubmarinoFactory;
import modelo.Tablero;
import modelo.iNave;
import vista.frmInicial;

/**
 *
 * @author Yeisi
 */
public class Main {
    public static void main(String[] args) {
        FrmInicialController.mostrar();
        Tablero tablero=new Tablero();
        
        for (int i = 0; i < tablero.getNaves().size(); i++) {
            System.out.println(""+tablero.getNaves().get(i).toString());
            
        }
        
        
    }
    
}
