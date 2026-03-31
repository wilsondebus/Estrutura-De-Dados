import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Principal {

    public static int valorTemperatura(String temp) {
        if (temp.equals("Frio")) {
            return 1;
        } else if (temp.equals("Ameno")) {
            return 2;
        } else if (temp.equals("Quente")) {
            return 3;
        } else {
            return 0;
        }
    }

    public static int valorPrecipitacao(String prec) {
        if (prec.equals("nada")) {
            return 1;
        } else if (prec.equals("pouca")) {
            return 2;
        } else if (prec.equals("média")) {
            return 3;
        } else if (prec.equals("muita")) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        List<Clima> lista = new ArrayList<>();
        String nomeBase = "base.csv";

        try (BufferedReader leitor = new BufferedReader(
                new FileReader(nomeBase, StandardCharsets.UTF_8))) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dadosLinha = linha.split(",");

                Clima objClima = new Clima(dadosLinha[0], dadosLinha[1], dadosLinha[2], dadosLinha[3]);

                if (!lista.contains(objClima)) {
                    lista.add(objClima);
                }
            }

            for (Clima item : lista) {
                System.out.println(item);
            }

            // HashMap para agrupar os dados por mês
            Map<String, int[]> dadosMes = new HashMap<>();

            // percorre a lista e agrupa por mês
            for (Clima item : lista) {
                String mes = item.mes;

                // se o mês ainda não existe no mapa, cria ele
                if (!dadosMes.containsKey(mes)) {
                    dadosMes.put(mes, new int[] { 0, 0, 0 });
                }

                //vetor para o valor de cada mes 
                int[] valores = dadosMes.get(mes);

                // [0] soma temperatura
                // [1] soma precipitação
                // [2] quantidade de registros
                // soma os valores convertidos
                valores[0] += valorTemperatura(item.temperatura);
                valores[1] += valorPrecipitacao(item.precipitacao);
                valores[2] += 1;
            }

            String mesMaisQuente = null;
            String mesMaisChuvoso = null;
            double maiorMediaTemperatura = 0;
            double maiorMediaPrecipitacao = 0;

            //cria o laço para percorrer todos os meses 
            for (String mes : dadosMes.keySet()) { //keySet serve para armazenar os meses 
                int[] valores = dadosMes.get(mes); //recupera o vetor com os dados acumulados do mes atual 

                double mediaTemp = (double) valores[0] / valores[2]; //faz a media da temperatura de cada mes 
                double mediaPrec = (double) valores[1] / valores[2];  //faz a media da precipitação de cada mes 

                System.out.println("\nMês: " + mes);
                System.out.println("Média da temperatura: " + mediaTemp);
                System.out.println("Média da precipitação: " + mediaPrec);

                if (mediaTemp > maiorMediaTemperatura) {
                    maiorMediaTemperatura = mediaTemp;
                    mesMaisQuente = mes;
                }

                if (mediaPrec > maiorMediaPrecipitacao) {
                    maiorMediaPrecipitacao = mediaPrec;
                    mesMaisChuvoso = mes;
                }
            }

            System.out.println("\nMês que costuma fazer mais calor: " + mesMaisQuente);
            System.out.println("Mês que costuma chover mais: " + mesMaisChuvoso);

        } catch (Exception e) {
            System.err.println("Ocorreu algum erro... " + e.getMessage());
        }
    }
}