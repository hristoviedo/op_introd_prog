public class EjercicioT3 {
    public static void main(String[] args) {
        coche myCoche = new coche();
        myCoche.SumarPuertas();
    }    
}

/**
 * coche
 */
class coche {

    private int puertas = 4;

    public void SumarPuertas() {
        this.puertas++;
        System.out.println("Cantidad de puertas: "+this.puertas);
    }

}