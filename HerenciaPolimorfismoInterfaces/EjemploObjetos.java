public class EjemploObjetos {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        Moto miMoto = new Moto();

        Linea("Coche sin datos");

        miCoche.MensajeMatricula();
        miCoche.MensajeVelocidadMax();
        miCoche.sonido();

        Linea("Moto sin datos");

        miMoto.MensajeMatricula();
        miMoto.MensajeVelocidadMax();
        miMoto.sonido();

        miCoche.setMatricula("AMI 1248");
        miCoche.setVelocidadMaxima((short) 185);
        miMoto.setMatricula("MYE 4955");
        miMoto.setVelocidadMaxima((short) 160);

        Linea("Coche con datos");

        miCoche.MensajeMatricula();
        miCoche.MensajeVelocidadMax();
        miCoche.sonido();

        Linea("Moto con datos");

        miMoto.MensajeMatricula();
        miMoto.MensajeVelocidadMax();
        miMoto.sonido();

    }

    public static void Linea() {
        System.out.println("-----------------------------------------------------------------");
    }

    public static void Linea(String mensaje) {
        System.out.println("-------------------------" + mensaje + "-------------------------");
    }
}

/**
 * Vehiculo
 */
abstract class Vehiculo {

    protected short velocidadMaxima = -1; //-1 indica que el dato es temporal
    protected String matricula = "No disponible";

    public void setVelocidadMaxima(short velocidad) {
        this.velocidadMaxima = velocidad;
    }

    public short getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    abstract public void sonido();

    abstract public void MensajeMatricula();

    abstract public void MensajeVelocidadMax();

}

class Coche extends Vehiculo {
    public void sonido() {
        System.out.println("Sonido de coche");
    }

    public void MensajeMatricula() {
        System.out.println("Matricula del coche: " + this.matricula);
    }

    public void MensajeVelocidadMax() {
        System.out.println("Velocidad máxima del coche: " + this.velocidadMaxima);
    }
}

final class Moto extends Vehiculo {
    public void sonido() {
        System.out.println("Sonido de moto");
    }

    public void MensajeMatricula() {
        System.out.println("Matricula del moto: " + this.matricula);
    }

    public void MensajeVelocidadMax() {
        System.out.println("Velocidad máxima del moto: " + this.velocidadMaxima);
    }
}