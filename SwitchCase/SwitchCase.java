//Comparando la Sentencia If con la Sentencia Switch Case 
public class SwitchCase {
    public static void main(String[] args) {

        // ------------------------Variables----------------------

        int num1 = 10;
        int num2 = 4;
        int opcion = 4;

        // ------------------------Switch Case----------------------

        switch (opcion) {
            case -1:
                System.out.println("¡Hasta luego!");
                break;
            case 1:
                System.out.println("La suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicación es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("La división es: " + (num1 / num2));
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        // ------------------------Condición----------------------

        if (opcion == -1) {
            System.out.println("¡Hasta luego!");
        } else if (opcion == 1) {
            System.out.println("La suma es: " + (num1 + num2));
        } else if (opcion == 2) {
            System.out.println("La resta es: " + (num1 - num2));
        } else if (opcion == 3) {
            System.out.println("La multiplicación es: " + (num1 * num2));
        } else if (opcion == 4) {
            System.out.println("La división es: " + (num1 / num2));
        } else {
            System.out.println("Opción inválida");
        }

    }
}
