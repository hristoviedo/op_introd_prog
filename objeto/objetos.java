// package objeto;
public class objetos {

    public static void main(String[] args) {
        Casa miCasa = new Casa();
        miCasa.SumarPuertas();
        miCasa.SumarMuebles();

    }
}

/**
 * Casa
 */
class Casa {
    // ---------------Atributos--------------------------------
    public int habitaciones = 5;
    public int puertas = 10;
    public int muebles = 8;
    
    // ----------------Métodos--------------------------------
    public void SumarPuertas() {
        this.puertas++;
        System.out.println(this.puertas);

    }

    public void SumarMuebles() {
        this.muebles++;
        System.out.println(this.muebles);

    }

    public void SumarHabitaciones() {
        this.habitaciones++;
        System.out.println(this.habitaciones);
    }
}
