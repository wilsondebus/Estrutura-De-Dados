from Glicemia import Glicemia
from minhas_funcoes import popular_lista_arquivo
from minhas_funcoes import exibir_lista
from minhas_funcoes import calcular_media
from minhas_funcoes import calcular_mediana 

lista = []
nome_base = "dados.csv"

popular_lista_arquivo(lista, nome_base)
exibir_lista(lista)

media = calcular_media(lista)
print("Media glicemica: ", media)

mediana = calcular_mediana(lista)
print("Mediana glicemica: ", mediana)



