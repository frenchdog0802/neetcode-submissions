class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        result = []
        #  for loop two arrays
        for i in range(len(nums)):
            # check is empty
            if result:
                break
            for j in range(len(nums)):
                if i==j:
                    continue
                if (nums[i] + nums[j]) == target:
                    result.append(i)
                    result.append(j)
                    break
        return result
                
                

        