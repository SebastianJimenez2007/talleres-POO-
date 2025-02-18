package vehiculos;

public class Vehiculo {
        protected String tipo;
    
        public Vehiculo(String tipo) {
            this.tipo = tipo;
        }
    
        public String getTipo() {
            return tipo;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
}
