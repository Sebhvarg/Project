package espol.estudiante.proyecto.modulo.Usuarios;
public class Usuario{

  protected String nombreUsr;
  protected String contrasena;
  protected String nombre;
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

  public String getNombre() {
    return nombre;
  }

  public String getNivel() {
    return nivel;
  }
}
  