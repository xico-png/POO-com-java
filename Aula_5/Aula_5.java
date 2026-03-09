public class Aula_5 {
    
    public static void main(String[] args) {
        
        Motor m1 = new Motor();
        Motor m2 = new Motor();

        Kart k1 = new Kart(m1);
        Kart k2 = new Kart(m2);


        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        k1.piloto = p1;
        k2.piloto = p2;


        

    }
}
