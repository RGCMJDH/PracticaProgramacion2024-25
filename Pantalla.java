package practicaalemanygallego;

public class Pantalla {

    private Cadena[] pant;

    public Pantalla(int y) {
        pant = new Cadena[y];
        esborrar_priv();
    }

    private void esborrar_priv() {
        for (int i = 0; i < pant.length; i++) {
            pant[i] = new Cadena();
        }
    }

    public void esborrar() {
        esborrar_priv();
    }

    public void imprimir() {
        for (int i = 0; i < pant.length; i++) {
            System.out.println();
        }
        System.out.println("============================================================================================");
        for (int i = 0; i < pant.length; i++) {
            System.out.println(pant[i]);
        }
        System.out.println("============================================================================================");
    }

    public void posar(Cadena ca, int i) {
        pant[i] = ca;
    }
}
