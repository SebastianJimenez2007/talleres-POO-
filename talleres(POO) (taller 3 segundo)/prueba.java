
class Vehiculo {
    public void moverse() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Bicicleta extends Vehiculo {
    //No es una sobrescritura válida porque cambia los parámetros
    public void moverse(String tipo) {
        System.out.println("La bicicleta se mueve de tipo: " + tipo);
    }
}

 class PruebaErrorSobrescritura {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Bicicleta();
        miVehiculo.moverse(); // Error de compilación si esperas que llame a moverse (String)
    }
}