#include<iostream> 
#include<cstdlib> 
#include<string>

using namespace std;    //biblioteca do std 


void inicializar(string vetor[]){
    for(int i = 0; i < TAMANHO; i++){
        vetor[i] = '#'; 
    }
}

int inserir(string nome, string vetor[], int total){
    if(total == TAMANHO){
        cout << ("Vetor Lotado \n");
    } else {
        for(int i = 0; i < TAMANHO; i++){
            if(vetor[i] == "#"){
                vetor[i] = nome;
                total++;
                break; 
            }
        }
    }
    return total; 
}

void exibir(string vetor[]){
    for(int i = 0; i < TAMANHO; i++){
        if(vetor[i] != "#"){
        cout << vetor[i] << "\n";
        }
    }
}

int ondeEsta(string encontrarNome, string vetor[]){
    for(int i = 0; i < TAMANHO; i++){
        if(encontrarNome == vetor[i]){
            return i;
        }
    }
    return -1;
}

