public class Q001 {

  public static void main(String[] args) {
    System.out.println(sum_cubes(5));
  }

  public static int sum_cubes(int num) {
    // given an int, return the cube of the sum from 1 to that given int
    int sum = 1;
    for (int i = 2; i <= num; i++) sum += i;
    return sum * sum;
  }
}
