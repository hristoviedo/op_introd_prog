class Objetos {
    public static void main(String[] args) {
        Carro miCarro = new Carro();
        Carro miCarro2 = new Carro(2, 4, 4, "Blanco");
        miCarro.Saludar();
        miCarro2.MentarMadre();
        System.out.println("Número de puertas carro 1: " + miCarro.getPuertas());
        System.out.println("Número de puertas carro 2: " + miCarro2.getPuertas());
        miCarro.setPuertas(6);
        System.out.println("Número de puertas carro 1: " + miCarro.getPuertas());

    }
}

/**
 * Carro
 */
class Carro {

    private int puertas;
    private int llantas;
    private int asientos;
    private float velocidadMaxima;
    private float velocidadActual;
    private float kilometraje;
    private String placa;
    private String color;
    private String propietario;

    public Carro(int puertas, int llantas, int asientos, String color) {
        this.puertas = puertas;
        this.llantas = llantas;
        this.asientos = asientos;
        this.color = color;
    }

    public Carro() {
        puertas = 4;
        llantas = 4;
        asientos = 4;
        velocidadMaxima = 180;
        velocidadActual = 0;
        kilometraje = 0;
        placa = "ABC-12345";
        color = "negro";
        propietario = "Usuario Final";
    }

    public void Saludar() {
        System.out.println("Beep beep");
    }

    public void MentarMadre() {
        System.out.println("BEEEEEEEEEEEEEEEP");
    }

    /**
     * @return the puertas
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * @param puertas the puertas to set
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    /**
     * @return the llantas
     */
    public int getLlantas() {
        return llantas;
    }

    /**
     * @param llantas the llantas to set
     */
    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    /**
     * @return the asientos
     */
    public int getAsientos() {
        return asientos;
    }

    /**
     * @param asientos the asientos to set
     */
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    /**
     * @return the velocidadMaxima
     */
    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * @param velocidadMaxima the velocidadMaxima to set
     */
    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * @return the velocidadActual
     */
    public float getVelocidadActual() {
        return velocidadActual;
    }

    /**
     * @param velocidadActual the velocidadActual to set
     */
    public void setVelocidadActual(float velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    /**
     * @return the kilometraje
     */
    public float getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}