import java.util.Scanner;
import java.util.TreeSet; 

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        TreeSet <FigurinhasRepetidas> listaFigurinhas = new TreeSet<>(); 

        System.out.println("Menu: ");
        
        int opcao = teclado.nextInt();
        teclado.nextLine();  

        switch(opcao){
            case 1: 
                System.out.println("1. Cadastrar figurunha repetida");

            case 2: 
                System.out.println("2. Listar minhas figurinhas repetidas");

            case 3: 
                System.out.println("3. Cadastrar figurinhas desejadas pessoais");

            case 4:
                System.out.println("4. Listar figurinhas desejadas pessoais");

            case 5:
                System.out.println("5. Carregar figurinhas reptidas de outro usuário");

            case 6:
                System.out.println("6. Carregar figurinhas desejadas de outro usuário");

            case 7: 
                System.out.println("Sair");
                
        }



        teclado.close(); 
    }
}
