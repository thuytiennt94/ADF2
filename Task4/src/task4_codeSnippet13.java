public class task4_codeSnippet13 {
    public static void main(String[] args) {
        int num = 1, sum = 0;
        /*
        * the body od the loop is executed first, then the condition is evaluated*/
        do{
            sum = sum + num;
            num++;
        }while(num <= 10);
        //prints the value of variable after the loop terminates
        System.out.printf("Sum of 10 Numbers:%d \n", sum);
    }
}
