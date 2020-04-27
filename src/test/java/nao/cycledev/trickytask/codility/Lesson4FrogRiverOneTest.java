package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lesson4FrogRiverOneTest {

    @Test
    void solution() {
        Assertions.assertThat(Lesson4FrogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}))
                .isEqualTo(6);
    }

    @Test
    void solution1() {
        Assertions.assertThat(Lesson4FrogRiverOne.solution(2, new int[]{2, 2, 2, 2, 2}))
                .isEqualTo(-1);
    }

    @Test
    void solution2() {
        Assertions.assertThat(Lesson4FrogRiverOne.solution(3, new int[]{1, 3, 1, 3, 2, 1, 3}))
                .isEqualTo(4);
    }

    @Test
    void solution3() {
        Assertions.assertThat(Lesson4FrogRiverOne.solution2(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}))
                .isEqualTo(6);
    }

    @Test
    void solution4() {
        Assertions.assertThat(Lesson4FrogRiverOne.solution2(2, new int[]{2, 2, 2, 2, 2}))
                .isEqualTo(-1);
    }

    @Test
    void solution5() {
        Assertions.assertThat(Lesson4FrogRiverOne.solution2(3, new int[]{1, 3, 1, 3, 2, 1, 3}))
                .isEqualTo(4);
    }
}
