package session09.tasks;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(new String[] { "Anna", "Bob", "Chris" });
        arrayList.add("Daniel");
        System.out.println(arrayList.contains("Daniel"));
        arrayList.print();

        LinkedListElement<String> anna = new LinkedListElement<String>("Anna");
        LinkedList list = new LinkedList(anna);
        list.add(new LinkedListElement<String>("Bob"));
        list.add(new LinkedListElement<String>("Chris"));
        list.print();

    }
}
