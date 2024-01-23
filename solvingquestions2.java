import java.util.*;
public class solvingquestions2 {
    public static void main(String[] args) {
        //(1st question)
        /* 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      int number = sc.nextInt();
      if(number <= 0){
        System.out.println("it is negative");
      
      }
      else{
        System.out.println("It is positive");
      }
    */
    //(2nd Question)
    /* 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the temperature: ");
      float input = sc.nextFloat();
      if(input >=100){
        System.out.println("You have a fever.");
      }
      else{
        System.out.println("You dont have a fever.");
      }  
      sc.close();
      */

    //  (3rd question)
    /* 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number:");
    int num = sc.nextInt();

    switch(num){
        case 1: System.out.println("Sunday");
                break;
        case 2: System.out.println("Monday");
                break;
        case 3: System.out.println("Tuesday");
                break;
        case 4: System.out.println("Wednesday");
                break; 
        case 5: System.out.println("Thursday");
                break;
        case 6: System.out.println("Friday");
                break;      
        case 7: System.out.println("Saturday");
                break;
        default: System.out.println("Something wrong");
    }
    sc.close();
    */

    // (5th question)

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Year:");
    int num =sc.nextInt();

    boolean x =(num % 4) == 0;
    boolean y =(num % 100) != 0 ;
    boolean z =((num % 100 == 0) && (num % 400 == 0));


    if(x && (y || z)){
        System.out.println(  "Yes! its a leap year");
    }
    else{
        System.out.println( "No! its not a leap year");
    }
    sc.close();
    }    
}

