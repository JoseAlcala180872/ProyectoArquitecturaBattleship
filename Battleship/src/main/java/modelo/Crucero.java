/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yeisi
 */
public class Crucero implements iNave{
    int longitud;
    EstadoNave estadoNave;
    int vida;
    Orientacion orientacion;

    public Crucero() {
        longitud=3;
        this.estadoNave=EstadoNave.SANO;
        vida=longitud;
        orientacion=Orientacion.VERTICAL;        
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public EstadoNave getEstadoNave() {
        return estadoNave;
    }

    public void setEstadoNave(EstadoNave estadoNave) {
        this.estadoNave = estadoNave;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }
    
    @Override
    public void recibirImpacto(){
        vida--; // Reducimos la vida en uno por cada impacto
        if (vida == 0) {
            this.estadoNave = EstadoNave.HUNDIDO;
        } else if (vida < longitud) {
            this.estadoNave = EstadoNave.AVERIADO;
        } 
    }    

    @Override
    public String toString() {
        return "Crucero{" + "longitud=" + longitud + ", estadoNave=" + estadoNave + ", vida=" + vida + ", orientacion=" + orientacion + '}';
    }   
    
}
