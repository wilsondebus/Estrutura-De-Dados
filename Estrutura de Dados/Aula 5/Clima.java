public class Clima{
    public String ano;
    public String mes; 
    public String temperatura;
    public String precipitacao;

    public Clima(String ano, String mes, String temperatura, String precipitacao) {
        this.ano = ano;
        this.mes = mes;
        this.temperatura = temperatura;
        this.precipitacao = precipitacao;
    }

    //exibir um onbjeto completo da classe 
    @Override
    public String toString() {
        return "Clima [ano=" + this.ano + ", mes=" + this.mes + ", temperatura=" + this.temperatura + ", preciptacao=" + this.precipitacao +"]";
    }

    @Override   //declarando a chave primaria 
    public boolean equals(Object obj) {
        Clima c = (Clima)obj;
        return (this.ano.equals(c.ano) && this.mes.equals(c.mes));
    }    
}