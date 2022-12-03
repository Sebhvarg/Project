package espol.estudiante.proyecto.modulo;
import static espol.estudiante.proyecto.modulo.Cliente.agregarCliente;
import java.util.Scanner;
public class Admin extends Usuario{
  
  public Admin(String nombreUsr, String contrasena, String nombre, String nivel){
    super(nombreUsr, contrasena, nombre, nivel);
  }
  
  Scanner sc = new Scanner(System.in);
  
  public void menuAdmin(){
    int i = 0;
    System.out.println((i+1)+" "+"Administrar Cliente");
    System.out.println((i+2)+" "+"Administrar Proveedor");
    System.out.println((i+3)+" "+"Administrar Servicios");
    System.out.println((i+4)+" "+"Salir");
    
    System.out.println("Selecione una opción: ");
    byte admin_op = sc.nextByte();
    switch(admin_op){
        case 1 -> administrarClientes();
        case 2 -> System.out.println((i+1)+" "+"Administrar Cliente");
        case 3 -> System.out.println((i+1)+" "+"Administrar Cliente");
        case 4 -> System.out.println((i+3)+" "+"Salir");
    }

}
  public void administrarClientes(){
      byte aggC = 2;
      while(aggC != 2){
          for (int i = 0; i<Sistema.getClientes().size(); i++){
          System.out.println(Sistema.getClientes().get(i).toString());
      }
      int i = 0;
        System.out.println((i+1)+" "+"Agregar Cliente");
        System.out.println((i+2)+" "+"Salir");
        aggC = sc.nextByte();
        if (aggC == 1){
            agregarCliente();
        }
      }
      
        
        
    
    
  }
}