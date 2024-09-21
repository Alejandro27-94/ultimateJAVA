package AOE;

import javax.swing.JOptionPane;

public class Aldeano extends Unidad {

    public Aldeano(String nombre, String modalidad, boolean lucha, int puntosVida) {
        super(nombre, modalidad, lucha, puntosVida);
    }

    @Override
    public void Mejorar() {
        JOptionPane.showMessageDialog(null,"ALDEANO \n El aldeano se encarga de hacer las mejoras)");

    }

    public void explotar() {
        JOptionPane.showMessageDialog(null,"ALDEANO \n El aldeano se encuentra explotando recursos(Oro,Piedra,Madera,Alimento)");

    }

    public void Almacenar() {
        JOptionPane.showMessageDialog(null,"ALDEANO \n El aldeano se encuentra almacenando recursos(Oro,Piedra,Madera,Alimento)");
    }

    public void Reparar() {
        JOptionPane.showMessageDialog(null,"ALDEANO \n El aldeano se encuentra reparando los daños ocacionados en el ultimo ataque)");
    }
}
