class Solution:
    def firstLastList(self, nums):
        if nums[0] == nums[len(nums) - 1]:
            print("True")
        else:
            print("False")
    
num_list = []
try:
    n = int(input("Enter the size of the list: "))
except:
    print("Size must be numeric.")
    exit()
    
# print("Enter the elements: ")
# for i in range(n):
#     num = int(input())
#     num_list.append(num)

try:
    num_list = list(map(int, input(f"Enter {n} space-separated numbers: ").split()))
except:
    print("list elements must be numeric.")
    exit()
    
Obj = Solution()
Obj.firstLastList(num_list)