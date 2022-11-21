import java.util.concurrent.ThreadLocalRandom;

public class ServerNameGenerator {
    public static String noun;
    public static String adjective;
    public static String[] nouns = {"cars","trucks","motorcycles","trains","airplanes","subway","trolley","ferries", "skateboards","roller blades"};
    public static String [] adjectives = {"good","new","old","broken","fast","slow","yellow","red","green","blue"};

    public static String randomEle(String[] arr){
        return arr[ThreadLocalRandom.current().nextInt(arr.length)];
    }
    public static void serverName(){
        adjective = randomEle(adjectives);
        noun = randomEle(nouns);
        System.out.println("Here is your server name : "+adjective+"-"+noun);

    }
    public static void main(String[] args){

        serverName();

    }
}
