import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList; 
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        List<Aluno> listaAlunos = new ArrayList<>(); 
        String dadosAlunos = "alunos.csv"; 

        String linha;

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(dadosAlunos));

            while((linha = leitor.readLine()) != null){
                String[] dados = linha.split(",");

                String nome = dados[0];
                String curso = dados[1];
                String sexo = dados[2];
                int anoIngresso = Integer.parseInt(dados[3]);
                
                Aluno aluno = new Aluno(nome, curso, sexo, anoIngresso);

                listaAlunos.add(aluno);
            }

            listaAlunos.sort(Comparator.comparingInt(Aluno::getAnoIngresso)); //ordena a lista por ano de Ingresso 

            for (Aluno aluno : listaAlunos) { //exibe a lista 
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Curso: " + aluno.getCurso());
                System.out.println("Sexo: " + aluno.getSexo());
                System.out.println("Ano de ingresso: " + aluno.getAnoIngresso());
                System.out.println("----------------------");
            }

            System.out.println("Digite um nome que queira encontrar: ");
            String localizarNome = teclado.nextLine();

            boolean encontrado = false;

            for(int i = 0; i < listaAlunos.size(); i++){
                if(listaAlunos.get(i).getNome().equalsIgnoreCase(localizarNome)){
                    System.out.println("Nome: "+listaAlunos.get(i).getNome());
                    System.out.println("Curso: "+listaAlunos.get(i).getCurso());
                    System.out.println("Sexo: "+listaAlunos.get(i).getSexo());
                    System.out.println("Ano Ingresso: "+listaAlunos.get(i).getAnoIngresso());

                    encontrado = true;
                    break;
                    } 
                }
            if(!encontrado){
            System.out.println("Aluno não encontrado!");
            }

            int contador2020 = 0;
            int contador2021 = 0;
            int contador2022 = 0;
            int contador2023 = 0;

            for(int i = 0; i < listaAlunos.size(); i++){
                if(listaAlunos.get(i).getAnoIngresso() == 2020){
                    contador2020++; 
                } else if (listaAlunos.get(i).getAnoIngresso() == 2021){
                    contador2021++;
                } else if (listaAlunos.get(i).getAnoIngresso() == 2022){
                    contador2022++;
                } else if (listaAlunos.get(i).getAnoIngresso() == 2023){
                    contador2023++;
                }
            }

            System.out.println("Quantidade de pessoas que ingressaram por ano:");
            System.out.println("\t2020: "+contador2020);
            System.out.println("\t2021: "+contador2021);
            System.out.println("\t2022: "+contador2022);
            System.out.println("\t2023: "+contador2023);

            //conforme os ingressos dos antigos anos, vou fazer uma media para suupor quantas pessoas ingressariam em 2024
            int mediaIngressos = (contador2020 + contador2021 + contador2022 + contador2023) / 4;

            System.out.println("No ano de 2024 espera-se "+mediaIngressos+" novos alunos");

            teclado.close(); 
            leitor.close(); 

        } catch(IOException e){
            System.out.println("Erro ao ler o arquivo: "+e.getMessage());
        }
    }
}
