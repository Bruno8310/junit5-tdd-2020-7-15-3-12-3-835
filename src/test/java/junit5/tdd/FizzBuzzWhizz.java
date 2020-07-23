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

    @Test
    void should_return_3_when_play_fizz_buzz_whizz_given_3() {
        // given
        int number = 3;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String actul = fizzBuzzWhizz.playFizzBuzzWhizz(number);

        // then
        assertThat(actul, is("Buzz"));
    }

    @Test
    void should_return_5_when_play_fizz_buzz_whizz_given_5() {
        // given
        int number = 5;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String actul = fizzBuzzWhizz.playFizzBuzzWhizz(number);

        // then
        assertThat(actul, is("Buzz"));
    }
    @Test
    void should_return_7_when_play_fizz_buzz_whizz_given_7() {
        // given
        int number = 7;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String actul = fizzBuzzWhizz.playFizzBuzzWhizz(number);

        // then
        assertThat(actul, is("Buzz"));
    }

    @Test
    void should_return_15_when_play_fizz_buzz_whizz_given_15() {
        // given
        int number = 15;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String actul = fizzBuzzWhizz.playFizzBuzzWhizz(number);

        // then
        assertThat(actul, is("Buzz"));
    }

    @Test
    void should_return_21_when_play_fizz_buzz_whizz_given_21() {
        // given
        int number = 21;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String actul = fizzBuzzWhizz.playFizzBuzzWhizz(number);

        // then
        assertThat(actul, is("Buzz"));
    }
    @Test
    void should_return_35_when_play_fizz_buzz_whizz_given_35() {
        // given
        int number = 35;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        // when
        String actul = fizzBuzzWhizz.playFizzBuzzWhizz(number);

        // then
        assertThat(actul, is("Buzz"));
    }



}
