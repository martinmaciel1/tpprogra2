package servicio;

import persona.Cliente;
import persona.Especialista;

public class ServicioGasistaReparacion extends ServicioGasista {

    private final double costoReparacion;

    public ServicioGasistaReparacion(Cliente cliente, Especialista especialista, String domicilio, int cantArtefactos) {
        super(cliente, especialista, domicilio, cantArtefactos);
        costoReparacion = 2000;
    }

    public double consultarCostoReparacion() {
        return costoReparacion;
    }

}