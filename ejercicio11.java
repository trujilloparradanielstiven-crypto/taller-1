public class ejercicio11 {

        public static void intentarRegistro(int edad, int cuposDisponibles) {
            System.out.println("\n--- Ejercicio 11: Registro a Evento ---");
            if (edad >= 18 && cuposDisponibles > 0) {
                System.out.println("Registro exitoso. ¡Bienvenido al evento!");
            } else if (edad < 18) {
                System.out.println("No puedes registrarte. Debes ser mayor de 18 años.");
            } else {
                System.out.println("No puedes registrarte. Los cupos estan agotados.");

            }
        }
    }
