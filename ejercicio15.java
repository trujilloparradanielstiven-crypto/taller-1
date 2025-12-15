public class ejercicio15 {
    public static void darRecomendacionClima(String clima) {
        System.out.println("\n---Ejercicio 14: Recomendacion por Clima ---");
        String climaNormalizado = clima.toLowerCase();

        switch (climaNormalizado) {
            case "lluvia":
                System.out.println("El clima es lluvioso. Te recomiendo llevar paraguar");
                break;
            case "soleado":
                System.out.println("Eñ cñima es soleado. No olvides tus gafas de sol");
                break;
            case "nublado":
                System.out.println("El clima esta nublado. Una chaqueta ligerapodria serutil.");
                break;
            default:
                System.out.println("Clima no reconocido. Empaca un poco de tod por si acaso");

        }
    }
}
