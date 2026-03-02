import java.util.Random;
import java.util.Scanner;

public class Aula_3 {
    public static void main(String[] args) {
      
        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);
        
        int numGerado = aleatorio.nextInt(10);

        
        System.out.println("Numero gerado: " + numGerado);

        System.out.println(numGerado);
    }
}