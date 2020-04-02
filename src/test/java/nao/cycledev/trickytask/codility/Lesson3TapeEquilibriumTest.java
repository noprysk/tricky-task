package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson3TapeEquilibriumTest {

    @Test
    void solution() {
        Assertions.assertThat(Lesson3TapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}))
                .isEqualTo(1);
    }

    @Test
    void solution1() {
        Assertions.assertThat(Lesson3TapeEquilibrium.solution(new int[]{-1000, 1000}))
                .isEqualTo(2000);
    }

    @Test
    void solution2() {
        Assertions.assertThat(Lesson3TapeEquilibrium.solution(new int[]{-2, -3, -4, -1}))
                .isEqualTo(0);
    }
}
