package session09.solution;

public class LinkedList {
    private LinkedListElement first;

    public LinkedList(){};
    
    public LinkedList(LinkedListElement first){
        this.first = first;
    };

    //TODO Aufgabe 2 Füge ein neues LinkedListElement an den Beginn der Liste ein
    void add(LinkedListElement value){
        value.setNext(first);
        first = value;
    };

    //TODO Aufgabe 3 Gebe alle Werte der LinkedList über die System.out.println() aus
    void print(){
        LinkedListElement current = first;

        while (current.hasNext()){
            System.out.println(current.getValue());
            current = current.getNext();
        }

        System.out.println(current.getValue());
    };

}
