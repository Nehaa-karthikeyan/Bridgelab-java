package javacollectionsandstreams.regexandjunit;



import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {

    // ---- ListManager Class ----
    class ListManager {

        void addElement(List<Integer> list, int element) {
            list.add(element);
        }

        void removeElement(List<Integer> list, int element) {
            list.remove(Integer.valueOf(element));
        }

        int getSize(List<Integer> list) {
            return list.size();
        }
    }

    ListManager manager = new ListManager();

    // ---- Test Cases ----
    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 10);
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        manager.removeElement(list, 10);
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertEquals(2, manager.getSize(list));
    }
}
