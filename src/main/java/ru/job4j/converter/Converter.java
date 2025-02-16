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
        float dollar = Converter.rubleToDollar(150);
        System.out.println("180 rubles are " + dollar + " dollars.");
        float ruble = Converter.euroToRuble(5.5f);
        System.out.println("5,5 euro are " + ruble + " rubles.");
        ruble = Converter.dollarToRuble(4);
        System.out.println("4 dollars are " + ruble + "rubles.");
    }
}
