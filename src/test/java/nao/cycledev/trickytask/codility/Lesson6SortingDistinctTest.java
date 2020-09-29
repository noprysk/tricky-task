package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson6SortingDistinctTest {
    @Test
    void solution() {
        Assertions.assertThat(Lesson6SortingDistinct.solution(new int[]{2, 2, 1, 3, 1, 1}))
                .isEqualTo(3);
    }
}
