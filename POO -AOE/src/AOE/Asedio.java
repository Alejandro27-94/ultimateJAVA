package AOE;

import javax.swing.JOptionPane;


public abstract class Asedio extends Militar {

    public Asedio(int puntosAtaque, int puntosResistencia, int lineaBatalla, String nombre, String modalidad, boolean lucha, int puntosVida) {
        super(puntosAtaque, puntosResistencia, lineaBatalla, nombre, modalidad, lucha, puntosVida);
    }

   
    
    @Override
    public void Atacar() {
        JOptionPane.showMessageDialog(null,"ASEDIO \n ¡La FUERZA MILITAR ASEDIO entra atacando con sus especialidades!!!");

    }
    
    @Override
    public void Defender() {
        JOptionPane.showMessageDialog(null,"ASEDIO \n ¡La FUERZA MILITAR ASEDIO se defiende atacando con sus especialidades!!!");

    }

}
    

