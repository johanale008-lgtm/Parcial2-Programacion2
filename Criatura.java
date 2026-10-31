/**
 * Clase abstracta base que representa a una criatura en el juego.
 */
public abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;

    // Constructor
    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    // Métodos Abstractos
    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int danio);

    // Método Concreto
    public boolean estaViva() {
        return this.salud > 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}