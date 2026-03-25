public class Processo {
    public int id;
    public String descricao;

    public Processo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object obj) {     //garantir a chave primaria 
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Processo other = (Processo) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {      //dizer como exibir um objeto 
        return "Processo [id=" + id + ", descricao=" + descricao + "]";
    } 

}
