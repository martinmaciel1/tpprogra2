package servicio;

import persona.Cliente;
import persona.Especialista;

public class ServicioElectricista extends RegistroServicio {

    protected int cantHoras;
    protected double precioHoras;

    public ServicioElectricista(Cliente cliente, Especialista especialista, String domicilio, double precioHoras,
                                int cantHorasTrabajadas) {
        super(cliente, especialista, domicilio);
        this.precioHoras = precioHoras;
        this.cantHoras = cantHorasTrabajadas;
    }

    @Override
    public double calcularCostoServicio() {
        double preciofinal = precioHoras*cantHoras;
        super.importeTotal= preciofinal;
        return preciofinal;
    }

    public int consultarCantHoras() {
        return cantHoras;
    }

    public double consultarPrecioHoras() {
        return precioHoras;
    }
}
