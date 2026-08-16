class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                HashMap<Character,Integer> map=new HashMap<>();
                boolean valid=true;
                String str=s.substring(i,j);
                for(int k=0;k<str.length();k++){
                    char ch=str.charAt(k);
                    int count=map.getOrDefault(ch,0);
                    if(count>=2){
                        valid=false;
                        break;
                    }
                    map.put(ch,count+1);
                }
                if(valid){
                    max=Math.max(max,str.length());
                }
            }
        }
        return max;
    }
}