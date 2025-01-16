// challenge -  38. Create a program to verify if a number is a palindrome

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        boolean isNumberPalindrome = isPalindromeNumber(number);
        if(isNumberPalindrome){
            System.out.println("Given Number is Plaindrome");
        }
        else{
            System.out.println("Not Plaindrome number");
        }
    }

    public static boolean isPalindromeNumber(int num){
        int revNum = reverseNumber(num);
        return num == revNum;
    }

    public static int reverseNumber(int num){
        int rev = 0;
        while(num>0){
            int lastDigit = num%10;
            rev = rev*10 + lastDigit;
            num = num/10;
        }
        return rev;
    }
}
