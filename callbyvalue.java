/* 
public class callbyvalue {
    public static void swap(int a , int  b){
        int temp=a;
         a=b;
         b=temp;
         System.out.println("a=" +a);
         System.out.println("b="+b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b =10;
        swap(a,b);
        
    }
    
}
*/



//find product of a and b.
/* 
public class callbyvalue {
    public static int multiply(int a , int b ){
        int product = a*b;
        return product;

    }
    public static void main(String[]args){
       int prod= multiply(10,3);
        System.out.println("a*b=" +prod);
        prod = multiply(2, 6);
        System.out.println("a*b=" +prod);
    
    }
}
*/

// factorial of a number
/*public class callbyvalue {
    public static int factorial(int n ){
        int f=1;
        for(int i=1; i<=n; i++){
            f= f * i;
        }
        return f; //factorial of n
    }
    public static void main(String[] args) {
    
        System.out.println(factorial(5));
        
    }

}*/

// Binomial coefficeient
public class callbyvalue {
    public static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
    public static int bicoe(int n , int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);

        int bicoe= n_fact/(r_fact*nmr_fact);
        return bicoe;

    }
    public static void main(String[] args) {
        System.out.println(bicoe(10, 2));
        
    }
}






