package espol.estudiante.proyecto.modulo;

import java.util.Scanner;

public class Proveedor extends Datos {
    private String direccion;
    private String telefono;

    public Proveedor(String codigo, String nombre,String direccion, String telefono) {
        super(nombre, codigo);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString()+  ", direccion=" + direccion + ", telefono=" + telefono;
    }
    public static void agregarProveedor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("A continuación agregue un Prooveedor:");
        System.out.println("Codigo:(XXXX)");
        String codigo = sc.nextLine();
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Dirección: ");
        String direccion = sc.nextLine();
        System.out.println("Telefono (09xxxxxxx): ");
        String telefono = sc.nextLine();
        Sistema.getProoveedores().add(new Proveedor(codigo,nombre,direccion,telefono));
    }
}
