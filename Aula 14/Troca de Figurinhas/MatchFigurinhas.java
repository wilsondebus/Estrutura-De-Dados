import java.util.TreeSet;

public class MatchFigurinhas{

    public void matchMinhasRepetidasComDesejadasDoOutro(
            TreeSet<FigurinhasRepetidas> minhasRepetidas,
            TreeSet<FigurinhasDesejadasOutro> desejadasOutro) {

        System.out.println("Figurinhas minhas que o outro usuário deseja:");
        System.out.println();

        boolean encontrou = false;

        for (FigurinhasRepetidas minhaFigurinha : minhasRepetidas) {
            for (FigurinhasDesejadasOutro desejadaOutro : desejadasOutro) {

                if (minhaFigurinha.nomeSelecao.equalsIgnoreCase(desejadaOutro.nomeSelecao)
                        && minhaFigurinha.numeroFigurinha == desejadaOutro.numeroFigurinha) {

                    System.out.println(minhaFigurinha);
                    encontrou = true;
                }
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma figurinha sua interessa ao outro usuário.");
        }
    }

    public void matchRepetidasDoOutroComMinhasDesejadas(
            TreeSet<FigurinhasRepetidasOutro> repetidasOutro,
            TreeSet<FigurinhasDesejadasPessoais> minhasDesejadas) {

        System.out.println("Figurinhas do outro usuário que você deseja:");
        System.out.println();

        boolean encontrou = false;

        for (FigurinhasRepetidasOutro figurinhaOutro : repetidasOutro) {
            for (FigurinhasDesejadasPessoais minhaDesejada : minhasDesejadas) {

                if (figurinhaOutro.nomeSelecao.equalsIgnoreCase(minhaDesejada.nomeSelecao)
                        && figurinhaOutro.numeroFigurinha == minhaDesejada.numeroFigurinha) {

                    System.out.println(figurinhaOutro);
                    encontrou = true;
                }
            }
        }

        if (!encontrou) {
            System.out.println("O outro usuário não possui nenhuma figurinha que você deseja.");
        }
    }
}