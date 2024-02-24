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
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollars.");
        float ruble = Converter.dollarToRuble(4);
        System.out.println("4 dollars are " + ruble + "rubles");
        ruble = Converter.euroToRuble(6);
        System.out.println("6 euro are " + ruble + "rubles");

        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);

        input = 180;
        expected = 3;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("180 dollars are 3. Test result : " + passed);

        input = 4;
        expected = 280;
        output = Converter.euroToRuble(input);
        passed = expected == output;
        System.out.println("4 rubbles are 280. Test result : " + passed);

        input = 2;
        expected = 120;
        output = Converter.euroToRuble(input);
        passed = expected == output;
        System.out.println("2 rubbles are 120. Test result : " + passed);
    }
}
