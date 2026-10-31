public class Guerrero extends Criatura {
    private String arma;

    public Guerrero(String nombre, int salud, int fuerza, String arma) {
        super(nombre, salud, fuerza);
        this.arma = arma;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int danio = this.fuerza;
        System.out.println("⚔️ " + this.nombre + " (Guerrero) ataca con su " + this.arma + " a " + objetivo.getNombre() + " causando " + danio + " de daño.");
        objetivo.defender(danio);
    }

    @Override
    public void defender(int danio) {
        // El guerrero bloquea con armadura/escudo estándar
        this.salud -= danio;
        if (this.salud < 0) this.salud = 0;
        System.out.println("🛡️ " + this.nombre + " bloquea con su armadura. Salud restante: " + this.salud);
    }

    public String getArma() {
        return arma;
    }
}