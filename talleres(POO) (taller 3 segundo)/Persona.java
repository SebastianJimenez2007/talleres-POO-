class Persona {
    public void presentarse() {
        System.out.println("Soy una persona.");
    }
}


class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Soy un estudiante.");
    }
}

class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Soy un profesor.");
    }
}


 class PruebaPolimorfismo {
    public static void main(String[] args) {
       
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        Persona[] personas = {persona, estudiante, profesor};

        for (Persona p : personas) {
            p.presentarse();
        }
    }
}