public class Ciclos {
    public static void main(String[] args) {
        int contadorW = 0;

        while (contadorW < 10){
            System.out.println(contadorW);
            contadorW++;
        };
        System.out.println("--------------------------------");

        int contadorDW = 10;

        do{
            System.out.println(contadorDW);
            contadorDW--;
        }while(contadorDW > 5);

        System.out.println("--------------------------------");

        int contadorF = 0;

        for(;contadorF <=5; contadorF++){
            System.out.println(contadorF);
        }
    }    
}
