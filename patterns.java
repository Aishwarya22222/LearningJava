public class patterns {
    /* 
    public static void hollow_rectangle(int totrows, int totcols){
        //outer loop
        for(int i =1; i<=totrows; i++){
            //inner loop
            for( int j=1; j<=totcols; j++){
                if(i==1 || i==totrows || j==1 || j==totcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(4, 05);
        
    }*/
    
    // square
    /*public static void fill_square(int totrows, int totcols){
        //outer loop
        for(int i =1; i<=totrows; i++){
            //inner loop
            for( int j=1; j<=totcols; j++){
                if(i==1 || i<=totrows || j==1 || j<=totcols){
                    System.out.print("*");
                }
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        fill_square(4, 5);
        
    }*/

    //  inverted and rotated half-pyramid
    /*public static void inverted_rotated_half_pyramid(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //to print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //  to print stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        inverted_rotated_half_pyramid(4);
    }*/
    // inverted_rotated_half_pyramid_withnumber// 
    /*public static void inverted_rotated_half_pyramid_withnumber(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop-unmbers
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j +" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        inverted_rotated_half_pyramid_withnumber(5);
    }*/

    //Floyds triangle//
    /* 
    public static void floyds_triangle(int n){
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds_triangle(5);
        
    }
    */

    // 0-1 triangle//
    /* 
    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zero_one_triangle(5);
        
    }
    */


    // butterfly patterns

    /*public static void butterfly(int n){
        //1st half
        // outer loop
        for(int i=1; i<=n; i++){
            // stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces -2*(n-1)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=i; j++){
                System.out.print("*"); 
            }
            System.out.println();
         }
        
         //2nd half
         for(int i=n; i>=1; i--){
            // stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces -2*(n-1)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=i; j++){
                System.out.print("*"); 
            }
            System.out.println();
         }
        }
         
    public static void main(String[] args) {
        butterfly(4);
        
    }
    */

    // solid rhombus
    /* 
    public static void solid_rhombus(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                 System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");

            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        solid_rhombus(7);
        
    }
    */

    //Holllow rhombus
    /* 
    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //boundry rectangle
            for( int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               
        }
        System.out.println();
        }
    }
    
    public static void main(String[] args) {
        hollow_rhombus(4);
        
    }
    */

    // diamond pattern
    public static void diamond(int n){
        //outer looop
        for(int i=1; i<=n; i++){
            //for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--){
            //for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    public static void main(String[] args) {
        diamond(4);
        
    }
}
