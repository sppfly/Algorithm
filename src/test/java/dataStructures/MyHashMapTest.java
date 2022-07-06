package dataStructures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


import java.util.HashMap;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyHashMapTest {





    @Test
    void testGetAndPut() {
        MyHashMap<Integer, Integer> map = new MyHashMap<>();
        int N = 100;
        Random random = new Random();
        Integer[] nums = new Integer[N];
        for (int i=0; i<N; i++) {
            Integer test = random.nextInt();
            nums[i] = test;
            map.put(test, test);
        }
        for (int i=0; i<N; i++) {
            Integer v = map.get(nums[i]);
            assertEquals(v, nums[i]);
        }
    }



    @Test
    void testClear() {

    }

    @Test
    void testContainsKey() {

    }

    @Test
    void testContainsValue() {

    }

    @Test
    void testEntrySet() {

    }

    @Test
    void testGet() {

    }

    @Test
    void testIsEmpty() {

    }

    @Test
    void testKeySet() {

    }

    @Test
    void testMain() {

    }

    @Test
    void testPut() {

    }

    @Test
    void testPutAll() {

    }

    @Test
    void testRemove() {

    }

    @Test
    void testSize() {

    }

    @Test
    void testValues() {

    }
}
