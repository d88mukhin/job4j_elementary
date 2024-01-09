package ru.job4j.array;

public class LegthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4}
        };
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Размер вложенного массива равен: " + numbers[index].length);
        }
    }
}
