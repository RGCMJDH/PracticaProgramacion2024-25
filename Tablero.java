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

    private Cadena[][] Tablero, TableroJugador;
    FI fi;
    Cadena Archivo;
    Random ran;
    int tamlin = 0;

    public Tablero() {
        this.fi = Fichero();
        this.Tablero = llegirTauler();
        
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
}
