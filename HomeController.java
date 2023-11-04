import java.util.*;
//class written by Gaurav and testcases provided by Roj
public class HomeController {
    //placeholder class for testing purposes
    public class User {
        private String username;
        private String password;

        User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }

    ArrayList<User> database = new ArrayList<>();

    /* Test case for authentication (Roj) : should be able to deny users from logging in in addition
    to displaying a message if a matching username is not found.
     */
    public void authenticate(String username, String password) {
        for (User user : database) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Authentication successful");
                return;
            }
        }
        System.out.println("Authentication failed. Username or password is incorrect.");
    }

    /*
    Test case for creating a new user (Roj) : when user registers, an existing username must not be used.
    If so, registration is rejected and a message is displayed.

    Validation of user name and password (Gaurav)

    Display Name is valid if it meets the following requirements
    the new name is unique, minimum of 3 characters and maximum of 16
    characters long, it can contain the following:
    letters A-Z, letters a-z, digits 0-9, and special
    characters !@,#$%^&*()-_+=,  .

    password is valid if it meets the following requirements:
    minimum of 12 characters and a maximum of 16.
    Must contain an uppercase letter A-Z.
    Must contain a lowercase letter a-z.
    Must contain a digit.
    Must contain one of the following special characters !@,#$%^&*()-_+=, .
    */
    public void createUser(String username, String password) {
        if (!isUniqueUsername(username)) {
            System.out.println("User registration failed. Username already exists.");
        } else if (isUsernameValid(username) && isPasswordValid(password)) {
            database.add(new User(username, password));
            System.out.println("User registration successful");
        } else {
            System.out.println("User registration failed. Please check the requirements.");
        }
    }

    private boolean isUsernameValid(String username) {
        return username.matches("^[A-Za-z0-9!@,#$%^&*()\\-+=\\.]{3,16}$");
    }

    private boolean isPasswordValid(String password) {
        return password.length() >= 12 &&
                password.length() <= 16 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[!@,#$%^&*()\\-+=\\.].*");
    }

    private boolean isUniqueUsername(String username) {
        for (User user : database) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    // test class HomeController
    public static void main(String[] args) {
        HomeController controller = new HomeController();

        controller.createUser("user1", "Password123!"); //Should be successful
        controller.createUser("user2", "Password456@"); //Should be successful
        controller.createUser("user2", "Password897!"); //Should fail (duplicate username)

        controller.authenticate("user1", "Password123!"); // Should be successful
        controller.authenticate("user2", "WrongPassword");  // Should fail 
    }


}
