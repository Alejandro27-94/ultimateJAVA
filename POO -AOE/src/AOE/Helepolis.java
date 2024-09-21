package AOE;



import javax.swing.JOptionPane;

public class Helepolis extends Asedio {

    public Helepolis(int puntosAtaque, int puntosResistencia, int lineaBatalla, String nombre, String modalidad, boolean lucha, int puntosVida) {
        super(puntosAtaque, puntosResistencia, lineaBatalla, nombre, modalidad, lucha, puntosVida);
    }

    public void Elimiar() {
        JOptionPane.showMessageDialog(null, "HEOPOLIS \n ¡Su especialidad es eliminar la fuerza de infanteria, caballeria y arqueros!!!");

    }

    @Override
    public void Mejorar() {

    }

}
