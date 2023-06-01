package servicio;

import persona.Cliente;
import persona.Especialista;

public class ServicioGasistaInstalacion extends ServicioGasista {

    private double precioPorArtefacto;

    public ServicioGasistaInstalacion(Cliente cliente, Especialista especialista, String domicilio, int cantArtefactos, double precioPorArtefacto) {
        super(cliente, especialista, domicilio, cantArtefactos);
        this.precioPorArtefacto = precioPorArtefacto;
    }

    public double PrecioPorArtefacto() {
        return precioPorArtefacto;
    }

}