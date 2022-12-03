package espol.estudiante.proyecto.modulo;

public class Cliente extends Datos {
    private String tipo;
    private String direccion;
    private String telefono;

    public Cliente(String codigo, String nombre, String direccion, String telefono, String tipo) {
        super(nombre, codigo);
        this.tipo = tipo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString()+  ", direccion=" + direccion + ", telefono=" + telefono + "tipo=" + tipo;
    }
    public static void agregarCliente(){
        System.out.println("A continuación agregue un Cliente:");
    
    }

    

   
    
       
    
}
