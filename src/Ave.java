public class Ave extends Animal implements Vacunable {
    private String plumaje;
    private String tipoDeAve;

    public Ave(String dueno, double edad, String nombre, double peso, String plumaje, String tipoDeAve) {
        super(dueno, edad, nombre, peso);
        this.plumaje = plumaje;
        this.tipoDeAve = tipoDeAve;
    }

    //getter
    public String getPlumaje() {return plumaje;}
    public String getTipoDeAve() {return tipoDeAve;}
    //setter
    public void setPlumaje(String plumaje) {this.plumaje = plumaje;}
    public void setTipoDeAve(String tipoDeAve) {this.tipoDeAve = tipoDeAve;}

    @Override
    public double consultarCosto() {
        return 0;
    }

    @Override
    public void registrarVacuna(String nombreVacuna) {

    }

    @Override
    public int getVacunasAplicadas() {
        return 0;
    }
}
