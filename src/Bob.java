import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String userInput;
do {
    System.out.println("Have a conversation with Bob.");
    String conversation = sc.nextLine();
    if (conversation.contains("?")) {
        System.out.println("Sure");
    } else if (conversation.contains("!")) {
        System.out.println("Whoa, chill out!");
    } else if (conversation.equals("")) {
        System.out.println("Fine. Be that way");
    } else {
        System.out.println("Whatever");
    }
    System.out.println("Continue conversation with Bob? Y/N");
    userInput = sc.nextLine();
    userInput.toLowerCase();
}while(userInput.equals("y"));


    }
}
