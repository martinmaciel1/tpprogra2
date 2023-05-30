package servicio;

import persona.Cliente;
import persona.Especialista;

public class ServicioPintura extends RegistroServicio {

    private int mtrsCuadrados;
    private final double precioMtrCuadrado;

    public ServicioPintura(Cliente cliente, Especialista especialista,
                           String domicilio, int mtrsCuadrados, double precioMtrCuadrado) {
        super(cliente, especialista, domicilio);
        this.mtrsCuadrados = mtrsCuadrados;
        this.precioMtrCuadrado = precioMtrCuadrado;

    }

    public int consultarMtrsCuadrados() {
        return mtrsCuadrados;
    }

    public double consultarPrecioMtrCuadrado() {
        return precioMtrCuadrado;
    }
}