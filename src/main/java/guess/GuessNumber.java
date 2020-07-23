package guess;

import java.util.Arrays;

public class GuessNumber {

    public String guess(int[] input,int[] answer){
        if(Arrays.equals(input,answer)){
            return "4A0B";
        }
        return  null;
    }
}
