package AOE;



import javax.swing.JOptionPane;

public class Caballeria extends Militar {

    public Caballeria(int puntosAtaque, int puntosResistencia, int lineaBatalla, String nombre, String modalidad, boolean lucha, int puntosVida) {
        super(puntosAtaque, puntosResistencia, lineaBatalla, nombre, modalidad, lucha, puntosVida);
    }

    @Override
    public void Atacar() {
        JOptionPane.showMessageDialog(null,"CABALLERIA \n ¡La FUERZA CABALLERIA MILITAR entra atacando con sus extraordinarias espadas!!!");

    }

    @Override
    public void Defender() {
        JOptionPane.showMessageDialog(null,"CABALLERIA \n ¡La FUERZA INFANTERIA MILITAR se defiende muy bien con sus extraordinarias espadas!!!");

    }

    @Override
    public void Mejorar() {
    }

}
