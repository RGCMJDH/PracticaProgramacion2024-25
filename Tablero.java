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

    public Tablero() {
        this.Tablero = llegirTauler();
    }

    private Cadena[][] llegirTauler() {
        ran = new Random();
        int archivo = ran.nextInt(100);
        String nombreArchivo = "Tableros/" + archivo + ".txt";
        Archivo = new Cadena(nombreArchivo.toCharArray()); // Convertimos el String a charArray para usar Cadena
        fi = new FI(Archivo);
        fi.obrir(); // Archivo abierto con el nombre dado

        Cadena linea = null;
        linea = fi.llegirLinia();
        char[] lineaCopiar;
        lineaCopiar = linea.toString().toCharArray();
        char letraASCII = 65;

        tamlin = lineaCopiar.length + 1;
        Tablero = new Cadena[tamlin][tamlin];
        char[] buit = new char[1];
        buit[0] = '-';
        Tablero[0][0] = new Cadena(' ');
        for (int i = 1; i < tamlin; i++) {

            Tablero[0][i] = new Cadena((char) (i + 48));
        }
        for (int j = 1; j < tamlin - 1; j++) {
            Tablero[j][0] = new Cadena(letraASCII);
            letraASCII++;
        }

        for (int y = 1; y < tamlin - 1; y++) {
            if (y > 1) {
                linea = fi.llegirLinia();   // CAMBIAR
            }
            for (int x = 0; x < tamlin - 1; x++) {

                Tablero[y][x] = new Cadena(lineaCopiar[x]);
            }
        }
        fi.tancar();
        return Tablero;
    }

    public String TaulerToString() {

        String nuevo = "";
        for (int i = 0; i < tamlin; i++) {
            nuevo += "\n";
            for (int j = 0; j < tamlin; j++) {
                nuevo += Tablero[i][j].getPal();
            }
        }
        return nuevo;
    }

}
