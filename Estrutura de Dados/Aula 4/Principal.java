import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 
        ArrayList<Glicemia> lista = new ArrayList<>(); 

        Glicemia obj = new Glicemia(191, "11/03/2026", "8:00");
        
        lista.add( obj );

        lista.add(new Glicemia(98, "11/03/2026", "11:00"));

        int valor;
        String data, hora; 
        for(int i = 0; i < 3; i++){
            System.out.println("Valor Glicemia: ");
            valor = teclado.nextInt();
            teclado.nextLine(); 

            System.out.println("Data [dd/mm/aaaa]");
            data = teclado.nextLine();

            System.out.println("Hora [hh:mm]");
            hora = teclado.nextLine();

            lista.add(new Glicemia(valor, data, hora));
        }

        //exibir lista - alternativa 1

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).valor + " - " + lista.get(i).data + " - " + lista.get(i).hora);
        }

        /* //alternativa 2
        for(Glicemia item : lista){
            System.out.println(item.valor + " - " + item.data + " - " + item.hora);
        } */

        teclado.close();
    }
}