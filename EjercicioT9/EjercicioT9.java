public class EjercicioT9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setNombre("Juan Pérez");
        cliente.setEdad((byte)31);
        cliente.setTelefono("(+29) 4572 2245");
        cliente.setCredito((float)100.00);

        System.out.println("---------------Cliente---------------");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad() + " años");
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: $" + cliente.getCredito());

        System.out.println("---------------Trabajador---------------");
        trabajador.setNombre("Carlos Castillo");
        trabajador.setEdad((byte)21);
        trabajador.setTelefono("(+01) 250 5500 7394");
        trabajador.setSalario((float)1000.00);

        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad() + " años");
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Crédito: $" + trabajador.getSalario());
    }
}

class Persona{
    protected String nombre;
    protected byte edad;
    protected String telefono;
}

class Cliente extends Persona {
    private float credito;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public void setEdad(byte edad){
        this.edad = edad;
    }

    public byte getEdad(){
        return this.edad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
    public void setCredito(float credito){
        this.credito = credito;
    }

    public float getCredito(){
        return this.credito;
    }

}

class Trabajador extends Persona {
    private float salario;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public void setEdad(byte edad){
        this.edad = edad;
    }

    public byte getEdad(){
        return this.edad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }

    public float getSalario(){
        return this.salario;
    }

}
