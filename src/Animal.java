public abstract class Animal {
    String nombre;
    double edad;
    double peso;
    String dueno;

    public Animal(String dueno, double edad, String nombre, double peso) {
        this.dueno = dueno;
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
    }
//    //getter
//    public String getDueno() {return dueno;}
//    public double getEdad() {return edad;}
//    public String getNombre() {return nombre;}
//    public double getPeso() {return peso;}
//    //setter
//    public void setDueno(String dueno) {this.dueno = dueno;}
//    public void setEdad(double edad) {this.edad = edad;}
//    public void setNombre(String nombre) {this.nombre = nombre;}
//    public void setPeso(double peso) {this.peso = peso;}
    //funciones
    public void imprmirFicha(){
        System.out.println("nombre :" + nombre + "edad: " + edad + "dueno: " + dueno + "peso : " + peso);
    }

    public abstract double consultarCosto();
}
