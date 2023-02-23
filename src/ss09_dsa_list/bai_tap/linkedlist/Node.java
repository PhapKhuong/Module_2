package ss09_dsa_list.bai_tap.linkedlist;

public class Node<E> {
    Node next;
    E element;

    public Node(E newElement) {
        this.element = newElement;
    }

    public E getElement () {
        return element;
    }

    @Override
    public String toString() {
        String str = "";
        str += element;
        return str;
    }
}