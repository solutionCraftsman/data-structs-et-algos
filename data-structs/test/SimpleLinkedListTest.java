import linkedList.Node;
import linkedList.SimpleLinkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLinkedListTest {

    SimpleLinkedList linkedList;
    Node root;

    @BeforeEach
    void setUp() {
        root = new Node();
        linkedList = new SimpleLinkedList(root);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void listHas_rootElement() {
        assertNotNull(linkedList.getRoot());
        assertEquals(root, linkedList.getRoot());
    }

    @Test
    void noArgConstructor_listHas_rootElement() {
        SimpleLinkedList linkedList = new SimpleLinkedList();
        Node root = new Node();

        linkedList.setRoot(root);
        assertNotNull(linkedList.getRoot());
        assertEquals(root, linkedList.getRoot());
    }
}