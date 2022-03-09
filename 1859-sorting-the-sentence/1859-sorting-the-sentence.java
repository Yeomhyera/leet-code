import java.util.ArrayList;
class Solution {
    public String sortSentence(String s) {
        String list[]=s.split(" ");
        String[] temp=new String[list.length];
        String answer="";
        int number=0;

        for(int i=0;i<list.length;i++) {
            number = list[i].charAt(list[i].length() - 1) - 48;//아스키코드에서 정수로 변환하기 위해서
            temp[number - 1] = list[i].substring(0, list[i].length() - 1);
        }
        for(int i=0;i<temp.length;i++) {
            answer += temp[i];
            if(i!= temp.length-1){
                answer += " ";
            }
        }
        return answer;
    }
}