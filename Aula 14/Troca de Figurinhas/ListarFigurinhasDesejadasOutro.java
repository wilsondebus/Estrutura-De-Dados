import java.util.TreeSet;

public class ListarFigurinhasDesejadasOutro{

    public void exibirFigurinhasDesejadasOutro(TreeSet<FigurinhasDesejadasOutro> listaFigurinhasDesejadasOutro){
        System.out.println("Minhas Figurinhas repetidas: ");
        System.out.println();

        if(listaFigurinhasDesejadasOutro.isEmpty()){  //isEmpty = esta vazio
            System.out.println("0 figurinhas desejadas cadastradas");
        } else {
            for(FigurinhasDesejadasOutro figurinhasDesejadas : listaFigurinhasDesejadasOutro){
                System.out.println(figurinhasDesejadas);
            }
        }
    }
}