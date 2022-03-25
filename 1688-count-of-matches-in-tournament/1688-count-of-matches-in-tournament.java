class Solution {
    public int numberOfMatches(int n) {        
        int answer=0;

        while(n!=1) {
            if (n % 2 == 1) {
                n = n/2;
                answer += n;
                n++;
            } else {
                n = n/2;
                answer+=n;
            }
        }
        return answer;
    }
}