class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int nums_len=nums.length,max_len=1,curr_len=1;
        if(nums_len==0)
            return 0;
        if(nums_len==1)
            return 1;
        for(int i=0;i<nums_len-1;i++){
            // System.out.println("i is at "+i+" comparing numbers nums[i+1] "+nums[i+1]+" nums[i] "+nums[i]);
            if(nums[i]<nums[i+1]){
                curr_len++;    
                // System.out.println("Macth found. Curr_len is "+curr_len);
            }else{
                // System.out.println("Macth not found. Curr_len is "+curr_len);
                max_len=max_len<curr_len?curr_len:max_len;
                curr_len=1;
            }
        }
        return max_len<curr_len?curr_len:max_len;
    }
}
/*
[1,3,5,4,5,6,7,8,9]
[2,2,2,2,2,2,2]
[9,8,7,6,5,8,11,14]
[2,3,7]
*/