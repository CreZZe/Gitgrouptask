package gitgrouptask;

import java.util.Scanner;

public class UserInput {

    Scanner scan = new Scanner(System.in);

    public String getUserInputWelcome(){
        System.out.println("Välkommen till palindromspelet. Skriv in ett ord för att kolla om det är ett palindrom");
        return scan.nextLine();
    }


}
