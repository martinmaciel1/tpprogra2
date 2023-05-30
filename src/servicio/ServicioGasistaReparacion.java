package servicio;
import persona.Cliente;
import persona.Especialista;

public class ServicioGasistaReparacion extends ServicioGasista {

    private double precioPorArtefacto;

    public ServicioGasistaReparacion(Cliente cliente, Especialista especialista, String domicilio, int cantArtefactos, int precioPorArtefacto) {
        super(cliente, especialista, domicilio, cantArtefactos);
        this.precioPorArtefacto = precioPorArtefacto;
    }

    public double PrecioPorArtefacto() {
        return precioPorArtefacto;
    }

}