import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean tieneLicencia, estaVigente, cumpleCategoria;

        System.out.print("¿Tiene licencia? (true/false): ");
        tieneLicencia = lector.nextBoolean();

        System.out.print("¿La licencia está vigente? (true/false): ");
        estaVigente = lector.nextBoolean();

        System.out.print("¿Cumple con la categoría requerida? (true/false): ");
        cumpleCategoria = lector.nextBoolean();

        if (!tieneLicencia || !estaVigente || !cumpleCategoria) {
            System.out.println("No puede aplicar");
        } else {
            System.out.println("Puede aplicar a la vacante");
        }
    }
}
