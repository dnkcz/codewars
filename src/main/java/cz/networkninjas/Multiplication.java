package cz.networkninjas;

/*
 * The product of digits of a number is computed by multiplying each digit of the number together.
 * This process is repeated until a single digit is reached.
 * The "persistence" is the number of steps required to reach a single digit.
 * Součin číslic čísla se opakovaně počítá, dokud nedostaneme jednociferné číslo.
 * "Perzistence" je počet kroků potřebných k dosažení jednociferného čísla.
 *
 * Examples:
 * 39  --> 3 (3*9=27, 2*7=14, 1*4=4)
 * 999 --> 4 (9*9*9=729, 7*2*9=126, 1*2*6=12, 1*2=2)
 * 4   --> 0 (already single digit)
 */
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

    //16,1
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