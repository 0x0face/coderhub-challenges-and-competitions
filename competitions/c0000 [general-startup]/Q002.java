public class Q002 {

  public static void main(String[] args) {
    System.out.println(average(new int[] { 100, 200, 300 }));
  }

  public static int average(int[] visitors) {
    // given an array of ints, return the average excluding the min and max nums from it
    int sum = 0;
    int min = visitors[0];
    int max = visitors[0];
    for (int n : visitors) {
      sum += n;
      if (n < min) min = n;
      if (n > max) max = n;
    }
    return (sum - min - max) / (visitors.length - 2);
  }
}
