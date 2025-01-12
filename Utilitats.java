/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaalemanygallego;

/**
 *
 * @author CAB892
 */
public class Utilitats {

    LT tec = new LT();

    public int validarEntradaSencer(String mensajePeticion, String mensajeError) { // Aquest mètode fa ús de la classe LT i permet validar entrada constantment
        Integer entrada = null;
        while (entrada == null) {
            System.out.println(mensajePeticion);
            entrada = tec.llegirSencer();
            if (entrada == null || entrada < 1 || entrada > 10) {
                System.out.println(mensajeError);
                entrada = null;
            }
        }
        return entrada;
    }

    public char[] validarEntradaLiniaC(String mensajePeticion, String mensajeError) { // Aquest mètode fa ús de la classe LT i permet validar entrada constantment

        char[] entrada = null;
        while (entrada == null) {
            System.out.println(mensajePeticion);
            entrada = tec.llegirLiniaC();
            if (entrada == null || (entrada.length == 0)) {
                System.out.println(mensajeError);
                entrada = null;
            }
        }
        return entrada;
    }

    public String toString(char[] palabra) {
        String res = "";
        for (int i = 0; i < palabra.length; i++) {
            res += palabra[i];
        }
        return res;
    }
}
