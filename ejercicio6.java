import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String claveCorrecta = "1234";
        String claveIngresada;

        System.out.print("Ingresa la contraseña: ");
        claveIngresada = lector.nextLine();

        if (claveIngresada.equals(claveCorrecta)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
