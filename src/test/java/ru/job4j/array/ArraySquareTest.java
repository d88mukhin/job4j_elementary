package ru.job4j.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class ArraySquareTest {

    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] result = ArraySquare.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenBound5Then014916() {
        int bound = 5;
        int[] result = ArraySquare.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }
}