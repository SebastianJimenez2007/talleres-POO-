package taller_2;

public class Producto{
    String nombre;
    int precio;

    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    // metodo Mostrar producto 
    public void MostrarProducto(String nombre, int precio){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println();
    }
}