package Personas;

public class prueba {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25);

        System.out.println("Nombre: " + persona.getNombre()); // Correcto
        persona.setNombre("Carlos"); // Correcto
        System.out.println("Nombre actualizado: " + persona.getNombre()); // Correcto

        System.out.println("Edad: " + persona.edad); // Correcto
        
        persona.edad = 30; // Correcto
        System.out.println("Edad actualizada: " + persona.edad); // Correcto
    }
    
}
