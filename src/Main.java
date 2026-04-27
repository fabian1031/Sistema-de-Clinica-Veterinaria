//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("======Systema clinica veterinaria===========");
        Animal perro = new Perro("cristian", 8, "onix", 6, "gris", "chanda", 2);
        Animal gato = new Gato ("paola", 3, "salem", 3, "azules",false);
        Animal ave = new Ave("Ana", 2, "cris", 3, 3, "gris", "perico");

        System.out.println("===Fichas de presentacion====");
        perro.imprmirFicha();
        gato.imprmirFicha();
        ave.imprmirFicha();

        System.out.println("===vacunación===");
        Vacunable vacPerro = (Vacunable) perro;
        Vacunable vacGato  = (Vacunable) gato;

        vacPerro.registrarVacuna("rabia");
        vacGato.registrarVacuna("cancer");

        System.out.println("===Vacunas aplicadas===");
        System.out.println("perro " + perro.nombre + ": " + vacPerro.getVacunasAplicadas()+ " vacunas");
        System.out.println("Gato " + gato.nombre + ": " + vacGato.getVacunasAplicadas() + " vacunas");

        System.out.println("===Calcular segundos====");
        Clinica clin1 = new Clinica("calle falsa 132", "animalistos-LOL", true);

        Asegurable [] asegurables = {
                (Asegurable) perro,
                (Asegurable) gato,
                clin1
        };

        for (Asegurable a : asegurables){
            System.out.println("poliza : $" + a.obtenerNumeroPoliza());
            System.out.println("prima Anual $ " + a.calcularPrimaSeguro());
        }


    }
}