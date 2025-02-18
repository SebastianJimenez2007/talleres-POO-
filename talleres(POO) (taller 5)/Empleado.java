class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + ", Salario: $" + salario);
    }
}

class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Gerente: " + nombre + ", Salario: $" + salario + ", Departamento: " + departamento);
    }
}

    class PruebaEmpleados {
    public static void main(String[] args) {
       
        Empleado emp = new Empleado("Carlos Pérez", 2500);
        emp.mostrarInformacion(); 

        Gerente ger = new Gerente("Laura Gómez", 5000, "Ventas");
        ger.mostrarInformacion();
        Empleado emp2 = new Gerente("Miguel Torres", 6000, "Marketing");
        emp2.mostrarInformacion();  
    }
}