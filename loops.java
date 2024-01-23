import java.util.*;
public class loops {
    public static void main(String[] args) {
        //  while loop
        /* 
        int counter=0;
        while(counter<10){
            System.out.println("Neupane");
            // counter++;
            counter+=1;
        }
        */




        // print number from 1 to 10
        /* 

        int num =1;
        while(num <=15){
            System.out.print(num+ " ");
            // num+=1;
            num++;    
        }

        System.out.println();
        */



        // print number from 1 to n
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int range = sc. nextInt();
        int counter = 1;
        while(counter <= range){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        sc.close();
        */



        //print sum of first natural numbers
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc. nextInt();
        int sum=0;
        int i = 1;
        while(i <= n){
            sum+=i;
            i++;
        }
        System.out.print("sum is" +sum);
        sc.close();
        */


        

        // for loop
        /* 
        for(int i=1; i <= 10; i++){
            System.out.println("hello world");
        }
        */


        //Print Square Pattern
        /* 
        for(int i = 1; i<=4; i++){
            System.out.println("****");
        }
        */

        //print reverse of a number
        /* 
        int n=10899;

        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n= n/10; // n/10
        }
        System.out.println();
        */

        //reverse the given original number
        /* 
        int n =10899;
        int rev = 0;
        while(n>0){
            int lastdigit=n%10;
            rev = (rev*10)+ lastdigit;
            n=n/10;
        }
        System.out.println(rev);
        */



        // do-while loop
        /* 
        int i=1;
        do{
            System.out.println("Hello world");
            i++;
        }while(i<= 10);
        */



        //break statement
        /* 
        for(int i=1; i<=5; i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
        */


        // keep entering numbers till user enters a multiple of 10
        /* 
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter your number:");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }

            System.out.println(n);
        } while(true);
        */

        

        // continue statement
        /* 
        for(int i=1; i<=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
            */




        // Display all numbers entered by user except multiple of 10
        /*
         Scanner sc = new Scanner(System.in);
         do{
            System.out.println("enter your number:");
            int n = sc.nextInt();
            if(n % 10 ==0){
                continue;
            }
            System.out.println("number was: " +n);
         } while(true);
         */


        //Check if a number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("n number is a prime number");
        }else{
            boolean isPrime = true;
         for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                isPrime=false;
            }
         }
         if(isPrime==true){
            System.out.println("n number is a prime number");
         }else{
            System.out.println("n is not a prime number");
         }
      
        }
        sc.close();
         
        }
    }
    
