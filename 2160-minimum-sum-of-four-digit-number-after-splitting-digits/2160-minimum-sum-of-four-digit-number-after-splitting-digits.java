class Solution {
    public int minimumSum(int num) {
        int[] number = new int[4];
        int i = 0;
        while(num > 0){// num의 1의 자리수 나눠 배열에 대입하기
            number[i] = num%10;
            num /= 10;
            i++;
        }
        Arrays.sort(number); // 자동 오름차순 메소드
        int answer =(number[0] * 10 + number[2]) + (number[1] * 10 + number[3]);
        return answer;
    }
}
