
public class EjercicioT8 {
    public static void main(String[] args) {
        /*
         * Crear clase Persona.
         * Crear variables las privadas edad, nombre y telefono de la clase Persona.
         * Crear gets y sets de cada propiedad.
         * Crear un objeto persona en el main.
         * Utiliza los gets y sets para darle valores a las propiedades edad, nombre y
         * telefono, por último muéstralas por consola.
         */

        Persona persona = new Persona();

        persona.setNombre("Andrés García");
        persona.setEdad(30);
        persona.setTelefono("(+51) 801-9584-7362");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad() + " años");
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}

/**
 * Persona
 */
class Persona {

    private String nombre;
    private int edad;
    private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}