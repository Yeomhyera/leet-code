class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i< sentences.length;i++) {
            String[] temp=sentences[i].split(" ");
            if(max<temp.length){
                max=temp.length;
            }
        }
        return max;
    }
}
