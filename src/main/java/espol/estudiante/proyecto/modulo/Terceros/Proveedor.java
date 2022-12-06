package espol.estudiante.proyecto.modulo.Terceros;

import espol.estudiante.proyecto.modulo.Usuarios.Sistema;

import java.util.Scanner;

public class Proveedor extends Datos {
    private String direccion;
    private String telefono;

    public Proveedor(String codigo, String nombre,String direccion, String telefono) {
        super(nombre, codigo);
        this.direccion = direccion;
        this.telefono = telefono;
    }
    static Scanner sc = new Scanner(System.in);
    public static void agregarProveedor(){
        System.out.println("A continuación agregue un Proveedor:"); //solicitud de datos al usuario
        System.out.println("Ingrese un nombre: ");
        String nombree = sc.nextLine();
        System.out.println("Ingrese una dirección: ");
        String direccionn = sc.nextLine();
        System.out.println("Ingrese un teléfono(09xxxxxxxx): ");
        String telefonoo = sc.nextLine();
        int ind = (Sistema.getProveedores().size()-1); //obtengo el indice el ultimo elemento del arraylist proveedores.
        int codigo1 = Integer.parseInt(((Sistema.getProveedores()).get(ind)).codigo); //otengo el ultimo codigo del arrayList y lo transformo en entero.
        String codigoo = String.valueOf(codigo1+1); //para poder realizar la suma y generar el nuevo codigo en base al anterior, y lo vuelvo a transformar a string.
        Sistema.getProveedores().add(new Proveedor(codigoo,nombree, direccionn, telefonoo)); //agrego el nuevo objeto cliente al arrayList proveedores.    
}

    @Override
    public String toString() {
        return super.toString()+  ", direccion=" + direccion + ", telefono=" + telefono;
    }
    
}
