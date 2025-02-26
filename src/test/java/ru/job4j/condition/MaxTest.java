package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import javax.lang.model.util.Elements;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int expected = 2;
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To3Then5() {
        int expected = 5;
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int expected = 3;
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }
}