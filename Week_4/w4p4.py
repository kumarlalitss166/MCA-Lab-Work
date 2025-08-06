class Solution:
    def listPrint(self, list_1, list_2):
        n1 = len(list_1)
        n2 = len(list_2)
        for i in range(n1):
            print(list_1[i], end=" ")
        for j in range(n2):
            print(list_2[n2 - j - 1], end=" ")
            
list_1 = [0, 1, 2, 3, 4]
list_2 = [5, 6, 7, 8, 9]

Obj = Solution()
Obj.listPrint(list_1, list_2)