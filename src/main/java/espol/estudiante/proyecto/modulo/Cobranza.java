
package espol.estudiante.proyecto.modulo;
import java.util.Scanner;
public class Cobranza extends Usuario {
    public Cobranza(String nombreUsr, String contrasena, String nombre, String nivel) {
        super(nombreUsr, contrasena, nombre, nivel);
    }


    static Scanner sc = new Scanner(System.in);
    public static void menuCobranza() {
        System.out.println("---- Menú de Cobranza ----");
        int i = 0;
        System.out.println((i + 1) + " " + "Generar facturas a empresas");//opciones que tiene el usuario
        System.out.println((i + 2) + " " + "Reporte de ingresos por servicios");
        System.out.println((i + 3) + " " + "Reporte de atenciones por técnico");
        System.out.println((i + 4) + " " + "Salir");
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione una opción: ");

        byte cobra_op = sc.nextByte();
        switch (cobra_op) {
            case 1 -> generarFacturasEmpresas(); //se ejecuta el metodo segun la opcion que haya elegido el ususario
            case 2 -> reporteIngresosPorServicios();
            case 3 -> reporteAtencionesTecnicos();
            case 4 -> Sistema.inicializarSistema();
        }


    }


    public static void generarFacturasEmpresas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Clientes Empresariales --- \n Codigo - nombre");
        for (Cliente c : Sistema.getClientes() ) {
            if (c.getTipo() ==  "empresarial" ) {
                System.out.println(c.getCodigo() + " - " + c.getNombre());
            }
        }
        System.out.println("Ingrese el código de un cliente: ");
        String codigo = sc.nextLine();


        for (Cliente c: Sistema.getClientes()) {

            if (codigo.equals(c.codigo)) {

                System.out.println("--- Factura --- \n Empresa: " +  c.getNombre()+"\n Período de facturación: "+ "\n Detalle Servicios:");
                System.out.println("#Placa      Fecha       Tipo        Servicio        Cantidad        Total");
                break;

            }

        }

    }
    public static void  reporteIngresosPorServicios(){

    }
    public static void reporteAtencionesTecnicos(){

    }
}