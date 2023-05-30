package EmpresaServicio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import persona.Cliente;
import persona.Especialista;
import servicio.RegistroServicio;
import servicio.ServicioElectricista;
import servicio.ServicioPintura;

//import servicio.ServicioGasistaReparacion;
//import servicio.ServicioGasistaRevision;
//import servicio.ServicioPintura;
//import servicio.ServicioPinturaEnAltura;
public class EmpresaDeServicios {
    private HashMap<Integer, Especialista> registroEspecialistas;
    private HashMap<Integer, Cliente> registroClientes;
    private HashMap<Integer, RegistroServicio> registroServicios;

    private Set<String> registroDeServiciosDisponibles;

    public EmpresaDeServicios() {
        registroEspecialistas = new HashMap<Integer, Especialista>();
        registroClientes = new HashMap<Integer, Cliente>();
        registroServicios = new HashMap<Integer, RegistroServicio>();
        registroDeServiciosDisponibles = new HashSet<String>();
    }

    /**
     * Registra un nuevo cliente en el sistema dado su:
     * - dni,
     * - nombre y
     * - teléfono de contacto.
     * <p>
     * Si el dni ya está en el sistema se debe generar una
     * excepción.
     */
    public void registrarCliente(int dni, String nombre, String telefono) {
        Cliente nuevoCliente = new Cliente(dni, nombre, telefono);
        if (clienteYaExiste(nuevoCliente.consultarDNI())) throw new RuntimeException("el cliente ya existe");
        registroClientes.put(nuevoCliente.consultarDNI(), nuevoCliente);

    }

    private boolean clienteYaExiste(int DNI) {
        return (registroClientes.containsKey(DNI));
    }

    /**
     * Registra un nuevo especialista en el sistema dados su:
     * - nroEspecialista,
     * - nombre,
     * - teléfono y
     * - tipo De servicio en el que se especializa.
     * <p>
     * Si el nroEspecialista ya está registrado en el sistema
     * se debe generar una excepción.
     */
    public void registrarEspecialista(int nroEspecialista, String nombre, String telefono, String especialidad) {
        Especialista nuevoEspecialista = new Especialista(nroEspecialista, nombre, telefono, especialidad);
        if (especialistaYaExiste(nuevoEspecialista.consultarNumEspecialista())) {
            throw new RuntimeException("el especialista ya existe");
        }
        registroEspecialistas.put(nuevoEspecialista.consultarNumEspecialista(), nuevoEspecialista);
    }

    private boolean especialistaYaExiste(int NumEspecialista) {
        return (registroEspecialistas.containsKey(NumEspecialista));
    }

    /**
     * Se registra la prestación de un servicio de tipo Electricidad en el sistema
     * ingresando los datos necesarios para solicitar un servicio y además:
     * - precio por hora de trabajo del especialista
     * - cantidad de horas estimadas que llevará realizar el trabajo.
     * <p>
     * Se devuelve el código único del servicio a realizar.
     * <p>
     * Si el dni o el nroEspecialista no están registrados en el sistema se debe
     * generar una excepción.
     * Si el especialista no se especializa en este tipo de servicio se debe generar
     * una excepción.
     * Si el precio por hora o las horas de trabajo estimado son menores o
     * iguales a 0, se debe generar una excepción.
     */
    public int solicitarServicioElectricidad(int dni, int nroEspecialista, String direccion, double precioPorHora, int horasTrabajadas) {
        Cliente cliente = buscarCliente(dni);
        Especialista especialista = buscarEspecialista(nroEspecialista);
        if (especialista.consultarEspecialidad().equalsIgnoreCase("electricista"))
            throw new RuntimeException("el especialista no esta capacitado para este servicio, su servicio es: " + especialista.consultarEspecialidad());
        if (precioPorHora <= 0) throw new RuntimeException("el precio hora no puede ser menor o igual a 0");
        if (horasTrabajadas <= 0) throw new RuntimeException("las horas trabajadas no pueden ser menor o igual a 0");
        ServicioElectricista Servicio = new ServicioElectricista(cliente, especialista, direccion, precioPorHora, horasTrabajadas);
        return 0;
    }

