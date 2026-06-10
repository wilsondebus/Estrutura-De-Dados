import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;

public class Principal {
    public static void main(String[] args) {

        ArrayList<String> estacoes = new ArrayList<>();

        // Lista para guardar as origens e destinos lidos do arquivo
        ArrayList<String> origens = new ArrayList<>();
        ArrayList<String> destinos = new ArrayList<>();

        try {
            // Ler o arquivo CSV chamado mapa.csv
            File arquivo = new File("mapa.csv");
            Scanner leitor = new Scanner(arquivo);

            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();

                String[] dados = linha.split(",");

                String origem = dados[0].trim();
                String destino = dados[1].trim();

                // Guarda as arestas para inserir depois no grafo
                origens.add(origem);
                destinos.add(destino);

                // Extrair os vértices presentes no CSV e adicioná-los na lista
                if(!estacoes.contains(origem)){
                    estacoes.add(origem);
                }

                if(!estacoes.contains(destino)){
                    estacoes.add(destino);
                }
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo mapa.csv não encontrado.");
        }

        // Ordenar os vértices
        Collections.sort(estacoes);

        // Criar o grafo com os vértices encontrados no arquivo
        Grafo gAssimetrico = new Grafo(estacoes);

        // Inserir as arestas no grafo
        for(int i = 0; i < origens.size(); i++){
            int indiceOrigem = gAssimetrico.pegarIndice(origens.get(i));
            int indiceDestino = gAssimetrico.pegarIndice(destinos.get(i));

            gAssimetrico.inserirAresta(indiceOrigem, indiceDestino);
        }

        gAssimetrico.mostrarMatriz(); 
        System.out.println();
        gAssimetrico.mostrarGrafo();
    }
}