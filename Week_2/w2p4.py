# class Solution:
#     def factorial(self, n):
#         if (n == 0 or n == 1):
#             return 1
#         else:
#             return n * self.factorial(n - 1)


# n = int(input("Enter a number: "))
# Obj = Solution()
# print(f"{n} Factorial: ", Obj.factorial(n))

class Solution:
    def factorial(self, n):
        fact = 1
        if (n == 0):
            return 1
        while (n > 0):
            fact = fact * n
            n = n - 1
        return fact 
        

n = int(input("Enter a number: "))
if (n < 0):
    print("Enter a number greater than 0.")
else:
    Obj = Solution()
    print(f"{n} Factorial: ", Obj.factorial(n)) 