public class Vendedor extends Empleado {
    protected double comisiones;

    public Vendedor(String nombre, double sueldoBase, double comisiones) {
        super (nombre, sueldoBase);
        this.comisiones = comisiones;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + comisiones;
    }
}
