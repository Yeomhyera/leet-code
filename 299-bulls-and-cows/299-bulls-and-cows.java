class Solution {
    public String getHint(String secret, String guess) {
        int[] A = new int[10];
        int[] B = new int[10];
        
        int bulls = 0, cows = 0;
        int N = secret.length();
        char ch1, ch2;
        
        for(int i = 0; i < N; i++){
            ch1 = secret.charAt(i);
            ch2 = guess.charAt(i);
            
            if(ch1 == ch2){
                ++bulls;
            }
            
            A[ch1 - '0']++;
            B[ch2 - '0']++;
        }
        
        for(int i = 0; i < 10; i++){
            cows += Math.min(A[i], B[i]);
        }
        
        cows -= bulls;
        String answer= bulls + "A" + cows + "B";
        return answer;
    }
}