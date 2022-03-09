class Solution {
    public int findCenter(int[][] edges) {
        int temp= edges[0][0];
        int answer=0;
        
        if(temp==edges[1][1]||temp==edges[1][0]){
            answer=edges[0][0];
        }else{
            answer=edges[0][1];
        }
        return answer;
    }
}