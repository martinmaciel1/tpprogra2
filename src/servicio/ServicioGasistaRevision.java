package servicio;
import persona.Cliente;
import persona.Especialista;

public class ServicioGasistaRevision extends ServicioGasista {

    private final double costoRevision;

    public ServicioGasistaRevision(Cliente cliente, Especialista especialista,
                                   String domicilio, int cantArtefactos) {
        super(cliente, especialista, domicilio, cantArtefactos);
        costoRevision = 750;
    }

    public double consultarCostoRevision() {
        return costoRevision;
    }
}