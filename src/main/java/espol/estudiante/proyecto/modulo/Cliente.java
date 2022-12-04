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
    static Scanner sc = new Scanner(System.in);
    public static void agregarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("A continuación agregue un Cliente:");

        System.out.println("Ingrese un nombre: "); //solicitud de datos al usuario
        String nombree = sc.nextLine();
        System.out.println("Ingrese una dirección: ");
        String direccionn = sc.nextLine();
        System.out.println("Ingrese un teléfono(09xxxxxxxx): ");
        String telefonoo = sc.nextLine();
        System.out.println("Ingrese el tipo de Cliente(personal o empresarial): ");
        String tipoCliente = sc.nextLine();
        int ind = (Sistema.getClientes().size()-1); //obtengo el indice el ultimo elemento del arraylist clientes
        int codigo1 = Integer.parseInt(((Sistema.getClientes()).get(ind)).codigo); //otengo el ultimo codigo del arrayList y lo transformo en entero.
        String codigoo = String.valueOf(codigo1+1); //para poder realizar la suma y generar el nuevo codigo en base al anterior, y lo vuelvo a transformar a string.
        Sistema.getClientes().add(new Cliente(codigoo,nombree, direccionn, telefonoo, tipoCliente)); //agrego el nuevo objeto cliente al arrayList clientes.
        
        } 

    }

