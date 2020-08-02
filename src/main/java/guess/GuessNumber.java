package guess;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuessNumber {
    int times = 0;

    public Boolean havaChance(){
        if (times<6) {
            times++;
            return true;
        }
        return false;
    }

    public String printInput(int[] input){
        StringBuilder str = new StringBuilder();
        for(int num:input){
            str.append(num).append(" ");
        }
        return str.toString();
    }

    public int[] getInput(){
        int[] inputGuess = new int[4];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            inputGuess[i] = input.nextInt();
        }
        return inputGuess;
    }

    public int[] getAnswer(AnswerGenerator answerGenerator){

        return answerGenerator.generate();
    }


    public String guess(int[] input, int[] answer) {

        if (isInputValid(input)) {
            int allCorrect = allCorrect(input,answer);
            int correct = correct(input,answer);
            return format(allCorrect,correct);
        }

        return "Wrong Input，Input again";
    }

    public int allCorrect(int[] input, int[] answer){
        int allCorrect =0;
        for (int i =0;i<input.length;i++){
            if(input[i]==answer[i]){
                allCorrect++;
            }
        }
        return allCorrect;
    }

    public int correct(int[] input, int[] answer){
        int correct =0;
        for (int num:input){
            for(int asw:answer){
                if (num==asw){
                    correct++;
                }
            }
        }
        return correct;
    }

    public String format(int allCorrect,int correct){
        return allCorrect+"A"+(correct - allCorrect) + "B";
    }


    public boolean isInputValid(int[] input){
        return input.length == Arrays.stream(input).distinct().count()&&input.length == 4;
    }


}
