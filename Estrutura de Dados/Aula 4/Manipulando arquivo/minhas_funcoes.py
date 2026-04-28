from Glicemia import Glicemia 

def popular_lista_arquivo(lista, nome_base):
    #ler do arquivo e popular a lista com dados splitados 
    leitor = open(nome_base, "r", encoding="utf8")

    for linha in leitor:
        vetor_linha = linha.split(",")
        obj = Glicemia(int(vetor_linha[0]), vetor_linha[1], vetor_linha[2])

        if obj not in lista:
            lista.append(obj)

    leitor.close()

def exibir_lista(lista):
    for item in lista:
        print(item.valor)
    
    print("Total de dados da base: ", len(lista))

def calcular_media(lista):
    soma = 0
    for item in lista: 
        soma += item.valor

    return int(soma/len(lista))

def calcular_mediana(lista):
    lista.sort(key=lambda g: g.valor)   #ordenando a lista por glicemia 
    n = len(lista)  #variavel n é igual o numero de elementos da lista
    if n % 2 == 1:  #se for impar 
        mediana = lista[n//2].valor #mediana = valor que esta na metade da lista 
        return mediana
    else:
        mediana = (lista[n//2].valor + lista[(n//2) - 1].valor) / 2 #mediana = pega os dois valores do meio, soma e divide por dois 
        return mediana
