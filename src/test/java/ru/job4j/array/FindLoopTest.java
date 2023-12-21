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

    @Test
    void whenDiaposonHas8ThenResultEqualFinis() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRanga(data, element, start, finish);
        int excepted = 5;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenDiaposonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRanga(data, element, start, finish);
        int excepted = 3;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenDiaposonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRanga(data, element, start, finish);
        int excepted = 3;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenDiaposonHasNot8ThenMinus1() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRanga(data, element, start, finish);
        int excepted = -1;
        assertThat(result).isEqualTo(excepted);
    }
}