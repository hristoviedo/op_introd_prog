//package Recursividad;

public class Recursividad {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(fibonacci(4));
        geometrica(10,5,10000);
    }

    public static int factorial(int numero) {
        int resultado;

        if (numero == 1) {
            return 1;
        }

        resultado = factorial(numero - 1) * numero;
        return resultado;
    }

    public static int fibonacci(int numero) {

        if (numero == 1 || numero == 0) {
            return numero;
        }

        return fibonacci(numero - 1) + fibonacci(numero - 2);

    }
    
    public static void geometrica(int base, int razon, int alcance){

        System.out.print(base + " ");
        if (base*razon < alcance){
            geometrica(base*razon, razon, alcance);
        }
    }
}