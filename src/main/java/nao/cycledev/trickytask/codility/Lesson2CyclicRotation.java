package nao.cycledev.trickytask.codility;

public class Lesson2CyclicRotation {
    public static int[] solution(int[] A, int K) {
        if (A == null || A.length == 0) {
            return A;
        }

        if (A.length == K) {
            return A;
        }

        int[] res = new int[A.length];
        for (int i = 0; i < A.length ; i++) {
            res[(i + K) % A.length] = A[i];
        }

        return res;
    }
}
