class Solution:
    def substring(self, s, n):
        substr = s[:n]
        return substr
s = input("Enter a string: ")
n = int(input("Enter the nth position: "))
Obj = Solution()

print("The new string is: ", Obj.substring(s, n))