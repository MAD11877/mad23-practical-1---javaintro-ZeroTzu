import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    int number=in.nextInt();
    double number2= Math.pow(number,2);
    int answer = (int) number2;
    System.out.println(answer);
    
  }
}
