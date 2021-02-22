package linkedList;

public class Node {

    private Node next;
    private Element element;

    public Node() {
    }

    public Node(Element element) {
        this.element = element;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }
}
