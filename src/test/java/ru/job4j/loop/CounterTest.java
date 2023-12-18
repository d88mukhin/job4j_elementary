package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart0Finish5Then15() {
        int start = 0;
        int finish = 5;
        int rsl = Counter.sum(start, finish);
        int excepted = 15;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenStart5Finish3Then0() {
        int start = 5;
        int finish = 3;
        int rsl = Counter.sum(start, finish);
        int excepted = 0;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenStartMinus2Finish3Then3() {
        int start = -2;
        int finish = 3;
        int rsl = Counter.sum(start, finish);
        int excepted = 3;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenStart2Finish2Then2() {
        int start = 2;
        int finish = 2;
        int rsl = Counter.sum(start, finish);
        int excepted = 2;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int rsl = Counter.sumByEven(start, finish);
        int excepted = 30;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenSumEvenNumbersFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int rsl = Counter.sumByEven(start, finish);
        int excepted = 18;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenSumEvenNumbersFrom1To1Then0() {
        int start = 1;
        int finish = 1;
        int rsl = Counter.sumByEven(start, finish);
        int excepted = 0;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenSumEvenNumbersFromMinus5To1ThenMinus6() {
        int start = 1;
        int finish = 1;
        int rsl = Counter.sumByEven(start, finish);
        int excepted = 0;
        assertThat(rsl).isEqualTo(excepted);
    }
}