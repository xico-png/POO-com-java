public class Aula_4 {
    
    public static void main(String[] args) {
        
        Zumbie z1 = new Zumbie();
        Zumbie z2 = new Zumbie();

        z1.setLife(10);
        z2.setLife(10);

        z1.setName("cris");
        z1.setName("cris");


       


        z1.transferirVida(z2, 1);
        
        z1.mostrarVida();
        z2.mostrarVida();



    }
}
