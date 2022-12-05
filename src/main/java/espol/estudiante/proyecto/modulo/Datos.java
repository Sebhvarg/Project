package espol.estudiante.proyecto.modulo;
public class Datos {
    protected String nombre;
    protected String codigo;

    public Datos(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", nombre=" + nombre ;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
}
