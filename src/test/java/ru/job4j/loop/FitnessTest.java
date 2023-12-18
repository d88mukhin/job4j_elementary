package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitnessTest {

    @Test
    void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int rsl = Fitness.calc(ivan, nik);
        int excepted = 0;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int rsl = Fitness.calc(ivan, nik);
        int excepted = 1;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int rsl = Fitness.calc(ivan, nik);
        int excepted = 2;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int rsl = Fitness.calc(ivan, nik);
        int excepted = 1;
        assertThat(rsl).isEqualTo(excepted);
    }
}