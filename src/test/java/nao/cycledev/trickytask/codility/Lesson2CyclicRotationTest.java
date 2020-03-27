package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson2CyclicRotationTest {

    @Test
    void solution1() {
        Assertions.assertThat(Lesson2CyclicRotation.solution(new int[] {3, 8, 9, 7, 6}, 3))
                .isEqualTo(new int[] {9, 7, 6, 3, 8});
    }

    @Test
    void solution2() {
        Assertions.assertThat(Lesson2CyclicRotation.solution(new int[] {0, 0, 0}, 1))
                .isEqualTo(new int[] {0, 0, 0});
    }

    @Test
    void solution3() {
        Assertions.assertThat(Lesson2CyclicRotation.solution(new int[] {1, 2, 3, 4}, 4))
                .isEqualTo(new int[] {1, 2, 3, 4});
    }

}
