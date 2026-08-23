class Solution {
    public boolean sumGame(String num) {
        int alicecount=0;
        int bobcount=0;
        int n=num.length();
        int alice=0;
        for(int i=0;i<n/2;i++){
            char ch=num.charAt(i);
            if(ch == '?'){
                alicecount++;
            }else{
                //int a=Integer.parseInt(String.valueOf(ch));
                alice += ch - '0';
            }
        }
        int bob=0;
        for(int i=n/2;i<n;i++){
            char ch=num.charAt(i);
            if(ch == '?'){
                bobcount++;
            }else{
               // int a=Integer.parseInt(String.valueOf(ch));
                bob += ch - '0';
            }
        }
        if ((alicecount + bobcount) % 2 == 1) {
            return true;
        }
        return alice - bob !=
               9 * (bobcount - alicecount) / 2;
    }
}