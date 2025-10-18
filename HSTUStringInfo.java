import java.util.Scanner;

public class HSTUStringInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        int totalChars = input.length();

        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        String lowerCase = input.toLowerCase();
        String upperCase = input.toUpperCase();

        System.out.println("Total characters: " + totalChars);
        System.out.println("Total vowels: " + vowelCount);
        System.out.println("Lower case: " + lowerCase);
        System.out.println("Upper case: " + upperCase);
    }
}
