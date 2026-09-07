public class ChipSim {

    private String empresa;
    private int numero;

    public ChipSim(String empresa, int numero) {
        this.empresa = empresa;
        this.numero = numero;
    }

    public void mostrar() {
        System.out.println("\tEmpresa: " + empresa);
        System.out.println("\tNumero de cel: " + numero);
    }
}
