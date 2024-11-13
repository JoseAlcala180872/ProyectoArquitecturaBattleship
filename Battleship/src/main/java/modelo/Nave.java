/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yeisi
 */
public abstract class Nave {
    int longitud;
    EstadoNave estadoNave;
    Orientacion orientacion;
    int vida;

    public Nave(int longitud, EstadoNave estadoNave, Orientacion orientacion) {
        this.longitud = longitud;
        this.estadoNave = estadoNave;
        this.orientacion = orientacion;
    }
    
    
    
}
