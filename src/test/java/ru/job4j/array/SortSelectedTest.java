package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort3Numbers() {
        int[] data = new int[] {4, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 4};
        assertThat(result).containsExactly(expected);
    }
}