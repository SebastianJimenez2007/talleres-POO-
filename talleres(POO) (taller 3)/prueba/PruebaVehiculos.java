package prueba;

import vehiculos.Vehiculo;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Automóvil");
        System.out.println(vehiculo.tipo);  // Error: tipo tiene acceso protected
    }
}