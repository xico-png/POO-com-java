public class Cantina {
    String name;
    Salgado [] salgados = new Salgado[3];
    int count = 0;


    public void addSalgado(Salgado novoSalgado){
        this.salgados[count] = novoSalgado;
        count++;
    }

    public void mostraSalgados(){
        for (Salgado salgado : salgados) {
            System.out.println(salgado.name);
        }
    }
}
