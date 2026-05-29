import java.util.TreeSet;

public class ListarFigurinhasRepetidas{

    public void exibirFigurinhasRepetidas(TreeSet<FigurinhasRepetidas> listaFigurinhasRepetidas){
        System.out.println("Minhas Figurinhas repetidas: ");
        System.out.println();

        if(listaFigurinhasRepetidas.isEmpty()){  //isEmpty = esta vazio
            System.out.println("0 figurinhas repetidas cadastradas");
        } else {
            for(FigurinhasRepetidas figurinha : listaFigurinhasRepetidas){
                System.out.println(figurinha);
            }
        }
    }
}
