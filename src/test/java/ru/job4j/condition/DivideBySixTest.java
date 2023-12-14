package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DivideBySixTest {

    @Test
    void whenNumberDivideBy6() {
        int number = 24;
        String result = DivideBySix.checkNumber(number);
        String excepted = "The number divides by 6.";
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenNumberDivideBy3AndNotEven() {
        int number = 9;
        String result = DivideBySix.checkNumber(number);
        String excepted = "The number divides by 3, but it isn't the even number";
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenNumberNoDivideBy3AndEven() {
        int number = 14;
        String result = DivideBySix.checkNumber(number);
        String excepted = "The number doesn't divide by 3, but it is the even number.";
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenNumberNoDivideBy3AndNotEven() {
        int number = 25;
        String result = DivideBySix.checkNumber(number);
        String excepted = "The number doesn't divide by 3 and it isn't the even number";
        assertThat(result).isEqualTo(excepted);
    }
}