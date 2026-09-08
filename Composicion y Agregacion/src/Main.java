public class Main {
    public static void main(String[] args) {

        Celular iphone = new Celular("Iphone12", 3000, "Apple");

        ChipSim personal = new ChipSim("Personal", 12345678);
        ChipSim movistar = new ChipSim("Movistar", 87654321);

        iphone.agregarChip(personal);
        iphone.agregarChip(movistar);

        iphone.mostrar();
    }
}