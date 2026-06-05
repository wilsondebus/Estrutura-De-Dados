import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeSet;

public class LeitorFigurinhasRepetidasOutro {

    public void carregarFigurinhas(TreeSet<FigurinhasRepetidasOutro> listaFigurinhasRepetidasOutro) {
        try {
            BufferedReader leitor = new BufferedReader(
                    new FileReader("figurinhas_repetidas_outro.csv")
            );

            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(";");

                if (dados.length == 6) {
                    String nomeSelecao = dados[0];
                    int numeroFigurinha = Integer.parseInt(dados[1]);
                    String nomeJogador = dados[2];
                    String descricao = dados[3];
                    int quantidade = Integer.parseInt(dados[4]);
                    boolean rara = Boolean.parseBoolean(dados[5]);

                    FigurinhasRepetidasOutro figurinha = new FigurinhasRepetidasOutro(
                            nomeSelecao,
                            numeroFigurinha,
                            nomeJogador,
                            descricao,
                            quantidade,
                            rara
                    );

                    listaFigurinhasRepetidasOutro.add(figurinha);
                }
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo CSV ainda não existe. Cadastre uma figurinha primeiro.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo CSV.");
        }
    }
}
