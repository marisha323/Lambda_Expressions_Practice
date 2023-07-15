public class MaxCalculator {
    public static TriFunction<Integer, Integer, Integer, Integer> maxFunction = (a, b, c) -> {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    };
}
class MinCalculator{
    public static TriFunction<Integer,Integer,Integer,Integer> minFunction=(a,b,c)->{
      int min =a;
      if (b<min){
          min=b;
      }
      if (c<min){
          min=c;
      }
      return min;
    };
}

@FunctionalInterface
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}