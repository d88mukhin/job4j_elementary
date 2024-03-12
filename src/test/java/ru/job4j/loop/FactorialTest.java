package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    public void whenCaculateFactorialFor5Then120() {
        int number = 5;
        int output = Factorial.calculate(number);
        int expected = 120;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    public void whenCaculateFactorialFor0Then1() {
        int number = 0;
        int output = Factorial.calculate(number);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }
}