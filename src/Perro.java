public class Perro extends Animal implements Vacunable{
    private String raza;
    private String color;

    public Perro(String dueno, double edad, String nombre, double peso, String color, String raza) {
        super(dueno, edad, nombre, peso);
        this.color = color;
        this.raza = raza;
    }
    //getter
    public String getColor() {return color;}
    public String getRaza() {return raza;}
    //setter
    public void setColor(String color) {this.color = color;}
    public void setRaza(String raza) {this.raza = raza;}

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
