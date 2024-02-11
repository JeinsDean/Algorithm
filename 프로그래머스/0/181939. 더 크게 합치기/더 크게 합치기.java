class Solution {
    public int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        int ab = Integer.parseInt(strA + strB);
        int ba = Integer.parseInt(strB + strA);
        if(ab > ba) {
                return ab;
        } else {
                return ba;
        }
    }
}