    private Especialista buscarEspecialista(int nroEspecialista) {
        if (registroEspecialistas.containsKey(nroEspecialista)) {
            return registroEspecialistas.get(nroEspecialista);
        }
        throw new RuntimeException("el especialista no esta registrado");
    }

    private Cliente buscarCliente(int dni) {
        if (registroClientes.containsKey(dni)) {
            return registroClientes.get(dni);
        }
        throw new RuntimeException("el cliente no esta registrado");
    }

    /**
     * Se registra la prestación de un servicio de tipo Pintura en el sistema
     * ingresando los datos necesarios para solicitar un servicio y además:
     * - precio por pintar un metro cuadrado
     * - cantidad de metros cuadrados a pintar.
     * <p>
     * Se devuelve el código único del servicio a realizar.
     * <p>
     * Si el dni o el nroEspecialista no están registrados en el sistema se debe
     * generar una excepción.
     * Si el especialista no se especializa en este tipo de servicio se debe generar
     * una excepción.
     * Si el precio por metro cuadrado o los metros cuadrados son menores o
     * iguales a 0, se debe generar una excepción.
     * 5 de 7
     */
    public int solicitarServicioPintura(int dni, int nroEspecialista, String direccion, int metrosCuadrados, double precioPorMetroCuadrado) {
        Cliente cliente = buscarCliente(dni);
        Especialista especialista= buscarEspecialista(nroEspecialista);
        if(especialista.consultarEspecialidad().equalsIgnoreCase("pintura"))
            throw new RuntimeException("el especialista no esta capacitado para este servicio, su servicio es: " + especialista.consultarEspecialidad());
        if (metrosCuadrados <= 0)
            throw new RuntimeException("metros cuadrados no pueden ser menor o igual a 0");
        if (precioPorMetroCuadrado <= 0)
            throw new RuntimeException("metros cuadrados no pueden ser menor o igual a 0");
        ServicioPintura Servicio = new ServicioPintura(cliente,especialista,direccion,metrosCuadrados,precioPorMetroCuadrado);
        return 0;
    }

    /**
     * Se registra la prestación de un servicio de tipo PinturaEnAltura en el
     * sistema ingresando los datos necesarios para solicitar un servicio y además:
     * - precio por pintar un metro cuadrado
     * - cantidad de metros cuadrados a pintar
     * - nro de piso en el que se realizará el trabajo.
     * - costo del seguro
     * - costo del alquiler de los andamios.
     * <p>
     * Se devuelve el código único del servicio a realizar.
     * <p>
     * Si el dni o el nroEspecialista no están registrados en el sistema se debe
     * generar una excepción.
     * Si el especialista no se especializa en este tipo de servicio se debe generar
     * una excepción.
     * Si el precio por metro cuadrado o los metros cuadrados o el piso o el costo
     * del seguro o el costo del alquiler de los andamios son menores o iguales a 0,
     * se debe generar una excepción.
     */
    public int solicitarServicioPintura(int dni, int nroEspecialista, String direccion, int metrosCuadrados, double precioPorMetroCuadrado, int piso, double seguro, double alqAndamios) {

        return 0;
    }

    /**
     * Se registra la prestación de un servicio de tipo GasistaInstalacion en el
     * sistema ingresando los datos necesarios para solicitar un servicio y además:
     * - cantidad de artefactos a instalar
     * - precio por la instalación de un artefacto.
     * <p>
     * Se devuelve el código único del servicio a realizar.
     * <p>
     * Si el dni o el nroEspecialista no están registrados en el sistema se debe
     * generar una excepción.
     * Si el especialista no se especializa en este tipo de servicio se debe generar
     * una excepción.
     * Si el precio de instalación o la cantidad de artefactos a instalar son
     * menores o iguales a 0, se debe generar una excepción.
     */
    public int solicitarServicioGasistaInstalacion(int dni, int nroEspecialista, String direccion, int cantArtefactos, double precioPorArtefacto) {
        return 0;
    }

