public class task4_codeSnippet19 {
    public static void main(String[] args) {
        int row, col;
        for (row = 1; row <=5; row++){
            for (col=1; col<=row; col++){
                System.out.print(" * ");
            }//end of inner for loop
            System.out.println();
        }//end of outer for loop
    }
}
