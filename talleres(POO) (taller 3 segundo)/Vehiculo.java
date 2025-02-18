
class Vehiculo {
    public void moverse() {
        System.out.println("El vehículo se está moviendo.");
    }
}
    class Bicicleta extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("La bicicleta se mueve pedaleando.");
    }
}

// Clase de prueba
    class PruebaVehiculos {
    public static void main(String[] args) {
        
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Bicicleta(); // Polimorfismo

        vehiculo.moverse();
        bicicleta.moverse();
    }
}