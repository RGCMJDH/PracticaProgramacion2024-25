/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaalemanygallego;

/**
 *
 * @author ramon
 */
public class TableroJ {

    private Cadena[][] TableroJugador;
    Tablero cpu = new Tablero();

    public TableroJ() {
        this.TableroJugador = creaTableroJ();
    }

    int tamlin = 11;

    private Cadena[][] creaTableroJ() {
         Cadena TableroJ[][] = new Cadena[tamlin][tamlin];
        for (int i = 0; i < tamlin; i++) {
            for (int j = 0; j < tamlin; j++) {
                TableroJ[i][j] = new Cadena();
            }
        }

        for (int i = 1; i < tamlin; i++) {
            TableroJ[i][0].sustitueix((char) (i + 64));
            for (int j = 1; j < tamlin; j++) {
                TableroJ[0][j].sustitueix((char) (j + 47));
            }
        }
        TableroJ[0][0].sustitueix(' ');

        for (int i = 1; i < tamlin; i++) {
            for (int j = 1; j < tamlin; j++) {
                TableroJ[i][j].sustitueix('-');
            }
        }

        return TableroJ;
    }

    public String imprimirTableroJ() {
        String res = " ";

        for (int i = 0; i < tamlin; i++) {
            res += "\n";
            for (int j = 0; j < tamlin; j++) {
                res += TableroJugador[i][j].getPrimer();
            }
        }
        return res;
    }
    
     private Cadena[][] setTableroJ(Cadena TableroJugador[][]) {
        LT tec = new LT();
        
        System.out.print("Dame una posicion X: ");
        int posX = tec.llegirSencer();
        System.out.print("Dame una posicion Y: ");
        int posY = tec.llegirSencer();
        
        for (int i = 1; i < tamlin; i++) {
            for (int j = 1; j < tamlin; j++) {
                TableroJugador[posX][posY].sustitueix('X');
            }
        }
        return TableroJugador;
        
    }
}
