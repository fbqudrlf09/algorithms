package Programmers_정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public long solution(long n) {
        long answer = 0;

        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (String s : str) {
            sb.append(s);
        }

        answer = Long.parseLong(sb.toString());

        return answer;
    }
}
