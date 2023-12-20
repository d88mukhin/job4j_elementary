package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] excepted = new int[] {4, 2, 3, 1};
        assertThat(result).containsExactly(excepted);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(input);
        int[] excepted = new int[] {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(excepted);
    }

    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = new int[] {1, 2, 3};
        int[] result = SwitchArray.swapBorder(input);
        int[] excepted = new int[] {3, 2, 1};
        assertThat(result).containsExactly(excepted);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = new int[] {1};
        int[] result = SwitchArray.swapBorder(input);
        int[] excepted = new int[] {1};
        assertThat(result).containsExactly(excepted);
    }
}