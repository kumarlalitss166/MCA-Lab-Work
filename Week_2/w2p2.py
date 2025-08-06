class Solution:
    def digitCounter(self):
        num = int(input("Enter an integer: "))
        counter = 0
        if num == 0:
            return 1
        while num != 0:   
            num = int(num / 10)
            counter += 1
        return counter
                 
Obj = Solution()
print("Total Digit Count: ", Obj.digitCounter())