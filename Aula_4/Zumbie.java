

public class Zumbie {

    private String name;    
    private double life;


    public void setName(String name) {
        name = this.name;
    }

    public String getName(){
        return name;
    }


     public void setLife(double life) {
        life = this.life;
    }

    public double getLife(){
        return life;
    }
    

    public void rugir(){
        System.out.println("Uurrhg");
    }

    public void brigarCotroZumbi(Zumbie z2){

        System.out.println("Zumbi "+ name + " esta brigando com " + z2.name);
    }

    public void mostrarVida(){
         System.out.println("vida de " + name + " eh " + life);
    }


    public void transferirVida(Zumbie zAlvo, double quantiade){
        setLife(life-quantiade);
      zAlvo.setLife(zAlvo.life + quantiade);  
    }


       public void trocarVida(Zumbie z2){
        double backup = life;
        life = z2.getLife();
        z2.setLife(backup);  
    }

}
