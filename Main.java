public class Main {
    public static void main(String[] args) {
        listaEncadeada<String> l = new listaEncadeada<>();
        l.adiciona("Erica");
        l.adiciona("Matheus");
        l.adiciona("Lucas");
        System.out.println(l.buscar("Lucas"));
    }
}
