public class task4_codeSnippet10 {
    /*
    * */
    public static void main(String[] args) {
        //String declaration
        String day = "Monday";
        String hour = "am";
        //Outer switch statement
        switch (day){
            case "Sunday":
                System.out.println("Sunday is a Holiday ... ");
                //Inner switch statement
                switch (hour){
                    case "am":
                        System.out.println("GoodMorning");
                        break;
                    case "pm":
                        System.out.println("GoodEvening");
                        break;
                }//End of inner switch-case statement
                break;//terminates the outer case statement
            case "Monday":
                System.out.println("Monday is a WorkingDay... ");
                //Inner switch statement
                switch (hour){
                    case "am":
                        System.out.println("GoodMorning");
                        break;
                    case "pm":
                        System.out.println("GoodEvening");
                        break;
                }//End of inner switch-case statement
                break;
            default:
                System.out.println("InvalidDay");
        }//End of the outer Switch-case statement

    }
}
