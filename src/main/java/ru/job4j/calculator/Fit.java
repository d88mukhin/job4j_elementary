package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 184;
        double man = Fit.manWeight(height);
        System.out.println("Man 184 is " + man);
        height = 165;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 170 is " + woman);
    }
}
