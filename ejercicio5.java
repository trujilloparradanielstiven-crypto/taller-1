import java.util.Scanner;

public class ejercicio5 {
    public static void main (String[] args){
        Scanner lector = new Scanner(System.in);

        System.out.println("¿Tienes membresia Premium? (true/false):");
        boolean esPremium = lector.nextBoolean();

        System.out.println("monto de la compra");
        double monto = lector.nextDouble();

        if (esPremium || monto >= 50){
            System.out.println("envio gratis.");

        }else {
            System.out.println("envio con costo.");
        }
    }
}
