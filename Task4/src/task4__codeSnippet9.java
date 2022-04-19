public class task4__codeSnippet9 {
    /*
    * An eumeration of Cards Suite
    * */
    enum Cards{
        Spade, Heart, Diamond, Club
    }
    /*
    * @paramargs the command line arguments
    * */
    public static void main(String[] args) {
        Cards card = Cards.Diamond;
        //enum variable is used to control a switch statement
        switch (card){
            case Spade:
                System.out.println("SPADE");
                break;
            case Heart:
                System.out.println("HEART");
                break;
            case Diamond:
                System.out.println("DIAMOND");
                break;
            case Club:
                System.out.println("CLUB");
                break;
        }//end of switch-case statement
    }
}
