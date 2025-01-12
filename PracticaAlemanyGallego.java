/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaalemanygallego;

/**
 *
 * @author cresp
 */
public class PracticaAlemanyGallego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tablero prueba = new Tablero();
        System.out.println(prueba.imprimirTablero());
        Utilitats util = new Utilitats();
        int tamTablero = util.validarEntradaSencer("Introduce un tamaño", "Tamaño no válido, dame otro");

        char[] nombre = util.validarEntradaLiniaC("Nombre del Jugador?", "Nombre Inválido, dame otro");
        System.out.println(util.toString(nombre));

        Tablero jugador = new Tablero(util.toString(nombre), tamTablero);
        System.out.println(jugador.imprimirTablero());

    }

}
