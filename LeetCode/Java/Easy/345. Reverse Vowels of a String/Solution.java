class Solution {
    public String reverseVowels(String s) {
       StringBuilder sb1=new StringBuilder();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i); 
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            sb1.append(ch);
        }
       }
        String s1=sb1.toString();
       StringBuilder sb2=new StringBuilder();
       int n=s1.length()-1;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i); 
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            sb2.append(s1.charAt(n));
            n--;
        }else{
            sb2.append(ch);
        }
       }
       return sb2.toString(); 
    }
}