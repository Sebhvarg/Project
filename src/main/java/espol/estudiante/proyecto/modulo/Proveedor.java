package espol.estudiante.proyecto.modulo;
public class Proveedor extends Datos {
    private String direccion;
    private String telefono;

    public Proveedor(String direccion, String telefono, String nombre, String codigo) {
        super(nombre, codigo);
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
}
