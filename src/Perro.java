public class Perro extends Animal implements Vacunable, Asegurable{
    private String raza;
    private String color;
    private int vacunasAplicadas = 0;

    public Perro(String dueno, double edad, String nombre, double peso, String color, String raza, int vacunasAplicadas) {
        super(dueno, edad, nombre, peso);
        this.color = color;
        this.raza = raza;
        this.vacunasAplicadas = vacunasAplicadas;
    }

    //getter
    public String getColor() {return color;}
    public String getRaza() {return raza;}

    //setter
    public void setColor(String color) {this.color = color;}
    public void setRaza(String raza) {this.raza = raza;}

    @Override
    public double consultarCosto() {
        return 45000+(edad*3000);
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
        return 80000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "pol_perro :" + nombre;
    }
}
