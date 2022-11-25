import java.util.Scanner;

public class Terminal {

    private static Scanner scanner = new Scanner(System.in);


    public static int printMessage(String string) {
        
        System.out.println(string);

        return scanner.nextInt();
    }

    public static void pressAKey( String msg){
        System.out.println(msg);
        scanner.next();
    }



}