package AOE;





public abstract class Unidad {

    String nombre;
    String modalidad;
    boolean lucha;
    int puntosVida;

    // Contructor de la clase SerVivo
    public Unidad(String nombre, String modalidad, boolean lucha, int puntosVida) {
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.lucha = lucha;
        this.puntosVida = puntosVida;
    }

    // Método abstracto de la clase
    public abstract void Mejorar(/*unidad*/);

}
