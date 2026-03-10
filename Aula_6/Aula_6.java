public class Aula_6 {

    public static void main(String[] args) {
        Cantina cantina = new Cantina();
        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.name = "coxinha";
        salgado2.name = "esfirra";
        salgado3.name = "pastel";
        
        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostraSalgados();

    }
    
}
