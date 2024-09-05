package punto5.main;

import punto5.model.Persona;

public class Main {
    public static void main(String[] args) {
        // Creación del objeto utilizando el constructor por defecto
    	
        Persona persona1 = new Persona();
        persona1.mostrarDatos();

        // Creación del objeto utilizando el constructor parametrizado
        
        Persona persona2 = new Persona("12345678", "Juana", "2000-05-14", "Buenos Aires");
        persona2.mostrarDatos();
        
        // Creación del objeto utilizando el constructor que inicializa solo nombre y dni
        
        Persona persona3 = new Persona("98765432", "Jose", "2005-10-25");
        persona3.mostrarDatos();
    }
}