import java.util.Scanner;

public class CWH_15_pr_3 {
    public static void main(String[] args) {


        // problem 1
        String village = "Sohgaura";
        village = village.toLowerCase();
       // System.out.println(village.toLowerCase());
        System.out.println(village);

        // Problem 2
        String text = "To Find Ourself" ;
        System.out.println(text.replace(' ','_'));

        // Problem 3
        System.out.println("Enter your name please !");

        Scanner name = new Scanner(System.in);
        String enter = name.next();
        String target = "Dear <|name|> , Thanks a lot!";
        String changedby = target.replace("name",enter);
        System.out.println(changedby);

        // Problem 4
        String mystring ="this string contains double & triple spaces";
        System.out.println(mystring.indexOf("triple"));
        System.out.println(mystring.indexOf(" "));

        // Problem 5
        String letter = "     Dear Nihal Sir , You     are going right Please going on Sir!   ";
        String trimmed =letter.trim();
        System.out.println(trimmed);





    }
}
