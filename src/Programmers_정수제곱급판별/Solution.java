package Programmers_정수제곱급판별;

public class Solution {

    public long solution(long n) {
        long answer = 0;

        if (Math.pow((int)Math.sqrt(n), 2) == 2) {
            return  (long)Math.pow(Math.sqrt(n) + 1, 2);
        }
        return answer;
    }
}
