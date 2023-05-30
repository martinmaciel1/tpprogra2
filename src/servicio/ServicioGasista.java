package servicio;
import persona.Cliente;
import persona.Especialista;

public class ServicioGasista extends RegistroServicio {

    private int cantArtefactos;

    public ServicioGasista(Cliente cliente, Especialista especialista, String domicilio, int cantArtefactos) {
        super(cliente, especialista, domicilio);
        this.cantArtefactos = cantArtefactos;
    }

    public int consultarCantArtefactos() {
        return cantArtefactos;
    }

}