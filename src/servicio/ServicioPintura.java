package servicio;

import persona.Cliente;
import persona.Especialista;

public class ServicioPintura extends RegistroServicio {

    protected int mtrsCuadrados;
    protected double precioMtrCuadrado;

    public ServicioPintura(Cliente cliente, Especialista especialista, String domicilio, int mtrsCuadrados, double precioMtrCuadrado) {
        super(cliente, especialista, domicilio);
        this.mtrsCuadrados = mtrsCuadrados;
        this.precioMtrCuadrado = precioMtrCuadrado;

    }
    @Override
    public double calcularCostoServicio() {
        double preciofinal = mtrsCuadrados*precioMtrCuadrado;
        super.importeTotal= preciofinal;
        return preciofinal;
    }

    public int consultarMtrsCuadrados() {
        return mtrsCuadrados;
    }

    public double consultarPrecioMtrCuadrado() {
        return precioMtrCuadrado;
    }
}