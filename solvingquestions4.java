import java.util.*;
public class solvingquestions4 {

    //question no.1//
    /*public static int sum(int a, int b, int c){
        return (a+b+c)/3;
            
    }
    public static void main(String[] args) {
        System.out.println(sum(4, 5, 6));
    
    }*/



    // question no. 2//
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = sc.nextInt();
        if(isEven(num)){
            System.out.println("number is even");
        } else{
            System.out.println("number is odd");
        }

        }
        
      public static boolean isEven(int n){
            if(n%2 == 0){
                return true;
            }else{
        
        return false;
    }

   }*/

   //question no. 3//

   /*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number");
    int palindrome = sc.nextInt();

    if (ispalindrome(palindrome)) {
        System.out.println("number: " + palindrome + " is a palindrome");
    } else {
        System.out.println("number: " + palindrome + " is not a palindrome");
    }
}

public static boolean ispalindrome(int number) {
    int palindrome = number;
    int reverse = 0;
    while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
    }
     if( number == reverse){
        return true;

     }
   
    return false;
}*/



//question no. 5

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input an integer: ");
    int digits = sc.nextInt();
    System.err.println("The sum is "+sum(digits));
}
public static int sum(int n){
    int sumOfDigits = 0;
    while(n>0){
        int lastdigit= n % 10;
        sumOfDigits += lastdigit;
        n/=10;
    }
    return sumOfDigits;
}

}
