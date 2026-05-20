import java.util.TreeSet;

public class Arvore{
    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<>(); 
        treeSet.add("Banana");
        treeSet.add("Maçã");
        treeSet.add("Laranja");
        treeSet.add("Abacaxi");
        treeSet.add("Uva");
        treeSet.add("Pera");
        treeSet.add("Manga");

        //imprime ordenado (LERD)
        System.out.println("Elementos na TreeSet: ");
        for(String i : treeSet){
            System.out.println(i);
        }

        if(treeSet.contains("Caqui")){
            System.out.println("A TreeSet contém Caqui");
        } else {
            System.out.println("A TreeSet não contém Caqui");
        } 

        treeSet.clear(); 

        System.out.println("Tamanho da TreeSet após limpar: "+treeSet.size());

    }
}