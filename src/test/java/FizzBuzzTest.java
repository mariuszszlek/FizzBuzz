import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should1When1() {
        String result = fizzBuzz.convert(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void should2When2() {
        String result = fizzBuzz.convert(2);
        assertThat(result).isEqualTo("2");
    }

    @Test
    void shouldFizzWhen3() {
        String resoult = fizzBuzz.convert(3);
        assertThat(resoult).isEqualTo("Fizz");
    }

    @Test
    void shouldFizzWhen6() {
        String resoult = fizzBuzz.convert(6);
        assertThat(resoult).isEqualTo("Fizz");
    }

    @Test
    void shouldBuzzWhen5() {
        String resoult = fizzBuzz.convert(5);
        assertThat(resoult).isEqualTo("Buzz");
    }

    @Test
    void shouldBuzzWhen10() {
        String resoult = fizzBuzz.convert(10);
        assertThat(resoult).isEqualTo("Buzz");
    }

    @Test
    void shouldFizzBuzzWhen15() {
        String resoult = fizzBuzz.convert(15);
        assertThat(resoult).isEqualTo("FizzBuzz");
    }

    @Test
    void shouldFizzBuzzWhen45() {
        String resoult = fizzBuzz.convert(45);
        assertThat(resoult).isEqualTo("FizzBuzz");
    }

}
