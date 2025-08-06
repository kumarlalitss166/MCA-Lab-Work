import random

uc = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
lc = uc.lower()
nums = '0123456789'
sp_chars = "~!@#$%^&*()_-+=[]{}:;'\"<,>.?/|\\"
all_chars = uc + lc + nums + sp_chars

char_list = []

for i in range(2):
    char_list.append(uc[random.randint(0, len(uc) - 1)]) 
char_list.append(nums[random.randint(0, len(nums) - 1)])
char_list.append(sp_chars[random.randint(0, len(sp_chars) - 1)])

for i in range (4, 10):
    char_list.append(all_chars[random.randint(0, len(all_chars) - 1)])

password = ''.join(random.sample(char_list, k=10))
print(password)