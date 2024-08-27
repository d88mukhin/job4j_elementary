package ru.job4j.condition;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Timeout(3)
    @Test
    void when00to20Then2() throws InterruptedException {
        Thread.sleep(5000);
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus3to20Then3Dot61() {
        int x1 = 0;
        int y1 = -3;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        double expected = 3.61;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when23to65Then4dot47() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 6;
        int y2 = 5;
        double output = Point.distance(x1, y1, x2, y2);
        double expected = 4.47;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus4Minus1toMinus2Minus3Then2Dot83() {
        int x1 = -4;
        int y1 = -1;
        int x2 = -2;
        int y2 = -3;
        double output = Point.distance(x1, y1, x2, y2);
        double expected = 2.83;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}