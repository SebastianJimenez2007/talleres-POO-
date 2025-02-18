package vehiculos;

public class Moto extends Vehiculo{
    private int cilindrada;  // Atributo específico de Moto

    public Moto(String tipo, int cilindrada) {
        super(tipo);  // Llama al constructor de la clase padre (Vehiculo)
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}