/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaalemanygallego;

import java.util.Date;

/**
 *
 * @author ramon
 */
public class PracticaAlemanyGallego {

    public static void main(String[] args) {
        // TODO code application logic here
        Tablero prueba = new Tablero(); 
        Registro reg = new Registro();
        Date fecha = new Date();
        
        //Para hacer bonito el registro
        final Cadena cabecera = new Cadena("---------------PARTIDA---------------".toCharArray());
        final Cadena espacio = new Cadena("--------------------------------------".toCharArray());  
        //final Cadena separador = new Cadena("#".toCharArray());
            //Nombre para el registro
        Cadena nombR = new Cadena("Nombre: ".toCharArray());
            //Fecha para el registro
        Cadena fechR =  new Cadena("Fecha: ".toCharArray());   
            
        //System.out.println(fecha); Muestra datos de fecha
        Cadena fech = new Cadena(fecha.toString().toCharArray());
        reg.guardarC(cabecera);
        reg.guardarC(fechR);
        fech.ponerSeparador();
        reg.guardarC(fech);
        
        System.out.println(prueba.imprimirTablero());

        Utilitats util = new Utilitats();//Crea objeto Utilitats

        int tamTablero = util.validarEntradaSencer("Introduce un tamano", "Tamano no válido, dame otro");//Valida entrada 

        char[] nombre = util.validarEntradaLiniaC("Nombre del Jugador?", "Nombre Inválido, dame otro");//Valida entrada
        //System.out.println(util.toString(nombre));//imprime el nombre 
        Cadena nomb = new Cadena(nombre);
        reg.guardarC(nombR);
        
        //nomb.posarInicio('#');
        nomb.ponerSeparador();
        reg.guardarC(nomb);
        reg.guardarC(espacio);
        
        
        Tablero jugador = new Tablero(util.toString(nombre), tamTablero);
        System.out.println(jugador.imprimirTablero());

    }

}
