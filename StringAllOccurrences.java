import java.util.Scanner;

public class StringAllOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter a character to find its occurrences: ");
        char target = scanner.nextLine().charAt(0);
        
        int[] occurrences = findAllOccurrences(input, target);
        
        if (occurrences.length > 0) {
            System.out.print("Occurrences of '" + target + "' are at indices: ");
            for (int index : occurrences) {
                System.out.print(index + " ");
            }
        } else {
            System.out.println("'" + target + "' not found in the string.");
        }
    }
    
    public static int[] findAllOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        
        int[] occurrences = new int[count];
        int currentIndex = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                occurrences[currentIndex] = i;
                currentIndex++;
            }
        }
        
        return occurrences;
    }
}
