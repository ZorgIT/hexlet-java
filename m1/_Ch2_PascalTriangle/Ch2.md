package io.hexlet;

class App {
    // BEGIN (write your solution here)
    public static int[] generate(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            result[i] = meNum(n, i);
        }
        return result;
    }

    public static int meNum(int linenum, int numPos) {
        return factorial(linenum)
                        / (factorial(numPos)
                        * factorial((linenum - numPos)));
    }

    public static int factorial(int n) {
        int result = 1;
        for (var i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    // END
}