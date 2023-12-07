package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double excepted = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(excepted, withPrecision(0.01));
    }

    @Test
    void whenP4K1Then1() {
        double p = 4;
        double k = 1;
        double excepted = 1;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(excepted, withPrecision(0.01));
    }

    @Test
    void whenP8K7Then1dot75() {
        double p = 8;
        double k = 7;
        double excepted = 1.75;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(excepted, withPrecision(0.01));
    }
}