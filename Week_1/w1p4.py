class Solution:
        def IsPalindrome(self):
            num = input("Enter number: ")
            n = len(num)
            palindrome = True
            start = 0
            end = n - 1
                    
            for i in range(int(n/2)):
                if (num[start] != num[end]):
                    palindrome = False
                    return palindrome
                start += 1
                end -= 1

            return palindrome
        

Obj = Solution()

if (Obj.IsPalindrome()):
     print('Given number is a palindrome')
else:
    print('Given number is not a palindrome')