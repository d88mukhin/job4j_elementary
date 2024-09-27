package ru.job4j.condition;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20Then2() throws InterruptedException {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double output = a.distance(b);
        double expected = 2;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus3to20Then3Dot61() {
        Point a = new Point(0, -3);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        double expected = 3.61;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when23to65Then4dot47() {
        Point a = new Point(2, 3);
        Point b = new Point(6, 5);
        double output = a.distance(b);
        double expected = 4.47;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus4Minus1toMinus2Minus3Then2Dot83() {
        Point a = new Point(-4, -1);
        Point b = new Point(-2, -3);
        double output = a.distance(b);
        double expected = 2.83;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}