import java.util.function.IntPredicate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ////Task1
//        LambdaExpressions lambdaExpressions=new LambdaExpressions();
//        lambdaExpressions.run();

        ////Task2
//        Lambda2 lambda2=new Lambda2();
//        lambda2.run();
        ////Task3
//        int a=10,b=20,c=5;
//        int max=MaxCalculator.maxFunction.apply(a,b,c);
//        int min=MinCalculator.minFunction.apply(a,b,c);
//
//        System.out.println("Максимум з чисел " + a + ", " + b + ", " + c + " : " + max);
//        System.out.println("Мінімум з чисел " + a + ", " + b + ", " + c + " : " + min);
        ////Task4
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntPredicate isEven = num->num%2==0;
        int sumOfEvens = ArraySumCalculator.calculateSum(numbers, isEven);
        System.out.println("Сума парних чисел: " + sumOfEvens);

        IntPredicate isOdd=num->num%2!=0;
        int sumOfOdds=ArraySumCalculator.calculateSum(numbers,isOdd);
        System.out.println("Сума непарних чисел: " + sumOfOdds);


        int lowerBound=3;
        int upperBound=8;
        IntPredicate isInRange=num->num>=lowerBound&&num<=upperBound;
        int sumInRange=ArraySumCalculator.calculateSum(numbers,isInRange);
        System.out.println("Сума чисел в діапазоні від " + lowerBound + " до " + upperBound + ": " + sumInRange);

        int multipleOf=3;
        IntPredicate isMultipleOf=num->num%multipleOf==0;
        int sumOfMultiples=ArraySumCalculator.calculateSum(numbers,isMultipleOf);
        System.out.println("Сума чисел, які кратні " + multipleOf + ": " + sumOfMultiples);
    }
}