package servicio;

import persona.Cliente;
import persona.Especialista;

public class ServicioGasistaInstalacion extends ServicioGasista {

    protected double precioPorArtefacto;

    public ServicioGasistaInstalacion(Cliente cliente, Especialista especialista, String domicilio, int cantArtefactos, double precioPorArtefacto) {
        super(cliente, especialista, domicilio, cantArtefactos);
        this.precioPorArtefacto = precioPorArtefacto;
    }
    @Override
    public double calcularCostoServicio() {
        double preciofinal =precioPorArtefacto * super.cantArtefactos;
        super.importeTotal= preciofinal;
        return preciofinal;
    }

    public double PrecioPorArtefacto() {
        return precioPorArtefacto;
    }

}