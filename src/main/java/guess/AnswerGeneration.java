package guess;

import java.util.Random;

public class AnswerGeneration implements AnswerGenerator{
    @Override
    public int[] generate() {
        int[] answer= new int[4];
        for(int i =0;i<4;i++){
            Random rand = new Random();
            int num = rand.nextInt(10);
            for(int asw:answer){
                if(asw==num){
                    i--;
                    continue;
                }
            }
            answer[i] = num;
        }
        return answer;
    }
}
