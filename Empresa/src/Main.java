public class Main {
    public static void main (String[] args) {

        Gerente juan = new Gerente("Juan Perez", 50000, 25000);
        Vendedor marcos = new Vendedor("Marcos Arrollo", 50000, 15000);

        System.out.println("Sueldo con bono: " + juan.calcularSueldo());
        System.out.println("Sueldo con comisiones: " + marcos.calcularSueldo());

        juan.mostrar();
        marcos.mostrar();
    }
}