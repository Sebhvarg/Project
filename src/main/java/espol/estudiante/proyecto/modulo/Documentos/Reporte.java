package espol.estudiante.proyecto.modulo.Documentos;

public class Reporte {
    private String nombreTecnico;
    private String parrafo;
    private String fecha;
    private static final String correo ="gecarri@espol.edu.ec";

    public Reporte(String nombreTecnico, String parrafo, String fecha) {
        this.nombreTecnico = nombreTecnico;
        this.parrafo = parrafo;
        this.fecha = fecha;
    }

    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }

    public void setParrafo(String parrafo) {
        this.parrafo = parrafo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public  static String getCorreo(){
        return correo;
    }
}
