package MarteGroup;

import java.util.ArrayList;
import java.util.List;

public class PackFuego {
    private List<FuegoIndividual> listaFuegoIndividual;
    private List<PackFuego> listaPackFuego;

    public PackFuego() {
        this.listaFuegoIndividual = new ArrayList<>();
        this.listaPackFuego = new ArrayList<>();
    }

    public PackFuego(List<FuegoIndividual> listaFuegoIndividual, List<PackFuego> listaPackFuego) {
        this.listaFuegoIndividual = listaFuegoIndividual;
        this.listaPackFuego = listaPackFuego;
    }
}
