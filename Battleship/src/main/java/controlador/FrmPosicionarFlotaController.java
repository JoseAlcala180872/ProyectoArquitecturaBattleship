/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.PortaAviones;
import modelo.PortaAvionesFactory;
import modelo.iNave;
import static vista.BattleshipFrame.dir;
import static vista.BattleshipFrame.pb;
import static vista.BattleshipFrame.placed;
import vista.frmPosicionarFlota;

/**
 *
 * @author Yeisi
 */
public class FrmPosicionarFlotaController implements iFrmPosicionarFlota{
    frmPosicionarFlota frmPosicionarFlota=new frmPosicionarFlota();
      @Override
    public void mostrar() {
        frmPosicionarFlota.setVisible(true);
    }

    @Override
    public void ocultar() {
        frmPosicionarFlota.setVisible(false);
    } 

    @Override
    public void dibujarTablero() {
        frmPosicionarFlota.dibujarTablero();
    }

    @Override
    public void crearPortaAviones() {
        PortaAviones portaAviones1 = new PortaAviones();
        for(int i = 0; i < 10; i++){
					for(int l = 0; l < 10; l++){
						try{
							if(pb[i][l].getModel().isPressed()){
								for(int j = 0; j < portaAviones1.getLongitud(); j++){
									pb[i][l+j].setBackground(Color.blue);
									dir = "n";
								}
								placed++;
							}
						}catch(ArrayIndexOutOfBoundsException e){
							System.out.println("im sorry that location wont work. Please try again");
                                                    try {
                                                        Thread.sleep(2000);
                                                    } catch (InterruptedException ex) {
                                                        Logger.getLogger(FrmPosicionarFlotaController.class.getName()).log(Level.SEVERE, null, ex);
                                                    }
							try{
								for(int j = 0; j < portaAviones1.getLongitud(); j++){
									pb[i][l+j].setBackground(Color.black);
								}
							}catch(ArrayIndexOutOfBoundsException ex){
								return;
							}
						}
					}
				}
    }
    
}
