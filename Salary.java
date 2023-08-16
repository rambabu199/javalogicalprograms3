/*14. Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross salary according to following:
BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
BasiJAVASalary > 20000 : HRA = 30%, DA = 95%
*/
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        scanner.close();

        double hra, da;
        
        if (basicSalary <= 10000) {
            hra = 0.2 * basicSalary;
            da = 0.8 * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da = 0.9 * basicSalary;
        } else {
            hra = 0.3 * basicSalary;
            da = 0.95 * basicSalary;
        }

        double grossSalary = basicSalary + hra + da;
        
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}
