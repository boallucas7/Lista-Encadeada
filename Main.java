public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> l = new ListaEncadeada<>();
        l.adiciona("Isabella");
        l.adiciona("Guilherme");
        l.adiciona("Aurora");
        System.out.println(l.buscar("Guilherme"));
    }
}
