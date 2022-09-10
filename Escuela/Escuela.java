public class Escuela {
    public static void main(String[] args) {
        Separador("Creando los objetos");
        Servicio servicio = new Servicio("Ariel", "Fuentes", (byte) 31, "Nocturna", 10000);
        Separador();
        Estudiante estudiante = new Estudiante("Úrsula", "Rios", (byte) 12, "Vespertina");
        Separador();
        Docente docente = new Docente("Sebastián", "Lagos", (byte) 31, "Nocturna", 10000);
        Separador("Mostrando datos");
        servicio.DatosGenerales();
        Separador();
        estudiante.DatosGenerales();
        Separador();
        docente.DatosGenerales();
        Separador("Modificando datos");
        estudiante.setNombre("Eric");
        System.out.println(estudiante.getNombre());
        Separador();
        docente.setSalario(18000);
        System.out.println(docente.getSalario());
        Separador();
        servicio.setEdad((byte) 54);
        System.out.println(servicio.getEdad());

    }

    public static void Separador() {
        System.out.println("----------------------------------------------------------------------");
    }

    public static void Separador(String mensaje) {
        System.out.println("-------------------------" + mensaje + "-------------------------");
    }
}

interface Persona {
    void setNombre(String nombre);

    String getNombre();

    void setApellido(String apellido);

    String getApellido();

    void setEdad(byte edad);

    byte getEdad();

    void setJornada(String jornada);

    String getJornada();

    void MensajeExito();

    void MensajeError();

    void DatosGenerales();

}

interface Empleado {

    int getId();

    void setSalario(float salario);

    float getSalario();
}

class Estudiante implements Persona {
    private String nombre = "No";
    private String apellido = "Disponible";
    private byte edad = -1;
    private String jornada = "N/A";

    Estudiante() {
        MensajeError();
    }

    Estudiante(String nombre, String apellido, byte edad, String jornada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.jornada = jornada;

        MensajeExito();

    }

    @Override
    public void MensajeError() {
        System.out.println("Error: Los datos del estudiante no fueron ingresados.");
    }

    @Override
    public void MensajeExito() {
        System.out.println("Éxito: Datos del estudiante ingresados exitosamente");
    }

    @Override
    public void DatosGenerales() {
        System.out.println("Nombre Completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Jornada: " + jornada);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public byte getEdad() {
        return edad;
    }

    @Override
    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public String getJornada() {
        return nombre;
    }

    @Override
    public void setJornada(String jornada) {
        this.nombre = jornada;
    }
}

class Docente implements Persona, Empleado {
    private int id = 0;
    private String nombre = "";
    private String apellido = "";
    private byte edad = -1;
    private String jornada = "";
    private float salario = 0;

    Docente(String nombre, String apellido, byte edad, String jornada, float salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.jornada = jornada;
        this.salario = salario;

        MensajeExito();
    }

    Docente() {
        MensajeError();
    }

    @Override
    public void MensajeError() {
        System.out.println("Error: Los datos del docente no fueron ingresados.");
    }

    @Override
    public void MensajeExito() {
        System.out.println("Éxito: Datos del docente ingresados exitosamente");
    }

    @Override
    public void DatosGenerales() {
        System.out.println("Nombre Completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Jornada: " + jornada);
        System.out.println("Salario: " + salario);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public byte getEdad() {
        return edad;
    }

    @Override
    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public String getJornada() {
        return jornada;
    }

    @Override
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public float getSalario() {
        return salario;
    }

}

class Servicio implements Persona, Empleado {

    private int id = 0;
    private String nombre = "";
    private String apellido = "";
    private byte edad = 0;
    private float salario = 0;
    private String jornada = "";

    Servicio(String nombre, String apellido, byte edad, String jornada, float salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.jornada = jornada;
        this.salario = salario;

        MensajeExito();
    }

    Servicio() {
        MensajeError();
    }

    @Override
    public void MensajeError() {
        System.out.println("Error: Los datos no fueron ingresados.");
    }

    @Override
    public void MensajeExito() {
        System.out.println("Éxito: Datos del empleado de servicio ingresados exitosamente");
    }

    @Override
    public void DatosGenerales() {
        System.out.println("Nombre Completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Jornada: " + jornada);
        System.out.println("Salario: " + salario);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public String getJornada() {
        return jornada;
    }

    @Override
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public float getSalario() {
        return salario;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public byte getEdad() {
        return edad;
    }
}