package io.hexlet;

import org.apache.commons.lang3.RandomUtils;

public class Example {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println(RandomUtils.nextInt(1, 1000));
    }
}