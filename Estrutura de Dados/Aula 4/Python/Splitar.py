from Glicemia import Glicemia

lista = []

linha = "120,11/03/2026,9:00"
#splitar linha 
valor, data, hora = linha.split(",")

#criar objeto de Glicemia 
obj = Glicemia(int(valor), data, hora)

if obj not in lista:
   lista.append(obj)

for item in lista:  
    print(item.valor, item.data, item.hora)
