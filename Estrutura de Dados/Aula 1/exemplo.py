lista_nomes = []  #criando uma lista, pode ser colocado numeros e caracteres


#adicionar nomes 
lista_nomes.append("Guilherme")
lista_nomes.append("Wilson")
lista_nomes.append("Bruno")

#exibir a lista inteira 
print(lista_nomes)  

#remover nomes 
if len(lista_nomes) != 0:       #verifica se a lsita tem tamanho nulo 
    nome = input("Digite um nome: ")
    if lista_nomes.__contains__(nome): 
        lista_nomes.remove(nome)

    else:
        print(nome, "não esta na lista")

    print(lista_nomes)

else:
    print("Lista vazia...")