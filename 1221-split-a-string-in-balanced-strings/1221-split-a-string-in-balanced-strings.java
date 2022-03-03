class Solution {
    public int balancedStringSplit(String s) {
        int answer=0;
        int R_count=0, L_count=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='R'){
                R_count++;
            }
            else {
                L_count++;
            }
            if(R_count==L_count){
                answer++;
                R_count=L_count=0;
            }
        }
        return answer;
    }
}