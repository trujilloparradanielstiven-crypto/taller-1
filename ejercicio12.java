public class ejercicio12 {
    public static void gestionarEnvio(String tipoEnvio, double saldoUsuario, double costoExtraExpress) {
        System.out.println("\n--- Ejercicio 12: Modode Envio ---");
        if (tipoEnvio.equalsIgnoreCase("Express")) {
            if (saldoUsuario >= costoExtraExpress) {
                System.out.println("Envio 'express' confirmado, Costo extra aplicado");
            } else {
                System.out.println("Saldo insuficienete para envio 'express' Sugerimos envioestandar");
            }
        } else {
            System.out.println("Hasseleccionado envio estandar. Continuamos con el proceso normal.");
        }
    }
    public static void main(String[] args) {
        gestionarEnvio("express", 50.0, 10.0);
        gestionarEnvio("express", 5.0, 0.0);
        gestionarEnvio("estandar", 0.0, 0.0);
    }
}
