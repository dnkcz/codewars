package cz.networkninjas;

public class GetSum {
    public int getSum(int a, int b) {
        int start = Math.min(a, b);
        int finish = a == start ? b : a;

        if (start == finish) return start; // 2 2

        int sum = 0;
        while (start <= finish) {
            sum += start;
            start++;
        }
        System.out.println("sum for a="+a+" b="+b+" is "+sum);
        return sum;
    }
}

/*
*
* Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples (a, b) --> output (explanation)
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
*
* */