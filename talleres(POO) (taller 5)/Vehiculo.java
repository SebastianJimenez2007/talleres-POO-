public class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }
    public void mostrarInformacion() {
        System.out.println("Vehículo: " + tipo + ", Marca: " + marca);
    }
}

// Clase derivada Moto
class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int cilindrada) {
        super("Moto", marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Moto: " + tipo + ", Marca: " + marca + ", Cilindrada: " + cilindrada + "cc");
    }
}

// Clase NO relacionada intentando acceder a protected
class PruebaAcceso {
    public void verificarAcceso() {
        Vehiculo v = new Vehiculo("Auto", "Toyota");

        // ERROR: No se puede acceder a miembros protected desde una clase NO relacionada
        // System.out.println(v.tipo);  
        // System.out.println(v.marca);

        v.mostrarInformacion(); // Se puede acceder a métodos públicos
    }
}

// Clase de prueba
     class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Auto", "Toyota");
        vehiculo.mostrarInformacion();

        Moto moto = new Moto("Yamaha", 600);
        moto.mostrarInformacion();

        // Intentar acceder a protected desde una clase no relacionada
        PruebaAcceso prueba = new PruebaAcceso();
        prueba.verificarAcceso();
    }
}

