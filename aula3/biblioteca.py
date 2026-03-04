import random

def popular_lista_aleatoria(lista_numeros, quantidade_numeros, faixa_inicial, faixa_final):
    """método que popula uma lista com numeros interos e aleatorios dentro de uma faixa 

    Args:
        lista_numeros (int): armazena numeros inteiros e aleatorios 
        quantidade_numeros (int): total de numeros inteiros a serem inseridos
        faixa_inicial (int): numero inicial de faixa 
        faixa_final (int): numero final de faixa
    """
    for i in range(quantidade_numeros):
        lista_numeros.append(random.randint(faixa_inicial, faixa_final))

def exibir_lista(lista_numeros):
    """método que recebe uma lista e a exibe, elementos um a baixo do outro

    Args:
        lista_numeros (int): lista contendo números inteiros 
    """
    for item in lista_numeros:
        print(item)

    print("--------------------")
    print("Total de elementos: ", len(lista_numeros))

def copiar_lista_sem_replicados(lista_origem, lista_destino):
    """método que copiar o conteudo da lista origem para a lista destino sem replicados

    Args:
        lista_origem (int): lista original contendo todos os numeros
        lista_destino (_type_): lista final contendo somente os numeros não replicados 
    """
    for item in lista_origem:
        if item not in lista_destino:
            lista_destino.append(item) 
