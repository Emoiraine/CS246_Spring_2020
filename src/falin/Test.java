package falin;

import java.util.Scanner;

import static falin.NSALoginController.hashUserPassword;
import static falin.NSALoginController.verifyPassword;

public class Test {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        // Prompt the user
        System.out.print( "Enter Password: " );
        String input = scanner.nextLine();

        User user = new User();

        System.out.println( "Password = " + user.getPassword());
        System.out.println( "Hash = " + user.getHashedPassword());
        System.out.println( "Salt = " + user.getSalt());
        try {
            hashUserPassword(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println( "Password = " + user.getPassword());
        System.out.println( "Hash = " + user.getHashedPassword());
        System.out.println( "Salt = " + user.getSalt());

        System.out.print( "Enter Password: " );
        String secondInput = scanner.nextLine();

        try {
            verifyPassword(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
