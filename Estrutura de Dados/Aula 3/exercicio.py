from biblioteca import popular_lista_aleatoria, exibir_lista, copiar_lista_sem_replicados   #faz a importação das funções que estão na outra pagina 

lista_numeros = []

quantidade_numeros = int(input("Digite quantos numeros gostaria de armazenas: "))

faixa_inicial = 10
faixa_final = 50 

popular_lista_aleatoria(lista_numeros, quantidade_numeros, faixa_inicial, faixa_final)

exibir_lista(lista_numeros) 

lista_resultados = []
copiar_lista_sem_replicados(lista_numeros, lista_resultados)
lista_resultados.sort()  #ordena 
exibir_lista(lista_resultados)
