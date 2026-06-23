class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);

        int res = 0;  //longest seq found so far
        int curr = nums[0];    //expected num
        int streak = 0;   // current length
        int i = 0;

        while(i<nums.length){
            if(curr!=nums[i]){  //if it is not expected
                curr=nums[i];
                streak=0;
            }
            while(i<nums.length && nums[i]==curr){   //if sam number appear twice
                i++;
            }
            streak++;
            curr++;
            res=Math.max(res,streak);
        }
        return res;
    }
}
