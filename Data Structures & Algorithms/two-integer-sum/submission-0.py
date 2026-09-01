class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for i in range(len(nums)):
            cmp = target - nums[i]
            if cmp in seen:
                return [seen[cmp] , i]
            seen[nums[i]] = i
        #return[]
