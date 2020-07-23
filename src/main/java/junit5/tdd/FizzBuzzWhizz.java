package junit5.tdd;

public class FizzBuzzWhizz {

    public String playFizzBuzzWhizz(int number) {
        if (number % 7 == 0) {
            return "Whizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
