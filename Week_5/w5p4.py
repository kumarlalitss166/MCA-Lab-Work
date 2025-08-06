list_1 = []
list_2 = []

list_1.extend(list(map(int, input("Enter comma separated items for list 1: ").split())))
list_2.extend(list(map(int, input("Enter comma separated items for list 2: ").split())))

print(list_1)
print(list_2)

list_3 = []

for i in range(len(list_1)):
    if list_1[i] % 2 != 0:
        list_3.append(list_1[i])
for i in range(len(list_2)):
    if list_2[i] % 2 == 0:
        list_3.append(list_2[i])

print(list_3)