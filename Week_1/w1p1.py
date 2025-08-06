class Solution:
        def productChecker(self):
            num_1 = input("Enter first number: ")
            num_2 = input("Enter second number: ")

            prod = int(num_1) * int(num_2)
            sum = int(num_1) + int(num_2)
            if prod <= 5000:
                return prod
            else:
                return sum


Obj = Solution()
print(Obj.productChecker())