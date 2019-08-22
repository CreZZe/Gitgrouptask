package gitgrouptask;

import java.util.Scanner;

public class UserInput {

    Scanner scan = new Scanner(System.in);

    public String getUserInputWelcome(){
        System.out.println("Skriv in ett ord för att kolla om det är ett palindrom.");
        return scan.nextLine();
    }

    public User getUserName(){
        System.out.println("Hej kompis, skriv in ditt namn: ");
        return new User(scan.nextLine());
    }

    public String getInput() {
        System.out.println("Vill du testa en gång till? \"Quit\" för att avsluta.");
        return scan.nextLine();
    }

}
