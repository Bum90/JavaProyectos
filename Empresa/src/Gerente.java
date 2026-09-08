public class Gerente extends Empleado {
    protected double bono;

    public Gerente(String nombre, double sueldoBase, double bono) {
        super (nombre, sueldoBase);
        this.bono = bono;
    }

    // Esto de acá es polimorfismo en acción
    @Override
    public double calcularSueldo() {
        return sueldoBase + bono;
    }
}
