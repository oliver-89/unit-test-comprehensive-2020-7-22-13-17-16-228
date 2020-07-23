package guess;

import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        int[] inputGuess = new int[4];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            inputGuess[i] = input.nextInt();
        }
        GuessNumber guessNumber = new GuessNumber();
        AnswerGenerator answerGenerator = new AnswerGeneration();
        int[] answer = answerGenerator.generate();
        String str ="";
        for(int num:inputGuess){
            str+=num+" ";
        }
        System.out.println(str+guessNumber.guess(inputGuess,answer));

    }
}

