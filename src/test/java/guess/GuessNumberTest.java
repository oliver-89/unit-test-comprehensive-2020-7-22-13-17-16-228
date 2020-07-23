package guess;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GuessNumberTest {

    @Test
    void should_return_4A0B_when_guess_number_given_answer_1234_and_input_1234(){
        //given
        int[] answer = {1,2,3,4};
        int[] input = {1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber();

        //when
        String result = guessNumber.guess(input,answer);

        //then
        assertEquals("4A0B",result);
    }

    @Test
    void should_return_2A2B_when_guess_number_given_answer_1234_and_input_1243(){
        //given
        int[] answer = {1,2,3,4};
        int[] input = {1,2,4,3};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber();

        //when
        String result = guessNumber.guess(input,answer);

        //then
        assertEquals("2A2B",result);
    }

    @Test
    void should_return_0A4B_when_guess_number_given_answer_1234_and_input_4321(){
        //given
        int[] answer = {1,2,3,4};
        int[] input = {4,3,2,1};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber();

        //when
        String result = guessNumber.guess(input,answer);

        //then
        assertEquals("0A4B",result);
    }
}
