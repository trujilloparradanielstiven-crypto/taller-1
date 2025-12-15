import java.util.Scanner;

public class ejercicio1 {

        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            System.out.println("edad del espectador");
            int edad = lector.nextInt();

            if (edad >= 13) {
                System.out.println("bienvenido");
            } else {
                System.out.println("tas muy chiquito");
            }
        }
    }

