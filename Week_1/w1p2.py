class Solution:
        def sumFirstTen(self):
            sum = 0
            for i in range(1, 11):
                  sum += i
            return sum

Obj = Solution()
print(Obj.sumFirstTen())