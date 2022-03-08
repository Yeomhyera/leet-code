class Solution {
    public int xorOperation(int n, int start) {
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=start+2*i;
        }
        int answer=temp[0];
        for(int i=1;i<n;i++){
            answer^=temp[i];
        }
        return answer;
    }
}