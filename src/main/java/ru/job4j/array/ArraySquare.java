package ru.job4j.array;

public class ArraySquare {
    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int index = 0; index < bound; index++) {
            result[index] = (int) Math.pow(index, 2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int number : array) {
            System.out.println(number);
        }
    }
}
