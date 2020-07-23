package guess;

import java.util.Arrays;

public class GuessNumber {

    public static String guess(int[] input, int[] answer){
        int num1 = 0;
        int num2 = 0;
        if(Arrays.equals(input,answer)){
            return "4A0B";
        }
        for(int i = 0;i<4;i++){
            if(input[i] == answer[i]){
                num1++;
            }
            for(int asw:answer){
                if(asw==input[i]){
                    num2++;
                }
            }
        }
        if(num1==2&&(num2-num1)==2){
            return "2A2B";
        }
        if(num1==0&&(num2-num1)==4){
            return "0A4B";
        }
        if(num1==2&&(num2-num1)==1){
            return "2A1B";
        }
        return null;
    }

}
