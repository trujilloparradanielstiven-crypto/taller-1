import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;
        boolean aproboExamen;

        System.out.print("Edad: ");
        edad = lector.nextInt();
        lector.nextLine(); // Limpiar el buffer

        System.out.print("¿Aprobó examen teórico? (true/false): ");
        aproboExamen = lector.nextBoolean();

        if (edad >= 16 && aproboExamen) {
            System.out.println("Licencia habilitada.");
        } else {
            System.out.println("No cumple los requisitos.");
        }
    }
}
