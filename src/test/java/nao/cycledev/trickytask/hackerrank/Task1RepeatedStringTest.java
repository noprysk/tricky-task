package nao.cycledev.trickytask.hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1RepeatedStringTest {

    @Test
    void repeatedString() {
        Assertions.assertThat(Task1RepeatedString.repeatedString("abcac", 10)).isEqualTo(4);

        Assertions.assertThat(Task1RepeatedString.repeatedString("b", 10)).isEqualTo(0);

        Assertions.assertThat(Task1RepeatedString.repeatedString("aba", 10)).isEqualTo(7);

        Assertions.assertThat(Task1RepeatedString.repeatedString("a", 1000000000000L)).isEqualTo(1000000000000L);
    }
}
