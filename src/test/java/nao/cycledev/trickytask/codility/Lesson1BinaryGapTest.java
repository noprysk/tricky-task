package nao.cycledev.trickytask.codility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson1BinaryGapTest {
    @Test
    void solution1() {
        Assertions.assertThat(Lesson1BinaryGap.solution(9)).isEqualTo(2);
    }

    @Test
    void solution2() {
        Assertions.assertThat(Lesson1BinaryGap.solution(-1)).isEqualTo(0);
    }

    @Test
    void solution3() {
        Assertions.assertThat(Lesson1BinaryGap.solution(529)).isEqualTo(4);
    }

    @Test
    void solution4() {
        Assertions.assertThat(Lesson1BinaryGap.solution(20)).isEqualTo(1);
    }

    @Test
    void solution5() {
        Assertions.assertThat(Lesson1BinaryGap.solution(15)).isEqualTo(0);
    }

    @Test
    void solution6() {
        Assertions.assertThat(Lesson1BinaryGap.solution(32)).isEqualTo(0);
    }

    @Test
    void solution7() {
        Assertions.assertThat(Lesson1BinaryGap.solution(1041)).isEqualTo(5);
    }
}
