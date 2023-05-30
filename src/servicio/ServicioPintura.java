package servicio;
import persona.Cliente;
import persona.Especialista;

public class ServicioPintura extends RegistroServicio {

    private int mtrsCuadrados;
    private final double costoMtrCuadrado;

    public ServicioPintura(Cliente cliente, Especialista especialista,
                           String domicilio, int mtrsCuadrados) {
        super(cliente, especialista, domicilio);
        this.mtrsCuadrados = mtrsCuadrados;
        costoMtrCuadrado = 250;
    }

    public int consultarMtrsCuadrados() {
        return mtrsCuadrados;
    }

    public double consultarCostoMtrCuadrado() {
        return costoMtrCuadrado;
    }
}