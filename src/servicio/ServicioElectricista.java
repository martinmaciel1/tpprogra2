package servicio;

import java.util.Date;

import persona.Cliente;
import persona.Especialista;
public class ServicioElectricista extends RegistroServicio {

    private int cantHoras;
    private double precioHoras;

    public ServicioElectricista(Cliente cliente, Especialista especialista, String domicilio, double precioHoras, int cantHorasTrabajadas) {
        super(cliente, especialista,domicilio);
        this.precioHoras=precioHoras;
        this.cantHoras = cantHorasTrabajadas;
    }

    public int consultarCantHoras() {
        return cantHoras;
    }

    public double consultarPrecioHoras() {
        return precioHoras;
    }
}
