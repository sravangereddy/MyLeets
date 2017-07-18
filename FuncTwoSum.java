public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int outputArr[]={-99,-99};
        int noOfEle = nums.length;
        for(int i=0; i<noOfEle;i++){
            for(int j=i+1;j<noOfEle;){
                if(nums[i]+nums[j]==target){
                    outputArr[0]=i;
                    outputArr[1]=j;
                    return outputArr;
                }else{
                    j++;
                }
            }
            
        }
        return outputArr;
    }
   
}