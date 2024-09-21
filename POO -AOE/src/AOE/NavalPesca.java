package AOE;



import javax.swing.JOptionPane;

public class NavalPesca extends Naval {

    public NavalPesca(int puntosResistencia, String nombre, String modalidad, boolean lucha, int puntosVida) {
        super(puntosResistencia, nombre, modalidad, lucha, puntosVida);
    }

    public void Pescar() {
        JOptionPane.showMessageDialog(null,"NAVAL PESCA \n Naval Pesca casi que no comienza a trabajar.. por fin pescando!");

    }

    public void Almacenar() {
        JOptionPane.showMessageDialog(null,"NAVAL PESCA \n El aldeano se encuentra almacenando recursos(Oro,Piedra,Madera,Alimento)");
    }

    @Override
    public void Mejorar() {
    }
}
