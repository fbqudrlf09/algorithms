package Programmers_폰켓몬;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 3, 3, 2, 2, 2};

        int result = solution.solution(nums);

        System.out.println("result = " + result);

    }

    public int solution(int[] nums) {

        /**
         * 1. 아이디어
         * 해시맵에 데이터를 넣어서 중복 확인
         * 총 데이터수가 결국에는 종류 개수
         * 2. 시간 복잡도
         * nums 개수 : 10000
         * num 종류 : 200000
         * 해시셋 시간
         * 삽입 10000
         * 3. 자료구조
         * Hashset
         */
        int answer = 0;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        int size = hashSet.size();

        answer = Math.min(nums.length / 2, size);

        return answer;
    }
}
