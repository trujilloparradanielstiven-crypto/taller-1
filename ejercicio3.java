import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.println("escribe la hora (0-23):");
        int hora = lector.nextInt();

        if ( hora >= 6 && hora <  12 ){
            System.out.println("buenos dias");

        }else if ( hora >= 12 && hora < 18 ){
            System.out.println("buenas tardes");
        }
        else if(hora >= 18 && hora < 23){
            System.out.println("buenas noches");
        }else{
            System.out.println("hora no valida");
        }

    }
}