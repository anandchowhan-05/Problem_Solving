class Solution {
    public int countCollisions(String directions) {
        String[] str = directions.split("");
        int ans=0;
        for(int i=0;i<str.length-1;i++){
            if(str[i+1].equals("L") && str[i].equals("R")){
                ans +=2;
                str[i]="S";
                str[i+1]="S";
            }else if((str[i].equals("S") && str[i+1].equals("L")) || (str[i+1].equals("S") && str[i].equals("R"))){
                ans +=1;
                str[i]="S";
                str[i+1]="S";
            }
        }
        return ans;
    }
}