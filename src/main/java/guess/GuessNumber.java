package guess;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuessNumber {

    int choice = 0;
    String errorMsg = "Wrong Input，Input again";

    public String guess(int[] input, int[] answer) {

        if (choice >= 6) {
            return "You Have No Choice";
        }
        choice++;



        if (input.length != Arrays.stream(input).distinct().count()||input.length != 4) {
            return errorMsg;
        }


        int allcorrect = 0;
        int correct = 0;

        for (int i = 0; i < 4; i++) {
            if (input[i] == answer[i]) {
                allcorrect++;
            }
            for (int asw : answer) {
                if (asw == input[i]) {
                    correct++;
                }
            }
        }
        return allcorrect + "A" + (correct - allcorrect) + "B";
    }


}
