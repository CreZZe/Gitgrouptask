
package gitgrouptask;

public class Gitgrouptask {

    public static void main(String[] args) {
        
        PalindromeChecker checker = new PalindromeChecker();
        UserInput userInput = new UserInput();
        User user = userInput.getUserName();
        checker.checker(userInput.getUserInputWelcome(), user);
    }

}
