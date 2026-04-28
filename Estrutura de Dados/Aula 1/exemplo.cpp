#include<iostream> 
#include<cstdlib> 
#include<string>

#define TAMANHO 10

using namespace std;  //biblioteca do std 

#include "utiilidades.h"

int main (){
    string vetorNomes[TAMANHO]; 
    inicializar(vetorNomes);
    int totalNomesInseridos = 0;
     

    totalNomesInseridos = inserir("Davi", vetorNomes, totalNomesInseridos);
    totalNomesInseridos = inserir("Eduardo", vetorNomes, totalNomesInseridos);
    totalNomesInseridos = inserir("Gabriel", vetorNomes, totalNomesInseridos);

    if(totalNomesInseridos > 0){
        exibir(vetorNomes); 
    } else {
        cout << "Vetor de nomes esta vazia"; 
    }

    string nome;
    cout << "Digite um nome: "; 
    getline(cin, nome); 

    int posicao; 
    posicao = ondeEsta(nome, vetorNomes);

    if(posicao != -1){
        vetorNomes[posicao] = '#';
        totalNomesInseridos--; 
        cout << "Nome encontrado e apagado na posicao " << posicao << "\n";
    } else{
        cout <<"Nome nao encontrado \n"; 
    }

return 1; 
}