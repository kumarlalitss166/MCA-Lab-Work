class Solution:
    def digitExtractor(self):
        num = input("Enter an integer: ")
        num = int(num)
        i = 0
        while num != 0:   
            digit = num % pow(10, i + 1)
            num = int(num / 10)
            print(digit)
                 
Obj = Solution()
Obj.digitExtractor()