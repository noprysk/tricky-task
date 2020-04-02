package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson3PermMissingElemTest {

    @Test
    void solution() {
        Assertions.assertThat(Lesson3PermMissingElem.solution(new int[]{2, 3, 1, 5}))
                .isEqualTo(4);
    }
}
