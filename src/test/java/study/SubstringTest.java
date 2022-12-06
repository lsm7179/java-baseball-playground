package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class SubstringTest {

    @DisplayName("(1,2)값이 주어졌을 때 substring() 메소드를 활용해 ()을 제거하고 1,2를 반환 검증")
    @ParameterizedTest
    @ValueSource(strings = "(1,2)")
    void substring(String actual) {
        String substring = actual.substring(1,4);

        assertThat(actual).isEqualTo("(1,2)");
        assertThat(substring).isEqualTo("1,2");

    }
}
