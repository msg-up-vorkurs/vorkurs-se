package session09.tasks;

public class LinkedListElement<T> {
    private T value;
    private LinkedListElement next;

    public LinkedListElement(T value) {
        this.value = value;
    }

    public LinkedListElement(T value, LinkedListElement next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
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
