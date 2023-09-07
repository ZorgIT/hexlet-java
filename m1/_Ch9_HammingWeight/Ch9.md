package io.hexlet;

class App {
    // BEGIN (write your solution here)
    public static int getHammingWeight(int number) {
        var tmp = number;
        var result = 0;
        while (tmp > 0) {
            if (tmp % 2 > 0) {
                result++;
            }
            tmp = tmp / 2;
        }
        return result;
    }
    // END
}