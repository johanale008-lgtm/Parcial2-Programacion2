public class Dragon extends Criatura {
    private String escamas;

    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int danio = this.fuerza * 2; // El dragón tiene un ataque más fuerte
        System.out.println("🐉 " + this.nombre + " (Dragón) lanza una llamarada devastadora a " + objetivo.getNombre() + " causando " + danio + " de daño.");
        objetivo.defender(danio);
    }

    @Override
    public void defender(int danio) {
        // Las escamas duras reducen el daño recibido a la mitad
        int danioReducido = danio / 2;
        this.salud -= danioReducido;
        if (this.salud < 0) this.salud = 0;
        System.out.println("🛡️ " + this.nombre + " usa sus escamas de " + this.escamas + " y mitiga el daño. Salud restante: " + this.salud);
    }

    public String getEscamas() {
        return escamas;
    }
}