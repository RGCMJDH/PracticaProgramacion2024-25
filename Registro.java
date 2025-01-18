/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaalemanygallego;

/**
 *
 * @author ramon
 */
public class Registro {

    FI fi;
    FO fo;
    //Cadena archivo = new Cadena("registro.txt".toCharArray());
    //Cadena entrada;
    public Registro() {
       
    }

    public Cadena guardarC(Cadena entrada) {
        fo = new FO( new Cadena("registro.txt".toCharArray()));
        fo.obrir(true);
        fo.gravarLinia(entrada);
        //fo.gravarLinia(espacio);
        fo.tancar();
        return entrada;
    }

    private FO guardarN(int[] entrada) {

        return fo;
    }

  
}
