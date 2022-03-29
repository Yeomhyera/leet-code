class Solution {
    public String truncateSentence(String s, int k) {
        String[] temp=s.split(" ");
        String answer="";
        for(int i=0; i<k;i++){
            answer+=temp[i];
            if(i<k-1){
                answer+=" ";
            }
        }
        return answer;
    }
}