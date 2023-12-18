package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculateFactorial5Then120() {
        int excepted = 120;
        int n = 5;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenCalculateFactorialFor0Then1() {
        int excepted = 1;
        int n = 0;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenCalculateFactorialFor1Then1() {
        int excepted = 1;
        int n = 1;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(excepted);
    }
}