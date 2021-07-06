package SaveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    private Integer contador;
    private Map<Integer, List<Prenda>> armario;

    public GuardaRopa() {
        this.armario = new HashMap<>();
        this.contador = 1;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda) {
        this.armario.put(this.contador, listaDePrenda);
        this.contador++;
        return this.contador - 1;
    }

    public void mostrarPrendas() {
        this.armario.forEach((k,v)-> System.out.println("Id: " + k + " Prendas: " + v.toString()));
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        return this.armario.get(numero);
    }
}
