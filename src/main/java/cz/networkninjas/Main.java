package cz.networkninjas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication(27);
        multiplication.multiply();

        new GetSum().getSum(0,0);
        new GetSum().getSum(0,1);
        new GetSum().getSum(1,2);
        new GetSum().getSum(-1,1);
    }
}