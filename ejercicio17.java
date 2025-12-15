import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int porcentajeBateria;
        System.out.println("ingrese el porcentaje de la bateria");
        porcentajeBateria = lector.nextInt();
        if (porcentajeBateria < 20) {
            System.out.println("cargar");
        }else if (porcentajeBateria <= 80) {
            System.out.println("carga suficiente");

        }else {
            System.out.println("nivel alto");
        }
    }
}
