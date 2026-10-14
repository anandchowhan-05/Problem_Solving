class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb=new StringBuilder();
        double val = sum/num;
        while(num != 0){
            if(sum >=0 && sum < 10){
                sb.append(sum);
                sum = 0;
            }else if(val > 9){
                return "";
            }else{
                sb.append("9");
                sum = sum-9;
            }
             num--;
        }
        return sb.toString();
    }
}