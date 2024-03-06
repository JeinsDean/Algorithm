class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 1) { // 홀수
            for(int i = n; i > 0; i--) {
                answer = i % 2 == 1 ? (answer + i) : answer;
            }
        } else { // 짝수
            for(int i = n; i > 0; i--) {
                answer = i % 2 == 0 ? (answer + (int)Math.pow(i, 2)) : answer;
            }
        }
        
        return answer;
    }
}