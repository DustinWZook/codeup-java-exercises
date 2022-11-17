package util;

public class InputTest {
    public static void main(String[] args){
/*
        Input.getString();
        Input.getString("enter a string");
        boolean yN = Input.yesNo();
        boolean yN = Input.yesNo("yes or no");
        System.out.println(yN);
        Input.getInt();
        Input.getInt(5,10);
        Input.getInt("enter a number");
        Input.getDouble(.5, .9);
*/
        double userDouble = Input.getDouble("enter a floating number");
        System.out.println(userDouble);


    }
}
