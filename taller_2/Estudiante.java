package taller_2;

public class Estudiante{
    String nombre;
    int edad;

    //Crea un constructor por defecto que llame a un constructor con dos parámetros utilizando this()
    public Estudiante(){
        this("Estudiante sin nombre", 0);
    }

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void MostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}