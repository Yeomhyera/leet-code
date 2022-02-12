class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        for (int i = 0;i < n; i++){
            ans[i] = ans[i + n] = nums[i];
            // ans[i]는 첫번째, ans[i+n]은 두번째 반복 부분에 입력
        }        
        return ans;
    }
}
