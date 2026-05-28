import java.util.Scanner;
import java.util.TreeSet; 
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        TreeSet <FigurinhasRepetidas> listaFigurinhas = new TreeSet<>(); 

        int opcao; 

        do{

            System.out.println("Menu: ");
            System.out.println("1. Cadastrar figurunha repetida");
            System.out.println("2. Listar minhas figurinhas repetidas");
            System.out.println("3. Cadastrar figurinhas desejadas pessoais");
            System.out.println("4. Listar figurinhas desejadas pessoais");
            System.out.println("5. Carregar figurinhas reptidas de outro usuário");
            System.out.println("6. Carregar figurinhas desejadas de outro usuário");
            System.out.println("7. Sair");

            opcao = teclado.nextInt(); 
            teclado.nextLine(); 

                switch(opcao){
                    case 1: 
                        FigurinhasRepetidas figurinha = new FigurinhasRepetidas();

                        figurinha.cadastrarFigurinhaRepetida();

                        listaFigurinhas.add(figurinha);

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
                        

                    case 3: 
                        

                    case 4:
                        

                    case 5:
                        

                    case 6:
                        

                    case 7: 


                    default:
                        System.out.println("Opção Inválida");
                        
                } 

            } while (opcao != 7); 





        teclado.close(); 
    }
}
