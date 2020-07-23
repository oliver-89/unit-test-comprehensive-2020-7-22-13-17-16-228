package guess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {

    @Test
    void should_return_4A0B_when_guess_number_given_answer_1234_and_input_1234(){
        //given
        int[] answer = {1,2,3,4};
        int[] input = {1,2,3,4};
        //when
        GuessNumber guessNumber = new GuessNumber();
        String result = guessNumber.guess(input);
        //then
        assertEquals("4A0B",result);
    }
}
