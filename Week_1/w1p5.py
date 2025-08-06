class Solution:
        def cubeAll(self):
            num = input("Enter the number to cube upto: ")
            for i in range(1, int(num)+ 1):
                print(f'Cube of {i}\t',pow(i, 3))

Obj = Solution()
Obj.cubeAll()