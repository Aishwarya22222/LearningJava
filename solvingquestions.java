/* 
public class solvingquestions {

    public static void main(String[] args) {
        int a= 10;
        int b= 12;
        int c= 15;
        int sum = a+ b +c;
        int n = 3;
        System.out.println(sum);
        System.out.println(sum/n);
        
        
    }
}

*/

import java.util.*;
public class solvingquestions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int area = a*a;
        // System.out.println("area of a square is" + area);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Bill is" +  total );

        // Add on with 18% tax

        float newtotal = total + (0.18f+ total);
        System.out.println(newtotal);
       
        




         sc.close();


    }
}