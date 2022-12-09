package session09.solution;

public class LinkedListElement {
    private String value;
    private LinkedListElement next;

    public LinkedListElement(String value) {
        this.value = value;
    }

    public LinkedListElement(String value, LinkedListElement next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public LinkedListElement getNext() {
        return next;
    }

    public void setNext(LinkedListElement next) {
        this.next = next;
    }

    public boolean hasNext() {
        if (this.next == null) {
            return false;
        } else {
            return true;
        }
    }
}
