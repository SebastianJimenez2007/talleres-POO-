// Clase Banco con saldo protegido (inseguro)
class Banco {
    protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}

// Subclase que accede directamente al saldo (mal uso de protected)
class Cliente extends Banco {
    public Cliente(double saldoInicial) {
        super(saldoInicial);
    }

    public void modificarSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;  // Modificación directa del saldo (inseguro)
    }
}

// Clase de prueba
    class PruebaBanco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1000);
        cliente.mostrarSaldo();
        
        // El cliente puede modificar el saldo directamente 
        cliente.modificarSaldo(5000);
        cliente.mostrarSaldo();
    }
}

