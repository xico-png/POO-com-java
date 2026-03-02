public class Aula_4 {
    
    public static void main(String[] args) {
        
        Zumbie z1 = new Zumbie();
        Zumbie z2 = new Zumbie();

        z1.nome = "igor";
        z1.velocidade = 2;

        z2.nome = "cris";

        z1.rugir();

        z1.brigarCotroZumbi(z2);
    }
}
