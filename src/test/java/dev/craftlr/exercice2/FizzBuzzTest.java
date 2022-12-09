package dev.craftlr.exercice2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzzer fizzBuzz = new FizzBuzzer();

    @Disabled
    @Test
    public void test_computeString_Should_Return_1_when_1() {
        String result = fizzBuzz.computeString(1);
        assertEquals("1", result);
    }

    @Disabled
    @Test
    public void test_computeString_Should_Return_2_when_2() {
        String result = fizzBuzz.computeString(2);
        assertEquals("2", result);
    }

    @Disabled
    @Test
    public void test_computeString_Should_Return_Fizz_when_3() {
        String result = fizzBuzz.computeString(3);
        assertEquals("Fizz", result);
    }

    @Disabled
    @Test
    public void test_computeString_Should_Return_4_when_4() {
        String result = fizzBuzz.computeString(4);
        assertEquals("4", result);
    }

    @Disabled
    @Test
    public void test_computeString_Should_Return_Buzz_when_5() {
        String result = fizzBuzz.computeString(5);
        assertEquals("Buzz", result);
    }

    @Disabled
    @Test
    public void test_computeString_Should_Return_Fizz_when_6() {
        String result = fizzBuzz.computeString(6);
        assertEquals("Fizz", result);
    }

    @Disabled
    @Test
    public void test_computeString_Should_Return_Fizz_when_9() {
        String result = fizzBuzz.computeString(9);
        assertEquals("Fizz", result);
    }

    @Disabled
    @Test
    public void test_computeString_Should_Return_Buzz_when_10() {
        String result = fizzBuzz.computeString(10);
        assertEquals("Buzz", result);
    }

    @Disabled
    @Test
    public void test_computeString_Should_Return_FizzBuzz_when_15() {
        String result = fizzBuzz.computeString(15);
        assertEquals("FizzBuzz", result);
    }

    @Disabled
    @Test
    public void test_computeList_Should_Return_a_sequence_of_5_elements_when_5() {
        String[] result = fizzBuzz.computeList(5);
        assertEquals(5, result.length);
    }

    @Disabled
    @Test
    public void test_computeList_Should_Return_a_sequence_of_5_FizzBuzz_elements_when_5() {
        String[] result = fizzBuzz.computeList(5);
        assertEquals("1", result[0]);
        assertEquals("2", result[1]);
        assertEquals("Fizz", result[2]);
        assertEquals("4", result[3]);
        assertEquals("Buzz", result[4]);
    }

    @Disabled
    @Test
    public void test_computeList_Should_Return_a_sequence_of_15_FizzBuzz_elements_when_15() {
        String[] result = fizzBuzz.computeList(15);
        for (int i = 0; i < result.length; ++i) {
            assertEquals(fizzBuzz.computeString(i + 1), result[i]);
        }
    }
}
