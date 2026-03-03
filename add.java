import java.util.Scanner; // Import the Scanner class to read user input

public class add {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number:");
        num = scanner.nextInt(); // Read the user input
        scanner.close(); // Close the scanner

        // Check if the number is divisible by 2 using the modulus operator
        if (num % 2 == 0) {
            System.out.println("The entered number " + num + " is Even");
        } else {
            System.out.println("The entered number " + num + " is Odd");
            print(even or Odd);
        }
    }
}
