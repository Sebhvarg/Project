
package espol.estudiante.proyecto.modulo.Usuarios;
import espol.estudiante.proyecto.modulo.Terceros.Cliente;
import espol.estudiante.proyecto.modulo.Documentos.Factura;
import espol.estudiante.proyecto.modulo.Documentos.Orden;
import espol.estudiante.proyecto.modulo.Servicio;

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
            }//Se recorre la lista de clientes y se verifica que cumplan con el tipo Empresarial
        }
        System.out.println("Ingrese el código de un cliente: ");
        String codigo = sc.nextLine();
        System.out.println("Ingrese el año de la orden (aaaa) : ");
        String anio = sc.nextLine();
        System.out.println("Ingrese el mes de la orden (mm): ");
        String mes = sc.nextLine();//Se piden los datos de la orden
        String mesN = "";
        switch (mes){
            case "01" -> mesN = "Enero";
            case "02" -> mesN = "Febrero";
            case "03" -> mesN = "Marzo";
            case "04" -> mesN = "Abril";
            case "05" -> mesN = "Mayo";
            case "06" -> mesN = "Junio";
            case "07" -> mesN = "Julio";
            case "08" -> mesN = "Agosto";
            case "09" -> mesN = "Septiembre";
            case "10" -> mesN = "Octubre";
            case "11" -> mesN = "Noviembre";
            case "12" -> mesN = "Diciembre";
        }
        double total = 0.0;//Generamos un switch para representar los meses

        for (Cliente c: Sistema.getClientes()) {

            if (codigo.equals(c.codigo)) {

                System.out.println("--- Factura --- \n Empresa: " +  c.getNombre()+"\n Período de facturación:"+ mesN+ " " + anio+ "\n Detalle Servicios:");
                System.out.println("#Placa      Fecha       Tipo        Servicio        Cantidad        Total");//Recorremos los datos de la factura segun el cliente
                for (Orden o: Sistema.getOrdenes()){
                    if(codigo.equals(o.getCodigoCliente()) && o.getFechaDeServicio().contains(mes+"-"+anio)){
                        System.out.println(o.getPlaca()+ "  " + o.getFechaDeServicio()+"  "+ o.getTipo() + "     "+o.getService()+"    "+ 1+ "           "+o.getPrecio());//Recorremos las ordenes escogiendo la ingresada y aplicando un contains para la fecha
                        total = total+o.getPrecio();//Actuliza el precio total
                    }

                }
                Factura f = new Factura(codigo, c.getNombre(), mesN,anio, total);
                System.out.println("Total $"+ total);
                System.out.println(f.toString());
                break;

            }

        }

    }
    public static void  reporteIngresosPorServicios(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el año de la orden (aaaa) : ");
        String anio = sc.nextLine();
        System.out.println("Ingrese el mes de la orden (mm): ");
        String mes = sc.nextLine();
        System.out.println("Servicio                         Total");
        double precio1T = 0.0;//Input y formateo del reporte

        for (Servicio s: Sistema.getServicios()) {
            for (Orden o: Sistema.getOrdenes()){
                if(o.getService().equals(s.getNombre()) && o.getFechaDeServicio().contains(mes+"-"+anio) && (o.getTipo().equals("personal")|| o.getTipo().equals("empresarial"))){//Para cada servicio tiene que cumplir con el servicio ingresado y que sea de tipo personal y empresarial para asi obviar al de tipo tecnico
                    precio1T = precio1T + o.getPrecio();//actualiza precio total
                }
            }
            System.out.println(s.getNombre() + "            "+ "$"+precio1T  );
            precio1T = 0.0;
        }
        System.out.println("--- Haga click para continuar");
        sc.nextLine();
        menuCobranza();//se ejecutara segun la opcion que elija el usuario
    }
    public static void reporteAtencionesTecnicos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el año de la orden (aaaa) : ");
        String anio = sc.nextLine();
        System.out.println("Ingrese el mes de la orden (mm): ");
        String mes = sc.nextLine();
        System.out.println("Técnico                         Total");
        double precio1T = 0.0;
        double precio2T = 0.0;//Se piden datos del tecnico por consultar
        for (Orden o: Sistema.getOrdenes())
            if(o.getCodigoCliente().equals(Sistema.getUsuarios()[1].getNombre()) && o.getFechaDeServicio().contains(mes+"-"+anio)){
                precio1T = precio1T+o.getPrecio();
            }else if(o.getCodigoCliente().equals(Sistema.getUsuarios()[3].getNombre()) && o.getFechaDeServicio().contains(mes+"-"+anio)){
                precio2T = precio2T+o.getPrecio();
            }//segun la orden primero se verifica a cada tecnico y se condicina el mes orden para asi sumarla al total de cada tecnico 
        System.out.println(Sistema.getUsuarios()[1].getNombre() + "                     "+precio1T);
        System.out.println(Sistema.getUsuarios()[3].getNombre() + "                     "+precio2T);//imprime los totales para cada tecnico
        System.out.println("--- Haga click para continuar");
        sc.nextLine();
        menuCobranza();//se ejecutara segun la opcion que elija el usuario

    }
}