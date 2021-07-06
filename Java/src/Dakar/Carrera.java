package Dakar;

import java.util.List;
import java.util.stream.Collectors;

public class Carrera {
    private double distancia;
    private double premioEnDolares;
    private String nombre;
    private int cantidadVehiculosPermitidos;
    private List<Vehiculo> listaVehiculos;

    public Carrera(double distancia, double premioEnDolares, String nombre, int cantidadVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
    }

    public void darDeAltaAuto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        if (this.listaVehiculos.size() < this.cantidadVehiculosPermitidos) {
            this.listaVehiculos.add(new Auto(velocidad, aceleracion, anguloDeGiro, patente));
        }
    }

    public void darDeAltaMoto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        if (this.listaVehiculos.size() < this.cantidadVehiculosPermitidos) {
            this.listaVehiculos.add(new Moto(velocidad, aceleracion, anguloDeGiro, patente));
        }
    }

    public void eliminarVehiculo(Vehiculo vehículo) {
        List<Vehiculo> vehiculosFiltrados = this.listaVehiculos.stream().filter(x -> x.equals(vehículo)).collect(Collectors.toList());
        if (vehiculosFiltrados.size() > 0)
            this.listaVehiculos.remove(vehiculosFiltrados.get(0));
    }
    public void eliminarVehiculoConPatente(String unaPatente) {
        List<Vehiculo> vehiculosFiltrados = this.listaVehiculos.stream().filter(x -> x.getPatente().equals(unaPatente)).collect(Collectors.toList());
        if (vehiculosFiltrados.size() > 0)
            this.listaVehiculos.remove(vehiculosFiltrados.get(0));
    }

    public Vehiculo ganador() {
        List<Vehiculo> ganadores = this.listaVehiculos.stream().sorted().collect(Collectors.toList());
                //sorted(x -> x.getAceleracion());
        this.listaVehiculos.forEach( x -> x.getPuntaje());
        return null;
    }
}
