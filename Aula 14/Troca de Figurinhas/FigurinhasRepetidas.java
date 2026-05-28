import java.util.Scanner;

public class FigurinhasRepetidas implements Comparable<FigurinhasRepetidas> {

    Scanner teclado = new Scanner(System.in); 

    protected String nomeSelecao;
    protected int numeroFigurinha;
    protected String nomeJogador;
    protected String descricao;
    protected int quantidade;
    protected boolean rara; 

    public FigurinhasRepetidas() { //pois antes vou criar uma figurinha vazia antes de inserir os dados 

    }

    public FigurinhasRepetidas(String nomeSelecao, int numeroFigurinha, String nomeJogador, String descricao, int quantidade, boolean rara){
        this.nomeSelecao = nomeSelecao;
        this.numeroFigurinha = numeroFigurinha;
        this.nomeJogador = nomeJogador;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.rara = rara; 
    }

    public void cadastrarFigurinhaRepetida(){
        System.out.println("\tCadastrar Figurinha");
        System.out.println();

        System.out.print("Nome da seleção \n -> ");
        this.nomeSelecao = teclado.nextLine();

        System.out.print("Numero da figurinha \n -> ");
        this.numeroFigurinha = teclado.nextInt(); 
        teclado.nextLine();

        System.out.print("Nome do Jogador \n -> ");
        this.nomeJogador = teclado.nextLine();

        System.out.print("Descrição \n -> ");
        this.descricao = teclado.nextLine();

        System.out.print("Quantidade \n -> ");
        this.quantidade = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Rara (1.Sim / 2.Não) \n -> ");
        int opcaoRara = teclado.nextInt();

        if(opcaoRara == 1){
            this.rara = true;
        } else if (opcaoRara == 0){
            this.rara = false; 
        }

    }

    public String gerarLinhaCsv() {
        return nomeSelecao + ";" + numeroFigurinha + ";" + nomeJogador + ";" + descricao + ";" + quantidade + ";" + rara;
    }

    @Override
    public int compareTo(FigurinhasRepetidas outra) {
        return Integer.compare(this.numeroFigurinha, outra.numeroFigurinha);
    }
}