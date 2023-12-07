package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double excepted = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(excepted, withPrecision(0.01));
    }

    @Test
    void when50To21Then3dot16() {
        int x1 = 5;
        int y1 = 0;
        int x2 = 2;
        int y2 = 1;
        double excepted = 3.16;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(excepted, withPrecision(0.01));
    }

    @Test
    void when23To06Then3dot61() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 0;
        int y2 = 6;
        double excepted = 3.61;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(excepted, withPrecision(0.01));
    }

    @Test
    void when00ToMinus6Minus4Then7dot21() {
        int x1 = 0;
        int y1 = 0;
        int x2 = -6;
        int y2 = -4;
        double excepted = 7.21;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(excepted, withPrecision(0.01));
    }
}