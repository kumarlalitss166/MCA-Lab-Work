class Solution:
    def displayPrimes(self):
        lower = int(input("Enter range lower bound: "))
        
        if (lower < 1):
            print("Lower bound must be greater than 1.")
            return -1

        upper = int(input("Enter range upper bound: "))
        
        if (lower <3):
            print(2, end= " ")
        
        while (lower <= upper):
            isPrime = False    
            
            for i in range(2, lower - 1):
                if (lower % i == 0):
                    isPrime = False
                    break
                else:
                    isPrime = True
                    
            if (isPrime):
                print(lower, end= " ")             
            lower += 1
   
                     
Obj = Solution()
Obj.displayPrimes()