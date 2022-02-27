class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0;// 곱셈 0 으로하면 끝까지 0. 
        while (n > 0) {
            int num = n % 10;
            product *= num;
            sum += num;
            n /= 10;
        }
        int answer=product-sum;
        return answer;
    }
}
