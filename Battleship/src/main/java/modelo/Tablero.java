/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Yeisi
 */
public class Tablero {

    Casilla[][] casillas = new Casilla[10][10];
    ArrayList<iNave> naves = new ArrayList<>();
    ArrayList<Disparo> disparos = new ArrayList<>();

    public Tablero() {
        dibujarTablero();
        cargarNaves();

    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    public ArrayList<iNave> getNaves() {
        return naves;
    }

    public void setNaves(ArrayList<iNave> naves) {
        this.naves = naves;
    }

    public ArrayList<Disparo> getDisparos() {
        return disparos;
    }

    public void setDisparos(ArrayList<Disparo> disparos) {
        this.disparos = disparos;
    }
        
    public void cargarNaves() {
        if (naves.size() == 0) {
            iNave portaAviones1 = new PortaAvionesFactory().crearNave();
            iNave portaAviones2 = new PortaAvionesFactory().crearNave();
            iNave crucero1 = new CruceroFactory().crearNave();
            iNave crucero2 = new CruceroFactory().crearNave();
            iNave submarino1 = new SubmarinoFactory().crearNave();
            iNave submarino2 = new SubmarinoFactory().crearNave();
            iNave submarino3 = new SubmarinoFactory().crearNave();
            iNave submarino4 = new SubmarinoFactory().crearNave();
            iNave barco1 = new BarcoFactory().crearNave();
            iNave barco2 = new BarcoFactory().crearNave();
            iNave barco3 = new BarcoFactory().crearNave();
            
            naves.add(portaAviones1);
            naves.add(portaAviones2);
            naves.add(crucero1);
            naves.add(crucero2);
            naves.add(submarino1);
            naves.add(submarino2);
            naves.add(submarino3);
            naves.add(submarino4);
            naves.add(barco1);
            naves.add(barco2);
            naves.add(barco3);
        }

    }

    public void dibujarTablero() {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas.length; j++) {
                casillas[i][j] = new Casilla(i + 1, j + 1);
                System.out.println("" + casillas[i][j].toString());
            }
        }
        // Encabezado de columnas
        System.out.print("  ");
        for (int i = 0; i < casillas.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();

        // Dibujar las filas
        for (int i = 0; i < casillas.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < casillas[i].length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        System.out.println(casillas[1][1]=new Casilla(0, 0));
    }

}
