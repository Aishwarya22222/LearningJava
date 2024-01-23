import java.util.*;
public class conditionalstatement {
    public static void main(String[] args) {
        // if else//
        /* 
        int age=16;
        if(age>=18){
            System.out.println("vote");
        }

        if (age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("cannot vote");
        }
        */


        //  print the largest of 2//
        /* 
        int a=1, b=3;
        if(a>=b){
            System.out.print("a is largest of 2");
            System.out.println(".....");
        }
        else{
            System.out.println("b is largest of 2");
        }
        */


        // Print if a number is Odd or Even//
        /* 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2== 0) {
            System.out.println("Even");

        }
        else{
            System.out.println("ODD");
        }
       sc.close();
       */


    // else if statement
    /* 
    int age=21;
    if (age>=18){
        System.out.println("adult");
    }
    else if(age>=13 && age<18){
        System.out.println("teenager");
    }
    else{
        System.out.println("child");
    }
    */

    // Income tax calculator
    /* 
    Scanner sc = new Scanner(System.in);
    int income =sc .nextInt();
    int tax;
    if(income<500000){
        tax = 0;
    }
    else if(income>=500000 && income< 1000000){
        tax =(int)(income*0.2);
    }
    else{
        tax = (int)(income*0.3);
    }
    System.out.println("Your tax is :" + tax);
    */

    //Print the largest of 3//
     int A=2 , B=5 , C=6;
     if((A>=B) && (A>=C)){
        System.out.println("A");
     }

     else if((B>=C)){
        System.out.println("B");
     }
     else{
        System.out.println("c");
     }

    }
}
