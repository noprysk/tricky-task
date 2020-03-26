package nao.cycledev.trickytask.codility;

public class Lesson1BinaryGap {
    public static int solution(int N) {
        if (N < 1 || N > 2147483647) {
            return 0;
        }

        int count = 0;
        int max = 0;

        String value = Integer.toBinaryString(N);
        System.out.println("Binary: " + value + "; for: " + N);

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
