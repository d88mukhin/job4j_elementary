package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void when140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void when180RblThen3Dollar() {
        float input = 180;
        float expected = 3;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void when5EuroThen350Rbl() {
        float input = 5;
        float expected = 350;
        float output = Converter.euroToRuble(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void when1DollarThen60Rbl() {
        float input = 1;
        float expected = 60;
        float output = Converter.dollarToRuble(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}