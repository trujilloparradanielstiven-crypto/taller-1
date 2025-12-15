import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);

        System.out.println("¿eres VIP? (true/false):");
        boolean esVIP = lector.nextBoolean();

        System.out.println("¿tienes cupon? (true/false):");
        boolean tieneCupon = lector.nextBoolean();

        if ( esVIP || tieneCupon) {
            System.out.println("se aplica descuento");
        }else {
            System.out.println("precio regular");
        }



    }
}