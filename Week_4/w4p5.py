class Solution:
    def countOccurences(self, tp_1):
        return tp_1.count(50)
        

tp_1 = tuple(map(int, input("Enter space-separated numbers: ").split()))
Obj = Solution()
print("Count 50: ", Obj.countOccurences(tp_1))
