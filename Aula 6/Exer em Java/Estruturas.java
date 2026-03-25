import java.util.List; 
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Random; 

public class Estruturas{
    public static void main(String[] args) {

    //pesquisar a diferença de cada um 
    //List
    //ArrayList
    //LinkedList
    //Vector 

    ArrayList<Processo> lista = new ArrayList<>(); 

    // lista.add(new Processo(1,"abertura"));
    // lista.add(new Processo(500,"teste de clock"));
    // lista.add(new Processo(45,"fechamento de valvula"));
    // lista.add(new Processo(1, "outro processo")); 

    int id;
    String descricao; 

    Scanner teclado = new Scanner(System.in);
    Random gerador = new Random();
    Processo tmp; 

    //colocar em um metodo depois 
    //adiciona processos na lista gerando um id aleatorio até o usuario digitar SAIR 
    while(true){
        id = gerador.nextInt(500);  //gera um numero aleatorio até 500 e adiciona no id 
        System.out.print("Descricao do Processo: ");
        descricao = teclado.nextLine().toUpperCase(); //le a descricao
        if(descricao.equals("SAIR")){   //se digitar SAIR ele finaliza o laço 
            break;
        }
        tmp = new Processo(id, descricao);
        if(!lista.contains(tmp)){   //se nao estiver ainda na lista ele adiciona
            lista.add(tmp); 
        }
    }

    //colocar em um metodo depois 
    System.out.println("Quantidade de Processos: "+lista.size()); //mostrar a quantidade de processos 

    lista.sort((p1, p2) -> p1.descricao.compareTo(p2.descricao)); //ordenando, utiliza a variavel descricao como indice 

    //colocar em um metodo depois 
    for(Processo p : lista){
        System.out.println(p);  //exibir todos os conteudos da lista
    }

    //colocar em um metodo - localizarProcessos 
    //rotina para pesquisar parte da descricao na lista de processos 
    System.out.print("Digite palavra ou Expressao que deseja localizar ");
    descricao = teclado.nextLine().toUpperCase();

    for(Processo p : lista){
        if(p.descricao.contains(descricao)){        //se a descricao tiver a palavra digitada ira mostrar na tela 
            System.out.println(p);
        }
    }

    System.out.print("Digite o processo que deseja remover da lista ");
    descricao = teclado.nextLine().toUpperCase();
    //localizar para remover 
    for(int i = 0; i < lista.size(); i++){
        Processo p = lista.get(i);

        if(p.descricao.toUpperCase().contains(descricao)){         
            lista.remove(i);    //remover da lista
            break; 
        }
    }

    System.out.println("Nova Lista: ");
    for(Processo p : lista){
        System.out.println(p);
    }

    //reescrever o codigo em python 

    teclado.close(); 

    }
}