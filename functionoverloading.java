import java.util.*;
public class functionoverloading {
    // function to calculate sum of 2 nums
    /* 
    public static int sum (int a , int b) {
        return a+b;
    }  
    // function to calculate sum of 3 nums
    public static int sum (int a, int b, int c) {
        return a + b + c;
    }  
    public static void main(String[] args) {
        System.out.println(sum(2,6));
        System.out.println(sum(2, 5, 8));

        
    }
    */
     


    // function overloading using datatypes
    //function to calculate in sum
   /*  public static int sum(int a, int b){
        return a+b;
    }
    // function to calculate in float
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(2, 8));
        System.out.println(sum(2.5f, 5.4f));
        
    }
    */



    //  check if a number is prime or not

    /*public static boolean isprime(int n){
        boolean isPrime=true;
        for(int i=2; i<=n-1; i++) {
            if(n % i == 0){
            isPrime=false;
            break;
        }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isprime(2));
        
    } */




    // optimized prime funtion always do in this way //
    /*public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++ ){
            if (n%i == 0){
                return false;

            }
            
        }
        return true;
        
    }
   
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        
    }*/


    // print all prime in a range
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++ ){
            if (n%i == 0){
                return false;

            }
            
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){ // true
                System.out.print(" " +i);

            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(20);
        
    }
    
}
