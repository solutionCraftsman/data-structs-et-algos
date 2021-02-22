package linkedList;

public class SimpleLinkedList {

    private Node root;

    public SimpleLinkedList() {}

    public SimpleLinkedList(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
