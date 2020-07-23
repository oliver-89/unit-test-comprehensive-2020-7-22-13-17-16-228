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

    @Test
    void should_return_2A1B_when_guess_number_given_answer_1234_and_input_1253(){
        //given
        int[] answer = {1,2,3,4};
        int[] input = {1,2,5,3};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber();

        //when
        String result = guessNumber.guess(input,answer);

        //then
        assertEquals("2A1B",result);
    }
    @Test
    void should_return_0A2B_when_guess_number_given_answer_1234_and_input_2156(){
        //given
        int[] answer = {1,2,3,4};
        int[] input = {2,1,5,6};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber();

        //when
        String result = guessNumber.guess(input,answer);

        //then
        assertEquals("0A2B",result);
    }
    @Test
    void should_return_0A0B_when_guess_number_given_answer_1234_and_input_7856(){
        //given
        int[] answer = {1,2,3,4};
        int[] input = {7,8,5,6};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber();

        //when
        String result = guessNumber.guess(input,answer);

        //then
        assertEquals("0A0B",result);
    }

    @Test
    void should_return_WrongInputInputagain_when_guess_number_given_answer_1234_and_input_1123(){
        //given
        int[] answer = {1,2,3,4};
        int[] input = {1,1,2,3};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber();

        //when
        String result = guessNumber.guess(input,answer);

        //then
        assertEquals("Wrong Input，Input again",result);
    }

    @Test
    void should_return_WrongInputInputagain_when_guess_number_given_answer_1234_and_input_15623(){
        //given
        int[] answer = {1,2,3,4};
        int[] input = {1,5,6,2,3};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber();

        //when
        String result = guessNumber.guess(input,answer);

        //then
        assertEquals("Wrong Input，Input again",result);
    }

    @Test
    void should_return_WrongInputInputagain_when_guess_number_given_answer_1234_and_input_156(){
        //given
        int[] answer = {1,2,3,4};
        int[] input = {1,5,6};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber();

        //when
        String result = guessNumber.guess(input,answer);

        //then
        assertEquals("Wrong Input，Input again",result);
    }

    @Test
    void should_return_YouHaveNoChoice_when_guess_number_given_more_than_6_times_answer(){
        //given
        int[] answer = {1,2,3,4};
        int[] input1 = {1,5,6,1};
        int[] input2 = {1,5,6,2};
        int[] input3 = {1,5,6,3};
        int[] input4 = {1,5,6,4};
        int[] input5 = {1,5,6,5};
        int[] input6 = {1,5,6,6};
        int[] input7 = {1,5,6,7};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber();

        //when
        String result1 = guessNumber.guess(input1,answer);
        String result2 = guessNumber.guess(input2,answer);
        String result3 = guessNumber.guess(input3,answer);
        String result4 = guessNumber.guess(input4,answer);
        String result5 = guessNumber.guess(input5,answer);
        String result6 = guessNumber.guess(input6,answer);
        String result7 = guessNumber.guess(input7,answer);

        //then
        assertEquals("You Have No Choice",result7);
    }
}
