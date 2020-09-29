package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson4CountDivTest {

    @Test
    void solution() {
        Assertions.assertThat(Lesson4CountDiv.solution(6, 11, 2))
                .isEqualTo(3);
    }

    @Test
    void solution1() {
        Assertions.assertThat(Lesson4CountDiv.solution(1, 1, 11))
                .isEqualTo(0);
    }

    @Test
    void solution2() {
        Assertions.assertThat(Lesson4CountDiv.solution(5, 7, 20))
                .isEqualTo(0);
    }

}
