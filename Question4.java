import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the
     * integer given.
     * e.g.
     * > 5
     * *****
     * ****
     * ***
     * **
     * *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */

    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    int number2 = number;
    int i = 0;
    while (i <= number2) {
      for (int ii = 0; ii < number; ii++) {
        System.out.print("*");
      }
      i += 1;
      number -= 1;
      if(i!=number2){
        System.out.println();
      }
      
    }

  }
}
