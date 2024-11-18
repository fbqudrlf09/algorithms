package Programmers_나누어떨어지는숫자배열;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {5, 9, 7, 10};
        int[] solution = sol.solution(arr, 5);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        answer = Arrays.stream(arr).filter(m -> m % 5 == 0).sorted().toArray();

        if (answer.length == 0) {
            answer = new int[]{-1};
        }

        return answer;
    }
}
