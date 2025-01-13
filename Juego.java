/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaalemanygallego;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author cresp
 */
public class Juego {

    private Tablero CPU;
    private Tablero Jugador1;
    private Tablero Jugador2;
    private int tocados, hundidos, agua, recibidos;
    String nombrePartida = "";
    LocalTime horaActual;
    LocalDate diaActual;
    Utilitats util = new Utilitats();

    public Juego(Tablero CPU, Tablero Jugador1, Tablero Jugador2) { // MODO DE JUEGO 2 JUGADORES 
        this.CPU = CPU;
        this.Jugador1 = Jugador1;
        this.Jugador2 = Jugador2;
        tocados = 0;
        hundidos = 0;
        recibidos = 0;
        agua = 0;
        String nombrePartida = Jugador1.getNombreTablero();
        horaActual = LocalTime.now();
        diaActual = LocalDate.now();

    }

    public Juego(Tablero CPU, Tablero Jugador1) { // MODO DE JUEGO VS CPU
        this.CPU = CPU;
        this.Jugador1 = Jugador1;
        this.Jugador2 = null;
        tocados = 0;
        hundidos = 0;
        recibidos = 0;
        agua = 0;
        String nombrePartida = Jugador1.getNombreTablero();
        horaActual = LocalTime.now();
        diaActual = LocalDate.now();

    }

    public void disparar(Tablero ataca, Tablero defiende, char[] coordenadas){
        if(coordenadasValidas(coordenadas)){

        }


    }

    private boolean coordenadasValidas(char[] coord){

     while(coord.length > 1 || coord == null){
         if (coord.length > 1){
             System.out.println("ERROR! Coordenades no vàlides");
         }
            coord = null;
            coord = util.validarEntradaLiniaC("Introdueix les coordenades en format LletraNombre. Exemple: A0", "ERROR! Coordenades no vàlides");
        }
     if(coord[0] >  CPU.getTablero()[0][CPU.getTamlin()].getPrimer() || coord[1] >  CPU.getTablero()[CPU.getTamlin()][0].getPrimer()){ 
       coord = null;
     } else if(coord[0] <= CPU.getTablero()[0][CPU.getTamlin()].getPrimer() && coord[1] < CPU.getTablero()[CPU.getTamlin()][0].getPrimer()){
        return true;
     }
     return true;
    }

}
