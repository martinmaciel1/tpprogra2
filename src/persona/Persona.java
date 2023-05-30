package persona;

public abstract class Persona {
    protected  String nombre;
    protected  String telefono;

    public String consultarTelefono(){
        return telefono;
    }

    public String consultarNombre(){
        return nombre;
    }
}
