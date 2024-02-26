package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        double p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        double expected = 2;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP4K1Square1() {
        double p = 4;
        double k = 1;
        double output = RectangleArea.square(p, k);
        double expected = 1;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K7Square1dot75() {
        double p = 8;
        double k = 7;
        double output = RectangleArea.square(p, k);
        double expected = 1.75;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}