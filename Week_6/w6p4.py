or_string = input("Enter the main string: ")
sym = input("Enter the symbol string: ")

en_string = ''
for ch in or_string:
  en_string = en_string + ch + sym
print("Encrypted String: ", en_string)

de_string = ''
letter_count = int(len(en_string) / (len(sym) + 1))
key = 0
for i in range(letter_count):
  de_string += en_string[key]
  key += len(sym) + 1
print("Decrypted String: ", de_string)