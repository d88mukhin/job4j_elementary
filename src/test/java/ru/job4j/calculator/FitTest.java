package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short in = 180;
        double excepted = 92;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(excepted, withPrecision(0.01));
    }

    @Test
    void whenWomam170Then69() {
        short in = 170;
        double excepted = 69;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(excepted, withPrecision(0.01));
    }
}