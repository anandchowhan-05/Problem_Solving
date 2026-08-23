class Solution {
    public boolean sumGame(String num) {
        int count=0;
        int n=num.length();
        int alice=0;
        for(int i=0;i<n/2;i++){
            char ch=num.charAt(i);
            if(ch == '?'){
                alice += 9;
            }else{
                int a=Integer.parseInt(String.valueOf(ch));
                alice += a;
            }
        }
        int bob=0;
        for(int i=n/2;i<n;i++){
            char ch=num.charAt(i);
            if(ch == '?'){
                count++;
            }else{
                int a=Integer.parseInt(String.valueOf(ch));
                bob += a;
            }
        }
        if(alice <= (count*9)-bob){
            return true;
        }
        return false;
    }
}