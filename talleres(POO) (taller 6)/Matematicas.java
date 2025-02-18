
class Matematicas {
  
    public static double sumar(double a, double b) {
        return a + b;
    }

   
    public static double restar(double a, double b) {
        return a - b;
    }

   
    public static double multiplicar(double a, double b) {
        return a * b;
    }

   
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; 
        }
        return a / b;
    }
}

// Clase de prueba
   class PruebaMatematicas {
    public static void main(String[] args) {
        double x = 10, y = 5;

        System.out.println("Suma: " + Matematicas.sumar(x, y));
        System.out.println("Resta: " + Matematicas.restar(x, y));
        System.out.println("Multiplicación: " + Matematicas.multiplicar(x, y));
        System.out.println("División: " + Matematicas.dividir(x, y));

        // Intento de división por cero
        System.out.println("División por cero: " + Matematicas.dividir(x, 0));
    }
}
