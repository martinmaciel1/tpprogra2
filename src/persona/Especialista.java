package persona;

public class Especialista extends Persona{
    private int numEspecialista;
    private String especialidad;

    public Especialista(String nombre, String telefono, int numEspecialista, String especialidad){
        super.nombre = nombre;
        super.telefono = telefono;
        this.numEspecialista = numEspecialista;
        this.especialidad = especialidad;
    };

    public  int consultarNumEspecialista() {
        return numEspecialista;
    }

    public  String consultarEspecialidad() {
        return especialidad;
    }
}
