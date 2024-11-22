/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yeisi
 */
public class Jugador {
    //Atributos.
    String nombre;
    String color;
    Tablero tableroPrincipal ;
    Tablero tableroEnemigo;
    //Metodos.

    public Jugador(String nombre) {
        this.nombre=nombre;
    }

    public Jugador(String nombre, String color, Tablero tableroPrincipal, Tablero tableroEnemigo) {
        this.nombre = nombre;
        this.color = color;
        this.tableroPrincipal = tableroPrincipal;
        this.tableroEnemigo = tableroEnemigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Tablero getTableroPrincipal() {
        return tableroPrincipal;
    }

    public void setTableroPrincipal(Tablero tableroPrincipal) {
        this.tableroPrincipal = tableroPrincipal;
    }

    public Tablero getTableroEnemigo() {
        return tableroEnemigo;
    }

    public void setTableroEnemigo(Tablero tableroEnemigo) {
        this.tableroEnemigo = tableroEnemigo;
    }
    
    public void colocarNaves(){
        
    }
    
    public Disparo realizarDisparo(Casilla casilla){
        //Implementacion pendiente.
        return null;
        
    }
    
    public void recibirDisparo(Casilla casilla){
        //Implemenacion pendiente.
    }
    
}
