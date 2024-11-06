package Programmers_자연수뒤집어배열로만들기;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {

        solution(5);

    }

    public static int[] solution(long n) {
        int[] answer = {};

        String[] charArray = String.valueOf(n).split("");
        answer = new int[charArray.length];

        for(int i = 0; i < charArray.length; i++){
            answer[answer.length - i - 1] = Integer.parseInt(charArray[i]);
        }

        return answer;
    }

}
