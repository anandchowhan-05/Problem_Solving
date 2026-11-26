class Solution {
    public int countCollisions(String directions) {
        String[] str = directions.split("");
        int ans=0;
        // for(int i=0;i<str.length-1;i++){
        //     if(str[i+1].equals("L") && str[i].equals("R")){
        //         ans +=2;
        //         str[i]="S";
        //         str[i+1]="S";
        //     }else if((str[i].equals("S") && str[i+1].equals("L")) || (str[i+1].equals("S") && str[i].equals("R"))){
        //         ans +=1;
        //         str[i]="S";
        //         str[i+1]="S";
        //     }
        // }

        int left=0;
        int right=str.length-1;
        while(left < str.length && str[left].equals("L")){
            left++;
        }
        while(right >=0 && str[right].equals("R")){
            right--;
        }
        for (int i = left; i <= right; i++) {
            if (!str[i].equals("S")) {
                ans++;
            }
        }
        return ans;
    }
}