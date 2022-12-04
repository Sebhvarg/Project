package espol.estudiante.proyecto.modulo;

import java.util.Scanner;

public class Proveedor extends Datos {
    private String direccion;
    private String telefono;

    public Proveedor(String direccion, String telefono, String nombre, String codigo) {
        super(nombre, codigo);
        this.direccion = direccion;
        this.telefono = telefono;
    }
    static Scanner sc = new Scanner(System.in);
    public static void agregarProveedor(){
        System.out.println("A continuación agregue un Proveedor:");
        System.out.println("Ingrese un nombre: ");
        String nombree = sc.nextLine();
        System.out.println("Ingrese una dirección: ");
        String direccionn = sc.nextLine();
        System.out.println("Ingrese un teléfono(09xxxxxxxx): ");
        String telefonoo = sc.nextLine();
        int ind = (Sistema.getProveedores().size()-1);
        int codigo1 = Integer.parseInt(((Sistema.getProveedores()).get(ind)).codigo);
        String codigoo = String.valueOf(codigo1+1);
        Sistema.getProveedores().add(new Proveedor(codigoo,nombree, direccionn, telefonoo));       
}
}
