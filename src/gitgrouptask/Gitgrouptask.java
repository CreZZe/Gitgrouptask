
package gitgrouptask;

public class Gitgrouptask {

    public static void main(String[] args) {
            PalindromeChecker checker = new PalindromeChecker();
            UserInput userInput = new UserInput();
            User user = userInput.getUserName();
            
            System.out.println("Välkommen till palindromspelet " + user.getUsername());
            
            while (true) {
                checker.checker(userInput.getUserInputWelcome(), user);
                
                
                if (userInput.getInput().equalsIgnoreCase("quit")) {
                    break;
                }
        }
    }

}
