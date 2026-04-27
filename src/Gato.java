public class Gato extends Animal implements Vacunable{
    private String colorOjos;
    private boolean esterilizado;

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
