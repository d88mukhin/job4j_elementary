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
}