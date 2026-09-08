public class Bateria {

    // Atributos
    private int mAh;
    private String marca;

    // Constructor
    public Bateria (int mAh, String marca) {
        this.mAh = mAh;
        this.marca = marca;
    }

    // Lo que se va a mostrar
    public void mostrar() {
        System.out.println("Cantidad de mAh: " + mAh);
        System.out.println("Nombre de la marca: " + marca);
    }
}
