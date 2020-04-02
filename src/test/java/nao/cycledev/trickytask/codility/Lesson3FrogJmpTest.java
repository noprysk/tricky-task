package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson3FrogJmpTest {

    @Test
    void solution1() {
        Assertions.assertThat(Lesson3FrogJmp.solution(10, 85, 30))
                .isEqualTo(3);
    }

    @Test
    void solution2() {
        Assertions.assertThat(Lesson3FrogJmp.solution(1, 5, 2))
                .isEqualTo(2);
    }

    @Test
    void solution3() {
        Assertions.assertThat(Lesson3FrogJmp.solution1(10, 85, 30))
                .isEqualTo(3);
    }

    @Test
    void solution4() {
        Assertions.assertThat(Lesson3FrogJmp.solution1(1, 5, 2))
                .isEqualTo(2);
    }
}
