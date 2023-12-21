package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RollBackArrayTest {

    @Test
    void whenEmpty() {
        int[] input = new int[] {};
        int[] excepted = new int[] {};
        int[] result = RollBackArray.rollBack(input);
        assertThat(result).containsExactly(excepted);
    }

    @Test
    void whenOne() {
        int[] input = new int[] {1};
        int[] excepted = new int[] {1};
        int[] result = RollBackArray.rollBack(input);
        assertThat(result).containsExactly(excepted);
    }

    @Test
    void whenFull() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] excepted = new int[] {4, 3, 2, 1};
        int[] result = RollBackArray.rollBack(input);
        assertThat(result).containsExactly(excepted);
    }

    @Test
    void whenTheSame() {
        int[] input = new int[] {1, 1, 1, 1};
        int[] excepted = new int[] {1, 1, 1, 1};
        int[] result = RollBackArray.rollBack(input);
        assertThat(result).containsExactly(excepted);
    }
}