package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to42Then4Dot47() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 4;
        int y2 = 2;
        double expected = 4.47;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13to85Then7Dot28() {
        int x1 = 1;
        int y1 = 3;
        int x2 = 8;
        int y2 = 5;
        double expected = 7.28;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00toMinus6Minus4Then7Dot21() {
        int x1 = 0;
        int y1 = 0;
        int x2 = -6;
        int y2 = -4;
        double expected = 7.21;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}