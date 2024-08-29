package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DivideBySixTest {

    @Test
    void whenNumberDividesBy6() {
        int input = 24;
        String result = DivideBySix.checkNumber(input);
        String expected = "The number divides by 6.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberDividesBy3AndNotEven() {
        int input = 9;
        String result = DivideBySix.checkNumber(input);
        String expected = "The number divides by 3, but it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberNoDividesBy3AndEven() {
        int input = 14;
        String result = DivideBySix.checkNumber(input);
        String expected = "The number doesn't divides by 3, but it is the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberNoDividesBy3AndNotEven() {
        int input = 25;
        String result = DivideBySix.checkNumber(input);
        String expected = "The number doesn't divides by 3 and it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }
}