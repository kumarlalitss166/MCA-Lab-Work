str = 'AbC14=~2/?agh'

uc = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
lc = uc.lower()
nums = '0123456789'
alphabets = uc + lc

uc_count = 0
lc_count = 0
digit_count = 0

for ch in str:
  if ch in uc:
    uc_count += 1
  elif ch in lc:
    lc_count += 1
  elif ch in nums:
    digit_count += 1

alphabet_count = uc_count + lc_count

print("Uppercase Count: ",uc_count)
print("Lowercase Count: ",lc_count)
print("Total Alphabets Count: ",alphabet_count)
print("Digits Count: ", digit_count)