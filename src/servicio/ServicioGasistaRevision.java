package servicio;

import persona.Cliente;
import persona.Especialista;

public class ServicioGasistaRevision extends ServicioGasista {

    protected double precioPorArtefacto;

    public ServicioGasistaRevision(Cliente cliente, Especialista especialista, String domicilio, int cantArtefactos, double precioPorArtefacto) {
        super(cliente, especialista, domicilio, cantArtefactos);
        this.precioPorArtefacto = precioPorArtefacto;

    }

    @Override  //falta aplicar descuento
    public double calcularCostoServicio() {
        if (super.cantArtefactos > 5) {
            double descuento = (precioPorArtefacto * 10) / 100;
            double preciofinal = (precioPorArtefacto * super.cantArtefactos) - descuento;
            super.importeTotal = preciofinal;
            return preciofinal;
        } else if (super.cantArtefactos > 10) {
            double descuento = (precioPorArtefacto * 15) / 100;
            double preciofinal = (precioPorArtefacto * super.cantArtefactos) - descuento;
            super.importeTotal = preciofinal;
            return preciofinal;
        } else {
            double preciofinal = precioPorArtefacto * super.cantArtefactos;
            super.importeTotal = preciofinal;
            return preciofinal;
        }
    }

    public double consultarPrecioPorArtefacto() {
        return precioPorArtefacto;
    }
}