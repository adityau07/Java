// challenge -  37. Create a program to check if a number is an Armstrong number.


// // "APPROACH 1"
//import java.util.Scanner;
//
//class ArmstrongNumber {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the number: ");
//
//        int number = input.nextInt();
//
//        boolean checkArmstrong = isArmStrong(number);
//        if(checkArmstrong){
//            System.out.println("Armstrong Number");
//        }
//        else{
//            System.out.println("Not a Armstrong Number");
//        }
//
//    }
//
//    public static boolean isArmStrong(int num){
//        int numberOfDigits = noOfDigits(num);
//        int numCopy = num;
//        int finalNumber = 0;
//        while(num>0){
//            int lastDigit = num%10;
//            num = num/10;
//            finalNumber = finalNumber+pow(lastDigit,numberOfDigits);
//        }
//        return finalNumber == numCopy;
//    }
//
//    // method for number of digits
//    public static int noOfDigits(int num){
//        int digits = 0;
//        while(num>0){
//            digits++;
//            num= num/10;
//        }
//        return digits;
//    }
//
//    // method for power
//    public static int pow(int num1, int num2){
//        int result = 1;
//        int i=0;
//        while(i<num2){
//            result = result*num1;
//            i++;
//        }
//        return result;
//    }
//}



// // APPROACH 2
class ArmstrongNumber{
    public static void main(String[] args){
        int n = 1;
        int temp = n;
        int arm = 0;

        while(n>0){
            int ld = n%10; // ld = lastDigit
            n = n/10;
            arm = arm + (ld*ld*ld);
        }

        if(temp == arm){
            System.out.println("Given number is Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
