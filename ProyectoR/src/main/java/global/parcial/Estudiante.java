package global.parcial;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String codigoParticipacion;

    public Estudiante(String nombre, String apellido, String actividad, String codigoParticipacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoParticipacion = codigoParticipacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigoParticipacion() {
        return codigoParticipacion;
    }

    public void setCodigoParticipacion(String codigoParticipacion) {
        this.codigoParticipacion = codigoParticipacion;
    }
    
    
    
    
}
