public class Gato extends Animal implements Vacunable, Asegurable{
    private String colorOjos;
    private boolean esterilizado;
    private int vacunasAplicadas;

    public Gato(String dueno, double edad, String nombre, double peso, String colorOjos, boolean esterilizado) {
        super(dueno, edad, nombre, peso);
        this.colorOjos = colorOjos;
        this.esterilizado = esterilizado;
    }

    //getter
    public String getColorOjos() {return colorOjos;}
    public boolean isEsterilizado() {return esterilizado;}
    //Setter

    public void setColorOjos(String colorOjos) {this.colorOjos = colorOjos;}
    public void setEsterilizado(boolean esterilizado) {this.esterilizado = esterilizado;}

    @Override
    public double consultarCosto() {
        return 38000;
    }

    @Override
    public void registrarVacuna(String nombreVacuna) {
        System.out.println("vacuna" + nombreVacuna + "registrada para " +nombre);
        vacunasAplicadas ++;
    }
    @Override
    public int getVacunasAplicadas() {
        return vacunasAplicadas;
    }

    @Override
    public double calcularPrimaSeguro() {
        return esterilizado?120000:200000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "pol_gato :" + nombre;
    }
}
