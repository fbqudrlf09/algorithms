package Programmers_두수의차;

import java.util.Collections;
import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int answer = solution.solution(10, 10);

        System.out.println("answer = " + answer);
    }

    public int solution(int num1, int num2){
        int answer = 0;
        answer = num1 - num2;


        return answer;
    }
}
