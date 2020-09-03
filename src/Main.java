import java.util.Scanner;

// Learning IF Else statements
// They should be enclosed in the curly brackets

public class Main {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();
        if (inputtedNum < 5){
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("your shoe selection will make you happy today");
        }

    }
}
