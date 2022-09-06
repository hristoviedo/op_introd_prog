public class operaciones {

    public static void main(String[] args) {
        float numero1 = 14;
        float numero2 = 3;
        
        Suma(numero1,numero2);
        Resta(numero1,numero2);
        Producto(numero1,numero2);
        Cociente(numero1,numero2);
        Residuo(numero1,numero2);
    }

    public static void Suma(float num1, float num2) {
        float resultado = 0;
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es: "+resultado);
    }

    public static void Resta(float num1, float num2) {
        float resultado = 0;
        resultado = num1 - num2;
        System.out.println("El resultado de la resta es: "+resultado);
    }

    public static void Producto(float num1, float num2) {
        float resultado = 0;
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: "+resultado);
    }

    public static void Cociente(float num1, float num2) {
        float resultado = 0;
        resultado = num1 / num2;
        System.out.println("El resultado de la división es: "+resultado);
    }

    public static void Residuo(float num1, float num2) {
        float resultado = 0;
        resultado = num1 % num2;
        System.out.println("El residuo es: "+resultado);
    }
}