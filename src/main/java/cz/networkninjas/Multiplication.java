package cz.networkninjas;

public class Multiplication {
    int number;
    int level = 1;

    private Multiplication() {

    }

    public Multiplication(int number) {
        this.number = number;
    }

    public int multiply() {
        return multiplication(this.number, this.level);
    }

    private int multiplication(int number, int level) {
        System.out.println("Number:" + number + " level:" + level);
        int multipliedNumber = getMultiplicationOfNumbers(number);
        if (multipliedNumber > 9) {
            level++;
            return multiplication(multipliedNumber, level);
        } else return level;
    }

    private int getMultiplicationOfNumbers(int number) {
        int multiplication = 1;
        while (number > 0) {
            multiplication *= number % 10;
            number = number / 10;
        }
        return multiplication;
    }
}