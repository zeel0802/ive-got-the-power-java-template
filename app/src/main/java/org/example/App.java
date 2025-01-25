package org.example;

public class App {
    public static void main(String[] args) {
        int x = 2; // Base
        int n = 3; // Exponent

        // Demonstrate all three methods
        System.out.println("Naive Power: " + naivePower(x, n));
        System.out.println("Unoptimized DC Power: " + unoptimizedDCPower(x, n));
        System.out.println("Optimized DC Power: " + optimizedDCPower(x, n));
    }

    // Naive approach
    public static int naivePower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return x * naivePower(x, n - 1);
    }

    // Unoptimized divide-and-conquer approach
    public static int unoptimizedDCPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return unoptimizedDCPower(x, n / 2) * unoptimizedDCPower(x, n / 2);
        } else {
            return x * unoptimizedDCPower(x, n / 2) * unoptimizedDCPower(x, n / 2);
        }
    }

    // Optimized divide-and-conquer approach
    public static int optimizedDCPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        int temp = optimizedDCPower(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }
}