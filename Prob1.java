import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of grades: ");
    int gradeNumber = scan.nextInt();
  
    int gradeTotal = 0;
  
    for (int i = 1; i <= gradeNumber; i++){
      System.out.println("Enter grade " +i);
      int grade = scan.nextInt();
      gradeTotal += grade;
    }
    System.out.println("The sum of the grades is "+ gradeTotal);

  }
}