package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitTest {

    @DisplayName("1,2을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인")
    @ParameterizedTest
    @ValueSource(strings = "1,2")
    void split(String actual) {

        String [] splits = actual.split(",");

        assertThat(actual).isEqualTo("1,2");
        assertThat(splits).contains("1");
        assertThat(splits).contains("2");
        assertThat(splits).containsExactly("1","2");
    }
}
