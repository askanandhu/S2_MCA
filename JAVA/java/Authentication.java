import java.util.Scanner;

public class Authentication {

    // Actual username and password of the user
    static final String USERNAME = "username";
    static final String PASSWORD = "password";
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try {
            // Read Username
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            
            // Validate Username
            if (!username.equals(USERNAME)) {
                throw new InvalidUsernameException();
            } 
            
            // Read Password
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            // Validate Password
            if (!password.equals(PASSWORD)) {
                throw new InvalidPasswordException();
            }
            
            System.out.println("Logged In!");

        } catch (InvalidUsernameException | InvalidPasswordException e) {
            // Multicatch: Catching multiple exceptions in a single catch block
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }

}

class InvalidUsernameException extends Exception {

    InvalidUsernameException() {
        super("Invalid Username!"); 
    }

}

class InvalidPasswordException extends Exception {

    InvalidPasswordException() {
        super("Invalid Password!");
    }

}
