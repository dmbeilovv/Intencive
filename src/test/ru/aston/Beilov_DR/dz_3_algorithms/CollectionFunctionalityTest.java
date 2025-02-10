package ru.aston.Beilov_DR.dz_3_algorithms;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class CollectionFunctionalityTest {

    static private HashMap<Integer, String> hashMap;
    static private TreeSet<Integer> treeSet;
    static private ArrayList<Integer> list;

    @BeforeAll
    static void initializeData() {
        hashMap = new HashMap<>();
        treeSet = new TreeSet<>();
        list = new ArrayList<>();
    }

    @Test
    void testArrayListMethods() {
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, list.size());
        assertTrue(list.contains(2));
        list.remove(Integer.valueOf(2));
        assertFalse(list.contains(2));

        list.clear();
    }

    @Test
    void testHashMapMethods() {
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        assertEquals("One", hashMap.get(1));
        assertTrue(hashMap.containsKey(2));
        hashMap.remove(2);
        assertFalse(hashMap.containsKey(2));

        hashMap.clear();
    }

    @Test
    void testTreeSetMethods() {
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(15);

        assertTrue(treeSet.contains(10));
        treeSet.remove(10);
        assertFalse(treeSet.contains(10));

        treeSet.clear();
    }



    @Test
    void testArrayListConstructors() {
        ArrayList<Integer> defaultList = new ArrayList<>();
        ArrayList<Integer> sizedList = new ArrayList<>(10);
        ArrayList<Integer> copiedList = new ArrayList<>(Arrays.asList(1, 2, 3));

        assertNotNull(defaultList);
        assertNotNull(sizedList);
        assertNotNull(copiedList);
        assertEquals(3, copiedList.size());
    }

    @Test
    void testHashMapConstructors() {
        HashMap<Integer, String> defaultMap = new HashMap<>();
        HashMap<Integer, String> sizedMap = new HashMap<>(10);
        HashMap<Integer, String> copiedMap = new HashMap<>(Map.of(1, "A", 2, "B"));

        assertNotNull(defaultMap);
        assertNotNull(sizedMap);
        assertNotNull(copiedMap);
        assertEquals(2, copiedMap.size());
    }

    @Test
    void testTreeSetConstructors() {
        TreeSet<Integer> defaultTreeSet = new TreeSet<>();
        TreeSet<Integer> comparatorTreeSet = new TreeSet<>(Comparator.reverseOrder());
        TreeSet<Integer> copiedTreeSet = new TreeSet<>(Arrays.asList(1, 2, 3));

        assertNotNull(defaultTreeSet);
        assertNotNull(comparatorTreeSet);
        assertNotNull(copiedTreeSet);
        assertEquals(3, copiedTreeSet.size());
    }



    @Test
    void testCollectionsMethods_sort_reverse_shuffle() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(3, 1, 2));
        Collections.sort(testList);
        assertEquals(Arrays.asList(1, 2, 3), testList);

        Collections.reverse(testList);
        assertEquals(Arrays.asList(3, 2, 1), testList);

        Collections.shuffle(testList);
        assertEquals(3, testList.size()); // порядок может измениться
    }

    @Test
    void testCollectionsAdvancedMethods_copy_fill_asList_min_max() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        List<Integer> copyList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));

        Collections.fill(testList, 9);
        assertEquals(Arrays.asList(9, 9, 9, 9, 9), testList);

        Collections.copy(copyList, testList);
        assertEquals(Arrays.asList(9, 9, 9, 9, 9), copyList);

        List<Integer> minMaxList = Arrays.asList(3, 5, 1, 4, 2);
        assertEquals(1, Collections.min(minMaxList).intValue());
        assertEquals(5, Collections.max(minMaxList).intValue());
    }
}
