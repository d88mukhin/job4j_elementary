package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArraySquareTest {

    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] result = ArraySquare.calculate(bound);
        int[] excepted = new int[] {0, 1, 4};
        assertThat(result).containsExactly(excepted);
    }

    @Test
    void whenBound5Then014916() {
        int bound = 5;
        int[] result = ArraySquare.calculate(bound);
        int[] excepted = new int[] {0, 1, 4, 9, 16};
        assertThat(result).containsExactly(excepted);
    }
}