public class task4_codeSnippet8 {
    /*
    *@paramargs the command line arguments
    */
    public static void main(String[] args) {
        String day="Monday";
        //String statenment contains an expression of typeString
        switch (day) {
            case "Sunday":
                System.out.println("First day of the Week");
                break;
            case "Monday":
                System.out.println("Second Day of the Week");
                break;
            case "Tuesday":
                System.out.println("Third Day of the Week");
                break;
            case "Wednesday":
                System.out.println("Fourth Day of the Week");
                break;
            case "Thursday":
                System.out.println("Fifth Day of the Week");
                break;
            case "Friday":
                System.out.println("Sixth Day of the Week");
                break;
            case "Staturday":
                System.out.println("Seventh Day of the Week");
                break;
            default:
                System.out.println("InvalidDay");
        }//End of switch-cas statement
    }
}
