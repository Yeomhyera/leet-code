class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;        
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            for(int j=0; j<temp.length(); j++){
                if(allowed.contains(temp.charAt(j)+"")==false){
                    count++;
                    break;
                }
            }
        }
        return words.length-count;
    }
}