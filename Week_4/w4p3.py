class Solution:
    def createList(self):
        num_list = []
        try:
            n = int(input("Enter the list size: "))    
        except:
            print("List size must be numeric.")
        try:
            num_list = list(map(int, input().split()))
        except:
            print("Please enter only numeric digits.")
            exit()
        return num_list
    
    def sqElements(self, num_list):
        for i in range(len(num_list)):
            num_list[i] = pow(num_list[i], 2)
        return num_list

Obj = Solution()
print("List of Squared Element: ", Obj.sqElements(Obj.createList()))