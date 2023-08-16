import java.util.Scanner;

public class StringEachCharOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int[] charCounts = countCharacterOccurrences(input);
        
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                char currentChar = (char) i;
                System.out.println("'" + currentChar + "' occurs " + charCounts[i] + " times.");
            }
        }
    }
    
    public static int[] countCharacterOccurrences(String str) {
        int[] charCounts = new int[256]; // Assuming ASCII character set
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCounts[currentChar]++;
        }
        
        return charCounts;
    }
}
