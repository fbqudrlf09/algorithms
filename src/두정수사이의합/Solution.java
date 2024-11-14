package 두정수사이의합;

public class Solution {

    public long solution(int a, int b) {
        long answer = 0;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // answer = (max + min) * (max - min + 1) / 2;
        // for(int x = min; x <= max; x++){
        //     answer += x;
        // }
        // 형변환을 하지 않으면 오버플로우 생겨서 문제 생김
        answer = (long) (a + b) * (Math.abs(a - b) + 1) / 2;

        return answer;
    }
}
