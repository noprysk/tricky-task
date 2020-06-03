package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson4MissingIntegerTest {

    @Test
    void solution1() {
        Assertions.assertThat(Lesson4MissingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}))
                .isEqualTo(5);
    }

    @Test
    void solution2() {
        Assertions.assertThat(Lesson4MissingInteger.solution(new int[]{1, 2, 3}))
                .isEqualTo(4);
    }

    @Test
    void solution3() {
        Assertions.assertThat(Lesson4MissingInteger.solution(new int[]{-1, -2}))
                .isEqualTo(1);
    }

    @Test
    void solution4() {
        Assertions.assertThat(Lesson4MissingInteger.solution(new int[]{2}))
                .isEqualTo(1);
    }
}
