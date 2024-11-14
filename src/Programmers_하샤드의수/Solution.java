package Programmers_하샤드의수;

public class Solution {
    public boolean solution(int x) {
        String[] strArr = String.valueOf(x).split("");
        int sum = 0;
        boolean answer = false;

        for (String str : strArr) {
            int value = Integer.parseInt(str);
            sum += value;
        }

        if (x % sum == 0) {
            answer = true;
        }

        int result =  String.valueOf(x).chars().map(ch -> ch - '0').sum();

        return answer;
    }
}
