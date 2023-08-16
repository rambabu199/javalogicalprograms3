
/*13. Write a JAVAprogram to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/
import java.util.Scanner;

public class StudentGrades {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter marks in Physics: ");
    double physics = scanner.nextDouble();

    System.out.print("Enter marks in Chemistry: ");
    double chemistry = scanner.nextDouble();

    System.out.print("Enter marks in Biology: ");
    double biology = scanner.nextDouble();

    System.out.print("Enter marks in Mathematics: ");
    double mathematics = scanner.nextDouble();

    System.out.print("Enter marks in Computer: ");
    double computer = scanner.nextDouble();

    scanner.close();

    double totalMarks = physics + chemistry + biology + mathematics + computer;
    double percentage = (totalMarks / 500) * 100;

    System.out.println("Percentage: " + percentage + "%");

    if (percentage >= 90) {
      System.out.println("Grade: A");
    } else if (percentage >= 80) {
      System.out.println("Grade: B");
    } else if (percentage >= 70) {
      System.out.println("Grade: C");
    } else if (percentage >= 60) {
      System.out.println("Grade: D");
    } else if (percentage >= 40) {
      System.out.println("Grade: E");
    } else {
      System.out.println("Grade: F");
    }
  }
}
