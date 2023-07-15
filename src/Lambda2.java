import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class Lambda2 {
    public void run() {
        Calculator2 calculator2 = new Calculator2();

        BinaryOperation<Integer> maxOperation = (a, b) -> Math.max(a, b);
        int maxResult = calculator2.calculate(maxOperation, 10, 5);
        System.out.println("Max: " + maxResult);

        BinaryOperation<Integer> minOperation = (a, b) -> Math.min(a, b);
        int minResult = calculator2.calculate(minOperation, 10, 5);
        System.out.println("Min: " + minResult);

        UnaryOperation<Integer> factorialOperation = n -> {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        int factorialResult = calculator2.calculate(factorialOperation, 5);
        System.out.println("Факторіал: " + factorialResult);

        UnaryOperation<Boolean> primeCheckOperation = n -> {
            if (!n) {
                return false;
            }
            int num = n ? 1 : 0;  // Конвертуємо Boolean у int
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        boolean isPrime = calculator2.calculate(primeCheckOperation, 17);
        System.out.println("Просте число? " + isPrime);
    }
}

class Calculator2 {

    public <T> T calculate(UnaryOperation<T> operation, T operand) {
        return operation.calculate(operand);
    }

    public <T> T calculate(BinaryOperation<T> operation, T operand1, T operand2) {
        return operation.calculate(operand1, operand2);
    }
    public boolean calculate(UnaryOperation<Boolean> operation, int operand) {
        return operation.calculate(operand != 0);
    }
}


interface UnaryOperation<T> {
    T calculate(T operand);
}

interface BinaryOperation<T> {
    T calculate(T operand1, T operand2);
}

interface Operation<T> {
    T calculate(T operand);
}
