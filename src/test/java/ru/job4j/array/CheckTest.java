package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CheckTest {

    @Test
    void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        assertThat(result).isFalse();
    }

    @Test
    void whenDataMonoByFalseThenTrue() {
        boolean[] input = new boolean[] {false, false, false};
        boolean result = Check.mono(input);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoByFalseThenFalse() {
        boolean[] input = new boolean[] {false, true, false};
        boolean result = Check.mono(input);
        assertThat(result).isFalse();
    }
}