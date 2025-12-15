import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mensaje;

        System.out.print("Ingrese un mensaje: ");
        mensaje = scanner.nextLine();

        if (mensaje.contains("spoiler")) {
            System.out.println("Advertencia: no se permiten spoilers.");
        } else {
            System.out.println("Mensaje publicado.");
        }
    }
}
