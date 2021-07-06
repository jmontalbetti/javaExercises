package SaveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Execices4 {

    public static void main(String[] args) {
        GuardaRopa armario = new GuardaRopa();
        List<Prenda> prendas = new ArrayList<>();
        prendas.add(new Prenda("Adidas", "A"));
        prendas.add(new Prenda("Totto", "B"));
        prendas.add(new Prenda("Puma", "C"));
        armario.guardarPrendas(prendas);

        prendas = new ArrayList<>();
        prendas.add(new Prenda("Converse", "D"));
        prendas.add(new Prenda("Superman", "E"));
        armario.guardarPrendas(prendas);

        System.out.println("Lista prendas");
        armario.mostrarPrendas();
        System.out.println("Prendas con id: " + 2);
        System.out.println(armario.devolverPrendas(2).toString());
    }
}
