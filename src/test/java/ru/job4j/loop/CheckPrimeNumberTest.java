package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CheckPrimeNumberTest {

    @Test
    void when5ThenTrue() {
        int number = 5;
        boolean rsl = CheckPrimeNumber.check(number);
        assertThat(rsl).isTrue();
    }

    @Test
    void when4ThenFalse() {
        int number = 4;
        boolean rsl = CheckPrimeNumber.check(number);
        assertThat(rsl).isFalse();
    }

    @Test
    void when1ThenFalse() {
        int number = 1;
        boolean rsl = CheckPrimeNumber.check(number);
        assertThat(rsl).isFalse();
    }

    @Test
    void when11ThenTrue() {
        int number = 11;
        boolean rsl = CheckPrimeNumber.check(number);
        assertThat(rsl).isTrue();
    }

    @Test
    void when25ThenFalse() {
        int number = 25;
        boolean rsl = CheckPrimeNumber.check(number);
        assertThat(rsl).isFalse();
    }

    @Test
    void when9ThenFalse() {
        int number = 9;
        boolean rsl = CheckPrimeNumber.check(number);
        assertThat(rsl).isFalse();
    }

    @Test
    void when49ThenFalse() {
        int number = 49;
        boolean rsl = CheckPrimeNumber.check(number);
        assertThat(rsl).isFalse();
    }
}