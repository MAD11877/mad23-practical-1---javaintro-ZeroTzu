import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    List<Integer> integerList = new ArrayList<>();
    Set<Integer> uniqueNumbersSet = new HashSet<>();
    List<Integer> CountNumberList= new ArrayList<>();
    List<Integer> OrderedNumberList= new ArrayList<>();
    int userIn1= in.nextInt();
    int i=0;
    while (i<userIn1){
      integerList.add(in.nextInt());
      i+=1;
    }
    for (Integer integer : integerList) {
      uniqueNumbersSet.add(integer);
    }
    for(Integer integer :uniqueNumbersSet){
      OrderedNumberList.add(integer);
    }
    for (Integer integer : OrderedNumberList){
      int ii=0;
      for (int integer2 : integerList){
        if (integer2==integer){
          ii+=1;
        }
      }
      CountNumberList.add(ii);
    }
    int Max=0;

    for (Integer integer: CountNumberList){
      if (integer>Max){
        Max=integer;
      }
    }
   ;
    System.out.println(OrderedNumberList.get( CountNumberList.indexOf(Max)));

  }
}
