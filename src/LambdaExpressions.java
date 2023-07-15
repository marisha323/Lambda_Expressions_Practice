import java.time.LocalDate;
import java.time.LocalTime;

public class LambdaExpressions {
    public void run() {
        Calculator calculator = new Calculator();

        int sum = calculator.calculate((a, b, c) -> a + b + c, 2, 4, 6);
        System.out.println("Сума: " + sum);

        int product = calculator.calculate((a, b, c) -> a * b * c, 2, 4, 6);
        System.out.println("Добуток: " + product);

        Printer timePrinter = new TimePrinter();
        timePrinter.print();

        Printer datePrinter = new DatePrinter();
        datePrinter.print();
    }

}

interface Calculation {
    int calculate(int a, int b, int c);
}

interface Printer {
    void print();
}

class Calculator {
    int calculate(Calculation calculation, int a, int b, int c) {
        return calculation.calculate(a, b, c);
    }
}

class TimePrinter implements Printer {
    @Override
    public void print() {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Поточний час: " + currentTime);
    }

}

class DatePrinter implements Printer {
    @Override
    public void print() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Поточна дата: " + currentDate);
    }
}

