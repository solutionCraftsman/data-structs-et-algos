package search.binary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void search() {
        int[] dataToSearch = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertEquals(-1, BinarySearch.find(dataToSearch, 0));
        assertEquals(0, BinarySearch.find(dataToSearch, 1));
        assertEquals(1, BinarySearch.find(dataToSearch, 2));
        assertEquals(2, BinarySearch.find(dataToSearch, 3));
        assertEquals(3, BinarySearch.find(dataToSearch, 4));
        assertEquals(4, BinarySearch.find(dataToSearch, 5));
        assertEquals(5, BinarySearch.find(dataToSearch, 6));
        assertEquals(6, BinarySearch.find(dataToSearch, 7));
        assertEquals(7, BinarySearch.find(dataToSearch, 8));
        assertEquals(8, BinarySearch.find(dataToSearch, 9));
        assertEquals(-1, BinarySearch.find(dataToSearch, 10));
    }
}