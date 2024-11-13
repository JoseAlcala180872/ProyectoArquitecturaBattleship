/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yeisi
 */
public class BarcoFactory extends NaveFactory{

    @Override
    public iNave crearNave() {
        return new Barco();
    }

    
    
}