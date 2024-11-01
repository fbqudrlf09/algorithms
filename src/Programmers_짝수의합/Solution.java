package Programmers_짝수의합;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i = i + 2){
            answer = answer + i;
        }

        return answer;
    }
}