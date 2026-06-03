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

        Grafo gAssimetrico = new Grafo(estacoes);
        //a,b
        gAssimetrico.inserirAresta(0,1); 
        //b,c
         gAssimetrico.inserirAresta(1,2);
        //b,d
         gAssimetrico.inserirAresta(1,3);
        //c,e
         gAssimetrico.inserirAresta(2,4);
        //d,a
        gAssimetrico.inserirAresta(3,0);
        //d,b
        gAssimetrico.inserirAresta(3,1);
        //d,c
        gAssimetrico.inserirAresta(3,2);
        //e,d
        gAssimetrico.inserirAresta(4,3);

        gAssimetrico.mostrarMatriz(); 
        System.out.println();
        gAssimetrico.mostrarGrafo();
    }
}