    /**
     * Se registra la prestación de un servicio de tipo GasistaRevison en el
     * sistema ingresando los datos necesarios para solicitar un servicio y además:
     * - cantidad de artefactos a revisar
     * - precio por la revisión de un artefacto.
     * <p>
     * Se devuelve el código único del servicio a realizar.
     * <p>
     * <p>
     * Si el dni o el nroEspecialista no están registrados en el sistema se debe
     * generar una excepción.
     * Si el especialista no se especializa en este tipo de servicio se debe generar
     * 6 de 7
     * una excepción.
     * Si el precio de instalación o la cantidad de artefactos a revisar son
     * menores o iguales a 0, se debe generar una excepción.
     */
    public int solicitarServicioGasistaRevision(int dni, int nroEspecialista, String direccion, int cantArtefactos, double precioPorArtefacto) {
        return 0;
    }

    /**
     * Se registra que el servicio solicitado ya fué concluido. Para esto se debe
     * ingresar el costo de los materiales utilizados para poder realizar el
     * trabajo.
     * <p>
     * Se devuelve el precio que se debe facturar al cliente.
     * Este precio se obtiene sumando el costo de los materiales con el costo del
     * servicio realizado. Cada tipo de servicio tiene su forma de calcular el
     * costo del trabajo.
     * <p>
     * Si el código de servicio no está en el sistema o el mismo ya fué finalizado,
     * se debe generar una excepción.
     * <p>
     * Se debe realizar esta operación en O(1).
     */
    public double finalizarServicio(int codServicio, double costoMateriales) {
        return 0;
    }

    /**
     * Devuelve un diccionario cuya clave es el tipo de servicio y el valor es la
     * cantidad de servicios realizados de ese tipo.
     * Si un tipo de servicio no tuvo ninguna demanda, el valor de esa entrada debe
     * ser 0.
     */
   /* public Map<String, Integer> cantidadDeServiciosRealizadosPorTipo() {
        return null;
    }*/

    /**
     * Devuelve la suma del precio facturado de todos los servicios finalizados que
     * son del tipo pasado por parámetro.
     * Si el tipo de servicio es invalido, debe generar una excepción.
     * <p>
     * Se debe realizar esta operación en O(1).
     */
    public double facturacionTotalPorTipo(String tipoServicio) {
        return 0;
    }

    /**
     * Devuelve la suma del precio facturado de todos los servicios finalizados que
     * realizó la empresa.
     */
    public double facturacionTotal() {


        return 0;
    }

    /**
     * Debe cambiar el especialista responsable del servicio.
     * Si código de Servicio o el nroEspecialista no están registrados en el sistema
     * se debe generar una excepción.
     * Si el especialista no se especializa en este tipo de servicio se debe generar
     * una excepción.
     * <p>
     * <p>
     * Se debe realizar esta operación en O(1).
     */
    public void cambiarResponsable(int codServicio, int nroEspecialista) {
    }

    /**
     * Devuelve un String con forma de listado donde cada renglón representa un
     * servicio realizado.
     * Cada renglón debe respetar el siguiente formato:
     * " + [ codServicio - GasistaInstalacion ] Dirección"
     * por ejemplo:
     * " + [ 1492 - GasistaInstalacion ] uan María Gutiérrez 1150"
     * Si el nroEspecialista no está registrado en el sistema, se debe generar una
     * excepción.
     * Si el especialista no ha realizado ningún servicio hasta el momento, se debe
     * devolver un String vacío.
     */
    public String listadoServiciosAtendidosPorEspecialista(int nroEspecialista) {
        return null;
    }

    public Map<String, Integer> cantidadDeServiciosRealizadosPorTipo() {

        return null;
    }
}
