class Solution {

    public static String[] babblingArray = {"ayxa", "yes", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;

        for(String bab : babbling){
            for(String str : babblingArray){
                bab = bab.replaceFirst(str," ");
            }
            if(bab.replaceAll("","").equals("")) answer++;
        }


        return answer;
    }
}
//zz,