public class Celular {

    private String modelo;
    private Bateria bateria;
    private int nroChips;
    private ChipSim[] chips;

    public Celular(String modelo, int cantidadMAh, String marcaBateria) {
        this.modelo = modelo;
        this.bateria = new Bateria(cantidadMAh, marcaBateria);
        this.nroChips = 0;
        this.chips = new ChipSim[2];
    }

    public void mostrar() {
        System.out.println("Modelo: " + modelo);
        System.out.println();
        System.out.println("Nro Chips: " + nroChips);
        for (int i = 0; i < nroChips; i++) {
            chips[i].mostrar();
        }
    }

    public void agregarChip(ChipSim nuevoChip) {
        if (nroChips < 2) {
            chips[nroChips] = nuevoChip;
            nroChips++;
        }
    }
}
