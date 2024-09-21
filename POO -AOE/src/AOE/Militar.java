package AOE;



public abstract class Militar extends Unidad {

    int puntosAtaque;
    int puntosResistencia;
    

    public Militar(int puntosAtaque, int puntosResistencia, int lineaBatalla, String nombre, String modalidad, boolean lucha, int puntosVida) {
        super(nombre, modalidad, lucha, puntosVida);
        this.puntosAtaque = puntosAtaque;
        this.puntosResistencia = puntosResistencia;
        
    }

    public abstract void Defender();

    public abstract void Atacar();
}
