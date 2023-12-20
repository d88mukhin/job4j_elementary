package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int excepted = 0;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {5, 0, 3};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int excepted = -1;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenArrayHas7ThenMinus2() {
        int[] data = new int[] {5, 3, 7, 0};
        int element = 7;
        int result = FindLoop.indexOf(data, element);
        int excepted = 2;
        assertThat(result).isEqualTo(excepted);
    }
}