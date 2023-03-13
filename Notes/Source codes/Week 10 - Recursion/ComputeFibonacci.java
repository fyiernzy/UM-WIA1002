import java.util.Scanner;

public class ComputeFibonacci {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("\n  Enter an index for a Fibonacci number: ");
    int index = input.nextInt();

    System.out.println("  The Fibonacci number at index "  
      + index + " is " + fib(index));
    System.out.println();  
  }

  /** The method for finding the Fibonacci number */
  public static long fib(long index) {
    if (index == 0) // Base case
      return 0;
    else if (index == 1) // Base case
      return 1;
    else  // Reduction and recursive calls
      return fib(index - 1) + fib(index - 2);
  }
}

