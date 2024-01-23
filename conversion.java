public class conversion {
    //binary to decimal//
    /* 
    public static void binToDec(int binNum) {
        int myNum=binNum;
        int pow=0;
        int decimal=0;
        while (binNum>0) {
            int lastdigit=binNum % 10;
              decimal=decimal+(lastdigit*(int)Math.pow(2, pow));
              pow++;
              binNum = binNum/10;

            
        }
        System.out.println("decimal of " + myNum + "="+ decimal);

    
        
    }

   public static void main(String[] args) {
    binToDec(101010);
    
   } 
   */
//    decimal to binary
public static void decToBin(int n){
    int myNum=n;
    int pow=0;
    int binary=0;
    while (n>0) {
        int rem= n %2 ;
        binary=binary+rem*((int)Math.pow(10, pow));
        pow++;
        n=n/2;
        
    }
    System.out.println("binary form of "  +myNum  +"=" +binary);
}
   public static void main(String[] args) {
    decToBin(20);
    
   }
    
}
