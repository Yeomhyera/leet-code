class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[n*2];
        for(int i=0; i< n ; i++){
            answer[2*i] = nums[i];//짝수번째
            answer[2*i+1] = nums[n+i];//홀수번째  
        }
        return answer;
    }
 }