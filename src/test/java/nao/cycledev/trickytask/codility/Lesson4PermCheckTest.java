package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson4PermCheckTest {

    @Test
    void solution1() {
        Assertions.assertThat(Lesson4PermCheck.solution(new int[]{4, 1, 3, 2}))
                .isEqualTo(1);
    }

    @Test
    void solution2() {
        Assertions.assertThat(Lesson4PermCheck.solution(new int[]{4, 1, 3}))
                .isEqualTo(0);
    }
}
