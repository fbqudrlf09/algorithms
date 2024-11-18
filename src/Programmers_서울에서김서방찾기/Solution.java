package Programmers_서울에서김서방찾기;

public class Solution {

    public static void main(String[] args) {
        String[] answer = {"Jane", "Kim"};

        Solution solution = new Solution();

        String s = solution.solution(answer);
        System.out.println("s = " + s);

    }

    public String solution(String[] seoul) {

        String answer = "";
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }

        return answer;
    }
}
