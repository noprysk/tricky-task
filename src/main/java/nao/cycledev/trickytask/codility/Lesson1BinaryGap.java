package nao.cycledev.trickytask.codility;

public class Lesson1BinaryGap {
    public static int solution(int A) {
        if (A < 1 || A > 2147483647) {
            return 0;
        }

        int count = 0;
        int max = 0;

        String value = Integer.toBinaryString(A);
        System.out.println("Binary: " + value + "; for: " + A);

        for (Character c : value.toCharArray()) {
            if (c == '0') {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }

        return max;
    }
}
