package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson6TriangleTest {
    @Test
    void solution_test1() {
        Assertions.assertThat(Lesson6Triangle.solution(new int[]{10, 2, 5, 1, 8, 20}))
                .isEqualTo(1);
    }

    @Test
    void solution_test2() {
        Assertions.assertThat(Lesson6Triangle.solution(new int[]{10, 50, 5, 1}))
                .isEqualTo(0);
    }
}
