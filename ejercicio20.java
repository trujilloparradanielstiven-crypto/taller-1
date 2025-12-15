import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean esDeNoche;
        boolean puertaAbierta;

        System.out.print("¿Es de noche? (true/false): ");
        esDeNoche = lector.nextBoolean();
        System.out.print("¿La puerta está abierta? (true/false): ");
        puertaAbierta = lector.nextBoolean();

        if (esDeNoche && puertaAbierta) {
            System.out.println("Asegura la puerta.");
        } else {
            System.out.println("Todo en orden.");
        }
    }
}