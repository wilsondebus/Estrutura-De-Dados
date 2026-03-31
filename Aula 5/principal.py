from clima import Clima

def valor_temperatura(temp):
    temp = temp.strip().lower()  #remove espaços e coloca minusculo
    
    if temp == "frio":
        return 1
    elif temp == "ameno":
        return 2
    elif temp == "quente":
        return 3
    
def valor_preciptacao(prec):
    prec = prec.strip().lower() 

    if prec == "nada":
        return 1
    elif prec == "pouca":
        return 2
    elif prec == "média":
        return 3
    elif prec == "muita":
        return 4


lista = []  # cria a lista 
nome_base = "base.csv"  #importa a base de dados e define a variavel para armazena-la 

try: #tentar
    #abrindo o arquivo no modo leitura
    leitor = open(nome_base, "r", encoding="utf-8")

    for linha in leitor:
        ano, mes, temperatura, preciptacao = linha.strip().split(",") #fazendo o split, separando por ','

        obj_clima = Clima(ano, mes, temperatura, preciptacao) #criando o obj 

        if obj_clima not in lista:
            lista.append(obj_clima)
    
    leitor.close()
    
    for item in lista:
        print(item)

    dados_mes = {}

    for item in lista: 
        mes = item.mes

        dados_mes[mes] = {
            "soma_temp": 0, #armazena a soma das temperaturas 
            "soma_prec": 0, #armazena a soma das precipitações 
            "quantidade": 0 #armazena a quantidade de registros desse mes 
            }

        #soma os valores convertidos
        dados_mes[mes]["soma_temp"] += valor_temperatura(item.temperatura)
        dados_mes[mes]["soma_prec"] += valor_preciptacao(item.preciptacao)
        dados_mes[mes]["quantidade"] += 1   #armazena a quantidade de vezes que o mes apareceu 
    
    mes_mais_quente = None
    mes_mais_chuvoso = None 
    maior_media_temp = 0
    maior_media_prec = 0

    for mes in dados_mes: 
        media_temp = dados_mes[mes]["soma_temp"] / dados_mes[mes]["quantidade"]
        media_prec = dados_mes[mes]["soma_prec"] / dados_mes[mes]["quantidade"]     

        if media_temp > maior_media_temp:
            maior_media_temp = media_temp
            mes_mais_quente = mes 

        if media_prec > maior_media_prec:
            maior_media_prec = media_prec
            mes_mais_chuvoso = mes

    print("\n\tTemperatura:")
    print("Frio = 1 \nAmeno = 2 \nQuente = 3")
    print("\tPrecipitação:")
    print("Nada = 1\nPouca = 2\nMédia = 3\nMuita = 4")
    print(f"\nO mês que costuma fazer mais calor é {mes_mais_quente}, com média {maior_media_temp:.2f}.")
    print(f"O mês que costuma chover mais é {mes_mais_chuvoso}, com média {maior_media_prec:.2f}.")

except Exception as e:
    print("Ocorreu um erro...", e)  # o e serve pra mostra onde esta o erro 