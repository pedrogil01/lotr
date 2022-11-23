import java.util.Scanner;

public class Terminal {

    private static Scanner scanner = new Scanner(System.in);


    public static int printMessage(String string) {
        
        System.out.println(string);

        return scanner.nextInt();
    }



}