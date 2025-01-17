package study.setcollection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @DisplayName("size 검증")
    @Test
    void setSize() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @DisplayName("contains 검증")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(int number) {
        assertThat(numbers.contains(number)).isTrue();
    }
    @DisplayName("contains true, false 검증")
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false"}, delimiter = ':')
    void contains(int number, boolean expected) {
        assertThat(numbers.contains(number)).isEqualTo(expected);
    }
}
