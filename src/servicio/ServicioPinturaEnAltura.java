package servicio;
import persona.Cliente;
import persona.Especialista;

public class ServicioPinturaEnAltura extends ServicioPintura{
    private double alquilerAndamios;
    private double costoSeguro;
    private int piso;

    public ServicioPinturaEnAltura(Cliente cliente, Especialista especialista, String domicilio, int mtrsCuadrados, double precioMtrCuadrado, int piso,double seguro,double alqAndamios) {
        super(cliente, especialista, domicilio, mtrsCuadrados, precioMtrCuadrado);
        this.alquilerAndamios = alqAndamios;
        this.costoSeguro = seguro;
        this.piso = piso;

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
    public boolean esMayorA5(){
        return piso> 5;
    }

}