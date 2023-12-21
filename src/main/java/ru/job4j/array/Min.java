package ru.job4j.array;

public class Min {
    public static int findMin(int[] arrau) {
        int min = arrau[0];
        for (int index = 1; index < arrau.length; index++) {
            if (min > arrau[index]) {
                min = arrau[index];
            }
        }
        return min;
    }
}
