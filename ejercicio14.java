public class ejercicio14 {
    public static void verificarBloqueo(int intentosFallidos) {
        System.out.println("\n--- Ejercicio 13: Bloqueo por Intentos ---") ;
        if (intentosFallidos >= 3) {
            System.out.println("Cuenta Bloqueada. Demaciados intebtos fallidos.");
        } else {
            System.out.println("Puedes volver a intentar. Te quedan " + (3 - intentosFallidos) + " intentos.");
        }

    }

    void main() {
        verificarBloqueo(4);
        verificarBloqueo(1);
    }
}
