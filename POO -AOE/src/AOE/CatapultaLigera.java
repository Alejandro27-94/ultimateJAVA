package AOE;


import javax.swing.JOptionPane;

public class CatapultaLigera extends Asedio {

    public CatapultaLigera(int puntosAtaque, int puntosResistencia, int lineaBatalla, String nombre, String modalidad, boolean lucha, int puntosVida) {
        super(puntosAtaque, puntosResistencia, lineaBatalla, nombre, modalidad, lucha, puntosVida);
    }

    public void Elimiar() {
        JOptionPane.showMessageDialog(null,"CATAPULTA LIGERA \n ¡Su especialidad es eliminar los edificios y estructuras!!!");

    }

    @Override
    public void Mejorar() {
        
    }

}
