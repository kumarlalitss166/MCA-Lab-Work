class Solution:
    def cal_sum_sub(self, num_1, num_2):
    
        sum = num_1 + num_2
        subtract = abs(num_1 - num_2)

        return sum, subtract

try:
    num_1 = int(input("Enter first number: "))
    num_2 = int(input("Enter second number: "))
except:
    print("Entered numbers must be numeric.")
    exit()
Obj = Solution()
sum, subtract = Obj.cal_sum_sub(num_1, num_2)

print(f"Sum of the numbers is {sum} and difference is {subtract}")
