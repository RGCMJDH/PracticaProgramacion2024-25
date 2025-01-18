/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaalemanygallego;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mascport
 */
public class FO {

    private final Cadena nom;
    private FileWriter fic;
    private BufferedWriter writer;

    public FO(Cadena n) {
        nom = n;
    }

    public void obrir(boolean afegir) {
        try {
            fic = new FileWriter(nom.toString(), afegir);
            writer = new BufferedWriter(fic);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void gravarLinia(Cadena lin) {
        try {
            writer.write(lin.toString().toCharArray());
            writer.newLine();
        } catch (Exception ex) {
            Logger.getLogger(FO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tancar() {
        try {
            writer.close();
            fic.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fic.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}