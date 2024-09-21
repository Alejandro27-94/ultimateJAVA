package AOE;



import javax.swing.JOptionPane;

public class Recursos extends Civilizacion {

    int cantidad;

    public Recursos(int cantidad, String nombre) {
        super(nombre);
        this.cantidad = cantidad;
    }

    public Recursos(String nombre) {
        super(nombre);
    }

   

    @Override
    public void crecer() {

    }

    public void ExtPiedra() {
        JOptionPane.showMessageDialog(null, "PIEDRA \n El aldeano extrae la piedra necesaria de la montaña");
    }

    public void ExtMineral() {
        JOptionPane.showMessageDialog(null, "ORO \n El aldeano extrae el mineral necesario de las minas");
    }

    public void Talar() {
        JOptionPane.showMessageDialog(null, "MADERA \n El aldeano tala los arboles necesarios del bosque");
    }

    public void Recolectar() {
        JOptionPane.showMessageDialog(null, "ALIMENTO \n El aldeano recolecta en bodegas el alimento de las tropas");
    }
    
    
    public void Cazar() {
        JOptionPane.showMessageDialog(null, "ALIMENTO \n El aldeano caza animales para el alimento de las tropas");
    }

}
