package guess;

import java.util.Scanner;

public class Start {

    public static void main(String[] args){
//        int times = 0;
//        GuessNumber guessNumber = new GuessNumber();
//        AnswerGenerator answerGenerator = new AnswerGeneration();
//        int[] answer = answerGenerator.generate();
//        int[] inputGuess = new int[4];
//        Scanner input = new Scanner(System.in);
//        while(times<6){
//            for(int i = 0; i < 4; i++){
//                inputGuess[i] = input.nextInt();
//            }
//            String str ="";
//            for(int num:inputGuess){
//                str+=num+" ";
//            }
//            times++;
//            System.out.println(str+guessNumber.guess(inputGuess,answer));
//        }
//        input.close();
//        System.out.println("You have no chances");
//        System.out.println("You have no chances");

        GuessNumber guessNumber = new GuessNumber();
        while (guessNumber.havaChance()){
            int[] input =guessNumber.getInput();
            int[] answer = guessNumber.getAnswer(new AnswerGeneration());
            System.out.print(guessNumber.guess(input,answer)+" ");
            System.out.println(guessNumber.printInput(input));
        }

        System.out.println("You have no chances");



    }

}

