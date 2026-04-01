import java.util.LinkedList;
import java.util.Queue; 
import java.util.Scanner;

public class Chamando {
    public static void main(String[] args) {
        Queue<Integer> filaNormal = new LinkedList<>();
        Queue<Integer> filaPrioritaria = new LinkedList<>();

        int contarNormal = 1;
        int contarPrioritaria = 500;
        int totalAtendimentos = 1;
        String qualFila = "";

        Scanner teclado = new Scanner(System.in);

        String opcao = ""; 

        do{
            System.out.println("\tMENU");
            System.out.println("1 - FICHA NORMAL");
            System.out.println("2 - FICHA PRIORITARIA");
            System.out.println("3 - CHAMAR FICHA");
            System.out.println("4 - MOSTRAR FILA DE ATENDIMENTO");
            System.out.println("5 - SAIR");
            System.out.print("Opcao: ");
            opcao = teclado.nextLine(); 

            switch (opcao){
                case "1": 
                    System.out.println("Gerando ficha normal.... "+contarNormal);
                    filaNormal.add(contarNormal); 
                    contarNormal++; 
                    break;
                
                case "2":
                    System.out.println("Gerando ficha prioritaria.... "+contarPrioritaria);
                    filaPrioritaria.add(contarPrioritaria);
                    contarPrioritaria++; 
                    break;

                case "3":

                    int fichaAtendida = -1;

                    //pelo numero de atendimento é prioritaria
                    if(totalAtendimentos % 3 == 0){ // a cada 3 chamadas normal chama uma prioritaria 
                        qualFila = "PRIORITARIA"; 
                    //pelo numero de atendimento é normal
                    } else { //chamar a normal 
                        qualFila = "NORMAL"; 
                    //deveria ser normal, mas esta vazia, então tenta a prioritaria
                    }
                    if(qualFila.equals("PRIORITARIA") && !filaPrioritaria.isEmpty()){ //se for a prioritaria e ela não estiver vazia
                        fichaAtendida = (int)filaPrioritaria.poll(); 
                        totalAtendimentos++;
                    } else if(qualFila.equals("NORMAL") && !filaNormal.isEmpty()){
                        fichaAtendida = (int)filaNormal.poll(); 
                        totalAtendimentos++;
                    } else if(qualFila.equals("NORMAL") && !filaNormal.isEmpty() && !filaPrioritaria.isEmpty()){
                        qualFila = "PRIORITARIA"; 
                        fichaAtendida = (int)filaPrioritaria.poll();
                        totalAtendimentos++;
                    }
                    if(fichaAtendida != -1){
                        System.out.println("Chamando ficha...."+qualFila +" : "+fichaAtendida);
                    } else {
                        System.out.println("Ninguem para ser atendido!");
                    }

                    break; 

                case "4": 
                    System.out.println("Mostrando fichas faltantes");
                    int totalNormalFaltante = filaNormal.size(); 
                    int totalPrioritariaFaltante = filaPrioritaria.size(); 

                    System.out.println("Fila Normal: "+filaNormal);
                    System.out.println("Total de fichas: "+totalNormalFaltante);
                    System.out.print("\n");
                    System.out.println("Fila Prioritaria: "+filaPrioritaria);
                    System.out.println("Total de fichas: "+totalPrioritariaFaltante);

                    break;

                case "5":
                    System.out.println("Encerrando...");
                    break;
                    
                default:
                    System.out.println("Opcao Invalida...");
                    break; 
            }


        } while(!opcao.equals("5")); 
    }
}
