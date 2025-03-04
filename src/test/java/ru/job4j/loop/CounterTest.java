package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import ru.job4j.converter.Converter;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart4Finish2Then0() {
        int expected = 0;
        int start = 4;
        int finish = 2;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart0Finish5Then15() {
        int expected = 15;
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1Then1() {
        int expected = 1;
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}