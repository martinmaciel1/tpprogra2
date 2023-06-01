package servicio;

import java.util.Date;

import persona.Cliente;
import persona.Especialista;

public abstract class RegistroServicio {

    private Cliente cliente;
    private Especialista especialista;
    private String direccion;
    private double importeTotal;

    public RegistroServicio(Cliente cliente, Especialista especialista, String domicilio) {
        this.cliente = cliente;
        this.especialista = especialista;
        this.direccion = domicilio;
    }

    public String consultarDireccion() {
        return direccion;
    }

    public boolean servicioTerminado() {
        return importeTotal != 0;
    }

    public double consultarImporteTotal() {
        return importeTotal;
    }

    public void cambiarResponsable(Especialista especialista) {
        this.especialista = especialista;
    }

    public Especialista consultarEspecialista() {
        return especialista;
    }

    public Cliente consultarCliente() {
        return cliente;
    }
}
