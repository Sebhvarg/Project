
package espol.estudiante.proyecto.modulo;

import java.util.Scanner;

public class Cobranza extends Usuario{
    public Cobranza(String nombreUsr, String contrasena, String nombre, String nivel){
    super(nombreUsr, contrasena, nombre, nivel);
  }
    static Scanner sc = new Scanner(System.in);
    public static void menuCobranza() {
        System.out.println("---- Menú de Cobranzas ----");
        int i = 0;
        System.out.println((i + 1) + " " + "Generar facturas a empresas"); //opciones que tiene el usuario
        System.out.println((i + 2) + " " + "Reporte de ingresos por servicios");
        System.out.println((i + 3) + " " + "Reporte de atenciones por técnico");
        System.out.println((i + 4) + " " + "Salir");
        
        System.out.println("Selecione una opción: "); 
        byte cobran_op = sc.nextByte();
        switch (cobran_op) {
            case 1 -> generarFacturasEmpresas(); //se ejecuta el metodo segun la opcion que haya elegido el ususario
            case 2 -> reporteIngresoServicios() ;//llamada a los metodos estaticos.
            case 3 -> reporteAtencionTecnico();
            case 4 -> Sistema.inicializarSistema();
    }
    }
      public  static  void generarFacturasEmpresas(){
          System.out.println("---- Generar facturas a empresas ----");
          for (Cliente c: Sistema.getClientes()){

          }
      }
    public static void reporteIngresoServicios(){
        System.out.println("---- Reporte de ingresos por servicios----");
    }
    public static void reporteAtencionTecnico(){
        
    } 
}
