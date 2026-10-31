public class Main {
    
    // Método para simular una batalla entre dos criaturas utilizando polimorfismo
    public static void simularBatalla(Criatura criatura1, Criatura criatura2) {
        System.out.println("\n========================================");
        System.out.println("⚔️ INICIO DE LA BATALLA: " + criatura1.getNombre() + " vs " + criatura2.getNombre());
        System.out.println("========================================");

        int turno = 1;
        while (criatura1.estaViva() && criatura2.estaViva()) {
            System.out.println("\n--- Turno " + turno + " ---");
            
            // Criatura 1 ataca a Criatura 2
            criatura1.atacar(criatura2);
            if (!criatura2.estaViva()) {
                break;
            }

            // Criatura 2 ataca a Criatura 1
            criatura2.atacar(criatura1);
            if (!criatura1.estaViva()) {
                break;
            }

            turno++;
        }

        System.out.println("\n🏆 ¡FIN DE LA BATALLA! 🏆");
        if (criatura1.estaViva()) {
            System.out.println("🎉 El ganador es: " + criatura1.getNombre() + " (" + criatura1.getClass().getSimpleName() + ")");
        } else {
            System.out.println("🎉 El ganador es: " + criatura2.getNombre() + " (" + criatura2.getClass().getSimpleName() + ")");
        }
        System.out.println("========================================\n");
    }

    public static void main(String[] args) {
        // Creación de instancias de diferentes criaturas
        Criatura dragon = new Dragon("Smaug", 120, 15, "Escamas de fuego");
        Criatura mago = new Mago("Gandalf", 90, 12, "Bola de Fuego");
        Criatura guerrero = new Guerrero("Aragorn", 100, 14, "Espada Andúril");

        // Simular batalla 1: Dragón vs Guerrero
        simularBatalla(dragon, guerrero);

        // Simular batalla 2: Mago vs Dragón
        // simularBatalla(mago, dragon);
    }
}