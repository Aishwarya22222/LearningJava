import java.util.*;
public class solvingquestions3{
    public static void main(String[] args) {

        // Solving question no. 2
        /* 
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.println("Enter the number");
            num = sc.nextInt();
            if(num%2 == 0){
                evenSum =+  num;
            } else{
                oddSum =+ num;
            }
            
               
                System.out.println("DO you want to continue? Press 1 for Yes or 0 for No");
                choice=sc.nextInt();
             }while(choice==1);
             System.out.println("sum of even numbers: "+ evenSum);
             System.out.println("sum of even numbers: "+ oddSum);
             */
            

             

             // solution for question no. 3
             /* 
             Scanner sc = new Scanner(System.in);
             int fact = 1 ;
             System.out.println("Enter any positive number:");
             int num = sc.nextInt();

             for(int i=1; i<=num; i++){
             fact *= i;
            }
            System.out.println("Factorial:" +fact);
            */



            // multiplication table of any number from user inputs
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number");
            int num = sc.nextInt();

            for(int i=1; i<=10; i++){
                System.out.println(num + "*" +i +"=" + num*i);
            }
              
        }

    }

