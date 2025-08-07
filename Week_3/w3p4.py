class Solution:
    def evenIndexes(self, s):
        size = len(s)
        for i in range(size):
            if (i % 2 == 0):
                print(s[i])

s = input("Enter a string: ")
Obj = Solution()
Obj.evenIndexes(s)
