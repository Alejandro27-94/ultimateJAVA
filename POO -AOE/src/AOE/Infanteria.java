package AOE;


import javax.swing.JOptionPane;

public class Infanteria extends Militar {

    public Infanteria(int puntosAtaque, int puntosResistencia, int lineaBatalla, String nombre, String modalidad, boolean lucha, int puntosVida) {
        super(puntosAtaque, puntosResistencia, lineaBatalla, nombre, modalidad, lucha, puntosVida);
    }

    @Override
    public void Atacar() {
        JOptionPane.showMessageDialog(null,"INFANTERIA \n ¡La FUERZA INFANTERIA MILITAR entra atacando con sus extraordinarias espadas!!!");

    }

    @Override
    public void Defender() {
        JOptionPane.showMessageDialog(null,"INFANTERIA \n ¡La FUERZA INFANTERIA MILITAR se defiende muy bien con sus escudos!!!");

    }

    @Override
    public void Mejorar() {
    }

}
