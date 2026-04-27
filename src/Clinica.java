public class Clinica implements Asegurable{
    String nombreClinica;
    String direccion;
    boolean PuedeAsegurarse;

    public Clinica(String direccion, String nombreClinica, boolean puedeAsegurarse) {
        this.direccion = direccion;
        this.nombreClinica = nombreClinica;
        PuedeAsegurarse = puedeAsegurarse;
    }

    public String getDireccion() {return direccion;}
    public String getNombreClinica() {return nombreClinica;}
    public boolean isPuedeAsegurarse() {return PuedeAsegurarse;}

    public void setDireccion(String direccion) {this.direccion = direccion;}
    public void setNombreClinica(String nombreClinica) {this.nombreClinica = nombreClinica;}
    public void setPuedeAsegurarse(boolean puedeAsegurarse) {PuedeAsegurarse = puedeAsegurarse;}

    @Override
    public double calcularPrimaSeguro() {
        return 5000000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "pol_clinica :" + nombreClinica;
    }
}
