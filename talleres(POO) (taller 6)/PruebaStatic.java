class EjemploIncorrecto {
    private int contador = 0; // Variable de instancia (NO estática)

    // Método estático intentando acceder a una variable de instancia
    public static void incrementar() {
        contador++; // ❌ ERROR: No se puede acceder a una variable de instancia desde un método estático
        System.out.println("Contador: " + contador);
    }
}

public class PruebaStatic {
    public static void main(String[] args) {
        EjemploIncorrecto.incrementar(); // Intento de llamar al método estático
    }
}

