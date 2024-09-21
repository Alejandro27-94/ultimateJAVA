package AOE;



import javax.swing.JOptionPane;

public class NavalMilitar extends Naval {

    public NavalMilitar(int puntosResistencia, String nombre, String modalidad, boolean lucha, int puntosVida) {
        super(puntosResistencia, nombre, modalidad, lucha, puntosVida);
    }

    public void Atacar() {
        
          JOptionPane.showMessageDialog(null,"NAVAL MILITAR \n ¡La FUERZA NAVAL MILITAR entra atacando con todo!!!");

    }

    @Override
    public void Mejorar() {

    }

}
