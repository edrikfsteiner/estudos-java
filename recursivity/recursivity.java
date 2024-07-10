package javaFunctions.recursivity;
import java.util.ArrayList;
import java.util.List;

public class Recursivity {
    public int factorial(int value) {
        if (value <= 1) {
            return value;
        } else {
            return value * factorial(value - 1);
        }
    }

    public int nat_sum(int value) {
        if (value == 0) {
            return value;
        } else {
            return value + nat_sum(value - 1);
        }
    }

    public List<Integer> fibonacci(int value) {
        List<Integer> fib = new ArrayList<>();

        if (value <= 0) {
            return fib;
        } else if (value == 1) {
            fib.add(0);
            return fib;
        } else {
            fib.add(0);
            fib.add(1);

            for (int i = 2; i < value; i++) {
                int nextFib = fib.get(i - 1) + fib.get(i - 2);
                fib.add(nextFib);
            }

            return fib;
        }
    }
}