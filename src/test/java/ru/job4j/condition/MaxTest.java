package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int excepted = 2;
        int rsl = Max.max(left, right);
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenMax4To1Then4() {
        int left = 4;
        int right = 1;
        int excepted = 4;
        int rsl = Max.max(left, right);
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenMax2To3Then4() {
        int left = 2;
        int right = 3;
        int excepted = 3;
        int rsl = Max.max(left, right);
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int excepted = 5;
        int rsl = Max.max(left, right);
        assertThat(rsl).isEqualTo(excepted);
    }
}