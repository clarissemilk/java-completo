import java.util.ArrayList;

public class MinhaLista {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Mariana");
        nomes.add("João");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}