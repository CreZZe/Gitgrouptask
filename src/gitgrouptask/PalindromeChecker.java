
package gitgrouptask;

public class PalindromeChecker {
    public void checker(String input, User user) {
        String inputBackwards = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            inputBackwards += input.charAt(i);
        }
        
        if (input.equalsIgnoreCase(inputBackwards)){
            System.out.println("Detta ord är ett palindrom! Bra jobbat " + user.getUsername());
        }
        else{
            System.out.println("Tyvärr " + user.getUsername() + ". Ditt ord var inte ett palindromeeee");
        }
    }
}
