class Clima: 
    def __init__(self, ano, mes, temperatura, preciptacao):
        self.ano = ano
        self.mes = mes
        self.temperatura = temperatura
        self.preciptacao = preciptacao

    def __str__(self):
            return f"Dados Climaticos (Ano:{self.ano}. Mes:{self.mes}. Temperatura: {self.temperatura}. Precipitacao: {self.preciptacao})"
    
    def __eq__(self, object):
         return self.ano == object.ano and self.mes == object.mes
    