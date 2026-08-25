class Solution {
    public int getLucky(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            sb.append(ch-'a'+1);
        }
        String str=sb.toString();
        while(k-- > 0){
          int result=0;
          for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            result += ch-'0';
          }
            str=Integer.toString(result);
        }
        return Integer.parseInt(str);
    }
}