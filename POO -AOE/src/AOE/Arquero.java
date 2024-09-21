package AOE;

import javax.swing.JOptionPane;

public class Arquero extends Militar {

    public Arquero(int puntosAtaque, int puntosResistencia, int lineaBatalla, String nombre, String modalidad, boolean lucha, int puntosVida) {
        super(puntosAtaque, puntosResistencia, lineaBatalla, nombre, modalidad, lucha, puntosVida);
    }

    
    
    @Override
    public void Atacar() {
        JOptionPane.showMessageDialog(null,"ARQUERO \n ¡La FUERZA MILITAR ARQUERA entra atacando rapida y letalmente!!!");

    }
    
    @Override
    public void Defender() {
        JOptionPane.showMessageDialog(null,"ARQUERO \n ¡La FUERZA INFANTERIA MILITAR se defiende con sus espadas!!!");

    }

    @Override
    public void Mejorar() {
        }

}
