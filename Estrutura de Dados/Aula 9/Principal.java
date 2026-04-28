import java.util.List;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        int dimensao = 10;
        int matriz [][] = new int [dimensao][dimensao];

        Matrizes.inicializarMatrizInteiro(matriz, dimensao, dimensao);

        matriz[2][4] = 1;
        matriz[0][3] = 1; 
        matriz[1][1] = 1;
        matriz[3][5] = 1;
        matriz[8][8] = 1;
        matriz[5][7] = 1;

        Matrizes.exibirMatriz(matriz, dimensao, dimensao);

        List<Dado> matrizEspecial = new ArrayList<>();
        Matrizes.converter(matriz, dimensao, dimensao, matrizEspecial);

    }
}
