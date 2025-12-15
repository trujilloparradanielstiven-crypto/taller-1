import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double temp;

        System.out.print("Temperatura en °C: ");
        temp = lector.nextDouble();

        if (temp < 10) {
            System.out.println("Frío");
        } else if (temp <= 25) {
            System.out.println("Agradable");
        } else {
            System.out.println("Caluroso");
        }

    }
}
