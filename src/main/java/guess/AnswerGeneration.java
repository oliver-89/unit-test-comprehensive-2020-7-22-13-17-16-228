package guess;

import java.util.Random;

public class AnswerGeneration implements AnswerGenerator{
    @Override
    public int[] generate() {
          return new Random().ints(0, 9).distinct().limit(4).toArray();
    }
}
