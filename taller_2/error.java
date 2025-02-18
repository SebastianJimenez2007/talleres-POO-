package taller_2;

public class error {
    private int valor;

    public static void mostrarValor() {
        System.out.println(this.valor);  // Error: no se puede usar this en un contexto estático
    }

    public static void main(String[] args) {
        mostrarValor();
    }
}
