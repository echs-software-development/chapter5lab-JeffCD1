import java.util.Scanner;

public class Prob2 {
  public static void main(String[] args){
    int countPositive = 0;
    int countNegative = 0;
    int count = 0, total = 0,number;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer, the input ends of it is a zero: ");
    number = input.nextInt();

    while (number !=0){
      if (number >0)
        countPositive++;
      else if (number < 0)
        countNegative++;

      total += number;
      count++;
      number=input.nextInt();
    }
    if (count==0)
      System.out.println("Only the number zero was entered");
    else {
      System.out.println("The number of positives is "+countPositive);
      System.out.println("The number of negatives is "+countNegative);
      System.out.println("The total is "+total);
      System.out.println("The average is "+ total * 1.0 / count);
    }


  }
}