public class Empleado {
    protected String nombre;
    protected double sueldoBase;

    public  Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public void mostrar() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Sueldo: " + sueldoBase);
    }

    public double calcularSueldo(){
        return sueldoBase;
    }
}
