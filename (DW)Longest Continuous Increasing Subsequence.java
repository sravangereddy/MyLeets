class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int seq_wind=0,nums_len=nums.length,max_len=1,curr_len=1;
        if(nums_len==0)
            return 0;
        if(nums_len==1)
            return 1;
        seq_wind=nums[1]-nums[0];
        System.out.println("Initializing seq_wind to "+seq_wind);
        for(int i=0;i<nums_len-1;i++){
            System.out.println("i is at "+i+" comparing numbers nums[i+1] "+nums[i+1]+" nums[i] "+nums[i]);
            if(nums[i]<nums[i+1]){
                if(nums[i+1]-nums[i]==seq_wind){
                    curr_len++;    
                }else{
                    seq_wind=nums[i+1]-nums[i];
                    max_len=max_len<curr_len?curr_len:max_len;
                    curr_len=1;
                }
                System.out.println("Macth found. Curr_len is "+curr_len);
            }else{
                System.out.println("Macth not found. Curr_len is "+curr_len);
                max_len=max_len<curr_len?curr_len:max_len;
                curr_len=1;
            }
        }
        return max_len<curr_len?curr_len:max_len;
    }
}