package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void when5Then3() {
        int finish = 5;
        int rsl = PrimeNumber.calc(finish);
        int excepted = 3;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void when11Then5() {
        int finish = 11;
        int rsl = PrimeNumber.calc(finish);
        int excepted = 5;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void when2Then1() {
        int finish = 2;
        int rsl = PrimeNumber.calc(finish);
        int excepted = 1;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void when25Then9() {
        int finish = 25;
        int rsl = PrimeNumber.calc(finish);
        int excepted = 9;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void when49Then15() {
        int finish = 49;
        int rsl = PrimeNumber.calc(finish);
        int excepted = 15;
        assertThat(rsl).isEqualTo(excepted);
    }
}