import random

class Solution:
    def divByFive(self):
        random_numbers = [random.randint(1, 100) for num in range(20)]                
        nums = []
        for num in random_numbers:
            if num % 5 == 0:
                nums.append(num)
        return nums
Obj = Solution()
print(Obj.divByFive())