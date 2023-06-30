package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadea = new ListaEncadeada<>();

        minhaListaEncadea.add("teste 1");
        minhaListaEncadea.add("teste 2");
        minhaListaEncadea.add("teste 3");
        minhaListaEncadea.add("teste 4");

        System.out.println(minhaListaEncadea.get(0));
        System.out.println(minhaListaEncadea.get(1));
        System.out.println(minhaListaEncadea.get(2));
        System.out.println(minhaListaEncadea.get(3));

        System.out.println(minhaListaEncadea);

        System.out.println(minhaListaEncadea.remove(3));

        System.out.println(minhaListaEncadea);

    }
}
