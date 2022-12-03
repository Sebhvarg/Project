package espol.estudiante.proyecto.modulo;

import java.util.Scanner;

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
        return super.toString()+  ", direccion=" + direccion + ", telefono=" + telefono + " tipo=" + tipo;
    }
    public static void agregarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("A continuación agregue un Cliente:");
        System.out.println("Codigo:(XXXX)");
        String codigo = sc.nextLine();
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Dirección: ");
        String direccion = sc.nextLine();
        System.out.println("Telefono (09xxxxxxx): ");
        String telefono = sc.nextLine();
        System.out.println("Tipo (personal/empresarial): ");
        String tipo = sc.nextLine();
        Sistema.getClientes().add(new Cliente(codigo,nombre,direccion,telefono,tipo));
    }

    

   
    
       
    
}
