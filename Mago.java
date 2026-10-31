public class Mago extends Criatura {
    private String hechizos;

    public Mago(String nombre, int salud, int fuerza, String hechizos) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int danio = this.fuerza + 5; // Ataque potenciado por magia
        System.out.println("✨ " + this.nombre + " (Mago) conjura el hechizo [" + this.hechizos + "] contra " + objetivo.getNombre() + " causando " + danio + " de daño.");
        objetivo.defender(danio);
    }

    @Override
    public void defender(int danio) {
        // El mago usa un escudo mágico que absorbe una cantidad fija
        int danioReducido = Math.max(0, danio - 5);
        this.salud -= danioReducido;
        if (this.salud < 0) this.salud = 0;
        System.out.println("🔮 " + this.nombre + " crea un escudo mágico. Salud restante: " + this.salud);
    }

    public String getHechizos() {
        return hechizos;
    }
}