public class EjercicioT4 {
    public static void main(String[] args) {
        /*
         * Usando un if, crear una condición que compare si la variable numeroIf es
         * positivo, negativo, o 0.
         */
        System.out.println("---------------Sentencia If--------------------");

        int numeroIf = -10;

        if (numeroIf > 0) {
            System.out.println(numeroIf + " es positivo.");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " es negativo.");
        } else {
            System.out.println(numeroIf + " es cero.");
        }

        /*
         * Crea un bucle While, este bucle tendrá que tener como condición que la
         * variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
         * bucle deberá:
         * Incrementar el valor de la variable en uno cada vez que se ejecute.
         * Mostrarlo por pantalla cada vez que se ejecute.
         */

        System.out.println("---------------Sentencia While--------------------");

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        /*
         * Para el bucle Do While, deberás crear la misma estructura que en el While,
         * pero solo se debe ejecutar una vez.
         */

        System.out.println("---------------Sentencia Do While--------------------");

        do {
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        /*
         * Para el bucle For, crea una variable numeroFor, esta variable tendrá como
         * valor 0 y su condición será que la variable sea igual o menor que 3, se irá
         * incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
         * pantalla.
         */

        System.out.println("---------------Sentencia For--------------------");

        int numeroFor = 0;

        for (; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        /*
         * Por último, para el Switch, deberás crear la variable estacion, y distintos
         * case para las cuatro estaciones del año. Dependiendo del valor de la variable
         * estacion se deberá mandar un mensaje por consola informando de la estación en
         * la que está. También habrá que poner un default para cuando el valor de la
         * variable no sea una estación.
         */

        System.out.println("---------------Sentencia Switch Case--------------------");

        String estación = "otoño";

        switch (estación) {
            case "invierno":
                System.out.println("Abrígate bien. Es " + estación);
                break;
            case "otoño":
                System.out.println("Mira las hojas caer. Es " + estación);
                break;
            case "verano":
            System.out.println("Usa protector solar. Es " + estación);
            break;
            case "primavera":
            System.out.println("Hay flores por doquier. Es " + estación);
            break;
            default:
            System.out.println(estación + " no es una estación del año");
        }
    }
}
