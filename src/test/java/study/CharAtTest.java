package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CharAtTest {

    @DisplayName("charAt() 메소드를 활용해 특정 위치의 문자를 검증")
    @ParameterizedTest
    @ValueSource(strings = "abc")
    void charAt(String actual) {
        char a = actual.charAt(0);
        char b = actual.charAt(1);
        char c = actual.charAt(2);

        assertThat(actual).isEqualTo("abc");
        assertThat(a).isEqualTo('a');
        assertThat(b).isEqualTo('b');
        assertThat(c).isEqualTo('c');

        assertThatThrownBy(() -> {
            actual.charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessage("String index out of range: 4");
    }
}
