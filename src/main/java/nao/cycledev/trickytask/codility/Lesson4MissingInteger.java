package nao.cycledev.trickytask.codility;

/*
This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class Lesson4MissingInteger {

    public static int solution(int[] A) {
        int[] array = new int[1000000];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                array[A[i] - 1] = 1;
            }
        }

        for (int i = 0; i < array.length ; i++) {
            if (array[i] == 0) {
                return i + 1;
            }
        }

        return 1;
    }
}
