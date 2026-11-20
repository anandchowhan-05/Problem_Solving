class Solution {
    public String digitSum(String s, int k) {
      while(s.length()>k){
        String b="";
        for(int i=0;i<s.length();i=i+k){
            int n=s.length();
            String str="";
            if(n-i-1 < k){
               str=s.substring(i,n); 
            }else{
               str=s.substring(i,i+k);
            }
            int n1=Integer.parseInt(str);
            int d=0;
            while(n1!=0){
                d=d+n1%10;
                n1=n1/10;
            }
            b=b+d;
        }
        s=b;
      }
      return s;  
    }
}