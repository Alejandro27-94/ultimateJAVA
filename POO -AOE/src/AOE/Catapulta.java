package AOE;


import javax.swing.JOptionPane;

public class Catapulta extends Asedio {

    public Catapulta(int puntosAtaque, int puntosResistencia, int lineaBatalla, String nombre, String modalidad, boolean lucha, int puntosVida) {
        super(puntosAtaque, puntosResistencia, lineaBatalla, nombre, modalidad, lucha, puntosVida);
    }

    public void Elimiar() {
        JOptionPane.showMessageDialog(null,"CATAPULTA \n ¡Su especialidad es eliminar los edificios y estructuras!!!");

    }

    @Override
    public void Mejorar() {
    }

}
