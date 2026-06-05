import java.util.Scanner;
import java.util.TreeSet; 
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        //figurinhas repetidas pessoais
        TreeSet <FigurinhasRepetidas> listaFigurinhasRepetidas = new TreeSet<>();
        //ler o arquivo csv
        LeitorFigurinhasRepetidasCSV leitorCsv = new LeitorFigurinhasRepetidasCSV();
        leitorCsv.carregarFigurinhas(listaFigurinhasRepetidas);
        
        //figurinhas desejadas pessoais 
        TreeSet <FigurinhasDesejadasPessoais> listaFigurinhasDesejadasPessoais = new TreeSet<>();
        //ler o arquivo csv
        LeitorFigurinhasDesejadasPessoais leitorCsvFigurinhasDesejadas = new LeitorFigurinhasDesejadasPessoais();
        leitorCsvFigurinhasDesejadas.carregarFigurinhas(listaFigurinhasDesejadasPessoais);

        //figurinhas repetidas outro 
        TreeSet <FigurinhasRepetidasOutro> listaFigurinhasRepetidasOutro = new TreeSet<>();
        //ler o arquivo csv 
        LeitorFigurinhasRepetidasOutro leitorCsvFigurinhasRepetidasOutro = new LeitorFigurinhasRepetidasOutro();
        leitorCsvFigurinhasRepetidasOutro.carregarFigurinhas(listaFigurinhasRepetidasOutro);

        //figurinhas desejadas outro
        TreeSet <FigurinhasDesejadasOutro> listaFigurinhasDesejadasOutro = new TreeSet<>(); 
        //ler o arquivo csv
        LeitorFigurinhasDesejadasOutro leitorCsvFigurinhasDesejadasOutro = new LeitorFigurinhasDesejadasOutro(); 
        leitorCsvFigurinhasDesejadasOutro.carregarFigurinhas(listaFigurinhasDesejadasOutro); 


        int opcao; 

        do{

            System.out.println("Menu: ");
            System.out.println("1. Cadastrar figurunha repetida");
            System.out.println("2. Listar minhas figurinhas repetidas");
            System.out.println("3. Cadastrar figurinhas desejadas pessoais");
            System.out.println("4. Listar figurinhas desejadas pessoais");
            System.out.println("5. Carregar figurinhas repetidas de outro usuário");
            System.out.println("6. Carregar figurinhas desejadas de outro usuário");
            System.out.println("7. Sair");

            opcao = teclado.nextInt(); 
            teclado.nextLine(); 

                switch(opcao){
                    case 1: 
                        FigurinhasRepetidas figurinha = new FigurinhasRepetidas();

                        figurinha.cadastrarFigurinha();

                        listaFigurinhasRepetidas.add(figurinha);

                        try {
                            FileWriter arquivo = new FileWriter("figurinhas_repetidas_pessoais.csv", true);
                            arquivo.write(figurinha.gerarLinhaCsv() + "\n");
                            arquivo.close();

                            System.out.println("Figurinha cadastrada com sucesso!");
                        } catch (IOException e) {
                            System.out.println("Erro ao salvar no arquivo CSV.");
                        }   

                    break;

                    case 2:
                        ListarFigurinhasRepetidas listarFigurinhas = new ListarFigurinhasRepetidas();
                        listarFigurinhas.exibirFigurinhasRepetidas(listaFigurinhasRepetidas);
                        
                        break;

                    case 3:
                        FigurinhasDesejadasPessoais figurinhasDesejadas = new FigurinhasDesejadasPessoais();

                        figurinhasDesejadas.cadastrarFigurinha();

                        listaFigurinhasDesejadasPessoais.add(figurinhasDesejadas);

                        try {
                            FileWriter arquivo = new FileWriter("figurinhas_desejadas_pessoais.csv", true);
                            arquivo.write(figurinhasDesejadas.gerarLinhaCsv() + "\n");
                            arquivo.close();

                            System.out.println("Figurinha cadastrada com sucesso!");
                        } catch (IOException e) {
                            System.out.println("Erro ao salvar no arquivo CSV.");
                        }

                        break;

                    case 4:
                        ListarFigurinhasDesejadasPessoais listarFigurinhasDesejadasPessoais = new ListarFigurinhasDesejadasPessoais();
                        listarFigurinhasDesejadasPessoais.exibirFigurinhasDesejadasPessoais(listaFigurinhasDesejadasPessoais);

                        break;

                    case 5:
                        ListarFigurinhasRepetidasOutro listarFigurinhasRepetidasOutro = new ListarFigurinhasRepetidasOutro(); 
                        listarFigurinhasRepetidasOutro.exibirFigurinhasRepetidas(listaFigurinhasRepetidasOutro);

                        MatchFigurinhas matchFigurinhas1 = new MatchFigurinhas(); 
                        matchFigurinhas1.matchRepetidasDoOutroComMinhasDesejadas(listaFigurinhasRepetidasOutro, listaFigurinhasDesejadasPessoais);

                        break;

                    case 6:
                        ListarFigurinhasDesejadasOutro listarFigurinhasDesejadasOutro = new ListarFigurinhasDesejadasOutro(); 
                        listarFigurinhasDesejadasOutro.exibirFigurinhasDesejadasOutro(listaFigurinhasDesejadasOutro);

                        MatchFigurinhas matchFigurinhas2 = new MatchFigurinhas();
                        matchFigurinhas2.matchMinhasRepetidasComDesejadasDoOutro(listaFigurinhasRepetidas, listaFigurinhasDesejadasOutro);
                        
                        break; 

                    default:
                        System.out.println("Saindo...");
                        
                } 

            } while (opcao != 7);





        teclado.close(); 
    }
}
