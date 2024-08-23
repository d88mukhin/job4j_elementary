package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RubleThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert180RubleThen3Dollar() {
        float input = 180;
        float expected = 3;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert5EuroThen350Ruble() {
        float input = 5;
        float expected = 350;
        float output = Converter.euroToRuble(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert4DollarThen240Ruble() {
        float input = 4;
        float expected = 240;
        float output = Converter.dollarToRuble(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}