import java.util.TreeSet;

public class ListarFigurinhasRepetidasOutro{

    public void exibirFigurinhasRepetidas(TreeSet<FigurinhasRepetidasOutro> listaFigurinhasRepetidasOutro){
        System.out.println("Minhas Figurinhas repetidas: ");
        System.out.println();

        if(listaFigurinhasRepetidasOutro.isEmpty()){  //isEmpty = esta vazio
            System.out.println("0 figurinhas repetidas cadastradas");
        } else {
            for(FigurinhasRepetidasOutro figurinha : listaFigurinhasRepetidasOutro){
                System.out.println(figurinha);
            }
        }
    }
}