package AOE;





public class main {

  
    
    public static void main(String[] args) {
        
        
        

        Recursos piedra = new Recursos(20, "PIEDRA");
        piedra.ExtPiedra();

        Recursos oro = new Recursos(20, "ORO");
        oro.ExtMineral();

        Recursos madera = new Recursos(20, "MADERA");
        madera.Talar();

        Recursos alimento = new Recursos(20, "ALIMENTO");
        alimento.Recolectar();
        alimento.Cazar();

        NavalMilitar navalMilitar = new NavalMilitar(10, "Barco Militar", "Naval", true, 50);
        navalMilitar.Mejorar();
        navalMilitar.Atacar();

        NavalPesca navalPesca = new NavalPesca(2, "Barco Pesca", "Naval", false, 30);
        navalPesca.Mejorar();
        navalPesca.Pescar();
        navalPesca.Almacenar();

        Infanteria infanteria = new Infanteria(10, 10, 1, "Soldado", "Terrestre", true, 50);
        infanteria.Mejorar();
        infanteria.Atacar();
        infanteria.Defender();

        Caballeria caballeria = new Caballeria(15, 15, 2, "Soldado/Caballo", "Terrestre", true, 50);
        caballeria.Mejorar();
        caballeria.Atacar();
        caballeria.Defender();

        Arquero arquero = new Arquero(10, 5, 3, "Arquero", "Terrestre", true, 50);
        arquero.Mejorar();
        arquero.Atacar();
        arquero.Defender();

        CatapultaLigera catapultaLigera = new CatapultaLigera(30, 30, 4, "Catapulta Ligera", "Terrestre", true, 80);
        catapultaLigera.Mejorar();
        catapultaLigera.Elimiar();
        catapultaLigera.Atacar();
        catapultaLigera.Defender();

        Catapulta catapulta = new Catapulta(30, 30, 4, "Catapulta", "Terrestre", true, 80);
        catapulta.Mejorar();
        catapulta.Elimiar();
        catapulta.Atacar();
        catapulta.Defender();

        CatapultaPesada catapultaPesada = new CatapultaPesada(30, 30, 4, "Catapulta Pesada", "Terrestre", true, 80);
        catapultaPesada.Mejorar();
        catapultaPesada.Elimiar();
        catapultaPesada.Atacar();
        catapultaPesada.Defender();

        Balista balista = new Balista(30, 30, 4, "Balista", "Terrestre", true, 80);
        balista.Mejorar();
        balista.Elimiar();
        balista.Atacar();
        balista.Defender();

        Helepolis helepolis = new Helepolis(30, 30, 4, "Helepolis", "Terrestre", true, 80);
        helepolis.Mejorar();
        helepolis.Elimiar();
        helepolis.Atacar();
        helepolis.Defender();

       
    }

    
    
}
