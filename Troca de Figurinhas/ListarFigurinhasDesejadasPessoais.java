import java.util.TreeSet;

public class ListarFigurinhasDesejadasPessoais{

    public void exibirFigurinhasDesejadasPessoais(TreeSet<FigurinhasDesejadasPessoais> listaFigurinhasDesejadasPessoais){
        System.out.println("Minhas Figurinhas repetidas: ");
        System.out.println();

        if(listaFigurinhasDesejadasPessoais.isEmpty()){  //isEmpty = esta vazio
            System.out.println("0 figurinhas desejadas cadastradas");
        } else {
            for(FigurinhasDesejadasPessoais figurinhasDesejadas : listaFigurinhasDesejadasPessoais){
                System.out.println(figurinhasDesejadas);
            }
        }
    }
}