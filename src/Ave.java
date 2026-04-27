public class Ave extends Animal{
    private String plumaje;
    private String tipoDeAve;
    private double pesoGramos;

    public Ave(String dueno, double edad, String nombre, double peso, double pesoGramos, String plumaje, String tipoDeAve) {
        super(dueno, edad, nombre, peso);
        this.pesoGramos = pesoGramos;
        this.plumaje = plumaje;
        this.tipoDeAve = tipoDeAve;
    }

    //getter
    public String getPlumaje() {return plumaje;}
    public String getTipoDeAve() {return tipoDeAve;}
    public double getPesoGramos() {return pesoGramos;}

    //setter
    public void setPlumaje(String plumaje) {this.plumaje = plumaje;}
    public void setTipoDeAve(String tipoDeAve) {this.tipoDeAve = tipoDeAve;}
    public void setPesoGramos(double pesoGramos) {this.pesoGramos = pesoGramos;}

    @Override
    public double consultarCosto() {
        return 280000+(500*pesoGramos);
    }
}
