class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        if(n<=8){
            return n;
        }else if(n>8 && n <=16){
            int x=n-8;
            int y=x*2;
            return 8+y;
        }else if(n>16 && n <=24){
            int x=n-16;
            int y=x*3;
            return 24+y;
        }else{
            int x=n-24;
            int y=x*4;
            return 48+y;
        }
    }
}