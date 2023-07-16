import java.util.function.IntPredicate;

class ArraySumCalculator  {
     static int calculateSum(int[] array, IntPredicate condition){
        int sum=0;
        for (int num:array){
            if (condition.test(num)){
                sum+=num;
            }
        }
        return sum;
    }
}
