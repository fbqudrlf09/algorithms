package Programmers_콜라츠;

public class Solution {
    public int solution(int num) {
        int answer = 0;
        long value = (long)num;

        while(value != 1){

            if(answer == 500){
                answer = -1;
                break;
            }

            if(value % 2 == 0){
                value = value / 2;
            }else if(value % 2 != 0){
                value= value * 3 + 1;
            }
            answer++;
        }

        return answer;
    }
}
