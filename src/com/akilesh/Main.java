package com.akilesh;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            boolean isPrimeNumber = isPrime(i);
            if (isPrimeNumber) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
