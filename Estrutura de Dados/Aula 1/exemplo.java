import java.util.ArrayList;
import java.util.Scanner; 

public class exemplo {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in); 
        ArrayList<String> listaNomes = new ArrayList<>(); 

        String nome; 
        
        listaNomes.add("Guilherme"); 
        listaNomes.add( "Wilson"); 

        System.out.println(listaNomes);

        if(listaNomes.size() != 0){     //Verifica se a lista não esta nula
            System.out.println("Digite um nome: ");
            nome = teclado.nextLine(); 
            if(listaNomes.contains(nome)){
                listaNomes.remove(nome); 
            } else {
                System.out.println("Nome não localizado...");
            }

            System.out.println("Total de elementos "+listaNomes.size());
            System.out.println(listaNomes);
        }

        teclado.close(); 
    }
}