/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaalemanygallego;

import java.util.Random;

/**
 *
 * @author cresp
 */
public class Tablero {

    private Cadena[][] Tablero;
    FI fi;
    Cadena Archivo;
    Random ran;
    int tamlin = 0;
    String nombreTablero = " ";
    int puntosTotal = 0;

    public Tablero() {
        nombreTablero = "CPU";
        this.fi = Fichero();
        this.Tablero = llegirTauler();
        this.puntosTotal = ObtenerPuntuacion();

    }

    public Tablero(String nombre, int tam) {
        nombreTablero = nombre;
        tamlin = tam + 1;
        this.Tablero = creaTableroJ();

    }

    private FI Fichero() {
        ran = new Random();
        int archivo = ran.nextInt(100);
        String nombreArchivo = "Tableros/" + archivo + ".txt";
        Archivo = new Cadena(nombreArchivo.toCharArray()); // Convertimos el String a charArray para usar Cadena
        fi = new FI(Archivo);
        System.out.println(archivo);
        return fi;

    }

    private int ObtenerPuntuacion() {
        int puntos = 0;
        fi.obrir();
        while (fi.llegirLinia() != null) {
            char[] linea = fi.llegirLinia().getPal();
            for (int i = 0; i < linea.length; i++) {
                if (linea[i] != '-') {
                    puntos++;
                }
            }
        }
        fi.tancar();
        System.out.println(puntos);
        return puntos;
    }

    private Cadena[][] llegirTauler() {

        fi.obrir(); // Archivo abierto con el nombre dado
        Cadena linealeida = new Cadena();
        linealeida = fi.llegirLinia();
        tamlin = linealeida.getTam() + 1;
        Cadena Tablero[][] = new Cadena[tamlin][tamlin];

        for (int i = 0; i < tamlin; i++) {
            for (int j = 0; j < tamlin; j++) {
                Tablero[i][j] = new Cadena();
            }
        }

        for (int i = 1; i < tamlin; i++) {
            Tablero[i][0].sustitueix((char) (i + 64));
            for (int j = 1; j < tamlin; j++) {
                Tablero[0][j].sustitueix((char) (j + 47));
            }
        }
        Tablero[0][0].sustitueix(' ');

        for (int i = 1; i < tamlin; i++) {
            if (i > 1) {
                linealeida = fi.llegirLinia();
            }
            for (int j = 1; j < tamlin; j++) {
                Tablero[i][j].sustitueix(linealeida.getPal()[j - 1]);
            }
        }

        return Tablero;
    }

    private Cadena[][] creaTableroJ() {
        Cadena Tablero[][] = new Cadena[tamlin][tamlin];

        for (int i = 0; i < tamlin; i++) {
            for (int j = 0; j < tamlin; j++) {
                Tablero[i][j] = new Cadena();
            }
        }
        for (int i = 1; i < tamlin; i++) {
            Tablero[i][0].sustitueix((char) (i + 64));
            for (int j = 1; j < tamlin; j++) {
                Tablero[0][j].sustitueix((char) (j + 47));
            }
        }
        for (int i = 1; i < tamlin; i++) {
            for (int j = 1; j < tamlin; j++) {
                Tablero[i][j].sustitueix('-');
            }
        }

        return Tablero;
    }

    public String imprimirTablero() {
        String res = " ";

        for (int i = 0; i < tamlin; i++) {
            res += "\n";
            for (int j = 0; j < tamlin; j++) {
                res += Tablero[i][j].getPrimer();
            }
        }
        return res;
    }

    public String getNombreTablero() {
        return nombreTablero;
    }

    public int getTamlin() {
        return tamlin;
    }

    public Cadena[][] getTablero() {
        return Tablero;
    }

}
