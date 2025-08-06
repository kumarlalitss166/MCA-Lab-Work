class Solution:
    def sumDigits(self, n):
        sum = 0
        while (n > 0):
            digit = n % 10
            sum += digit
            n = int(n / 10)      
        return sum
    
Obj = Solution()
n = int(input("Enter an integer: "))
print("Sum of the digits of n: ", Obj.sumDigits(n))