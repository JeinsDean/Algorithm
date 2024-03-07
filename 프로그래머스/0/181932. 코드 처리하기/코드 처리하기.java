class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mod = false;
        for (int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') {
                mod = !mod;
                continue;
            }

            if(mod && (i % 2 == 1)) {         // 1
                answer += code.charAt(i);
            } else if(!mod && (i % 2 == 0)) { // 0
                answer += code.charAt(i);
            }
        }

        return answer.isEmpty() ? "EMPTY" : answer;
    }
}