import linkedList.Element;
import linkedList.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    Node node;
    Element element;

    @BeforeEach
    void setUp() {
        element = new Element();
        node = new Node(element);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void nodeHas_anElement() {
        assertNotNull(node.getElement());
        assertEquals(element, node.getElement());

        Element newElement = new Element();
        node.setElement(newElement);
        assertNotNull(node.getElement());
        assertEquals(newElement, node.getElement());
    }

    @Test
    void nodeCan_referenceOrLink_toNextNode() {
        assertNull(node.getNext());
    }

    @Test
    void nodeHas_referenceOrLink_toNextNode() {
        Node nextNode = new Node();
        node.setNext(nextNode);

        assertNotNull(node.getNext());
        assertEquals(node.getClass(), node.getNext().getClass());
    }
}