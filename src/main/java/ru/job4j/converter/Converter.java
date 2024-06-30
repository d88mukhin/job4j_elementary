package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static float euroToRuble(float value) {
        float result = value * 70;
        return result;
    }

    public static float dollarToRuble(float value) {
        float result = value * 60;
        return result;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);

        input = 180;
        expected = 3;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("180 rubles are 3. Test result : " + passed);

        input = 4;
        expected = 280;
        output = Converter.euroToRuble(input);
        passed = expected == output;
        System.out.println("4 euro are 280. Test result : " + passed);

        input = 1;
        expected = 60;
        output = Converter.dollarToRuble(input);
        passed = expected == output;
        System.out.println("1 euro are 60. Test result : " + passed);
    }
}
