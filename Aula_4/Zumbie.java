public class Zumbie {

    String nome;    
    int vida;
    float velocidade;


    public void rugir(){
        System.out.println("Uurrhg");
    }

    public void brigarCotroZumbi(Zumbie z2){

        System.out.println("Zumbi "+ nome + " esta brigando com " + z2.nome);
    }

    public void mostrarVida(){
         System.out.println("vida de " + nome + " eh " + vida);
    }

    public void setVida(int valuevida){
        vida = valuevida;
    }

    public void transferirVida(Zumbie z2){
        int backup = vida;
        vida = z2.vida;
        z2.setVida(backup);  
    }

}
