public class task4_codeSnippet11 {
    public static void main(String[] args) {
        //Variable, num acts as a counter variable
        int num = 1;
        //Variable, Product will store the result
        int product = 0;
        //Test the condition at the beginning od the loop
        while (num <= 5 ){
            product = num * 10;
            System.out.printf("\n %d*10= %d", num, product);
            num++;//Equivalent to n+=1
        }//Moves the control back to the while statement
        //Statement gets printed on loop termination
        System.out.println("\n Outside the Loop");
    }

}
