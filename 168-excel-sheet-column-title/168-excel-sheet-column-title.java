class Solution {
    public String convertToTitle(int n) {
        String answer ="";
        
        while(n > 0){
            int temp = n % 26;
            n /= 26;
            String x = (temp==0) ? "Z" :String.valueOf((char)(--temp+65));
            n = (x.charAt(x.length()-1)=='Z') ? --n : n;
            answer += x;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        answer = sb.reverse().toString();
        return answer;
    }
}