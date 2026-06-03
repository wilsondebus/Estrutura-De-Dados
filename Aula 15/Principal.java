import java.util.ArrayList; 

public class Principal {
    public static void main(String[] args) {

        ArrayList<String> estacoes = new ArrayList<>();
        //populando estacoes 
        estacoes.add("a");
        estacoes.add("b");
        estacoes.add("c");
        estacoes.add("d");
        estacoes.add("e"); 


        //TRABALHO AQUI
            //ler o arquivo csv, chamado mapa.csv 
                //a,b 
                //b,c 
                //b,d
                //d,a
                //d,b
                //d,c
                //e,d 
            //extrair os vertices presentes no csv e adicona-los na lista de vértices (lembrar de ordenar)

        Grafo gAssimetrico = new Grafo(estacoes);
        //a,b
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("a"), gAssimetrico.pegarIndice("b")); 
        //b,c
         gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("b"), gAssimetrico.pegarIndice("c"));
        //b,d
         gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("b"), gAssimetrico.pegarIndice("d"));
        //c,e
         gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("c"), gAssimetrico.pegarIndice("e"));
        //d,a
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("d"), gAssimetrico.pegarIndice("a"));
        //d,b
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("d"), gAssimetrico.pegarIndice("b"));
        //d,c
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("e"), gAssimetrico.pegarIndice("d"));
        //e,d
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("e"), gAssimetrico.pegarIndice("d"));

        gAssimetrico.mostrarMatriz(); 
        System.out.println();
        gAssimetrico.mostrarGrafo();
    }
}
