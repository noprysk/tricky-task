package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson2OddOccurrencesInArrayTest {

    @Test
    void solution() {
        Assertions.assertThat(Lesson2OddOccurrencesInArray.solution(new int[] {9, 3, 9, 3, 9, 7, 9}))
                .isEqualTo(7);
    }
}
