public class Matrizes {
/**
 * metodo de classe que inicializa com zeros a matriz
 * @param matriz matriz - matriz que inteiro que sera inicializada com zeros
 * @param qntdLinhas quantidade de linhas 
 * @param qntdColunas quantidade de colunas 
 */
    public static void inicializarMatrizInteiro(int matriz[][], int qntdLinhas, int qntdColunas){
        for (int lin = 0; lin < qntdLinhas; lin++){
            for (int col = 0; col < qntdColunas; col++){
                matriz[lin][col] = 0;
            }
        }
    }

    public static void exibirMatriz(int matriz[][], int qntdLinhas, int qntdColunas){
        for (int lin = 0; lin < qntdLinhas; lin++){
            for (int col = 0; col < qntdColunas; col++){
                System.out.print(matriz[lin][col] + "\t");
            }
            System.out.println();
        }
    }
}
