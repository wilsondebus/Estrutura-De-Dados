public class Dado {
    int valor;
    int linha; 
    int coluna;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public Dado(int valor, int linha, int coluna) {
        this.valor = valor;
        this.linha = linha;
        this.coluna = coluna;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dado other = (Dado) obj;
        if (linha != other.linha)
            return false;
        if (coluna != other.coluna)
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Dado [valor=" + valor + ", linha=" + linha + ", coluna=" + coluna + "]";
    } 
}