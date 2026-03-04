#include <iostream> 
#include <cstdlib>
#include <vector>
#include <ctime>

using namespace std; 

/**
 * @brief metodo que poupla uma lista  com numeros inteiros aleatorios dentro de uma faixa
 * 
 * @param listaNumeros contem os numeros aleratorios gerados
 * @param quantidadedeNumeros contem quanrtos numeros se deseja inserir na lista
 * @param faixaInicial contem o numero inicial da faixa 
 * @param faixaFinal contem o numero final da faixa
 */
void popularListaAletoria(vector<int> &listaNumeros, int quantidadedeNumeros, int faixaInicial, int faixaFinal){
//o & é para poder alterar a lista em C++
    srand(time(NULL));  
    int numeroSorteado;
    for (int i = 0; i < quantidadedeNumeros; i++){
        numeroSorteado = faixaInicial + (rand() % faixaFinal);
        listaNumeros.push_back(numeroSorteado);
    }


}

/**
 * @brief metodo que exibe o conteudo de uma lista de inteiros elemento a baixo de elemento
 * 
 * @param lista contem os numeros inteiros 
 */
void exibirLista(vector<int> lista){
    for (int i = 0; i < lista.size(); i++){
        cout << lista[i] << "\n";
    }
    cout << "------------ \n";
    cout << "Total de elementos: " << lista.size() << "\n"; 
}

/**
 * @brief metodo que copia os numeros da lista origem para a lista destino, exceto os repetidos
 * 
 * @param listaOrigem contem os numeros originais da lista
 * @param listaDestino contem os numeros copiados da lista original sem ser repetidos 
 */
void copiarListaSemReplicados(vector<int> listaOrigem, vector<int> &listaDestino){

    // Remove repetidos (exemplo simples)
    for(int i = 0; i < listaOrigem.size(); i++){
        
        bool repetido = false;

        for(int j = 0; j < listaDestino.size(); j++){
            if(listaOrigem[i] == listaDestino[j]){
                repetido = true;
                break;
            }
        }

        if(!repetido){
            listaDestino.push_back(listaOrigem[i]);
        }
    }

    // Ordenação crescente
    for(int i = 0; i < listaDestino.size(); i++){
        for(int j = i + 1; j < listaDestino.size(); j++){
            if(listaDestino[i] > listaDestino[j]){
                swap(listaDestino[i], listaDestino[j]); 
            }
        }
    }

    //Exibição
    cout << "Lista sem repetidos e ordenada:\n";
    for(int i = 0; i < listaDestino.size(); i++){
        cout << listaDestino[i] << "\n";
    }
    cout << "\n";
}
    
