import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Lucas");
        linkedList.add("Erica");
        linkedList.add("Matheus");
        System.out.println(linkedList);

        linkedList.addFirst("Start");
        linkedList.addLast("End");
        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);

        System.out.println(linkedList.get(1));
    }
}
