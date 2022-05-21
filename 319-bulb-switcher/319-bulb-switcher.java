class Solution {
    public int bulbSwitch(int n) {
		if (n <= 1) {
			return n;
		}

		int answer = 0;
		int i = 1;

		while (i * i <= n) {
			answer++;
			i++;
		}
		return answer; 
    }
}