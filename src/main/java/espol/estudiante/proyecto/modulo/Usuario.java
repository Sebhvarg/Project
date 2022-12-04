package espol.estudiante.proyecto.modulo;
public class Usuario{

  protected String nombreUsr;
  protected String contrasena;
  protected static String nombre;
  protected String nivel;
  
  public Usuario(String nombreUsr, String contrasena, String nombre, String nivel){
    this.nombreUsr = nombreUsr;
    this.contrasena = contrasena;
    this.nombre = nombre;
    this.nivel = nivel;
  }

  public String getNombreUsr() {
    return nombreUsr;
  }

  public static String getNombre() {
    return nombre;
  }

  public String getNivel() {
    return nivel;
  }
}
  