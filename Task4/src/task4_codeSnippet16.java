public class task4_codeSnippet16 {
    public static void main(String[] args) {
        int i, j;
        int max=10;
        /*
        * the initialization and increment/decrement section includes more than one variable*/
        for (i= 0, j= max; i <= max; i++, j--){
            System.out.printf("\n %d + %d = %d", i, j, i+j);
        }
    }
}
