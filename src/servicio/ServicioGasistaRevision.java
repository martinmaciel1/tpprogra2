package servicio;

import persona.Cliente;
import persona.Especialista;

public class ServicioGasistaRevision extends ServicioGasista {

    private double precioPorArtefacto;

    public ServicioGasistaRevision(Cliente cliente, Especialista especialista, String domicilio, int cantArtefactos, double precioPorArtefacto) {
        super(cliente, especialista, domicilio, cantArtefactos);
        this.precioPorArtefacto = precioPorArtefacto;

    }

    public double consultarPrecioPorArtefacto() {
        return precioPorArtefacto;
    }
}