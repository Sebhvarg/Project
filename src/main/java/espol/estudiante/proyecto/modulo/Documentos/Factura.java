package espol.estudiante.proyecto.modulo.Documentos;

public class Factura {
    private String codigo;
    private String nombreEmpresa;
    private String año;
    private String mes;
    private double total;

    public Factura(String codigo, String nombreEmpresa, String mes, String año, double total) {
        this.codigo = codigo;
        this.nombreEmpresa = nombreEmpresa;
        this.año = año;
        this.mes = mes;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "codigo='" + codigo + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", año='" + año + '\'' +
                ", mes='" + mes + '\'' +
                ", total=" + total +
                '}';
    }
}
