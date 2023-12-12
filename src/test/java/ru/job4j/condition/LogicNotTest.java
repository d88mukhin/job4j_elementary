package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LogicNotTest {
    @Test
    void whenIsEvenTrue() {
        int num = 2;
        boolean rsl = LogicNot.isEven(num);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenIsEvenFalse() {
        int num = 3;
        boolean rsl = LogicNot.isEven(num);
        assertThat(rsl).isFalse();
    }

    @Test
    void whenIsPositiveTrue() {
        int num = 2;
        boolean rsl = LogicNot.isPositive(num);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenIsPositiveFalse() {
        int num = -2;
        boolean rsl = LogicNot.isPositive(num);
        assertThat(rsl).isFalse();
    }

    @Test
    void whenNumIs0IsPositiveFalse() {
        int num = 0;
        boolean rsl = LogicNot.isPositive(num);
        assertThat(rsl).isFalse();
    }

    @Test
    void whenNotEvenFalse() {
        int num = 2;
        boolean rsl = LogicNot.notEven(num);
        assertThat(rsl).isFalse();
    }

    @Test
    void whenNotEvenTrue() {
        int num = 3;
        boolean rsl = LogicNot.notEven(num);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenNotPositiveTrue() {
        int num = -2;
        boolean rsl = LogicNot.notPositive(num);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenNotPositiveFalse() {
        int num = 2;
        boolean rsl = LogicNot.notPositive(num);
        assertThat(rsl).isFalse();
    }

    @Test
    void whenIs0IsNotPositiveFalse() {
        int num = 0;
        boolean rsl = LogicNot.notPositive(num);
        assertThat(rsl).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveIsTrue() {
        int num = 3;
        boolean rsl = LogicNot.notEvenAndPositive(num);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenNotEvenFalseIsAllFalse() {
        int num = 2;
        boolean rsl = LogicNot.notEvenAndPositive(num);
        assertThat(rsl).isFalse();
    }

    @Test
    void whenPositiveFalseIsAllFalse() {
        int num = -2;
        boolean rsl = LogicNot.notEvenAndPositive(num);
        assertThat(rsl).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveIsFalse() {
        int num = -2;
        boolean rsl = LogicNot.notEvenAndPositive(num);
        assertThat(rsl).isFalse();
    }

    @Test
    void whenEvenOrNotPositiveIsTrue() {
        int num = -2;
        boolean rsl = LogicNot.evenOrNotPositive(num);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenEvenIsTrueThenAllIsTrue() {
        int num = 2;
        boolean rsl = LogicNot.evenOrNotPositive(num);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenNotPositiveIsTrueThenAllIsTrue() {
        int num = -3;
        boolean rsl = LogicNot.evenOrNotPositive(num);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenEvenOrNotPositiveIsFalse() {
        int num = 3;
        boolean rsl = LogicNot.evenOrNotPositive(num);
        assertThat(rsl).isFalse();
    }
}