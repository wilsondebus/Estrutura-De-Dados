from Glicemia import Glicemia 

lista = []
obj = Glicemia(191, "11/03/2026", "9:00")
lista.append(obj)

lista.append(Glicemia (98, "11/03/2026", "11:00"))

for i in range(3):
    valor = int(input("Valor Glicemia: "))
    data = input("Data[dd/mm/aaaa]: ")
    hora = input("hh/mm: ")

    lista.append(Glicemia(valor, data, hora))

for item in lista:  #para cada item dentro da lista
    print(item.valor, item.data, item.hora)