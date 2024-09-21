package AOE;




// La clase es abstracta
public abstract class Civilizacion {

    String imperio;

    // Contructor de la clase SerVivo
    public Civilizacion(String nombre) {
        this.imperio = nombre;
    }

    // Método abstracto de la clase
    public abstract void crecer();
}
