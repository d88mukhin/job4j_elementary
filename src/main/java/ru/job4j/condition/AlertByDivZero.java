package ru.job4j.condition;

public class AlertByDivZero {
    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative number.");
        }
    }

    public static void main(String[] args) {
        AlertByDivZero.checkNumber(4);
        AlertByDivZero.checkNumber(0);
        AlertByDivZero.checkNumber(-3);
    }
}
