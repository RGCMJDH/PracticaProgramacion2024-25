/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaalemanygallego;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mascport
 */
public class FI {

    private final Cadena nom;
    private FileReader fic;
    private BufferedReader reader;

    public FI(Cadena n) {
        nom = n;
    }

    public void obrir() {
        try {
            fic = new FileReader(nom.toString());
            reader = new BufferedReader(fic);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Cadena llegirLinia() {
        char[] res = null;
        try {
            String fr = reader.readLine();
            if (fr != null) {
                res = fr.toCharArray();
            }
        } catch (Exception ex) {
            Logger.getLogger(FI.class.getName()).log(Level.SEVERE, null, ex);
        }
        Cadena cad = null;
        if (res != null) {
            cad = new Cadena();
            for(int i=0;i<res.length;i++) {
                cad.posar(res[i]);
            }
        }
        return cad;
    }

    public void tancar() {
        try {
            reader.close();
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
