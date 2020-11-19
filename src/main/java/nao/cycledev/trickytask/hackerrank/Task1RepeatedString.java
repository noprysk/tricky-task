package nao.cycledev.trickytask.hackerrank;

public class Task1RepeatedString {
    public static long repeatedString(String s, long n) {
        long count = 0;
        final long quotient = n / s.length();
        if (quotient > 0) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    count++;
                }
            }
            count = quotient * count;
        }

        final long remainder = n % s.length();
        if (remainder > 0) {
            for (int i = 0; i < remainder; i++) {
                if (s.charAt(i) == 'a') {
                    count++;
                }
            }
        }

        return count;
    }
}
