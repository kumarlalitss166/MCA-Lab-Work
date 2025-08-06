import random
otp = ''.join(str(random.randint(0, 9)) for i in range(5))
print(otp)