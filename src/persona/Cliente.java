package persona;

public  class Cliente extends Persona{
    private int dni;
    private String domicilio;

    public Cliente(int dni, String nombre, String telefono){
        super.nombre = nombre;
        super.telefono = telefono;
        this.dni = dni;
        this.domicilio = domicilio;
    };


    public int consultarDNI() {
        return dni;
    }

    public String consultarDomicilio() {
        return domicilio;
    }
}
