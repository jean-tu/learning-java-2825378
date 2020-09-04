import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What does blue and yellow make?";
        String choiceOne = "green";
        String choiceTwo = "orange";
        String choiceThree = "brown";
        Scanner input = new Scanner(System.in);

        String correctAnswer = choiceOne;

        // Write a print statement asking the question
        System.out.println(question);

        // Write a print statement giving the answer choices
        System.out.println("Choose one of the following choices: " + choiceOne + " " + choiceTwo + " " + choiceThree);

        // Have the user input an answer
        String answer = input.next();

        // Retrieve the user's input
        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        if(choiceOne.equals(answer.toLowerCase())){
            System.out.println("CONGRATS! You chose the right answer");
        } else {
            System.out.println("SORRY, you choose the incorrect answer. The answer is " + correctAnswer);
        }
    }

}
