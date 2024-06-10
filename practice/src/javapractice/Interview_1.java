package javapractice;

import java.util.Scanner;

public class Interview_1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        // Find the nearest palindrome
        int nearestLowerPalindrome = findNearestLowerPalindrome(inputNumber);
        int nearestHigherPalindrome = findNearestHigherPalindrome(inputNumber);

        // Output
     // Determine the closer palindrome
        int result = (inputNumber - nearestLowerPalindrome) < (nearestHigherPalindrome - inputNumber)
                ? nearestLowerPalindrome
                : nearestHigherPalindrome;

        // Output
        System.out.println("The nearest palindrome is: " + result);

        scanner.close();
	}
	
	
	 private static int findNearestLowerPalindrome(int number) {
	        while (!isPalindrome(--number)) ;
	        return number;
	    }

	    // Function to find the nearest higher palindrome
	    private static int findNearestHigherPalindrome(int number) {
	        while (!isPalindrome(++number)) ;
	        return number;
	    }

	    // Function to check if a number is palindrome
	    private static boolean isPalindrome(int number) {
	        int originalNumber = number;
	        int reverse = 0;

	        while (number != 0) {
	            int remainder = number % 10;
	            reverse = reverse * 10 + remainder;
	            number /= 10;
	        }

	        return originalNumber == reverse;
	    }

}
