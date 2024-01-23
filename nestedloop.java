public class nestedloop {
    public static void main(String[] args) {
        // nested loop
        /* 
        for (int line=1; line<=10; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();

        }
        */


        //print inverted-star pattern
        
        /*for (int line=1; line<=5; line++){
            for(int star=1; star<=5-line+1; star++){
                System.out.print("*");
            }
            System.out.println();

        }
        */

        // print half-pyramid pattern
        /*
        for (int line=1; line<=4; line++ ){
            for(int num=1; num<=line; num++){
                System.out.print(num);
            }
            System.out.println();
        }
        */
        /*
        for (int line=1; line<=4; line++ ){
            for(int num=1; num<=4-line+1; num++){
                System.out.print(num);
            }
            System.out.println();
        }
        */

        //
        int n = 4;
        char ch ='A';
        for(int line=1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    }
    
}
