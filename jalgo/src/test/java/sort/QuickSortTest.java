package sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    Integer[] nums;

    @BeforeEach
    void init() {
        nums = new Integer[]{3,5,3,4,24,24,234,25,34,4,21,312,4312,45,345,23,4,1324534,563,65,86,73,54123,124,267,66,35,423,412,4,234,13};
    }

    QuickSort quickSort = new QuickSort();

    @Test
    void sort() {
        quickSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}