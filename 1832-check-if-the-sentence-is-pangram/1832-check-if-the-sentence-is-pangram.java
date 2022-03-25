class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean answer=true;
        int[] temp=new int[26];
        
        for(int i=0;i<sentence.length();i++){
            temp[sentence.charAt(i)-'a']++;
        }
        for(int i=0; i <26; i++){
            if(temp[i]==0){
                answer= false;
            }
        }
        return answer;
    }
}