package ss09_dsa_list.excercise.linkedlist;

public class Node<E> {
    Node pre;
    E element;
    Node next;

    public Node(Node newPre, E newElement, Node newNext) {
        this.pre = newPre;
        this.element = newElement;
        this.next = newNext;
    }

    public Node(E newElement) {
        this.element = newElement;
    }

    @Override
    public String toString() {
        String str = "";
        str += element;
        return str;
    }
}