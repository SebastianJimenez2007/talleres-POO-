
class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0; 
   
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; 
    }

   
    public static void mostrarTotalCoches() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }

    
    public void mostrarInformacion() {
        System.out.println("Coche: " + marca + " " + modelo);
    }
}


   class PruebaCoches {
    public static void main(String[] args) {
       
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Mustang");

        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
        coche3.mostrarInformacion();

        Coche.mostrarTotalCoches();
    }
}
