public class ternaryoperator {
    public static void main(String[] args) {
        int number = 4;

        // ternary operator

        String type = ((number%2)==0) ? "Even" : "Odd";
        System.out.println(type);


        int marks = 67;
        String reportcard = marks >=33 ? "Pass" : "Fail";
        System.out.println(reportcard);

    }
}
