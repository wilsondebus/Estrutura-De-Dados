import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue; 
import java.util.Iterator; 

public class Colecoes {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("ArrayList - LISTA");
        lista.add(45);
        lista.add(15);
        lista.add(100); 
        lista.sort(null); //ordena a lista, o null serve pra não usar nenhuma variavel 
        System.out.println(lista);
        lista.remove((Integer)100); //remove o numero 100
        System.out.println(lista);
        System.out.println(lista.contains(100)); //perguntando se o numero 100 esta na lista (true/false)

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i)); //exibe pelo indice 
        }

        for(Integer i : lista){
            System.out.println(i); //exibe pelo objeto 
        }

        Iterator i = lista.iterator();
        while(i.hasNext()){
            System.out.println(i.next()); //foca no objeto que esta na copia realizada 
        }


        Stack<Integer> pilha = new Stack<>(); //mesma coisa que criar um ArrayList
        System.out.println("\nStack - PILHA");
        pilha.add(15); //quando se trabalha com pilha, é bom evitar o add
        pilha.push(30); //preferivel usar o push 
        pilha.push(100);
        pilha.push(45);
        // pilha.sort(null); //se ordenar a pilha, perde o sentido da pilha pois a função dela é empilhar os dados
        System.out.println(pilha);
        pilha.pop(); //remove quem esta no topo da pilha 
        System.out.println(pilha.contains(45)); //procurando se o 45 esta na lista 
        System.out.println(pilha);
        System.out.println("Topo eh "+pilha.peek()); //mostra quem é o topo da pilha


        Queue<Integer> fila = new LinkedList<>(); //preciso do LinkedList para implementar uma lista
        System.out.println("\nQueue - FILA");
        fila.add(15); //pode usar o offer enves do add
        fila.add(45);
        fila.add(100); 
        fila.remove(); //o primeiro a entrar é o primeiro a sair | pode utilizar poll enves de remove 
        System.out.println(fila); 
        System.out.println(fila.contains(15)); //pergunta se o 15 esta na lista
        System.out.println(fila.peek()); //mostra a cabeça da fila 

    }
}