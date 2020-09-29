package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson6MaxProductOfThreeTest {

    @Test
    void solution() {

        Assertions.assertThat(Lesson6MaxProductOfThree.solution(new int[]{-3, 1, 2, -2, 5, 6}))
                .isEqualTo(60);
    }
}
