package AOE;



public abstract class Naval extends Unidad {

    int puntosResistencia;

    public Naval(int puntosResistencia, String nombre, String modalidad, boolean lucha, int puntosVida) {
        super(nombre, modalidad, lucha, puntosVida);
        this.puntosResistencia = puntosResistencia;
    }
    
    

}
