import java.util.Scanner;

public class Aula_2{
    public static void main(String[] args) {
        double NPA;


        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite a NPA:");
            NPA = scanner.nextDouble();
            if(NPA > 50.0) System.out.println("Aprovado");
            else System.out.println("Voce esta NP3");

           System.out.println("Digite a sua nota da np3"); 
              double NP3 = scanner.nextDouble();
              if((NP3 + NPA)/2 > 50.0) System.out.println("Aprovado");
              else System.out.println("Reprovado");
           

            scanner.close();
        }

    
    }
 

}

