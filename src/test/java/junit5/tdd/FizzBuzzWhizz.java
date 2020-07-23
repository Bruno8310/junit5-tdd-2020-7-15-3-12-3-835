package junit5.tdd;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class FizzBuzzWhizz {

    @Test
    void should_return_1_when_play_fizz_buzz_whizz_given_1() {
        // given
        int number = 1;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String actul = fizzBuzzWhizz.playFizzBuzzWhizz(number);

        // then
        assertThat(actul, is("1"));
    }

}