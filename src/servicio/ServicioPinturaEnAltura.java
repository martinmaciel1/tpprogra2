package servicio;

import persona.Cliente;
import persona.Especialista;

public class ServicioPinturaEnAltura extends ServicioPintura {
    protected double alquilerAndamios;
    protected double costoSeguro;
    protected int piso;

    public ServicioPinturaEnAltura(Cliente cliente, Especialista especialista, String domicilio, int mtrsCuadrados, double precioMtrCuadrado, int piso, double seguro, double alqAndamios) {
        super(cliente, especialista, domicilio, mtrsCuadrados, precioMtrCuadrado);
        this.alquilerAndamios = alqAndamios;
        this.costoSeguro = seguro;
        this.piso = piso;

    }
    @Override
    public double calcularCostoServicio() {
        if (piso >= 5) {
            double Andamiosaumento = alquilerAndamios + ((20 / alquilerAndamios) * 100);
            double preciofinal = (super.mtrsCuadrados * super.precioMtrCuadrado) + costoSeguro + Andamiosaumento;
            super.importeTotal = preciofinal;
            return preciofinal;
        } else {
            double preciofinal = (super.mtrsCuadrados * super.precioMtrCuadrado) + costoSeguro + alquilerAndamios;
            super.importeTotal = preciofinal;
            return preciofinal;
        }
    }
    public double consultarAlguilerAndamios() {
        return alquilerAndamios;
    }

    public double consultarCostoSeguro() {
        return costoSeguro;
    }

    public int consultarPiso() {
        return piso;
    }

    public boolean esMayorA5() {
        return piso > 5;
    }

}