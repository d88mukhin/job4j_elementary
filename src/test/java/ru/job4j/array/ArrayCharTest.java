package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArrayCharTest {

    @Test
    void whenStartWithprefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'e'};
        boolean result = ArrayChar.startWith(word, prefix);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotStartWithprefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'i'};
        boolean result = ArrayChar.startWith(word, prefix);
        assertThat(result).isFalse();
    }
}