
package pooobjetosclasses;

public class PooObjetosClasses {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Crystal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.destampar();
        c1.status();
    }
}
