package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to02then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 2;
        double output = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when06to20then6dot32() {
        int x1 = 0;
        int y1 = 6;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        double expected = 6.32;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus56to2Minus2then10dot63() {
        int x1 = -5;
        int y1 = 6;
        int x2 = 2;
        int y2 = -2;
        double output = Point.distance(x1, y1, x2, y2);
        double expected = 10.63;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00toMinus6Minus4then7dot21() {
        int x1 = 0;
        int y1 = 0;
        int x2 = -6;
        int y2 = -4;
        double output = Point.distance(x1, y1, x2, y2);
        double expected = 7.21;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}