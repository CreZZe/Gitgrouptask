
package gitgrouptask;

public class PalindromeChecker {
    public boolean checker(String input) {
        String inputBackwards = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            inputBackwards += input.charAt(i);
        }
        
        return input.equalsIgnoreCase(inputBackwards);
    }
}
