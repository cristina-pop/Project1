package Homework_week1;

public class Homework1 {

    //    1. Calculate the sum of the first 100 numbers higher than 0
    int calculateSum() {
        int sum = 0;

        for (int i = 1; i < 101; i++) {
            sum = sum + i;
            System.out.println("i = " + i + "; sum = " + sum);
        }
        return sum;
    }

    //    2. Display the smallest number from an array of number
    int smallestNumber() {
        int a[] = {78, 896, 543, 2, -43, 7645, 97, 0, 30};
        int smallest = a[0];
        int currentmin = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < currentmin) {
                currentmin = a[i];
            } else
                smallest = currentmin;
            // System.out.println("a[i]= " + a[i] + "; Smallest number so far is: " + currentmin);
        }
        System.out.println("Smallest number in the array is: " + smallest);
        return smallest;
    }

    //    3. Display the max digit from a number.
    int maxDigit(int nr) {
        int largest = 0;
        int rem;
        System.out.println("Number is: " + nr);
        while (nr != 0) {
            rem = nr % 10;
            largest = Math.max(rem, largest);
            nr = nr / 10;
        }
        System.out.println("Largest digit is: " + largest);
        return largest;
    }

//    4. Check if a number is palindrom( e.g palindrom 1221, 34143)
    static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            System.out.println("The number " + number + " is a palindrome");
            return true;
        } else {
            System.out.println("The number " + number + " is not a palindrome");
            return false;
        }
    }
//    5. Display all the prime numbers lower than a given number


}
