#include <iostream> 
#include <cstdlib>
#include <vector> //para a lista 
#include <ctime>

using namespace std ;

#include "biblioteca.h"

int main(){
    vector<int> listaNumeros; //declarando lista
    int quantidadedeNumeros;
    int faixaInicial = 10, faixaFinal = 50; 
    vector<int> listaResultados; 

    cout << "digite quantos numeros quer gerar: ";
    cin >> quantidadedeNumeros;  

    popularListaAletoria(listaNumeros, quantidadedeNumeros, faixaInicial, faixaFinal); 
    exibirLista(listaNumeros); 
    copiarListaSemReplicados(listaNumeros, listaResultados); 



    return 1; 
}
