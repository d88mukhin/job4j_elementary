package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ChessBoardTest {

    @Test
    void wayIs5() {
        int x1 = 6;
        int y1 = 7;
        int x2 = 1;
        int y2 = 2;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int excepted = 5;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void wayIs7() {
        int x1 = 7;
        int y1 = 0;
        int x2 = 0;
        int y2 = 7;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int excepted = 7;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void wayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int excepted = 0;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenX1IsMinus1ThenWayIs0() {
        int x1 = -1;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int excepted = 0;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenY1IsMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = -1;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int excepted = 0;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenX2IsMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = -1;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int excepted = 0;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenY2IsMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = -1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int excepted = 0;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenX1IsGreater7ThenWayIs0() {
        int x1 = 10;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int excepted = 0;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenY1IsGreater7ThenWayIs0() {
        int x1 = 2;
        int y1 = 10;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int excepted = 0;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenX2IsGreater7ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 10;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int excepted = 0;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void whenY2IsGreaterThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 10;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int excepted = 0;
        assertThat(result).isEqualTo(excepted);
    }
}