package servicio;
import persona.Cliente;
import persona.Especialista;

public class ServicioPinturaEnAltura extends ServicioPintura{
    private final double alquilerAndamios;
    private final double costoSeguro;
    private final int altura;

    public ServicioPinturaEnAltura(Cliente cliente, Especialista especialista, String domicilio, int mtrsCuadrados, int altura) {
        super(cliente, especialista, domicilio, mtrsCuadrados);
        alquilerAndamios = 500;
        costoSeguro = 1500;
        this.altura = altura;
    }

    public double consultarAlguilerAndamios() {
        return alquilerAndamios;
    }

    public double consultarCostoSeguro() {
        return costoSeguro;
    }

    public int consultarAltura() {
        return altura;
    }

}