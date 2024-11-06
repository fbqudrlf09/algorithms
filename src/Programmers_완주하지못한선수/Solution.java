package Programmers_완주하지못한선수;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {


    public String solution(String[] participant, String[] completion) {

        /**
         * 1. 아이디어
         * 해시맵으로 각 참여자에 대한 값을 +1 , -1로 하여 마지막에 0이 되지않는 참여자를 반환
         * 2. 시간복잡도
         * participant 입력 nlogn
         * completion 입력 nlongn
         * 키값 확인 n
         * 최종 nlogn
         * 3. 자료구조
         * hashMap
         * *
         */

        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for(String player : completion){
            map.put(player, map.get(player) - 1);
        }

        for(String key : map.keySet()){
            if(map.get(key) == 1){
                answer = key;
            }
        }

        return answer;
    }
}
