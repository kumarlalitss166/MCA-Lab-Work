class Solution:
    def evenIndexes(self, s):
        size = len(s)
        for i in range(size):
            if (i % 2 == 0):
                print(s[i])

s = "Lalit Kumar"
Obj = Solution()
Obj.evenIndexes(s)
